package Practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Launchingchrome {
			public static void main(String[] args) throws Exception {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver.manage().deleteAllCookies();
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
				driver.navigate().to("https://tcsglobal.udemy.com/organization/home/");
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getWindowHandle());
				driver.navigate().back();
}
}
