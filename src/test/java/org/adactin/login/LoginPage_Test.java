package org.adactin.login;

import org.adactin.login.page.LoginPage;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import junit.framework.Assert;

public class LoginPage_Test extends BaseTest {

	@Test(enabled = false)
	private void ValidLoginTest() {
		LoginPage login = new LoginPage();
		input(login.getUserName(), "AnithaTest");
		input(login.getPassword(), "Work2win!");
		btnclick(login.getLogin());
		Assert.assertEquals("AdactIn.com - Search Hotel", driver.getTitle());
	}

	@Test(enabled = false)
	private void InvalidLoginTest() {
		LoginPage login = new LoginPage();
		input(login.getUserName(), "AnithaTest");
		input(login.getPassword(), "123456!");
		btnclick(login.getLogin());
		Assert.assertEquals("Invalid Login Details", login.getIncorrectLogin().getText());
	}
	@Test
	public void test0() {
		System.out.println("dep  method");
	}
	@Test(groups = "test")
	public void test1() {
		System.out.println("am from test group");
	}

	@Test(dependsOnGroups="test")
	public void test3() {
		System.out.println("am dep on test group");
	}
	@Test(dependsOnMethods="test0")
	@Parameters("para")
	public void test3(@Optional("am dep on test method")String para) {
		System.out.println(para);
	}
}