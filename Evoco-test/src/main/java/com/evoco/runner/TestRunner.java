package com.evoco.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/main/java/com/evoco/features"},
        glue = {"com.evoco.stepdefinations"},
        plugin = {
                "pretty",
                "html:target/cucumber-html-report",
                "junit:target/cucumber-reports/cucumber.xml",
                "json:target/cucumber-reports/cucumber.json",
                "json:target/cucumber-report.json"

        },
        //tags = {"@TC-001","@TC-002"},
        strict = true,
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

       /* @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios(){
                return super.scenarios();
        }*/
}
