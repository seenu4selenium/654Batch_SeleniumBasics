package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenCart_Login {
	WebDriver driver;

	@Test // Login without test data(blank data)
	public void TC_01_LoginWithBlankTestData() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
		// wait
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		Thread.sleep(3000);
		// GEt the error message
		String errMsg = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText();
		System.out.println(errMsg);
		System.out.println("Test case 01 is passed");

	}

	@Test
	public void TC_02_LoginWith_invalid_testdata() throws Exception {
		driver.findElement(By.name("email")).sendKeys("TejaSritest@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("345tertf");
		// Loginbutton
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		Thread.sleep(3000);
		// GEt the error message
		String errMsg = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText();
		System.out.println(errMsg);
		System.out.println("Test case 02 is passed");
	}

	@Test
	public void TC_03() throws Exception {
		//Clear the existing test data before type valid data
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.id("input-password")).clear();
		
		
		driver.findElement(By.name("email")).sendKeys("seenu4selenium@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Test@123");
		// Loginbutton
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		Thread.sleep(3000);
		// Verify logout element is displayed or not
		if (driver.findElement(By.linkText("Logout")).isDisplayed()) {
			System.out.println("System logged in successfully");
		}
	}

	@Test
	public void TC_04_Logout() throws Exception {
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		// Verify "logout" has done
		if (driver.findElement(By.id("content")).isDisplayed()) {
			System.out.println("Logout function done");
		}
	}
}
