package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearmethod {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();//maximize
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(6000);
		driver.findElement(By.id("name")).sendKeys("komal");
		Thread.sleep(6000);
		
		driver.findElement(By.id("name")).clear();
	Thread.sleep(3000);
	driver.close();

	}

}
