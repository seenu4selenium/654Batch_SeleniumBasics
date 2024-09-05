package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextDemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		// click on login button
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		String errorTest = driver.findElement(By.className("_9ay7")).getText();
		System.out.println(errorTest);

	}

}
