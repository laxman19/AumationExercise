package com.evoco.managers;

import com.evoco.pageobjects.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver driver;

    private AuthenticationPage authenticationPage;
    private LandingPage landingPage;
    private CreateAccountPage createAccountPage;
    private CategoryPage categoryPage;
    private ProductPage productPage;
    private OrderPage orderPage;
    private PaymentPage paymentPage;
    private OrderConfirmationPage orderConfirmationPage;
    private HistoryPage historyPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public AuthenticationPage getAuthenticationPage() {
        return (authenticationPage == null) ? authenticationPage = new AuthenticationPage(driver) : authenticationPage;
    }

    public LandingPage getLandingPage() {
        return (landingPage == null) ? landingPage = new LandingPage(driver) : landingPage;
    }

    public CreateAccountPage getCreateAccountPage() {
        return (createAccountPage == null) ? createAccountPage = new CreateAccountPage(driver) : createAccountPage;
    }

    public CategoryPage getCategoryPage() {
        return (categoryPage == null) ? categoryPage = new CategoryPage(driver) : categoryPage;
    }

    public ProductPage getProductPage() {
        return (productPage == null) ? productPage = new ProductPage(driver) : productPage;
    }

    public OrderPage getOrderPage() {
        return (orderPage == null) ? orderPage = new OrderPage(driver) : orderPage;
    }

    public PaymentPage getPaymentPage() {
        return (paymentPage == null) ? paymentPage = new PaymentPage(driver) : paymentPage;
    }

    public OrderConfirmationPage getOrderConfirmationPage() {
        return (orderConfirmationPage == null) ? orderConfirmationPage = new OrderConfirmationPage(driver) : orderConfirmationPage;
    }

    public HistoryPage getHistoryPage() {
        return (historyPage == null) ? historyPage = new HistoryPage(driver) : historyPage;
    }
}
