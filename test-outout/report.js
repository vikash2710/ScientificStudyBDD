$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Academics.feature");
formatter.feature({
  "line": 1,
  "name": "Academics Page",
  "description": "",
  "id": "academics-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "Create Grade",
  "description": "",
  "id": "academics-page;create-grade",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@CreateGrade"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user login into the website",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user navigates to academics module",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user select Grading from Masters dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user enter \"\u003cScale Name\u003e\" and \"\u003cScale Description\u003e\" and save it",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user logout from the Application",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_login_into_the_web()"
});
formatter.result({
  "duration": 48451831353,
  "status": "passed"
});
formatter.match({
  "location": "NavigatesToAcademics.user_navigates_to_academics_module()"
});
formatter.result({
  "duration": 15753742477,
  "status": "passed"
});
formatter.match({
  "location": "MasterDropDown.user_select_Grading_from_Masters_dropdown()"
});
formatter.result({
  "duration": 298237300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cScale Name\u003e",
      "offset": 12
    },
    {
      "val": "\u003cScale Description\u003e",
      "offset": 31
    }
  ],
  "location": "CreateGrade.user_enter_and_and_save_it(String,String)"
});
formatter.result({
  "duration": 620338852,
  "status": "passed"
});
formatter.match({
  "location": "Logout.user_logout_from_the_Application()"
});
formatter.result({
  "duration": 8144584647,
  "status": "passed"
});
});