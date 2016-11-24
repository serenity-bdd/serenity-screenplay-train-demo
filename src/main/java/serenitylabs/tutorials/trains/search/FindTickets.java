package serenitylabs.tutorials.trains.search;

import serenitylabs.tutorials.trains.search.builders.FindOneWayTicketsBuilder;
import serenitylabs.tutorials.trains.search.builders.FindReturnTicketsBuilder;
import serenitylabs.tutorials.trains.search.builders.FindSeasonTicketsBuilder;

public class FindTickets {
    public static FindOneWayTicketsBuilder forAOneWayTrip() {
        return new FindOneWayTicketsBuilder();
    }

    public static FindReturnTicketsBuilder forAReturnTrip() {
        return new FindReturnTicketsBuilder();
    }

    public static FindSeasonTicketsBuilder forASeasonTicket() {
        return new FindSeasonTicketsBuilder();
    }

}
