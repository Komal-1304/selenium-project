package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
 ChromeDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.navigate().to("https://www.youtube.com/");
 Thread.sleep(5000);
 driver.findElement(By.id("")).sendKeys("songs");
 driver.findElement(By.id("")).click();
 
 Thread.sleep(5000);
 driver.close();

 
	}

}
