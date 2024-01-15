package com.group9_practice_project.pages;

import com.group9_practice_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage extends BasePage{

    public VehiclesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "((//li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement fleetModuleDropdown;


    @FindBy(xpath = "(((//ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1'])[2])//span[@class='title title-level-2'])[1]")
    public WebElement vehicles;

    @FindBy(css = "Selected Rows")
    public List<WebElement> allRows;

    @FindBy(xpath = "(//button[@class='btn btn-default btn-small dropdown-toggle'])[1]//input[@type='checkbox']")
    public WebElement selectAllVehiclesCheckbox;

    @FindBy(xpath = "//td[@data-column-label='Selected Rows']//input")
    public WebElement vehiclesCheckbox1;

    @FindBy(xpath = "(//td[@data-column-label='Selected Rows']//input)[3]")
    public WebElement vehiclesCheckbox3;

    @FindBy(xpath = "(//td[@data-column-label='Selected Rows']//input)[5]")
    public WebElement vehiclesCheckbox5;







}
