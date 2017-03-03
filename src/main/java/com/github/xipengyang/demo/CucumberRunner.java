package com.github.xipengyang.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by davidyang on 1/03/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-json-report.json", "junit:target/cucumber-junit.xml"}, features = {"src/main/resources/features"})
public class CucumberRunner {

}
