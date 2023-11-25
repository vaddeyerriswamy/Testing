import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
			 
		
		//Alert handling
		
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		Thread.sleep(2000);
		//Alert accepted
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
//		dismiss alert
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    Thread.sleep(1000);
	      //specify the number of pixels the page must be scrolled
	     js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
			
	}

}
