package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submitmethod {
static {
	System.setProperty("webdriver.chrome.driver.", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Submit Click']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='satisfaction'])[1]")).click();
		driver.findElement(By.xpath("((//button[text()='Submit'])[1])")).submit();
		Thread.sleep(3000);
		driver.close();
		

	}

}

//submit method


