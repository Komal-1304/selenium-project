package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
	static {
		System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean output = driver.findElement(By.name("login")).isEnabled();
		if(output==true) {
			System.out.println("button is enabled");
		}
			else {
				System.out.println("button is disabled");
				
			}
		Thread.sleep(3000);
		driver.close();
		}

	}


