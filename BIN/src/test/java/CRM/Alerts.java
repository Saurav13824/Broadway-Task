package CRM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Alerts {
	
	@Test
	public void alertsend() throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();

	Alert alert = driver.switchTo().alert();
	alert.accept();
	Thread.sleep(2000);
	System.out.println("Alert accepted");

}
}