package Practiceselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fifth_Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}

}
