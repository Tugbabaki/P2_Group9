package com.group9_practice_project.pages;

import com.group9_practice_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class HowToUsePinBarPage {

    public HowToUsePinBarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div/h3")
    public WebElement howToUsePinbar;
    @FindBy(css = "img")
    public WebElement pinBarImage;

    @FindBy(css = "html > body > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(2) > div > p:nth-of-type(1)")
    public WebElement usePinIcon;

    
    
    
}
