package Practiceselenium;

import java.util.concurrent.TimeUnit;import javax.naming.event.NamingExceptionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fifth_Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		
		//Enetr USername
		driver.findElement(By.id("email")).sendKeys("vyswamy465@gmail.com");
		//fetchinput inputbox attribute value
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		//get height of input box
		System.out.println(driver.findElement(By.id("email")).getSize().getHeight());
		//Gte width of input box
		System.out.println(driver.findElement(By.id("email")).getSize().getWidth());
		
		WebDriverWait wt =new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcda");
	}

}
