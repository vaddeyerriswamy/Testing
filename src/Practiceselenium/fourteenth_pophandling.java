package Practiceselenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourteenth_pophandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		
		//Tab Handling
		Thread.sleep(1000);
		driver.findElement(By.id("tabButton")).click();
		
		//total no of opened tabs/Windows
		Set<String> windows=driver.getWindowHandles();
		System.out.println("The total no of windows opend:" +windows.size() );
		System.out.println(windows);
		
		Iterator<String> abc =windows.iterator();
		
		String win1=abc.next();
		String win2=abc.next();
		//Print the current tab of title
		driver.switchTo().window(win1);
		Thread.sleep(2000);
		System.out.println("Window 1 switched");
		System.out.println(driver.getTitle());
		
		//Print the current tab of url
		Thread.sleep(2000);
		driver.switchTo().window(win2);
		System.out.println("child Window 2 switched");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//WIndow handling
		Thread.sleep(2000);
		driver.switchTo().window(win1);
		Thread.sleep(1000);
		driver.findElement(By.id("windowButton")).click();
		//print the title of current window
		Thread.sleep(2000);
		Set<String> windows2= driver.getWindowHandles();
		String win3=abc.next();
		String win24=abc.next();
		//Print the current tab of title
		driver.switchTo().window(win3);
		Thread.sleep(2000);
		System.out.println("Window 1 switched");
		System.out.println(driver.getTitle());
		
		
	}

}
