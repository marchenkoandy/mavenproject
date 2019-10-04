package com.epam.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * #Summary:
 * #Author: Andrii_Marchenko1
 * #Author’s Email:
 * #Creation Date: 10/3/2019
 * #Comments:
 */
@CucumberOptions(
        features = {"src/test/resources/cucumber/"},
        glue = "com.epam.tests",
        tags = {"not @Ignore"},
        plugin = {"pretty",
                "json:target/jsons/CucumberTestReport.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
