package com.group9_practice_project.step_definitions;

import com.group9_practice_project.pages.LoginPage;
import com.group9_practice_project.pages.DashboardPage_Svetko;
import com.group9_practice_project.pages.VehicleContractsPage_Svetko;
import com.group9_practice_project.utilities.BrowserUtils;
import com.group9_practice_project.utilities.ConfigurationReader;
import com.group9_practice_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US04_StepDefs_SD {

    LoginPage loginPage = new LoginPage();
    DashboardPage_Svetko dashboardPage = new DashboardPage_Svetko();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    VehicleContractsPage_Svetko vehicleContractsPage = new VehicleContractsPage_Svetko();


    @Given("user is logged in as a {string}")
    public void userIsLoggedInAsA(String userType) {
        loginPage.login(userType);
    }

    @When("user navigate to the Vehicle Contracts page")
    public void userNavigateToTheVehicleContractsPage() {

        BrowserUtils.sleep(3);
        dashboardPage.fleetLink.click();
        dashboardPage.vehicleContractsOption.click();
    }
    @Then("user should be on the Vehicle Contracts page")
    public void userShouldBeOnTheVehicleContractsPage() {

        String testEnv = ConfigurationReader.getProperty("url");

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String expectedURL = testEnv + "/entity/Extend_Entity_VehicleContract";

        wait.until(ExpectedConditions.titleContains(expectedTitle));

        String actualTitle = Driver.getDriver().getTitle();
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedTitle, actualTitle);
        Assert.assertEquals(expectedURL, actualURL);
    }

    @Then("user should see the required message")
    public void userShouldSeeTheRequiredMessage() {

        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage = vehicleContractsPage.alertMessage.getText();

        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
