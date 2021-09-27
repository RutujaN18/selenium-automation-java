package testcase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.IInvokedMethodimpl;
import pages.HomePage;
import pages.LoginPage;

@Listeners(IInvokedMethodimpl.class)

public class LoginTest {

	@Test(enabled = true)
	public void verifyAdminUserLoginSuccessful() {

		LoginPage lp = new LoginPage();
		lp.login("Admin", "admin123")
		.verifyWelcomeText("Welcome Ram");

	}

	@Test(enabled = false)
	public void verifyAdminUserLoginUnSuccessful() {

		LoginPage lp = new LoginPage();
		lp.login("Admin", "Admin123");

	}

}
