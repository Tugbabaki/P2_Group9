package com.group9_practice_project.step_definitions;

import com.group9_practice_project.pages.LoginPage;
import com.group9_practice_project.pages.VehiclesModelPage_VP;
import com.group9_practice_project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class US05_StepDefs_VP {
    LoginPage loginPage = new LoginPage();
    VehiclesModelPage_VP vehiclesModelPage = new VehiclesModelPage_VP();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    @Given("user is on the VyTruck login page")
    public void userIsOnTheVyTruckLoginPage() {
        Driver.getDriver().get("https://qa3.vytrack.com/");
    }
    @When("the user logs in with username {string} and password {string}")
    public void the_user_logs_in_with_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }
    @When("user navigates to Vehicles Model page")
    public void user_navigates_to_vehicles_model_page() {
        Driver.getDriver().navigate().to("https://qa3.vytrack.com/entity/Extend_Entity_VehiclesModel");
    }
    @Then("User is able to see the following columns on the page")
    public void user_is_able_to_see_the_following_columns_on_the_page(List<String> columnName) {
        List<WebElement> tableHeaders = vehiclesModelPage.tHeaders;
        // this is the loop that is being used with a locator that locate all 12 headers
/*
          System.out.println("vehiclesModelPage.tHeaders.size() = " + vehiclesModelPage.tHeaders.size());
         System.out.println("tableHeaders.size() = " + tableHeaders.size());
        System.out.println("columnName.size() = " + columnName.size());
        for (int i = 0, j=1; i < columnName.size();) {
            System.out.println("tableHeaders.get(i).getText() = " + tableHeaders.get(j).getText());
            System.out.println("columnName.get(i) = " + columnName.get(i));
            Assert.assertEquals("Headers are not equal",columnName.get(i), tableHeaders.get(i).getText());
            i++;
            j++;
        }

 */

        for (int i = 0; i < columnName.size();) {
//            System.out.println("tableHeaders.get(i).getText() = " + tableHeaders.get(i).getText());
//            System.out.println("columnName.get(i) = " + columnName.get(i))
            Assert.assertEquals("Headers are not equal",columnName.get(i), tableHeaders.get(i).getText());
            i++;
        }

    }
    @And("user clicks on Vehicles Model page")
    public void userClickOnVehiclesModelPage() {
        // when we want to click on our locators ("Fleet" and "Vehicles models") and work with them
        // Also using explicit wait
        Actions actions = new Actions(Driver.getDriver());
        wait.until(ExpectedConditions.visibilityOf(vehiclesModelPage.fleetMenu));
        actions.moveToElement(vehiclesModelPage.fleetMenu).perform();
        wait.until(ExpectedConditions.visibilityOf(vehiclesModelPage.vehicleLink));
        vehiclesModelPage.vehicleLink.click();
    }

    @Then("User is able to see the error message {string}")
    public void userIsAbleToSeeTheErrorMessage(String errorMessage) {
        Assert.assertTrue("message is not displayed",vehiclesModelPage.errorMessage.isDisplayed());
        Assert.assertEquals("message is not equal expected",errorMessage, vehiclesModelPage.errorMessage.getText() );
    }

}
