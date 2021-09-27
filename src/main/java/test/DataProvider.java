package test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.WebBase;
import common.IInvokedMethodimpl;
import pages.LoginPage;

@Listeners(IInvokedMethodimpl.class)

public class DataProvider extends WebBase {

	@Test(dataProvider = "Login Data")
	public void verifyAdminUserLoginSuccessful(String userName, String password) {

		LoginPage lp = new LoginPage();
		lp.login(userName, password);

	}
	@Test(dataProvider= "LoginCSVData")
	public void verifyAdminUserLoginSuccessfulusingCSV(String userName, String password) {

		LoginPage lp = new LoginPage();
		lp.login(userName, password);

}
}