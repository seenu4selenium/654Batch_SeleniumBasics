package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeDemo {

	public static void main(String[] args) {
		// Created Object for Webdriver interface

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/my-account/");
		// find the webelement by using any locator, then using sendkeys methos send
		// some test data to editbox
		driver.findElement(By.id("username")).sendKeys("venkat@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sdghdgd");
		driver.findElement(By.name("login")).click();

	}

}
