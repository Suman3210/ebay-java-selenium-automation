package com.ebay.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    private By continueToShippingBtn = By.id("sbtBtn");
    private By paypalOption = By.cssSelector("input[value='paypal']");
    private By confirmAndContinueBtn = By.id("confirmButtonTop");
    private By loginRequiredBtn = By.id("signin-continue-btn");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoginRequired() {
        return driver.findElements(loginRequiredBtn).size() > 0;
        
    }

    public void proceedToShipping() {
        try { driver.findElement(continueToShippingBtn).click(); } catch (Exception ignored) {}
    }

    public void selectPaypalAndContinue() {
        try {
            driver.findElement(paypalOption).click();
            driver.findElement(confirmAndContinueBtn).click();
        } catch (Exception ignored) {}
    }
}
