package serenitylabs.tutorials.trains.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class FindReturnTickets implements Task {
    private final String origin;
    private final String destination;
    private final DepartureDay departureDay;
    private final int returningAfterDayCount;

    public FindReturnTickets(String origin,
                             String destination,
                             DepartureDay departureDay,
                             int returningAfterDayCount) {
        this.origin = origin;
        this.destination = destination;
        this.departureDay = departureDay;
        this.returningAfterDayCount = returningAfterDayCount;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectItinerary.from(origin).to(destination),

                EnterDate.of(departureDay).into(JourneyDetails.LEAVING_DATE),

                Click.on(JourneyDetails.RETURN_TRIP),
                EnterDate.of(departureDay)
                        .plus(returningAfterDayCount)
                        .into(JourneyDetails.RETURN_DATE),

                Click.on(JourneyDetails.BUY_TICKETS_BUTTON)
        );
    }
}
