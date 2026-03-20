package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisabled {
	static {
		System.setProperty("webdriver.chrome.driver.", "./driver.chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(5000);
		boolean output = driver.findElement(By.name("sex")).isSelected();
		if (output==true) {
			System.out.println("Button is selected");
		} else {
            System.out.println("Button is not Selected");
		}
		Thread.sleep(3000);
		driver.close();
		
	}

}

//div[text()='Sign Up']
