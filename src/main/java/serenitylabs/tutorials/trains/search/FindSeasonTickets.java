package serenitylabs.tutorials.trains.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class FindSeasonTickets implements Task {
    private final String origin;
    private final String destination;
    private final SeasonTicketDuration duration;

    public FindSeasonTickets(String origin, String destination, SeasonTicketDuration duration) {
        this.origin = origin;
        this.destination = destination;
        this.duration = duration;
    }

    @Override
    @Step("{0} looks for a one-way ticket from #origin to #destination #departureDay")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectItinerary.from(origin).to(destination),
                Click.on(JourneyDetails.SEASON_TICKET_TYPE.of(duration.name())),
                Click.on(JourneyDetails.BUY_TICKETS_BUTTON)
        );
    }
}
