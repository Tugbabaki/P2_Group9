package com.group9_practice_project.pages;

import com.group9_practice_project.utilities.ConfigurationReader;
import com.group9_practice_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }
    public void login(String userType){
        userName.sendKeys(ConfigurationReader.getProperty(userType + "_username"));
        password.sendKeys(ConfigurationReader.getProperty(userType + "_password"));
        submit.click();
    }

    public void login(String userType){

        userType = userType.replace(" ","_");
        userName.sendKeys(ConfigurationReader.getProperty(userType + "_username"));
        password.sendKeys(ConfigurationReader.getProperty(userType + "_password"));
        submit.click();
    }

}