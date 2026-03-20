package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions a=new Actions(driver);
	
	a.contextClick(element).perform();
	driver.findElement(By.xpath("//span[text()='Edit']")).click();
	Alert al= driver.switchTo().alert();
	al.accept();
	Thread.sleep(5000);
	driver.close();

	
	}

}
