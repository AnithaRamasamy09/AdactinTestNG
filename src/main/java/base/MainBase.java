package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainBase {
	
	public static WebDriver driver;

	public static WebDriver getDriver(String url) throws InstantiationException, IllegalAccessException {
		
		String path=System.getProperty("user.dir");		
		System.setProperty("webdriver.gecko.driver", path+"/drivers/geckodriver.exe");

//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
		
//		Class<ChromeDriver> driverClass = ChromeDriver.class;
//		WebDriverManager.getInstance(driverClass).setup();
//		WebDriver driver = driverClass.newInstance();
//		WebDriverManager.getInstance(chrome).setup();
		driver=new FirefoxDriver();
//		driver=new ChromeDriver();
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
