package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktextlocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");//set path
		
		ChromeDriver driver =new ChromeDriver();//launch browser
		
		driver.manage().window().maximize();//maximize
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");//navigate to FB
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Create")).click();//click on create account button
		Thread.sleep(3000); //wait
		driver.close();//close

		
	}
}


//partial link sysntax is ame as tagname text

//id,name,classname ,tagname, linktest, partial linktext

//partiallinklocator