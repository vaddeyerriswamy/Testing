import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		
		//Javascripts
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('email').value='test@gmail.com'");
		js.executeScript("document.getElementById('pass').value='test@gmail.com'");
		
		//Scroll down using Javascripts
		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,500)");
		//Scroll down using Javascripts
			
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(40,300)");
				
		
	}

}
