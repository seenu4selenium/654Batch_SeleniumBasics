package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CCL_login {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://cricclubs.com/ColoradoCricket");
		
		//click on  Log in menu
		driver.findElement(By.linkText("Log in")).click();	
		Thread.sleep(4000);
		driver.findElement(By.name("userName")).sendKeys("Supriyaemail");
		driver.findElement(By.id("password")).sendKeys("sdgsdgsdgds");		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div[1]/div[3]/div/div/input")).click();
		
		
	}

}
