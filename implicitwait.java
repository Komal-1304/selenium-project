package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class implicitwait {

	
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	driver.findElement(By.linkText("Multi Select")).click();
	WebElement country = driver.findElement(By.id("select-multiple-native"));
	Select s =new Select(country);
	String option= s.getWrappedElement().getText();
	System.out.println(option);
	Thread.sleep(3000);
	driver.close();
	
	

		
		
		
		
		
		}

}


//impilict wait- is used for find element and find elements method
//duration is java class present in time package
//methods of duration -of seconds,of nano,of min...this are static method