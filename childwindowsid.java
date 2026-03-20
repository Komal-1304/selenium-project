package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowsid {
	static {
		System.setProperty("webdriver.chorme.driver","./driver/chromedriver.exe");
	
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
		 Set<String> allwind = driver.getWindowHandles();
		 for (String win : allwind) {
			//System.out.println(win);  
			 
			 
			 
			 driver.switchTo().window(win);
			 Thread.sleep(2000);
			 driver.close();
		
		}
		 Thread.sleep(2000);
		// driver.quit();    wrp to close all the browser without using quit method
	}

}
