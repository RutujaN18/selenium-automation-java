package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.IInvokedMethodimpl;
import pages.AddUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.AdminPage;

@Listeners(IInvokedMethodimpl.class)
public class AddUserTest {

	@Test
	public void verifyAdminUserGettingAddedSuccessfully() {

		new LoginPage().login("Admin", "admin123")

				.verifyWelcomeText("Welcome Ram")

				.navigatetoAdminPage()

				.navigateToAddUserPage()

				.AddUser("Charlie Carter", "charliecenter@123498"+  System.currentTimeMillis(), "Enabled", "charliecenter@12345678","charliecenter@12345678");
		
		         System.out.println("Hello");
		       

	}
}
