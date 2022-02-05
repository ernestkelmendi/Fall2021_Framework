$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 22,
  "name": "Verify user gets error for invalid credential",
  "description": "",
  "id": "login;verify-user-gets-error-for-invalid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@invalidLogin"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I enter \u0027\u003cinvalidEmail\u003e\u0027 as login email",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I enter \u0027\u003cinvalidPassword\u003e\u0027 as login password",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I verify login error is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "login;verify-user-gets-error-for-invalid-credential;",
  "rows": [
    {
      "cells": [
        "invalidEmail",
        "invalidPassword"
      ],
      "line": 29,
      "id": "login;verify-user-gets-error-for-invalid-credential;;1"
    },
    {
      "cells": [
        "%^\u0026\u0026*()",
        "abcd@1234"
      ],
      "line": 30,
      "id": "login;verify-user-gets-error-for-invalid-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I launch facebook website",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookPaySD.launchFacebook()"
});
formatter.result({
  "duration": 13930341187,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Verify user gets error for invalid credential",
  "description": "",
  "id": "login;verify-user-gets-error-for-invalid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@invalidLogin"
    },
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I enter \u0027%^\u0026\u0026*()\u0027 as login email",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I enter \u0027abcd@1234\u0027 as login password",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I verify login error is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "%^\u0026\u0026*()",
      "offset": 9
    },
    {
      "val": "email",
      "offset": 27
    }
  ],
  "location": "LoginSD.enterLoginData(String,String)"
});
formatter.result({
  "duration": 2592723691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd@1234",
      "offset": 9
    },
    {
      "val": "password",
      "offset": 29
    }
  ],
  "location": "LoginSD.enterLoginData(String,String)"
});
formatter.result({
  "duration": 2615891663,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.clickLogin()"
});
formatter.result({
  "duration": 2496199839,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.verifyInvalidLoginError()"
});
formatter.result({
  "duration": 11518534633,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[text()\u003d\u0027The email or mobile number you entered isn’t connected to an account. \u0027]\"}\n  (Session info: chrome\u003d97.0.4692.71)\n  (Driver info: chromedriver\u003d97.0.4692.71 (adefa7837d02a07a604c1e6eff0b3a09422ab88d-refs/branch-heads/4692@{#1247}),platform\u003dWindows NT 10.0.10586 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027deepaks-mbp.lan\u0027, ip: \u0027fe80:0:0:0:184f:5953:a9de:8aa3%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 97.0.4692.71 (adefa7837d02a..., userDataDir: C:\\Users\\ADMINI~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:54217}, handlesAlerts: true, hasMetadata: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 97.0.4692.71, webStorageEnabled: true, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true, webdriver.remote.sessionid: 19aff47a4371404a88d5ab5a257...}\nSession ID: 19aff47a4371404a88d5ab5a257d4eb4\n*** Element info: {Using\u003dxpath, value\u003d//div[text()\u003d\u0027The email or mobile number you entered isn’t connected to an account. \u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat Pages.WebCommands$1.apply(WebCommands.java:44)\n\tat Pages.WebCommands$1.apply(WebCommands.java:42)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\n\tat Pages.WebCommands.getElementWithWait(WebCommands.java:42)\n\tat Pages.WebCommands.isWebElementDisplayed(WebCommands.java:171)\n\tat Pages.Facebook.LaunchPage.isInvalidLoginErrorDisplayed(LaunchPage.java:68)\n\tat StepDefinition.LoginSD.verifyInvalidLoginError(LoginSD.java:58)\n\tat ✽.Then I verify login error is displayed(Login.feature:26)\n",
  "status": "failed"
});
formatter.after({
  "duration": 190906680,
  "status": "passed"
});
});