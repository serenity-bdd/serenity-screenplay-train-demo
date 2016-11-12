package serenitylabs.tutorials.trains.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectItinerary implements Task {

    private final String origin;
    private final String destination;

    public SelectItinerary(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    @Step("{0} selects an itinerary from #origin to #destination")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectTheStation.called(origin).in(JourneyDetails.ORIGIN),
                SelectTheStation.called(destination).in(JourneyDetails.DESTINATION)
        );
    }

    public static SelectItineraryBuilder from(String origin) {
        return new SelectItineraryBuilder(origin);
    }


    public static class SelectItineraryBuilder {
        private final String origin;

        public SelectItineraryBuilder(String origin) {
            this.origin = origin;
        }

        public SelectItinerary to(String destination) {
            return instrumented(SelectItinerary.class, origin, destination);
        }
    }
}
