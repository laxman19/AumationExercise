package com.evoco.stepdefinations;

import com.evoco.pageobjects.*;
import com.evoco.utils.TestContext;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class EvocoStepDefinationsTests {

    private TestContext testContext;
    private AuthenticationPage authenticationPage;
    private LandingPage landingPage;
    private CreateAccountPage createAccountPage;
    private CategoryPage categoryPage;
    private ProductPage productPage;
    private OrderPage orderPage;
    private PaymentPage paymentPage;
    private OrderConfirmationPage orderConfirmationPage;
    private HistoryPage historyPage;

    public EvocoStepDefinationsTests(TestContext testContext) {
        this.testContext = testContext;
        this.authenticationPage = testContext.getPageObjectManager().getAuthenticationPage();
        this.landingPage = testContext.getPageObjectManager().getLandingPage();
        this.createAccountPage = testContext.getPageObjectManager().getCreateAccountPage();
        this.categoryPage = testContext.getPageObjectManager().getCategoryPage();
        this.productPage = testContext.getPageObjectManager().getProductPage();
        this.orderPage = testContext.getPageObjectManager().getOrderPage();
        this.paymentPage = testContext.getPageObjectManager().getPaymentPage();
        this.orderConfirmationPage = testContext.getPageObjectManager().getOrderConfirmationPage();
        this.historyPage = testContext.getPageObjectManager().getHistoryPage();
    }

    @When("user clicks on Sing-in link")
    public void user_clicks_on_Sing_in_link() {
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        this.landingPage.signInLink.click();
    }

    @When("user enters {string} as email address")
    public void user_enters_as_email_address(String email) {
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        this.authenticationPage.setEmailAddress(email);
    }

    @When("clicks on Create Account button")
    public void clicks_on_Create_Account_button() {
        this.authenticationPage.clickCreateAccountButton();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
    }

    @When("enter below information to creat an account")
    public void enter_below_information_to_creat_an_account(DataTable dataTable) {
        this.createAccountPage.setFormDetails(dataTable);
    }

    @When("click on Tshirts link and feeded Tshirt link")
    public void click_on_Tshirts_link_and_feeded_Tshirt_link() {
        this.categoryPage.clickOnTshirtAndFeededTshirt();
    }

    @When("click on add to cart")
    public void click_on_add_to_cart() {
        this.productPage.clickOnAddToCart();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

    }

    @When("click on proceed to checkout")
    public void click_on_proceed_to_checkout() {
        this.productPage.clickOnProceedCheckout();
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

    @When("click on proceed to checout on orderpage")
    public void click_on_proceed_to_checout_on_orderpage() {
        this.orderPage.proceedToCheckout();
        this.orderPage.proceedToCheckoutStep1();
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

    @When("click on shipping proceed to checkout page")
    public void click_on_shipping_proceed_to_checkout_page() {
        this.orderPage.clickOnCheckBox();
        this.orderPage.shippingProceedToCheckout();
        this.orderPage.clickOnPayment();
        Uninterruptibles.sleepUninterruptibly(4, TimeUnit.SECONDS);
    }

    @When("make payment")
    public void make_payment() {
        this.paymentPage.clickOnConfirmMyOrder();
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

    @When("cllick on back to orders")
    public void cllick_on_back_to_orders() {
        this.orderConfirmationPage.clickOnBackToOrders();
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

    @And("validate the price")
    public void validateThePrice() {
        this.historyPage.validatePrice();
    }

    // scenario-2

    @When("user enters {string} as password")
    public void userEntersAsPassword(String password) {
        this.authenticationPage.setPassword(password);
    }

    @When("user enters {string} as sign-in email address")
    public void userEntersAsSignInEmailAddress(String emailAddress) {
        this.authenticationPage.setSignInEmail(emailAddress);
    }

    @When("user clicks on Sign-in button")
    public void userClicksOnSignInButton() {
        this.authenticationPage.clickSignInButton();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
    }

    @Then("update personal information and save")
    public void updatePersonalInformationAndSave() {
        this.createAccountPage.clickOnPersonalInformation();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        this.createAccountPage.updateFirstname();
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        this.createAccountPage.enterOldPassword();
        this.createAccountPage.clickOnSaveUpdate();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
    }
}

