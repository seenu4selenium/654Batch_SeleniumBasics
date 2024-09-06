package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoTestData {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://autotestdata.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("exampleRadios10")).click();
		// Clear the existing value
		driver.findElement(By.id("total-rows-gen")).clear();
		driver.findElement(By.id("total-rows-gen")).sendKeys("26");
		// Click on Generate button
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/div")).click();
		Thread.sleep(5000);
		// Click on Download button
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/button")).click();
	}
}
