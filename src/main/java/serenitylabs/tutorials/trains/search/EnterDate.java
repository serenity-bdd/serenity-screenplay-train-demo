package serenitylabs.tutorials.trains.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import java.time.LocalDate;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

class EnterDate implements Interaction {

    private final int daysAfterToday;
    private final Target dateField;

    EnterDate(int daysAfterToday, Target dateField) {
        this.daysAfterToday = daysAfterToday;
        this.dateField = dateField;
    }

    static EnterDateBuilder of(DepartureDay departureDay) {
        return new EnterDateBuilder(departureDay);
    }

    @Override
    @Step("{0} selects day #departureDay")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(dateField),
                WaitUntil.the(DatePicker.DATE_SELECTION_DONE, isVisible()),
                Click.on(DatePicker.DAY.of(getDepartureDay())),
                Click.on(DatePicker.DATE_SELECTION_DONE)
        );
    }

    private String getDepartureDay() {
        return String.valueOf(
                LocalDate.now().plusDays(daysAfterToday).getDayOfMonth()
        );
    }

    static class EnterDateBuilder {

        private int daysAfterToday = 0;

        EnterDateBuilder(DepartureDay departureDay) {
            this.daysAfterToday = departureDay.daysFromToday();
        }

        Interaction into(Target dateField) {
            return instrumented(EnterDate.class, daysAfterToday, dateField);
        }

        public EnterDateBuilder plus(int daysAfter) {
            this.daysAfterToday = daysAfterToday + daysAfter;
            return this;
        }
    }

}
