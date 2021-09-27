package common;

import org.openqa.selenium.WebDriver;

import common.WebDriverFactory;

public class WebDriverFactory {

	public static ThreadLocal<WebDriver> threadStorage = new ThreadLocal<>();

}
