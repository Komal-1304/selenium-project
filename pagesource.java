package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty ("webdriver.chrome.driver" ,"./driver/chromedriver.exe");

ChromeDriver driver= new ChromeDriver(); //launch browser 
driver.manage().window().maximize();

driver.get("https://www.amazon.in/");
String source = driver.getPageSource();
System.out.println(source);
Thread.sleep(5000);
driver.close();
	
	}
}

