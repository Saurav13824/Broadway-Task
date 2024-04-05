package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRM_login {
	
	@Test(priority = 1)
	public void new_Login() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://crm.nirojprasain.com.np/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("admin@dev.com");
		driver.findElement(By.id("password")).sendKeys("pass");
		Thread.sleep(1000);
		driver.findElement(By.name("remember")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/section/div/div/div/div[2]/div[2]/form/div[4]/button")).click();
		Thread.sleep(1000);
		driver.quit();

	}

	@Test(priority = 2)
	public void invalid_login() throws InterruptedException {
		
		WebDriver invalid = new ChromeDriver();
		invalid.get("https://crm.nirojprasain.com.np/login");
		invalid.manage().window().maximize();
		Thread.sleep(1000);
		invalid.findElement(By.id("email")).sendKeys("admin123@dev.com");
		invalid.findElement(By.id("password")).sendKeys("pass");
		invalid.findElement(By.xpath("/html/body/div/section/div/div/div/div[2]/div[2]/form/div[4]/button")).click();
		Thread.sleep(1000);
		invalid.quit();
	}
	
	@Test(priority = 3)
	public void forget() throws InterruptedException {
		
		WebDriver forget_pw = new ChromeDriver();
		forget_pw.get("https://crm.nirojprasain.com.np/login");
		forget_pw.manage().window().maximize();
		Thread.sleep(1000);
		forget_pw.findElement(By.id("email")).sendKeys("admin123@dev.com");
		forget_pw.findElement(By.xpath("/html/body/div/section/div/div/div/div[2]/div[2]/form/div[2]/div[1]/div/a")).click();
		Thread.sleep(1000);
		forget_pw.quit();	
		
}
}

