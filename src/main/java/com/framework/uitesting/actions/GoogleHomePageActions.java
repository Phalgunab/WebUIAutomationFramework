package com.framework.uitesting.actions;

import org.openqa.selenium.WebDriver;

import com.framework.uitesting.driverfactory.DriverFactory;

public class GoogleHomePageActions {
		WebDriver driver;
		public GoogleHomePageActions() {
			driver = DriverFactory.getDriver();
		}
}
