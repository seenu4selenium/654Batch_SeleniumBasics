package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");

		Select abc = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		// abc.selectByVisibleText("August");
		abc.selectByIndex(8);
		// abc.selectByValue("March");

		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByVisibleText("1947");

		Select day = new Select(driver.findElement(By.id("daybox")));
		day.selectByVisibleText("15");

	}

}
