package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		//Create an object for Webdriver
		WebDriver driver;
		
		// Open any browser
		driver = new ChromeDriver();
		
		// go to url https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		//Type username and Password
		driver.findElement(By.name("email")).sendKeys("testsdgsdfhsdhsh");
		driver.findElement(By.name("pass")).sendKeys("sdt5634tdghsdfh");
		//click on login button
		driver.findElement(By.name("login")).click();
		

	}

}
