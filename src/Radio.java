import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,'/r.php?locale=en_GB&display=page')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"-1\"]")).click();
		
		//Method 2
		List<WebElement> radious =driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		System.out.println("total Radio buttons : " +radious.size());
		System.out.println(radious.get(0).isSelected());
		System.out.println(radious.get(1).isEnabled());
		System.out.println(radious.get(2).isDisplayed());
		Thread.sleep(1000);
		radious.get(1).click();
		System.out.println(radious.get(2).isSelected());
		//Third method
		List<WebElement> radious1 =driver.findElements(By.xpath("//label[@class=\"_58mt\"]"));
		System.out.println("Total no od Texts :" +radious1.size());
		String expresult="Female";
		for(int i=3;i>radious1.size();i++) {
			if(radious1.get(i).getText().equalsIgnoreCase(expresult)) {
				radious1.get(i).click();
				System.out.println(expresult);
//				break;
			}
		}
		driver.close();
		

	}

}
