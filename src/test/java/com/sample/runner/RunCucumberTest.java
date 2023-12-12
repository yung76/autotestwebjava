package com.sample.runner;

// RunCucumberTest.java



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features",
        glue = "com.sample.steps",
        plugin = {"pretty", "html:build/reports/cucumber"},
        monochrome = true
)
public class RunCucumberTest {
}


