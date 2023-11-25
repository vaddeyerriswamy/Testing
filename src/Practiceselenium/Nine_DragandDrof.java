package Practiceselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nine_DragandDrof {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		//Javascript
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		//Locate webelement
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='abc@gmail.com'");
		
		//scrolldown using Javascript	
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,4200)");
		
		jse.executeScript("window.");
		//scroll up using Javascript
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,-1000)");
			}
	}


