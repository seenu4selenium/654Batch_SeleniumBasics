package testscenarios;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

public class Vivek_Batch654_assignment {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		driver = new SafariDriver();
		driver.get("https://us.megabus.com/account-management/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a [@data-gtm-id='account-management-sign-up']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("Test1234@gas.com");
		driver.findElement(By.xpath("//input[@id='confirmEmail']")).sendKeys("test1234@gas.com");

		driver.findElement(By.xpath("//input[@id='choosePassword']")).sendKeys("test1234");
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Test1234");

		Date ts = new Date();
		DateFormat abc = new SimpleDateFormat("MMMddyyyy_HHmmss");
		String timestamp = abc.format(ts);
		
		String errormessage = driver.findElement(By.id("confirm-password-error")).getText();
		System.out.println("The error message is: "+ errormessage + "at instance:"+  timestamp);

		File scrn = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn, new File(
				"/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/Vivek_Batch654_assignment" + timestamp + ".png"));

		Thread.sleep(3000);
		driver.quit();

	}

}
