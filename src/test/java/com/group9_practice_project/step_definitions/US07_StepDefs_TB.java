package com.group9_practice_project.step_definitions;

import com.group9_practice_project.pages.BasePage;
import com.group9_practice_project.pages.LoginPage;
import com.group9_practice_project.pages.VehicleContractsPage_Svetko;
import com.group9_practice_project.pages.VehiclesPage;
import com.group9_practice_project.utilities.BrowserUtils;
import com.group9_practice_project.utilities.ConfigurationReader;
import com.group9_practice_project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US07_StepDefs_TB extends VehiclesPage {


    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    VehiclesPage vehiclesPageObj = new VehiclesPage();

    @Given("user is logged in as a {string}")
    public void userIsLoggedInAsA(String userType) {

        loginPage.login(userType);
    }

    @When("User clicks on Vehicles Page under Fleet Module Dropdown")
    public void userClicksOnVehiclesPageUnderFleetModuleDropdown() {

        vehiclesPageObj.fleetLink.click();
        vehiclesPageObj.vehicles.click();
        BrowserUtils.sleep(3);

    }

    @Then("User verifies all checkboxes are unselected by default")
    public void userVerifiesAllCheckboxesAreUnselectedByDefault() {

        for (WebElement eachRow : allRows) {

            Assert.assertFalse(eachRow.isSelected());
        }

    }

    @Then("Verify that users can check the first checkbox to select all the cars")
    public void verifyThatUsersCanCheckTheFirstCheckboxToSelectAllTheCars() {
//        Assert.assertTrue(selectAllVehiclesCheckbox.isEnabled());

        selectAllVehiclesCheckbox.click();
        BrowserUtils.sleep(5);


        for (WebElement eachRow : allRows) {
            Assert.assertTrue(eachRow.isSelected());
        }
    }

    @Then("Verify that users can select any car")
    public void verifyThatUsersCanSelectAnyCar() {

        vehiclesCheckbox1.click();
        Assert.assertTrue(vehiclesCheckbox1.isSelected());
        BrowserUtils.sleep(3);

        vehiclesCheckbox3.click();
        Assert.assertTrue(vehiclesCheckbox3.isSelected());


    }
}
