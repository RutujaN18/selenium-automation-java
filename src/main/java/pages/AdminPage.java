package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common2.WebDriverFactory2;

public class AdminPage {

	@FindBy(id = "btnAdd")
	WebElement addUserButton;
	private WebDriverWait wait;

	public AdminPage() {
		PageFactory.initElements(WebDriverFactory2.threadStorage.get(), this);
		wait = new WebDriverWait(WebDriverFactory2.threadStorage.get(), 20);
		isPageLoaded();

	}

	public AddUserPage navigateToAddUserPage() {
		addUserButton.click();
		return new AddUserPage().isPageloaded();
	}

	public AdminPage isPageLoaded() {

		wait.until(ExpectedConditions.visibilityOf(addUserButton));
		return this;
	}
}
