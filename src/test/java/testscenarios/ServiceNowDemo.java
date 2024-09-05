package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowDemo {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.servicenow.com/");
		driver.findElement(By.id("cmp-nav__tab--companyNav")).click();
		//Hyperlink
		driver.findElement(By.linkText("Global Impact")).click();

		//How to find count of hyper links
		System.out.println(driver.findElements(By.tagName("a")).size());
		
	}

}
