package org.adactin.login.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class LoginPage extends BasePage  {
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="username")
	private WebElement userName;

	@FindBy (id="password")
	private WebElement password;

	@FindBy (id="login")
	private WebElement login;

	@FindBy (xpath="//b[text()=\'Invalid Login Details\']")
	private WebElement IncorrectLogin;

	public WebElement getIncorrectLogin() {
		return IncorrectLogin;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
//	public void enterUserName(String userName) {
//		input(getUserName(), userName);
//	}
//	public void enterPassword() {
//		input(getPassword(), "AnithaTest");
//	}
//	public void clickLogin() {
//		btnclick(login);
//	}

}