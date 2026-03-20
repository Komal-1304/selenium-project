package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocationmethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
int value=driver.findElement(By.id("email")).getLocation().getX();
System.out.println(value);
int values=driver.findElement(By.id("email")).getLocation().getY();
System.out.println(values);
Thread.sleep(3000);
driver.close();

	}

}

//getlocation two types
//get x()
//get y()


