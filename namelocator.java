package qsp;


	import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
	public class namelocator{

	
public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	ChromeDriver driver = new ChromeDriver();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("file:///C:/Users/komal/Desktop/element.html");
    driver.findElement(By.className("Station")).click(); ///classname locator
	Thread.sleep(3000);
	driver.quit();
}
}
