package serenitylabs.tutorials.trains.search;

import net.serenitybdd.screenplay.targets.Target;

class JourneyDetails {
    static final Target ORIGIN = Target.the("origin field")
            .locatedBy("#depart-from");

    static final Target DROPDOWN_ENTRY = Target.the("dropdown entry '{0}").locatedBy("[data-val*='{0}']");

    static final Target DESTINATION = Target.the("destination field")
            .locatedBy("#going-to");

    static final Target BUY_TICKETS_BUTTON = Target.the("buy tickets button")
            .locatedBy(".planner__submit");

    static final Target LEAVING_DATE = Target.the("leaving date")
            .locatedBy("(//*[contains(@class,'date-time__display-primary')])[1]");

    static final Target SEASON_TICKET_TYPE = Target.the("{0} season ticket trip")
            .locatedBy("//label[.='{0}']");

    static final Target RETURN_TRIP = Target.the("return trip")
            .locatedBy("//label[.='Return']");

    static final Target RETURN_DATE = Target.the("return date")
            .locatedBy("(//*[contains(@class,'date-time__display-primary')])[2]");
}
