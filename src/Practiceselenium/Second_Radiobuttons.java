package Practiceselenium;

import java.io.File;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second_Radiobuttons {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		//Taking ScreenShots
		
	
		
		//First Method
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]")).click();
		
		//Second method
		List <WebElement> radio=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println("Total no of radio buttons :"+ radio.size());
		System.out.println(radio.get(0).isEnabled());
		System.out.println(radio.get(0).isDisplayed());
		System.out.println(radio.get(2).isSelected());
		radio.get(1).isSelected();
				
		//third method
		List <WebElement> radio1=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println("Total no of radio buttons texts :"+ radio1.size());
		String expresults="Internet Explorer";
		String expresults1="Mozilla";
		String expresults2="Opera";
		
		for (int i=0;i<radio1.size();i++) 
		{
			if (radio1.get(i).getText().equalsIgnoreCase(expresults));
				radio1.get(i).click();
				System.out.println(expresults+" Cliocked");
				break;
			
		}
		for (int i=1;i<radio1.size();i++) 
		{
			if (radio1.get(i).getText().equalsIgnoreCase(expresults1));
				radio1.get(i).click();
				System.out.println(expresults1+" Cliocked");
				break;
			
		}
		for (int i=2;i<radio1.size();i++) 
		{
			if (radio1.get(i).getText().equalsIgnoreCase(expresults2));
				radio1.get(i).click();
				System.out.println(expresults2+" Cliocked");
				break;
			
		}
		
	
	}

}
