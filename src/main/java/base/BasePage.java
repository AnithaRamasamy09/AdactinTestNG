package base;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends MainBase {
	public static void input(WebElement element, String name)
	{
		element.sendKeys(name);

	}
	public static void btnclick(WebElement element) 
	{
		element.click();
	}
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

	public static void switchToDefault(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}

	public static void switchTochild(WebDriver driver) {


		Set<String> allWindows = driver.getWindowHandles();

		String currWindow = driver.getWindowHandle();
		{
			for (String x : allWindows) {

				if(!currWindow.equalsIgnoreCase(x))
				{
					driver.switchTo().window(x);
				}
			}

		}
		System.out.println(currWindow);
	}

	public static void dropDown(WebElement dd, int index)
	{
		Select s=new Select(dd);
		s.selectByIndex(index);
	}

	public static void dropDown(WebElement dd, String value)
	{
		Select s=new Select(dd);
		s.selectByValue(value);
	}
	public static void dropDown(String value, WebElement dd)
	{
		Select s=new Select(dd);
		s.deselectByVisibleText(value);
	}


	public static void findElement(WebDriver driver, String locator)
	{
		driver.findElement(By.xpath(locator));
	}

	public static String getAttribute(WebElement element, String name)
	{
		String text = element.getAttribute(name);
		System.out.println(text);
		return text;
	}

	public static String getText(WebElement element)
	{

		String text = element.getText();
		System.out.println(text);
		return text;
	}

	public static void scrollDown(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}

	public static void jsClick(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element);
	}

	public static void switchFrame(WebDriver driver, String switchto)
	{
		driver.switchTo().frame(switchto);
	}

	public static void switchFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}

	public static void acceptAlert()
	{
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	public static void declineAlert()
	{
		Alert al=driver.switchTo().alert();
		al.dismiss();
	}

}
