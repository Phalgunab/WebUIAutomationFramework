package com.framework.uitesting.driverfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverFactory {

	private static Map<AvailableDriver, WebDriver> driversList = new HashMap();

	private static enum AvailableDriver {
		CHROME, IE, FIREFOX
	}

	public static WebDriver getDriver() {
		AvailableDriver browser = AvailableDriver.CHROME;
		if (driversList.isEmpty()) {
			switch (browser) {
			case CHROME:
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Phalguna\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driversList.put(AvailableDriver.CHROME, setDriverProps(driver));
				return driver;
			case IE:
				return null;
			case FIREFOX:
				return null;
			default:
				return null;
			}
		} else {
			return driversList.get(browser);
		}
	}
	
	private static WebDriver setDriverProps(WebDriver driver) {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

}
