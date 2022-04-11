package com.musala.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/povioe2e/step_definitions",

        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }
)
public class FailedTestRunners {

}