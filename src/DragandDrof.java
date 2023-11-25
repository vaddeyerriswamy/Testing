import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrof {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
//		driver.get("https://jqueryui.com/droppable/");
		
		//switch to frame
		driver.switchTo().frame(0);
		System.out.println("Switch to frame");
		
		WebElement drag=driver.findElement(By.id("draggable"));
//		
//		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(1000);
//		act.dragAndDrop(drag, drop).build().perform();
		act.dragAndDropBy(drag, 400,100).build().perform();

	}

}
