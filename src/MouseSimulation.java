import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class=\"_30XB9F\"]")).click();
		
		//Creating electronin webelement as ref
		
		WebElement elecro=driver.findElement(By.xpath("//*[text()=\"Electronics\"]"));
		
		//Mouse simulation Using Action class
		Actions act=new Actions(driver);
		
		Thread.sleep(1000);
		act.moveToElement(elecro).build().perform();
		
		//Keyboard Operations
		Thread.sleep(1000);
		driver.navigate();
		Thread.sleep(3000);
		WebElement fash=driver.findElement(By.xpath("//*[text()=\"Fashion\"]"));
		Thread.sleep(1000);
		act.sendKeys(fash,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		System.out.println("Fashion Option is clicked");
		
		act.contextClick().build().perform();
		
		
	}

}
