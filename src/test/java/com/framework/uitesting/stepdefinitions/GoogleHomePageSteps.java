package com.framework.uitesting.stepdefinitions;

import com.framework.uitesting.actions.GoogleHomePageActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleHomePageSteps {
	GoogleHomePageActions actions;

	public GoogleHomePageSteps() {
		actions = new GoogleHomePageActions();
	}

	@Given("Navigate to Google Home Page using {string}")
	public void navigate_to_Google_Home_Page_using(String string) {

	}

	@When("Verify Google Home Page title")
	public void verify_Google_Home_Page_title() {

	}

	@Then("Title matches with {string}")
	public void title_matches_with(String string) {

	}

}
