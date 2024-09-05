package testscenarios;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

public class Vivek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("thank you for the access");
//System.out.println("This line form Sreeni");

		WebDriver driver;
		driver = new SafariDriver();
		driver.get("https://us.megabus.com/account-management/login");
		driver.manage().window().maximize();
		
		
		
		

//Date ts = new Date();
//DateFormat abc = new SimpleDateFormat("MMMddyyyy_HHmmss");
//String timestamp = abc.format(ts);
//
//File scrn = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//FileHandler.copy(scrn,
//		new File("/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/Asgn11_img"+timestamp+".png"));
//driver.close();

	}

}
