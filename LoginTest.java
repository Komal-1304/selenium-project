package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();

// Step 1: Open website
driver.get("https://www.saucedemo.com");

Thread.sleep(2000);

// Step 2: Enter username
driver.findElement(By.id("user-name")).sendKeys("standard_user");

// Step 3: Enter password
driver.findElement(By.id("password")).sendKeys("secret_sauce");

// Step 4: Click login
driver.findElement(By.id("login-button")).click();

Thread.sleep(2000);

// Step 5: Add product to cart
driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

// Step 6: Open cart
driver.findElement(By.className("shopping_cart_link")).click();

Thread.sleep(2000);

// Step 7: Validation
if (driver.getCurrentUrl().contains("cart")) {
System.out.println("Test Passed");
} else {
System.out.println("Test Failed");
}

// Close browser
driver.quit();
}
}



