import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		//JavaScripts
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//Locating Elements on UI
		js.executeScript("document.getElementByID('email').value='Swamy@test.com'");
		js.executeScript("document.getElementByID('pass').value='1234567'");

	}

}
