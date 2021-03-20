$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/cucumber/features/GoogleHomePageValidation.feature");
formatter.feature({
  "name": "Validate Google Home Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate page title of google home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TitleVal"
    }
  ]
});
formatter.step({
  "name": "Navigate to Google Home Page using \"\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify Google Home Page title",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Title matches with \"Google\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});