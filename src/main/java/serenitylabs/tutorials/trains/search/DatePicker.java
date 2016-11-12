package serenitylabs.tutorials.trains.search;

import net.serenitybdd.screenplay.targets.Target;

class DatePicker {
    static Target DAY = Target.the("departure day")
                              .locatedBy("(//*[@data-pika-day='{0}'])[2]");
    static final Target DATE_SELECTION_DONE = Target.the("date selection done button")
                                                    .locatedBy("(//button[.='Done'])[2]");

}

