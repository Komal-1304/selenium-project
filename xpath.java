// xpath by indexing.

package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		
	}

public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();//launch browser
		
		driver.manage().window().maximize();//maximize
		Thread.sleep(3000);
		driver.get("https://www.zomato.com/mumbai");
		

		// TODO Auto-generated method stub
		
		

	}

}


//xptah  -one of the locator use to locate the page 
//type of Xpath-
//-absolute xpath- / start with 
//relative xpath- //
      //- xpath by attribute -//tagname[@AN='AV']
 //xpath by text button
//xpath by contains function
//xpath by indexing
//xpathby independent and dependent

//priority-1)name 2)id 3)x-path