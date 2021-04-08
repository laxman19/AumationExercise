package com.evoco.pageobjects;

import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;
import java.util.concurrent.TimeUnit;


public class CreateAccountPage extends BasePage {

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "customer_firstname")
    public WebElement customer_firstname;
    @FindBy(how = How.ID, using = "customer_lastname")
    public WebElement customer_lastname;
    @FindBy(how = How.NAME, using = "passwd")
    public WebElement passwd;
    @FindBy(how = How.ID, using = "id_gender1")
    public WebElement setTitle;
    @FindBy(how = How.ID, using = "days")
    public WebElement days;
    @FindBy(how = How.ID, using = "months")
    public WebElement months;
    @FindBy(how = How.ID, using = "years")
    public WebElement years;

    @FindBy(how = How.ID, using = "firstname")
    public WebElement firstname;
    @FindBy(how = How.ID, using = "lastname")
    public WebElement lastname;
    @FindBy(how = How.ID, using = "address1")
    public WebElement address;
    @FindBy(how = How.ID, using = "city")
    public WebElement city;
    @FindBy(how = How.ID, using = "id_state")
    public WebElement state;
    @FindBy(how = How.ID, using = "postcode")
    public WebElement postcode;
    @FindBy(how = How.ID, using = "id_country")
    public WebElement country;
    @FindBy(how = How.ID, using = "phone_mobile")
    public WebElement phone;
    @FindBy(how = How.ID, using = "alias")
    public WebElement alias;

    @FindBy(how = How.ID, using = "submitAccount")
    public WebElement submitAccount;

    @FindBy(how = How.XPATH, using =   "//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")
    public WebElement personalInformation;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/div/form/fieldset/div[11]/button/span")
    public WebElement saveButton;

    @FindBy(how = How.XPATH, using = "//*[@id='old_passwd']")
    public WebElement oldPassword;

    public void setFormDetails(DataTable dataTable) {
        Map<String, String> data = dataTable.asMaps().get(0);
        System.out.println(data);
        this.setTitle.click();
        this.customer_firstname.sendKeys(data.get("First Name"));
        this.customer_lastname.sendKeys(data.get("Last Name"));
        this.passwd.sendKeys(data.get("Password"));
        Select dateDropDown = new Select(this.days);
        dateDropDown.selectByValue(data.get("Day"));
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        Select monthDropDown = new Select(this.months);
        monthDropDown.selectByValue(data.get("Month"));
        Select yearDropDown = new Select(this.years);
        yearDropDown.selectByValue(data.get("Year"));
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.firstname.sendKeys(data.get("Address First Name"));
        this.lastname.sendKeys(data.get("Address Last Name"));
        this.address.sendKeys(data.get("Address"));
        this.city.sendKeys(data.get("City"));
        Select stateDropDown = new Select(this.state);
        stateDropDown.selectByValue(data.get("State"));
        this.postcode.sendKeys(data.get("ZipCode"));
        Select countryDropDown = new Select(this.country);
        countryDropDown.selectByValue(data.get("Country"));
        this.phone.sendKeys(data.get("Mobile"));
        this.alias.sendKeys(data.get("Address Alias"));
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.submitAccount.click();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }

    public void clickOnPersonalInformation(){
        this.personalInformation.click();
    }
    public void updateFirstname(){
        this.firstname.sendKeys("something");
    }
    public void enterOldPassword(){
this.oldPassword.sendKeys("Password99999");
    }
    public void clickOnSaveUpdate(){
        this.saveButton.click();
    }


}
