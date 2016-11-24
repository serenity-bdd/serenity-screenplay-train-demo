package serenitylabs.tutorials.trains.seasontickets;

import net.serenitybdd.screenplay.Consequence;

import java.util.List;
import java.util.stream.Collectors;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static serenitylabs.tutorials.trains.seasontickets.SeasonTicketTravelOptions.SEASON_TICKET_TYPE;

public class SeasonTicketOptions {

    public static Consequence[] seeEachSeasonTicketOptionIn(List<String> expectedSeasonTicketOptions) {
        return expectedSeasonTicketOptions.stream().map(
                expectedOption -> seeThat(the(SEASON_TICKET_TYPE.of(expectedOption)), isVisible())
        ).collect(Collectors.toList()).toArray(new Consequence[]{});
    }}
