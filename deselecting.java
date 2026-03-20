package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselecting {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		  
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(3000);
		  
		driver.findElement(By.linkText("Multi Select")).click();
		Thread.sleep(3000);
		  
		 WebElement country = driver.findElement(By.id("select-multiple-native"));
		 Thread.sleep(3000);
		  
		 Select s=new Select(country);
		 s.deselectByVisibleText("Poland");
		 Thread.sleep(3000);
		  
		 s.selectByVisibleText("India");
		 Thread.sleep(3000);
		  
		 s.selectByValue("Canada");
		Thread.sleep(3000);
		String firstoption=s.getFirstSelectedOption().getText();
	System.out.println(firstoption);
	Thread.sleep(3000);
	driver.close();
		  
	}

}
//deselectAll
//deselectbyindex
//deselectbyvalue
//deselectbyvisibletext
