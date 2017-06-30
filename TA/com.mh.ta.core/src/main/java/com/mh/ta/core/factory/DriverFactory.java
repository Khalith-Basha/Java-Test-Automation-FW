package com.mh.ta.core.factory;

import org.openqa.selenium.WebDriver;

import com.mh.ta.core.exception.TestContextException;
import com.mh.ta.core.webdriver.ChromeBrowser;

public class DriverFactory {
	private static ThreadLocal<Object> drivers = new ThreadLocal<Object>();

	public static void startDriver(String driverType) {
		System.err.println("Init Driver " + driverType);
		Object driver;
		driver = new ChromeBrowser().startDriver();
		drivers.set(driver);
	}

	public static WebDriver getDriver() {
		WebDriver driver = (WebDriver) drivers.get();
		if (driver == null)
			throw new TestContextException("Please call start driver before can running test");
		return driver;
	}

	public static void diposeDriver() {
		WebDriver driver = (WebDriver) drivers.get();
		driver.quit();
		drivers.set(null);
	}
}
