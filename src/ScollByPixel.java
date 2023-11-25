
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScollByPixel {

	public static void main(String[] args) throws InterruptedException {
		
		 //specify the location of the driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(1000);
	       //launch the website
	       driver.get("https://www.album.alexflueras.ro/index.php");

			driver.manage().window().maximize();
	 
	       //maximize the window to full screen
	       driver.manage().window().maximize();
	 
	       //It will wait for maximum of 10sec for each object
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	 

	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       Thread.sleep(3000);
	       //specify the number of pixels the page must be scrolled
	       js.executeScript("window.scrollBy(0,3000)");
	 
//	       driver.close();

	}

}


