package test2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common2.IInvokedMethodimpl;
import pages.AddUserPage;
import pages.HomePage;
import pages.Loginpage1;
import pages.AdminPage;

@Listeners(IInvokedMethodimpl.class)
public class AddUserTest {

	@Test
	public void verifyAdminUserGettingAddedSuccessfully() {

		new Loginpage1().login("Admin", "admin123")

				.verifyWelcomeText("Welcome Paul")

				.navigatetoAdminPage()

				.navigateToAddUserPage()

				.AddUser("Charlie Carter", "charliecenter@1234AjR1985079812345", "Enabled", "charliecenter@12345678","charliecenter@12345678");
		
		         System.out.println("Hello");

	}
}
