package serenitylabs.tutorials.trains.journeys;

import net.serenitybdd.screenplay.Question;

public class TheAvailableJourneys {

    public static Question<String> lowestPrice() {
        return actor -> JourneyList.CHEAPEST_PRICE.resolveFor(actor).getText();
    }

    public static Question<String> ticketType() {
        return actor -> JourneyList.TICKET_TYPE.resolveFor(actor).getText();
    }

    public static Question<String> origin() {
        return actor -> JourneyList.ORIGIN.resolveFor(actor).getText();
    }

    public static Question<String> destination() {
        return actor -> JourneyList.DESTINATION.resolveFor(actor).getText();
    }

}
