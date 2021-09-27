package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common2.WebDriverFactory2;

public class AddUserPage {

	@FindBy(id = "systemUser_employeeName_empName")
	private WebElement employeeName;

	@FindBy(id = "systemUser_userName")
	private WebElement userName;

	@FindBy(id = "systemUser_status")
	private WebElement userstatus;

	@FindBy(id = "systemUser_password")
	private WebElement password;

	@FindBy(id = "systemUser_confirmPassword")
	private WebElement confirmPassword;

	@FindBy(id = "btnSave")
	private WebElement saveButton;

	private WebDriverWait wait;

	public AddUserPage() {
		PageFactory.initElements(WebDriverFactory2.threadStorage.get(), this);
		wait = new WebDriverWait(WebDriverFactory2.threadStorage.get(), 30);

	}

	public AdminPage AddUser(String strEmployeeName, String strUserName, String userStatus, String strPassword,
			String strPassword1) 
	{
		employeeName.sendKeys(strEmployeeName);
		userName.sendKeys(strUserName);
		userstatus.sendKeys(userStatus);
		password.sendKeys(strPassword1);
		confirmPassword.sendKeys(strPassword1);
		saveButton.click();

		return new AdminPage().isPageLoaded();

	}

	public AddUserPage isPageloaded() {

		wait.until(ExpectedConditions.visibilityOf(employeeName));
		wait.until(ExpectedConditions.visibilityOf(userName));
		wait.until(ExpectedConditions.visibilityOf(userstatus));
		wait.until(ExpectedConditions.visibilityOf(password));
		wait.until(ExpectedConditions.visibilityOf(confirmPassword));
		wait.until(ExpectedConditions.visibilityOf(saveButton));

		return this;
	}
}
