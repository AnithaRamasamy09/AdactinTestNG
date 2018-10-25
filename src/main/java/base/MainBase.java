package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainBase {
	
	public static WebDriver driver;

	public static WebDriver getDriver(String url) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Anitha\\First Project\\drivers\\geckodriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get(url);
		return driver;	
	}
	public static void impWait(int seconds)
	{
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public static void closeBrowser() {
		driver.close();
	}

//need to define different browser settings, close browser
}
