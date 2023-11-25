package Practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fourth_Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(2000);
		
		//first way
		driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]")).click();
		driver.findElement(By.xpath("//option[@value=\"Google\"]")).click();
		// 2ndst way
		List<WebElement> drpdown = driver.findElements(By.xpath("//select[@id=\"first\"]/option"));
		System.out.println(drpdown.size() + " Total No of dropdowns values");
		Thread.sleep(2000);
		drpdown.get(2).click();
		//3rd way
		
		WebElement drpdown1 = driver.findElement(By.xpath("//select[@id=\"first\"]"));
		System.out.println("Total no of dropdown elements :" + drpdown1.getSize());
		
		Select  drop=new Select (drpdown1);
		Thread.sleep(2000);
		drop.selectByVisibleText("Yahoo");
		Thread.sleep(2000);
		drop.selectByIndex(1);
		Thread.sleep(2000);
		drop.selectByValue("Apple");
		System.out.println(drop.getFirstSelectedOption().getText());
		
		//4th way
		List<WebElement> d=drop.getOptions();
		for (int i=0;i<d.size();i++) {
			if(d.get(i).getText().equalsIgnoreCase("Apple")) {
				d.get(i).click();
			}
		//5th way
			
			drpdown1.sendKeys("Yahoo");
		}
	}

}
