$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Academics.feature");
formatter.feature({
  "line": 1,
  "name": "Academics Page",
  "description": "",
  "id": "academics-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 13,
  "name": "Create Subject",
  "description": "",
  "id": "academics-page;create-subject",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@CreateSubject"
    },
    {
      "line": 12,
      "name": "@AcademicsPage"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user login into the website",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user navigates to academics module",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user select Subject from Masters dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enter subject name and save it",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user verify toast notification",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user logout from the Application",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_login_into_the_web()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigatesToAcademics.user_navigates_to_academics_module()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MasterDropDown.user_select_Subject_from_Masters_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateSubject.user_enter_subject_name_and_save_it()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Toastnotification.user_verify_toast_notification()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Logout.user_logout_from_the_Application()"
});
formatter.result({
  "status": "skipped"
});
});