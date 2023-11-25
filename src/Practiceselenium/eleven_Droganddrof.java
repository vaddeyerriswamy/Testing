package Practiceselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class eleven_Droganddrof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		//switching to frame
		driver.switchTo().frame(0);
		System.out.println("switched to framed");
		
		//dragable webelement
		WebElement drag=driver.findElement(By.id("draggable"));
		
		//drapable webelement
//		WebElement drap=driver.findElement(By.id("droppable"));
		//drag and rop using actions class
		Actions act = new Actions(driver);
//		act.dragAndDrop(drag, drap).build().perform();
		//drag and drof one place to another
		act.dragAndDropBy(drag,100,100).build().perform();
		//drog webelemnt and hold 
		act.clickAndHold().dragAndDropBy(drag, 100, 100).build().perform();
	}

}
