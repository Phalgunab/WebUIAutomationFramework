Feature: Validate Google Home Page

  @TitleVal
  Scenario: Validate page title of google home page
    Given Navigate to Google Home Page using ""
    When Verify Google Home Page title
    Then Title matches with "Google"
