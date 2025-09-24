package com.ebay.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CartPage {
	static JavascriptExecutor js;
    private WebDriver driver;
    private By cartIcon = By.xpath("//*[@id=\"binBtn_btn_1\"]/span/span");
    private By checkoutBtn = By.xpath("a[data-test-id='cta-top']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
    	
        driver.findElement(cartIcon).click();
    }

    public void checkout() {
        driver.findElement(checkoutBtn).click();
    }
}
