package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class namemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
driver.findElement(By.name("email")).sendKeys("abcd2gmail.com"); //name locator
driver.findElement(By.name("pass")).sendKeys("abcd123");
Thread.sleep(3000);
driver.close();
	}

}
