package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsizemetod {
static{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(3000);
driver.get("https://www.facebook.com/");
 int value =driver.findElement(By.xpath("//img[@alt='Facebook']")).getSize().getHeight();
System.out.println(value);
int values =driver.findElement(By.xpath("//img[@alt='Facebook']")).getSize().getWidth();

System.out.println(values);
Thread.sleep(3000);
driver.close();

	}

}


//get size two method
//getheight()
//getwidth()
