package Practiceseleniumtwo;

import java.io.File;
import java.net.MulticastSocket;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drodown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//Taking SCreenShots
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		driver.findElement(By.xpath("//*[text()='Sign up for Facebook']")).click();
		
		//filling the details
		
		driver.findElement(By.name("firstname")).sendKeys("swamy");
		driver.findElement(By.name("lastname")).sendKeys("swamy");
		driver.findElement(By.name("reg_email__")).sendKeys("6304462451");
		driver.findElement(By.id("password_step_input")).sendKeys("Amrutha@123#");
		
		//Using List for Days
		List<WebElement> Days=driver.findElements(By.xpath("//*[@name=\"birthday_day\"]/option"));
		System.out.println("Total no of days :" + Days.size());
		Days.get(16).click();
		//Using List for Months
		List<WebElement> Month=driver.findElements(By.xpath("//*[@name=\"birthday_month\"]/option"));
		System.out.println("Total no of Months :" + Month.size());
		Month.get(11).click();
		//Using List for Years
		List<WebElement> Year=driver.findElements(By.xpath("//*[@name=\"birthday_year\"]/option"));
		System.out.println("Total no of Months :" + Year.size());
		Year.get(25).click();	
		
		
		//Clicking Genders
		WebElement st=driver.findElement(By.xpath("//*[text()='Male']"));
		st.click();
		System.out.println("Male button is clicked");
		
		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Sign Up'])[1]")));
		driver.findElement(By.xpath("(//*[text()='Sign Up'])[1]")).click();
		driver.findElement(By.xpath("(//*[@role=\"button\"])[8]")).click();
	}

		}
