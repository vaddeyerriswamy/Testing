import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framess {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		//finding the total no fo elements
		int allframes=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total no of elements:" +allframes);
		//Go to each frame
		for (int i=0;i<allframes;i++) {
			driver.switchTo().frame(i);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(),\"Watch Video\")]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@role='button']")).click();
		}
	}

}
