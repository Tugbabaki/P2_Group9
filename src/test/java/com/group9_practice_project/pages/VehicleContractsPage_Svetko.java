package com.group9_practice_project.pages;

import com.group9_practice_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleContractsPage_Svetko {

    public VehicleContractsPage_Svetko() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public WebElement alertMessage;




}
