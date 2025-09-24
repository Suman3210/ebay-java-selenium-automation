eBay Automation Project

This project is a Selenium + TestNG + Maven automation framework that automates the following flow on eBay
:

Open eBay homepage

Search for a product

Select the first product from search results (handles new window/tab switch)

Add the product to the cart

Open the cart and proceed to checkout

Login if required

Continue to shipping

Select PayPal and redirect to the payment page

Tech Stack

Java 17+ (recommended)

Selenium WebDriver 4.x

TestNG (test framework)

Maven (build & dependency management)

WebDriverManager (auto-manages browser drivers)

Setup Instructions
 Clone the repo
git clone https://github.com/your-username/ebay-automation.git
cd ebay-automation

Configure properties

Edit src/test/resources/config.properties with your test account:

url=https://www.ebay.com
browser=chrome
username=your_email@example.com
password=your_password

