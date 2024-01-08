package com.group9_practice_project.pages;

import com.group9_practice_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage_Svetko {

    public DashboardPage_Svetko() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Fleet")
    public WebElement fleetLink;

    @FindBy(linkText = "Vehicle Contracts")
    public WebElement vehicleContractsOption;



}
