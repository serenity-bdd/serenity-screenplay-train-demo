package serenitylabs.tutorials.trains.datacollection;

import net.serenitybdd.screenplay.targets.Target;

class CookieConsentBanner {
    static final Target CLOSE_COOKIES = Target.the("the cookies consent button")
                                              .locatedBy(".cookies button");
}
