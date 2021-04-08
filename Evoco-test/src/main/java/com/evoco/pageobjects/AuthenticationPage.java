package com.evoco.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AuthenticationPage extends BasePage {

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "email_create")
    public WebElement emailAddressInput;

    @FindBy(how = How.ID, using = "email")
    public WebElement singInEmail;

    @FindBy(how = How.ID, using = "passwd")
    public WebElement password;

    @FindBy(how = How.NAME, using = "SubmitCreate")
    public WebElement createAccountButton;

    @FindBy(how = How.NAME, using = "SubmitLogin")
    public WebElement signInButton;

    public void setEmailAddress(String emailAddress) {
        this.emailAddressInput.sendKeys(emailAddress);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void setSignInEmail(String email) {
        this.singInEmail.sendKeys(email);
    }

    public void clickSignInButton() {
        this.signInButton.click();
    }

    public void clickCreateAccountButton() {
        this.createAccountButton.click();
    }

}