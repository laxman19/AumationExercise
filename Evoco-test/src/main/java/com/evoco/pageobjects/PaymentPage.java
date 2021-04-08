package com.evoco.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='cart_navigation']/button/span")
    public WebElement confirmMyOrder;

    public void clickOnConfirmMyOrder() {
        this.confirmMyOrder.click();
    }
}
