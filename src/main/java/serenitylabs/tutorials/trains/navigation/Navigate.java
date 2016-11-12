package serenitylabs.tutorials.trains.navigation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import serenitylabs.tutorials.trains.datacollection.AcceptNotification;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate implements Task {

    private final Section section;

    public Navigate(Section section) {
        this.section = section;
    }

    @Override
    @Step("{0} navigates to #section")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(section.url()),
                AcceptNotification.aboutCookies()
        );
    }

    public static Performable to(Section section) {
        return instrumented(Navigate.class, section);
    }
}
