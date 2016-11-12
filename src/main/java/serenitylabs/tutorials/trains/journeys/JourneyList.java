package serenitylabs.tutorials.trains.journeys;

import net.serenitybdd.screenplay.targets.Target;

class JourneyList {
    static Target CHEAPEST_PRICE = Target.the("cheapest price").locatedBy(".planner-header__price");
    static Target TICKET_TYPE = Target.the("cheapest price").locatedBy(".planner-header__type");
    static Target ORIGIN = Target.the("origin").locatedBy(".planner-header__origin");
    static Target DESTINATION = Target.the("destination").locatedBy(".planner-header__destination");
}
