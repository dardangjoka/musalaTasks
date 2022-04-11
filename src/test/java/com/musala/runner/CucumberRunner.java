package com.musala.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports.json",
                "json:target/cucumber.json"},
        publish = true,
        features = "src/test/resources/features/",
        glue = "com/musala/stepDefinition",
        tags = "@tests",
        dryRun = false
)

public class CucumberRunner {
}