package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SnehaPrgm {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://podfoods.co/");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[4]/div/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/button/span")).click();
		Thread.sleep(5000);
		// Get all the error messages
		List<WebElement> allErrorMsgs = driver.findElements(By.className("el-form-item__error"));
		for (WebElement errmsg : allErrorMsgs) {
			System.out.println(errmsg.getText());
		}
	}
}
