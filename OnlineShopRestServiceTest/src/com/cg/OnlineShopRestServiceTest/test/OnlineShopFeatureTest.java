package com.cg.OnlineShopRestServiceTest.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Features"}, glue= {"com.cg.OnlineShopRestServiceTest.stepdefinitions"}, tags= {"@Rest"})
public class OnlineShopFeatureTest {

}
