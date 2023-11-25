package Practiceselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirteen_ALert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(100,60)");
		//Alert handling
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()=\"Click me\"])[3]")).click();
		Thread.sleep(2000);
		//Verifying alert text
		driver.switchTo().alert().accept();
		
	}

}
