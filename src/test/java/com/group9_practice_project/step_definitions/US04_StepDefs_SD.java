package com.group9_practice_project.step_definitions;

import com.group9_practice_project.pages.LoginPage;
import com.group9_practice_project.pages.VehicleContractsPage_Svetko;
import com.group9_practice_project.utilities.BrowserUtils;
import com.group9_practice_project.utilities.ConfigurationReader;
import com.group9_practice_project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US04_StepDefs_SD {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    VehicleContractsPage_Svetko vehicleContractsPage = new VehicleContractsPage_Svetko();


    @Given("user is logged in as a {string}")
    public void userIsLoggedInAsA(String userType) {
        loginPage.login(userType);
    }

    @When("user navigate to the Vehicle Contracts page")
    public void userNavigateToTheVehicleContractsPage() {

        BrowserUtils.sleep(3);
        vehicleContractsPage.fleetLink.click();
        vehicleContractsPage.vehicleContractsOption.click();
    }

    @Then("user should see title as required")
    public void userShouldSeeTitleAsRequired() {

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        wait.until(ExpectedConditions.titleContains(expectedTitle));

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @And("user should see URL as required")
    public void userShouldSeeURLAsRequired() {

        String testEnv = ConfigurationReader.getProperty("url");

        String expectedURL = testEnv + "/entity/Extend_Entity_VehicleContract";
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);
    }



    @Then("user should see the required message")
    public void userShouldSeeTheRequiredMessage() {

        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage = vehicleContractsPage.alertMessage.getText();

        Assert.assertEquals(expectedMessage, actualMessage);
    }




}
