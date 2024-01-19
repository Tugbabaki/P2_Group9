package com.group9_practice_project.pages;

import com.group9_practice_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesModelPage_VP {
    public VehiclesModelPage_VP(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //fleet menu --> used if we want to click on it, returns the first matched option
    @FindBy(xpath ="//span[contains(text(), 'Fleet')]")
    public WebElement fleetMenu;

    //vehicles link --> used if we want to click on it
    @FindBy (xpath = "//span[.='Vehicles Model']")
    public WebElement vehicleLink;

    //locate 10 specified headers
    @FindBy(xpath = "//table//th//span[@class='grid-header-cell__label']") //table//th//span[@class='grid-header-cell__label']
    public List<WebElement> tHeaders;

    //locate all 12 headers
    /*
    @FindBy(xpath = "//table//tr/th")
    public List<WebElement> tHeaders;

     */

    @FindBy (xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;

}
