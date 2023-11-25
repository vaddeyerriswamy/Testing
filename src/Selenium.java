import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
			//delete all cookies
			Thread.sleep(2000);
			driver.manage().deleteAllCookies();
//			driver.close();
			//refresh the page
			Thread.sleep(1000);
			driver.navigate().refresh();
			//back
			driver.navigate().back();
			//forward
			driver.navigate().forward();
			//get current url
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.close();
	}

}
