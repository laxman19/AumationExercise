package com.evoco.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver){
        super(driver);
    }
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public WebElement signInLink;

}
