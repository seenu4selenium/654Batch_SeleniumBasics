package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollageWeekLiveDmeo {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		//wait statments
		Thread.sleep(8000);
		//Get the count of editboxes
		System.out.println(driver.findElements(By.tagName("input")).size());

	}

}
