package testDaraz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Daraztest {
	
	@Test
	public void Daraz_loading() throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.daraz.com.np/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.quit();
	
}

	@Test
	public void D_Login() throws InterruptedException {
		WebDriver login_daraz = new ChromeDriver();
		login_daraz.get("https://www.daraz.com.np/");
		login_daraz.manage().window().maximize();
		//Thread.sleep(2000);
		login_daraz.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div/div[3]/ul/span/li/a")).click();
		//Thread.sleep(2000);
		login_daraz.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("9860523736");
		login_daraz.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("Daraz123");
		login_daraz.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[1]/button")).click();
		Thread.sleep(2000);
		login_daraz.quit();

	
	}
	
}
