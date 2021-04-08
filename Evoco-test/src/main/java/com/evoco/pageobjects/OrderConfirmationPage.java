package com.evoco.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BasePage {


    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/p/a")
    public WebElement backToOrders;

    public void clickOnBackToOrders() {
        this.backToOrders.click();
    }

}
