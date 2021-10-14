package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\com\\features\\Homepage.feature"},
		glue = {"com/stepdefinitions", "com/hooks"},
		plugin = {"pretty"
		},
		publish = true,
		monochrome = true
		)
		
public class TestRunner {

}
