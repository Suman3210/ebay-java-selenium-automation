package com.ebay.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailInput = By.id("userid");
    private By continueBtn = By.id("signin-continue-btn");
    private By passwordInput = By.id("pass");
    private By signInBtn = By.id("sgnBt");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) throws InterruptedException {
        driver.findElement(emailInput).sendKeys(username);
        driver.findElement(continueBtn).click();
        Thread.sleep(2000);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(signInBtn).click();
        Thread.sleep(3000);
    }
}
