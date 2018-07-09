$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/Features/Academics.feature");
formatter.feature({
  "line": 1,
  "name": "Academics Page",
  "description": "",
  "id": "academics-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Academics page",
  "description": "",
  "id": "academics-page;verify-academics-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user login into the website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user navigates to academics module",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user verify the page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logout from the Application",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_login_into_the_web()"
});
formatter.result({
  "duration": 41113871900,
  "status": "passed"
});
formatter.match({
  "location": "NavigatesToAcademics.user_navigates_to_academics_module()"
});
formatter.result({
  "duration": 9519901843,
  "status": "passed"
});
formatter.match({
  "location": "VerifyAcademicsPage.user_verify_the_page()"
});
formatter.result({
  "duration": 343309955,
  "status": "passed"
});
formatter.match({
  "location": "Logout.user_logout_from_the_Application()"
});
formatter.result({
  "duration": 8126852358,
  "status": "passed"
});
});