package com.ebay.automation.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage  {
    private WebDriver driver;
    private By firstProduct = By.xpath("//*[@id=\"item1fc8111174\"]/div/div[2]/div[1]/a/div/span[2]");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    
    public void selectFirstProduct() {
        driver.findElements(firstProduct).get(0).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(1000,0)");

    }
}
