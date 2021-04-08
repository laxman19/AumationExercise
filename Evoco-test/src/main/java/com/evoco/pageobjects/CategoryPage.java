package com.evoco.pageobjects;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CategoryPage extends BasePage {

    public CategoryPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[3]/a")
    public WebElement tShirts;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")
    public WebElement feededTshirt;

    public void clickOnTshirtAndFeededTshirt() {
        this.tShirts.click();
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        this.feededTshirt.click();
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }
}
