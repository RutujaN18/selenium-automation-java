package common2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import common2.WebDriverFactory2;

public class IInvokedMethodimpl implements IInvokedMethodListener {

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		WebDriverFactory2.threadStorage.get().quit();

	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rutuja\\Downloads\\Driver\\Chrome\\chromedriver.exe");
		WebDriverFactory2.threadStorage.set(new ChromeDriver());
		WebDriverFactory2.threadStorage.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverFactory2.threadStorage.get().get("https://opensource-demo.orangehrmlive.com/");
		// WebDriverFactory2.browser.manage().window().maximize();

	}

}
