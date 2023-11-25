import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		
		
		//Enter user name
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("test@gmail.com");
		
		//Fetch input box from attribute value
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		//Fetching height of input box
		
		System.out.println(driver.findElement(By.id("email")).getSize().getHeight());

		System.out.println(driver.findElement(By.id("email")).getSize().getWidth());
		System.out.println(driver.findElement(By.id("email")).getSize().getClass());
		
		//use of explicit wait
		WebDriverWait wt=new WebDriverWait(driver, 10);
	
		driver.close();

	}

}
