import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,'/r.php?locale=en_GB&display=page')]")).click();
		
		//1st way
		List<WebElement> days =driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		System.out.println("Total no of elemets :" +days.size());
		days.get(17).click();
		Thread.sleep(2000);
		
		//2nd way
		WebElement bm=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select month=new Select(bm);
		month.selectByIndex(2);
		Thread.sleep(1000);
		month.selectByValue("12");
		month.selectByVisibleText("Apr");
		System.out.println(month.getFirstSelectedOption().getText());
		//3rd way
		
//		List<WebElement> dropdown=month.getOptions();
		
		//4th way
		Thread.sleep(1000);
		bm.sendKeys("Dec");
		//5th way
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id=\"month\"]")).sendKeys("Jan");
		System.out.println("Selected Month :"+bm.getLocation());
		driver.close();
	}

}
