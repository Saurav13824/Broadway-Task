package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {
	
	WebDriver driver;
	
	public WebDriver browser (String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		return driver;
		
	}

}
