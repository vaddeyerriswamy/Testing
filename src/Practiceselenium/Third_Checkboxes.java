package Practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		Thread.sleep(2000);
		
		//First method
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
		
		//Second method
		List <WebElement> Checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println("Total No of checkboxes :"+Checkbox.size());
		System.out.println(Checkbox.get(2).isDisplayed());
		
		//Third method
		
		List <WebElement> Checkbox1 = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println("Total No of checkboxes :"+Checkbox1.size());
		
		String expresult="Orange";
		for (int i=0;i<Checkbox1.size();i++) {
			if(Checkbox1.get(i).getText().equalsIgnoreCase(expresult));
			Checkbox1.get(i).click();
			System.out.println(expresult + "Clicked");
		}

	}

}
