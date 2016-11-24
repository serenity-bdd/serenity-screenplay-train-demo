package serenitylabs.tutorials.trains.search.builders;

import net.serenitybdd.screenplay.Performable;
import serenitylabs.tutorials.trains.search.FindSeasonTickets;
import serenitylabs.tutorials.trains.search.SeasonTicketDuration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindSeasonTicketsBuilder {

    private SeasonTicketDuration duration;
    private String departure;
    private String destination;

    public FindSeasonTicketsBuilder from(String departure) {
        this.departure = departure;
        return this;
    }

    public FindSeasonTicketsBuilder ofDuration(SeasonTicketDuration seasonTicketDuration) {
        this.duration = seasonTicketDuration;
        return this;
    }

    public Performable to(String destination) {
        return instrumented(FindSeasonTickets.class, departure, destination, duration);
    }
}