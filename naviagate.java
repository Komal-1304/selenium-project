package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class naviagate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/komal/Desktop/element.html");
Thread.sleep(3000);
driver.findElement(By.id("mumbai")).click(); //whenever we have number we dont use id
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.findElement(By.id("banglore")).click();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.quit();
	}

}
