package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
 
	public static void main (String [] args) throws InterruptedException {
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//path set
			ChromeDriver driver= new ChromeDriver(); //launch browser 
			driver.manage().window().maximize();//
			driver.get("https://www.youtube.com/"); // navigate to youtube 
			String url = driver.getCurrentUrl(); //get url of appln
			System.out.println (url);
			Thread.sleep(5000); //wait
			driver.close();// close the window
	}
}
