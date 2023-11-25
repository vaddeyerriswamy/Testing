import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		
		//Tab Handling
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		
		
		Set<String> windowhandles =driver.getWindowHandles();
		System.out.println("Total no of windowhandles :" +windowhandles);
		
		Iterator<String> itr=windowhandles.iterator();
		String win1=itr.next();
		String win2=itr.next();
		
		//Title of parent window
		driver.switchTo().window(win1);
		System.out.println("Title of the window :"+win1);
		System.out.println(driver.getTitle());
		driver.close();
		
		//title of current window or child window
		Thread.sleep(2000);
		driver.switchTo().window(win2);
		System.out.println("Title of the window :"+win2);
		System.out.println(driver.getCurrentUrl());
		//2nd sep for windows
		Thread.sleep(2000);
		driver.switchTo().window(win1);
		Thread.sleep(2000);
		driver.findElement(By.id("New Window")).click();

	}

}
