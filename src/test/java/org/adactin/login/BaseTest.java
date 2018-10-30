package org.adactin.login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import base.BasePage;

public class BaseTest extends BasePage{

	@BeforeTest
	public void launchBrowser() throws InstantiationException, IllegalAccessException {
		getDriver("http://www.adactin.com/HotelApp/index.php");
	}

	@AfterTest(enabled=false)
	public static void closeSite() {
		closeBrowser();
	}

}

