package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {
	static {
		System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");
   }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    boolean output = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	    if (output==true) {
	    	System.out.println("logo is displayed");
			
		} else {
			System.out.println("logo is not displayed");

		}
	    Thread.sleep(5000);
	    driver.close();	    
	}

}
