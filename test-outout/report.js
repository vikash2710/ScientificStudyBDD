$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/Features/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_already_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of login page is Scientific Study",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_Scientific_Study()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login into the web",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_login_into_the_web()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:557)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat com.pages.LoginPage.login(LoginPage.java:60)\r\n\tat StepDefinition.LoginStepDefinition.user_login_into_the_web(LoginStepDefinition.java:38)\r\n\tat ✽.user login into the web(./src/main/java/Features/Login.feature:8)\r\n",
  "status": "failed"
});
});