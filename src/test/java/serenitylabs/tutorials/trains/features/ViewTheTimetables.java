package serenitylabs.tutorials.trains.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consult_the_timetables/view_the_timetables.feature")
public class ViewTheTimetables {}
