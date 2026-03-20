package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys2 {


		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to ("https://www.amazon.in/");
			Thread.sleep(3000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("box");
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(3000);
			driver.close();
			
	}

}
