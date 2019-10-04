package com.epam.tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

/**
 * #Summary:
 * #Author: Andrii_Marchenko1
 * #Author’s Email:
 * #Creation Date: 10/3/2019
 * #Comments:
 */
public class MyStepsDefinitions {
    @Given("^Background step with sleep$")
    public void backgroundStepWithSleep() {
        System.out.println("Background is executed");
    }

    @Given("^Step passed$")
    public void stepPassed() throws Throwable {
        Assert.assertTrue(true, "Step PASSED!!!");
    }

    @Then("^Must be failed$")
    public void mustBeFailed() throws Throwable {
        Assert.fail("Step FAILED!!!");
    }

    @Then("^Must be pending$")
    public void mustBePending() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
