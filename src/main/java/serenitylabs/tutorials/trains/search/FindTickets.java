package serenitylabs.tutorials.trains.search;

import serenitylabs.tutorials.trains.search.builders.FindOneWayTicketsBuilder;
import serenitylabs.tutorials.trains.search.builders.FindReturnTicketsBuilder;

public class FindTickets {
    public static FindOneWayTicketsBuilder forAOneWayTrip() {
        return new FindOneWayTicketsBuilder();
    }

    public static FindReturnTicketsBuilder forAReturnTrip() {
        return new FindReturnTicketsBuilder();
    }
}
