package assignmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.linkText("Practice Site")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("username")).sendKeys("seenu4selenium@gmail.com");
		driver.findElement(By.name("password")).sendKeys("seenu4selenium@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Test Case passed");

	}

}
