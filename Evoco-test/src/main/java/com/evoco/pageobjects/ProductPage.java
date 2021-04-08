package com.evoco.pageobjects;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='add_to_cart']/button/span")
    public WebElement addTOCart;

    @FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    public WebElement proceedToCheckOut;

    public void clickOnAddToCart() {
        addTOCart.click();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }

    public void clickOnProceedCheckout() {
        proceedToCheckOut.click();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }
}
