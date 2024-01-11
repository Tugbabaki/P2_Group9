package com.group9_practice_project.step_definitions;

import com.group9_practice_project.pages.BasePage;
import com.group9_practice_project.pages.HowToUsePinBarPage;
import com.group9_practice_project.pages.LoginPage;
import com.group9_practice_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US3_StepDef {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    HowToUsePinBarPage pinBar = new HowToUsePinBarPage();
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String string) {
        loginPage.login(userType);
    }
    @When("the user click the “Learn how to use this space”")
    public void the_user_click_the_learn_how_to_use_this_space() {// Write code here that turns the phrase above into concrete actions
        BasePage.pinBarLink.click();
    }
    @Then("the user can see “How To Use Pinbar”")
    public void the_user_can_see_how_to_use_pinbar() {
        Assert.assertEquals(pinBar.howToUsePinbar.getText(), "How To Use Pinbar");
    }
    @Then("the user can see “Use the pin icon on the right top corner of page to create fast access link in the pinbar.”")
    public void the_user_can_see_use_the_pin_icon_on_the_right_top_corner_of_page_to_create_fast_access_link_in_the_pinbar() {
        Assert.assertEquals(pinBar.usePinIcon.getText(), "Use the pin icon on the right top corner of page to create fast access link in the pinbar.");
    }
    @Then("the user should to see image")
    public void the_user_should_to_see_image() {
        Assert.assertEquals(pinBar.pinBarImage.getAttribute("src"), "/bundles/oronavigation/images/pinbar-location.jpg");

    }


}
