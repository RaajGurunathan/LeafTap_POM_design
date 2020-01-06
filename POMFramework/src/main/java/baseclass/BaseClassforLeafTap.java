package baseclass;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import day10.classroom.ReadExcel;

public class BaseClassforLeafTap {
	public static ChromeDriver driver;
	@BeforeMethod
	//@Parameters({"url","uname","pswd"})
	public void lanchBroswer() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	public static String FileName;
	
	@DataProvider 
	public String[][] getData() throws IOException{
		ReadExcel RE = new ReadExcel();
		return RE.readExcel(FileName); 
	
	}
	@AfterMethod
	public void closeBroswer() {
		driver.close();
	}
	
	
}
