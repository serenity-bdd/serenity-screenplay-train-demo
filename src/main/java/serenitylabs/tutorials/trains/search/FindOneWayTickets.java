package serenitylabs.tutorials.trains.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class FindOneWayTickets implements Task {
    private final String origin;
    private final String destination;
    private final DepartureDay departureDay;

    public FindOneWayTickets(String origin, String destination, DepartureDay departureDay) {
        this.origin = origin;
        this.destination = destination;
        this.departureDay = departureDay;
    }

    @Override
    @Step("{0} looks for a one-way ticket from #origin to #destination #departureDay")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectItinerary.from(origin).to(destination),
                EnterDate.of(departureDay).into(JourneyDetails.LEAVING_DATE),
                Click.on(JourneyDetails.BUY_TICKETS_BUTTON)
        );
    }
}
