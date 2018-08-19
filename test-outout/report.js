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
  "duration": 34314781864,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"a.btnlink.continue\"}\n  (Session info: chrome\u003d68.0.3440.106)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027VIKASHGUPTA\u0027, ip: \u0027192.168.0.115\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\VIKASH~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 68.0.3440.106, webStorageEnabled: true}\nSession ID: 630c365472caecce9d743560cdde70c5\n*** Element info: {Using\u003dcss selector, value\u003da.btnlink.continue}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.pages.LoginPage.login(LoginPage.java:51)\r\n\tat StepDefinition.Login.user_login_into_the_web(Login.java:24)\r\n\tat ✽.Given user login into the website(Academics.feature:35)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NavigatesToAcademics.user_navigates_to_academics_module()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MasterDropDown.user_select_AddExam_from_Masters_dropdown()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "Logout.user_logout_from_the_Application()"
});
formatter.result({
  "status": "skipped"
});
});