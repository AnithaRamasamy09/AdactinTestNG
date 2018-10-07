package org.adactin.login;
import org.adactin.login.page.LoginPage;
import org.testng.annotations.Test;
import junit.framework.Assert;


public class LoginPage_Test extends BaseTest{

	@Test(priority=2)
	private void ValidLoginTest() {	
	LoginPage login=new LoginPage();
	input(login.getUserName(), "AnithaTest");
	input(login.getPassword(), "Work2win!");
	btnclick(login.getLogin());
	Assert.assertEquals("AdactIn.com - Search Hotel", driver.getTitle());
}
	@Test(priority=1)
	private void InvalidLoginTest() {	
	LoginPage login=new LoginPage();
	input(login.getUserName(), "AnithaTest");
	input(login.getPassword(), "123456!");
	btnclick(login.getLogin());
	Assert.assertEquals("Invalid Login Details", login.getIncorrectLogin().getText());
}
}