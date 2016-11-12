package serenitylabs.tutorials.trains.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

class SelectTheStation implements Interaction {
    private final String stationName;
    private final Target stationDropdown;

    @Override
    @Step("{0} selects station #stationName")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(stationName).into(stationDropdown),
                Click.on(JourneyDetails.DROPDOWN_ENTRY.of(stationName))
        );
    }

    public SelectTheStation(String stationName, Target stationDropdown) {
        this.stationName = stationName;
        this.stationDropdown = stationDropdown;
    }


    static StationBuilder called(String stationName) {
        return new StationBuilder(stationName);
    }

    public static class StationBuilder {
        private final String stationName;

        StationBuilder(String stationName) {
            this.stationName = stationName;
        }

        public Interaction in(Target stationDropdown) {
            return instrumented(SelectTheStation.class, stationName, stationDropdown);
        }
    }
}
