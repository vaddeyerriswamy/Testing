import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.computerhope.com/jargon/c/checkbox.htm#:~:text=A%20check%20box%2C%20selection%20box,of%20applications%20and%20operating%20systems.");
//		Thread.sleep(1000);
		//Javascript
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//Scroll down using Javascripts
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");

		driver.findElement(By.xpath("//input[@id='Example-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Example-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Example-3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Example-4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Example-5']")).click();
		
		//Javascript
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		//Scroll down using Javascripts
//				Thread.sleep(2000);
//				js.executeScript("window.scrollBy(0,500)");
//		Method 2
		List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total no fo chcek boxs :"+ check.size());
		System.out.println(check.get(0).isSelected());
		System.out.println(check.get(0).isDisplayed());
		driver.close();
	}

}
