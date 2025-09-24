package com.ebay.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By searchBox = By.id("gh-ac");
    private By searchButton = By.xpath("//*[@id=\"gh-f\"]/div[2]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
