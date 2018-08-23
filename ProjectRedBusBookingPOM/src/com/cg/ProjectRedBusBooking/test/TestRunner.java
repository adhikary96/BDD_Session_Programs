package com.cg.ProjectRedBusBooking.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Features"}, glue= {"com.cg.ProjectRedBusBooking.stepdefinitions"}, tags= {"@Bus"})
public class TestRunner {

}
