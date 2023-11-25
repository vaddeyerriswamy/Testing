
package Practiceselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sixth_HandlingDynamicWebelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		//Dynamicwebelement
		
		List<WebElement> allcompanies=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[1]/a"));
		System.out.println("The total no of elements :" + allcompanies.size());
		
		List<WebElement> Currentprice=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[4]"));
		System.out.println("The total no of price :" + Currentprice.size());
		
		String excpted = "Misquita Engineering";
		
		for (int i=0;i<allcompanies.size();i++) {
			if(allcompanies.get(i).getText().equalsIgnoreCase(excpted)) {
				System.out.println(allcompanies.get(i).getText() + "===" +Currentprice.get(i).getText());
				allcompanies.get(i).click();
				break;
			}
		}
	}

}
