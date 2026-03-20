package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 15");
		Thread.sleep(3000);
	List<WebElement> allsugg = driver.findElements(By.xpath("//span[text()='iphone 15']/.."));
		int count=allsugg.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String sugg= allsugg.get(i).getText();
			System.out.println(sugg);
			Thread.sleep(3000);
			driver.close();
			
		}

		
	}

}

//eventlistners...blur....remove..remove.. css code


//diff betn find element and find elements

//