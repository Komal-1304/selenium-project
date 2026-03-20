package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");//set path
			
			ChromeDriver driver =new ChromeDriver();//launch browser
			
			driver.manage().window().maximize();//maximize
			Thread.sleep(3000);
			driver.get("https://www.flipkart.com/");
			
		driver.findElement(By.name("q")).sendKeys("iphone 15");
		Thread.sleep(3000);
			
			driver.findElement(By.className("_2iLD__")).click();
			Thread.sleep(3000); //wait
			
			
			driver.close();
}

}
