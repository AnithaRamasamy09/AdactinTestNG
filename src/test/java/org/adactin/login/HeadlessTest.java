package org.adactin.login;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTest {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver.driver","C:\\Users\\Lenovo\\git\\AdactinTestNG\\drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		driver=new ChromeDriver(options);
		driver.get("https://hangouts.google.com/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
	}

}
