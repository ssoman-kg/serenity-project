package com.demoblaze.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.demoblaze.cucumber.featureSteps",
        plugin = {"pretty"},
        features = "src/test/resources/features/add-to-cart.feature")
public class DemoBlazeTestSuite {
}
