package com.evoco.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage{


    public OrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/p[2]/a[1]/span")
    public WebElement proceedTOCheckout;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/form/p/button/span")
    public WebElement proceedTOCheckoutStep1;

    @FindBy(how = How.XPATH, using = "//*[@id='cgv']")
    public WebElement clickOnCheckBox;

    @FindBy(how = How.XPATH, using = "//*[@id='form']/p/button/span")
    public WebElement shippingProceedTOCheckout;

    @FindBy(how = How.XPATH, using = "//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
    public WebElement makePayment;

    public void proceedToCheckout() {
        this.proceedTOCheckout.click();
    }

    public void proceedToCheckoutStep1() {
        this.proceedTOCheckoutStep1.click();
    }

    public void clickOnCheckBox() {
        this.clickOnCheckBox.click();
    }

    public void shippingProceedToCheckout() {
        this.shippingProceedTOCheckout.click();
    }

    public void clickOnPayment() {
        this.makePayment.click();
    }
}
