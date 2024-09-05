package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("testsdgsdfhsdhsh");
		driver.findElement(By.name("pass")).sendKeys("sdt5634tdghsdfh");
		// click on login button
		// driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		
		//Click on Refresh icon
		driver.navigate().refresh();		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);
		//Click on Back icon
		driver.navigate().back();
		Thread.sleep(2000);
		
		//click on forward icon
		driver.navigate().forward();

	}

}
