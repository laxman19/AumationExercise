package com.evoco.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HistoryPage extends BasePage{
    public HistoryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//*[@id='order-list']/tbody/tr/td[3]")
    public WebElement totalPrice;

    public void validatePrice(){
        String price=totalPrice.getText().replace("$", "");
        float totalPrice=Float.parseFloat(price);
        int expected=0;
        System.out.println("*****************"+totalPrice);
        //Assert.assertEquals(price,"$19.25");
        Assert.assertTrue(totalPrice>0);
    }
}
