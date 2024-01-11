package com.group9_practice_project.step_definitions;

import com.group9_practice_project.pages.BasePage;
import com.group9_practice_project.pages.HowToUsePinBarPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US3_StepDef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

    }
    @When("the user click the “Learn how to use this space”")
    public void the_user_click_the_learn_how_to_use_this_space() {
       BasePage.pinBarLink.click();
    }
    @Then("the user can see “How To Use Pinbar”")
    public void the_user_can_see_how_to_use_pinbar() {
        Assert.assertEquals(HowToUsePinBarPage.howToUsePinbar.getText(), "How To Use Pinbar");
    }
    @Then("the user can see “Use the pin icon on the right top corner of page to create fast access link in the pinbar.”")
    public void the_user_can_see_use_the_pin_icon_on_the_right_top_corner_of_page_to_create_fast_access_link_in_the_pinbar() {
    Assert.assertEquals(HowToUsePinBarPage.usePinIcon.getText(), "Use the pin icon on the right top corner of page to create fast access link in the pinbar.");
    }
    @Then("the user should to see image")
    public void the_user_should_to_see_image() {
    Assert.assertEquals(HowToUsePinBarPage.pinBarImage.getAttribute("src"), "/bundles/oronavigation/images/pinbar-location.jpg");
    }

}
