package com.ebay.automation.tests;

import com.ebay.automation.base.BaseTest;
import com.ebay.automation.pages.CartPage;
import com.ebay.automation.pages.CheckoutPage;
import com.ebay.automation.pages.HomePage;
import com.ebay.automation.pages.LoginPage;
import com.ebay.automation.pages.ProductPage;
import com.ebay.automation.pages.SearchResultsPage;
import com.ebay.automation.utils.ConfigReader;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class EbayTest extends BaseTest {
	static JavascriptExecutor js;
    @Test
    public void testEbayCheckoutToPayment() throws InterruptedException {
        // Initialize all page objects
        HomePage home = new HomePage(driver);
        SearchResultsPage results = new SearchResultsPage(driver);
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);
        LoginPage login = new LoginPage(driver);

        // 1️⃣ Search a product
        home.searchProduct("samsung galaxy s24 ultra");

        // 2️⃣ Select first product from search results
        results.selectFirstProduct();
        Thread.sleep(2000);
        
     // Switch to new window
        String parentWindow = driver.getWindowHandle();  // save original window
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);  // switch to product tab
                break;
            }
        }      

        
        // 3️⃣ Add product to cart
        product.addToCart();
        Thread.sleep(2000);

        // 4️⃣ Open cart
        cart.openCart();

        // 5️⃣ Proceed to checkout
        cart.checkout();
        Thread.sleep(2000);

        // 6️⃣ Login if required
        if (checkout.isLoginRequired()) {
            login.login(ConfigReader.get("username"), ConfigReader.get("password"));
        }

        // 7️⃣ Proceed to shipping page
        checkout.proceedToShipping();
        Thread.sleep(3000);

        // 8️⃣ Select PayPal as payment method and continue
        checkout.selectPaypalAndContinue();
        Thread.sleep(5000); // Observe redirect to PayPal
    }
}
