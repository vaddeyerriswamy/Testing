import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepo {

	public static void main(String[] args) throws IOException {
		
		//Specify the location properties
		
		File src1=new 	File("C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Repository\\configration.properties");
	

		File src2=new 	File("C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Repository\\locators.properties");
	
		File src3=new 	File("C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Repository\\testdata.properties");
	
		//create File input Stream class object to load the file
		
		FileInputStream fis1 =new FileInputStream(src1);
		FileInputStream fis2 =new FileInputStream(src2);
		FileInputStream fis3 =new FileInputStream(src3);
		
		//create properties class object
		Properties pro1=new Properties();
		pro1.load(fis1);
		
		Properties pro2=new Properties();
		pro2.load(fis2);
		
		Properties pro3=new Properties();
		pro3.load(fis3);
		
		//Chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver4"
				+ ""
				+ ""
				+ "");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(pro1.getProperty("URL"));
		//getproperty method will accept the key and return the value of that key
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
		
	}

}
