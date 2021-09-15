package pages;

import java.util.concurrent.locks.Condition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common2.WebDriverFactory2;

public class HomePage {

	@FindBy(id = "welcome")
	private WebElement welcomeText;

	@FindBy(id = "menu_admin_viewAdminModule")
	private WebElement adminTab;

	private WebDriverWait wait;

	public HomePage() // constructor
	{
		PageFactory.initElements(WebDriverFactory2.threadStorage.get(), this);
		wait = new WebDriverWait(WebDriverFactory2.threadStorage.get(), 20);

	}

	public HomePage verifyWelcomeText(String strexpectedWelcomeText)

	{
		Assert.assertEquals(welcomeText.getText(), strexpectedWelcomeText);
		return new HomePage().isPageloaded();
	}

	public AdminPage navigatetoAdminPage() {
		adminTab.click();
		return new AdminPage().isPageLoaded();
	}

	public HomePage isPageloaded() {
		wait.until(ExpectedConditions.visibilityOf(adminTab));
		return this;

	}

}
