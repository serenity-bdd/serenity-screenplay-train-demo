package serenitylabs.tutorials.trains.seasontickets;

import net.serenitybdd.screenplay.targets.Target;

public class SeasonTicketTravelOptions {
    public static final Target OPTIONS = Target.the("travel options").locatedBy(".options-input__item");
    public static final Target SEASON_TICKET_TYPE = Target.the("'{0}' season ticket").locatedBy("//label[.='{0}']");
}
