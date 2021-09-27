package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import common.WebDriverFactory;

public class IInvokedMethodimpl implements IInvokedMethodListener {

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		WebDriverFactory.threadStorage.get().quit();

	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rutuja\\Downloads\\Driver\\Chrome\\chromedriver.exe");
		WebDriverFactory.threadStorage.set(new ChromeDriver());
		WebDriverFactory.threadStorage.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverFactory.threadStorage.get().get("https://opensource-demo.orangehrmlive.com/");

	}

}
