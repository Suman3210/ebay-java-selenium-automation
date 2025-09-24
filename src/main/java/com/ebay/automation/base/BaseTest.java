package com.ebay.automation.base;

import com.ebay.automation.utils.ConfigReader;
import com.ebay.automation.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        ConfigReader.loadConfig();
        driver = DriverFactory.initDriver(ConfigReader.get("browser"));
        driver.get(ConfigReader.get("url"));
    }

    @AfterClass
    public void teardown() {
        DriverFactory.quitDriver();
    }
}
