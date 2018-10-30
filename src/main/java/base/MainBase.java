package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainBase {
	
	public static WebDriver driver;

	public static WebDriver getDriver(String url) {
		
		String path=System.getProperty("user.dir");		
		System.setProperty("webdriver.gecko.driver", path+"/drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();	
		driver.get(url);
		return driver;	
	}
	public static void impWait(int seconds)
	{
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		System.out.println("");
	}
	
	public static void closeBrowser() {
		driver.close();
	}

//need to define different browser settings, close browser
}
