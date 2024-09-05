package assignmets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnehaAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
				//Create an object for Webdriver
				WebDriver driver;
				
				// Open any browser
				driver = new ChromeDriver();
				
				// go to url https://podfoods.co/
				driver.get ("https://podfoods.co/");
				
				//Click on the Start With Us Button
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[4]/div/div[1]/a[2]")).click();
				
				//Click on the Submit Button
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/form/button/span")).click();
						
				Thread.sleep(5000);
				
				String abc = new String(driver.findElement(By.className("el-form-item__error")).getText());
				System.out.println(abc);
				
				String xyz = new String(driver.findElement(By.className("el-form-item__error")).getText());
				System.out.println(xyz);
				
				String stu = new String(driver.findElement(By.className("el-form-item__error")).getText());
				System.out.println(stu);
				
				String lmn = new String(driver.findElement(By.className("el-form-item__error")).getText());
				System.out.println(lmn);
	}

}
