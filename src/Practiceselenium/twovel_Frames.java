package Practiceselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twovel_Frames {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(1000);
		//finding all frames
		int allfreames = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total no of frames :"+ allfreames);
		//go inside frame and perform operations
		for(int i=0;i<allfreames;i++) {
			driver.switchTo().frame(i);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='app-store-link']")).click();
			driver.navigate().refresh();
		}
		
	}

}
