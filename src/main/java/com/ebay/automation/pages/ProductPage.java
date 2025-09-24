package com.ebay.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By addToCartButton = By.xpath("//*[@id=\"binBtn_btn_1\"]/span/span");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() throws InterruptedException {
        driver.findElement(addToCartButton).click();

        Thread.sleep(10000000);
    }
}
