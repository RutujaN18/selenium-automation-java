package common2;

import org.openqa.selenium.WebDriver;

import common2.WebDriverFactory2;

public class WebDriverFactory2 {

	public static ThreadLocal<WebDriver> threadStorage = new ThreadLocal<>();

}
