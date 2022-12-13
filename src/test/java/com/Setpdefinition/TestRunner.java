package com.Setpdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features =".\\src\\test\\resources\\Feature\\Facebook.feature",
                  glue   = "com.Setpdefinition",
                  plugin = "html:Cucumbertask\\target\\face.html",
                  monochrome = true,
                  dryRun = false)
public class TestRunner {
	

}
