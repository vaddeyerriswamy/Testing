import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingEXcelfile {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		//Specify the location of file
		File src= new File("\"C:\\Users\\Vyswa\\OneDrive\\Desktop\\All Testing Materials\\New Microsoft Excel Worksheet.xlsx\"");
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkPlace\\Demo\\Driver4\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
		//Load the file
		FileInputStream fls=new FileInputStream(src);
		//Load the workbook
	
	}

}
