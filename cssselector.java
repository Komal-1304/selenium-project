package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		
	}

public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();//launch browser
		
		driver.manage().window().maximize();//maximize
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone15");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}

//css selector- tagname[AN='AV']
//ctrl+F to check the element.

