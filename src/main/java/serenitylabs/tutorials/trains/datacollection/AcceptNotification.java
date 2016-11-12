package serenitylabs.tutorials.trains.datacollection;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AcceptNotification implements Task {

    @Override
    @Step("{0} agrees to cookies")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(theCookieMessageIsVisible()).andIfSo(
                        Click.on(CookieConsentBanner.CLOSE_COOKIES)
                )
        );
    }

    private Question<Boolean> theCookieMessageIsVisible() {
        return actor -> CookieConsentBanner.CLOSE_COOKIES.resolveFor(actor).isCurrentlyVisible();
    }

    public static Performable aboutCookies() {
        return instrumented(AcceptNotification.class);
    }
}
