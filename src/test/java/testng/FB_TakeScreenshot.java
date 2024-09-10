package testng;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FB_TakeScreenshot {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("testsdgsdfhsdhsh");
		driver.findElement(By.name("pass")).sendKeys("sdt5634tdghsdfh");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);

		// Take screenshot
		//GEt the timestamp (System current date & time
		Date d = new Date();		
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		String timeStmp = df.format(d);
		
		File tempScrSht = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(tempScrSht, new File(
				"C:\\Users\\nalla\\eclipse-workspace\\654Batch\\SeleniumBasics_654Batch\\Screenshots\\Myfb"+timeStmp+".png"));
	}
}
