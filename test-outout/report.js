$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Academics.feature");
formatter.feature({
  "line": 1,
  "name": "Academics Page",
  "description": "",
  "id": "academics-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 33,
  "name": "Add Exam",
  "description": "",
  "id": "academics-page;add-exam",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@AddExam"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user login into the website",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "user navigates to academics module",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user select AddExam from Masters dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "user enter \"\u003cExam Title\u003e\" and \"\u003cStart Time\u003e\" and \"\u003cEnd Time\u003e\" and save it",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "user logout from the Application",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_login_into_the_web()"
});
formatter.result({
  "duration": 32972679234,
  "status": "passed"
});
formatter.match({
  "location": "NavigatesToAcademics.user_navigates_to_academics_module()"
});
formatter.result({
  "duration": 7316329411,
  "status": "passed"
});
formatter.match({
  "location": "MasterDropDown.user_select_AddExam_from_Masters_dropdown()"
});
formatter.result({
  "duration": 385088361,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cExam Title\u003e",
      "offset": 12
    },
    {
      "val": "\u003cStart Time\u003e",
      "offset": 31
    },
    {
      "val": "\u003cEnd Time\u003e",
      "offset": 50
    }
  ],
  "location": "AddExam.user_enter_and_and_and_save_it(String,String,String)"
});
formatter.result({
  "duration": 3117919049,
  "status": "passed"
});
formatter.match({
  "location": "Logout.user_logout_from_the_Application()"
});
formatter.result({
  "duration": 8176673260,
  "status": "passed"
});
});