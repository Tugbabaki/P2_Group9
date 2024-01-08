package com.group9_practice_project.step_definitions;

import com.group9_practice_project.pages.LoginPage;
import com.group9_practice_project.pages.DashboardPage_Svetko;
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

    @Given("user is logged in as store manager")
    public void userIsLoggedInAsStoreManager() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        loginPage.userName.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        loginPage.submit.click();
    }

    @Given("user is logged in as a {string}")
    public void userIsLoggedInAsA(String userType) {
        /*
        switch (userType){
            case "Store manager":
                loginPage.userName.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
                loginPage.password.sendKeys(ConfigurationReader.getProperty("store_manager_password"));
                loginPage.submit.click();
                break;
            case "Sales manager":
                loginPage.userName.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
                loginPage.password.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
                loginPage.submit.click();
                break;
        }

         */
        loginPage.login(userType);
    }

    @When("user navigate to the Vehicle Contracts page")
    public void userNavigateToTheVehicleContractsPage() {

        dashboardPage.fleetLink.click();
        dashboardPage.vehicleContractsOption.click();

    }
    @Then("user should be on the Vehicle Contracts page")
    public void userShouldBeOnTheVehicleContractsPage() {

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String expectedURL = "https://qa1.transmuda.com/entity/Extend_Entity_VehicleContract";

        wait.until(ExpectedConditions.titleContains(expectedTitle));

        String actualTitle = Driver.getDriver().getTitle();
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedTitle, actualTitle);
        //Assert.assertEquals(expectedURL, actualURL);

    }

}
