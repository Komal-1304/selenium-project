package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//path set
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();//manage method of web driver
		driver.get("https://www.youtube.com/");// get method 
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000); //exception used
		driver.close();// close method
	}

}



