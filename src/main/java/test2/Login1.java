package test2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common2.IInvokedMethodimpl;
import pages.HomePage;
import pages.Loginpage1;

@Listeners(IInvokedMethodimpl.class)

public class Login1 {

	@Test(enabled=true)
	public void verifyuseridpassword() {

		Loginpage1 lp = new Loginpage1();
		lp.login("Admin", "admin123").verifyWelcomeText("Welcome Ram");

	}

	@Test(enabled = false)
	public void adminincorrectpassword() {

		Loginpage1 lp = new Loginpage1();
		lp.login("Admin", "Admin123");
		// .adminincorrectpassword("Invalid credentials");

	}

	@Test(enabled = false)
	public void incorrectadminincorrectpassword() {

		Loginpage1 lp = new Loginpage1();
		lp.login("admin123", "Admin143");
		// .incorrectadminincorrectpassword("Invalid credentials");

	}
}
