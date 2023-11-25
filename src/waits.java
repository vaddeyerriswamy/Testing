import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class waits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//delete all cookies
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("how stuff works");
		
//		List<WebElement> Staff=(List<WebElement>) driver.findElement(By.xpath(""));

	}

}
