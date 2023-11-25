package Practiceselenium;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ten_MouseSimulation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/mnjuser/homepage?");
		
		
		//
		WebElement companies = driver.findElement(By.xpath("//*[text()='Companies']"));
		
		// Mouse simulation using Action clasess
		Actions act =new Actions(driver);
		//Mouse hover to companies
		Thread.sleep(1000);
		act.moveToElement(companies).build().perform();
		
		
		//Keyboard Operations
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		WebElement featured=driver.findElement(By.xpath("//*[text()='Featured companies']"));
		Thread.sleep(2000);
		act.sendKeys(featured,Keys.ENTER).build().perform();
		System.out.println("featured option is clicked");
		
		//Right click on webpage
		act.contextClick().build().perform();
		
	}

}
