package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.WebDriverFactory;

public class LoginPage {
	@FindBy(id = "txtUsername")
	private WebElement Username;

	@FindBy(id = "txtPassword")
	private WebElement password;

	@FindBy(id = "btnLogin")
	private WebElement loginButton;

	@FindBy(id = "spanMessage")
	private WebElement errorMessage;

	private WebDriverWait wait; // declaration

	public LoginPage() // constructor
	{
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
		wait = new WebDriverWait(WebDriverFactory.threadStorage.get(), 20);

	}

	public HomePage login(String strUserName, String strPassword)

	{

		Username.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();

		HomePage hp = new HomePage();
		System.out.println("Printing hp from Login Page" + hp);
		return hp.isPageloaded();

	}

	public void verifyErrorMesssage(String strExpectedErrorMessage)

	{
		Assert.assertEquals(errorMessage.getText().contains("Welcome"), true, "Welcome text is not as per format");
		Assert.assertEquals(errorMessage.getText(), strExpectedErrorMessage);

	}

	public LoginPage adminincorrectpassword(String strUserName, String strPassword, String strExpectedErrorMessage)

	{
		Username.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();
		Assert.assertEquals(errorMessage.getText().contains(strExpectedErrorMessage), true);
		return new LoginPage();
	}
}
