package com.cg.ProjectLoginValidation.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Features"}, glue= {"com.cg.ProjectLoginValidation.stepdefinitions"}, tags= {"@test"})
public class TestRunner {

}
