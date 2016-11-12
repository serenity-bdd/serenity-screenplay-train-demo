package serenitylabs.tutorials.trains.search.builders;

import net.serenitybdd.screenplay.Performable;
import serenitylabs.tutorials.trains.search.DepartureDay;
import serenitylabs.tutorials.trains.search.FindOneWayTickets;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindOneWayTicketsBuilder {

    private String departure;
    private String destination;

    public FindOneWayTicketsBuilder from(String departure) {
        this.departure = departure;
        return this;
    }

    public FindOneWayTicketsBuilder to(String destination) {
        this.destination = destination;
        return this;
    }

    public Performable leaving(DepartureDay departureDay) {
        return instrumented(FindOneWayTickets.class, departure, destination, departureDay);
    }
}