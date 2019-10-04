$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Gmail.feature");
formatter.feature({
  "line": 3,
  "name": "Login to Gmail application",
  "description": "",
  "id": "login-to-gmail-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Login to Gmail application and verification of incorrect username and password",
  "description": "",
  "id": "login-to-gmail-application;login-to-gmail-application-and-verification-of-incorrect-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open the Firefox and launch Gamil URL",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I login with following credentials",
  "rows": [
    {
      "cells": [
        "vinayhg@gmail.com",
        "pass1234"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "perfromSteps.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 13754433100,
  "status": "passed"
});
formatter.match({
  "location": "perfromSteps.enter_the_incorrect_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 15586431700,
  "status": "passed"
});
formatter.match({
  "location": "perfromSteps.Reset_the_credential()"
});
formatter.result({
  "duration": 1417369200,
  "status": "passed"
});
formatter.uri("Features/GmailLogin.feature");
formatter.feature({
  "line": 3,
  "name": "Login to Gmail application",
  "description": "",
  "id": "login-to-gmail-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Login to Gmail application and verification of incorrect username and password",
  "description": "",
  "id": "login-to-gmail-application;login-to-gmail-application-and-verification-of-incorrect-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open the Firefox and launch Gamil URL",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I login with following credentials",
  "rows": [
    {
      "cells": [
        "vinayhg@gmail.com",
        "pass1234"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "perfromSteps.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 8688733100,
  "status": "passed"
});
formatter.match({
  "location": "perfromSteps.enter_the_incorrect_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 14171689100,
  "status": "passed"
});
formatter.match({
  "location": "perfromSteps.Reset_the_credential()"
});
formatter.result({
  "duration": 2173970400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login to Gmail application and verification of incorrect username and password",
  "description": "",
  "id": "login-to-gmail-application;login-to-gmail-application-and-verification-of-incorrect-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Open the Firefox and launch Gamil URL",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I login with following credentials",
  "rows": [
    {
      "cells": [
        "vinayhg@gmail.com",
        "pass12342"
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "perfromSteps.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 12789077600,
  "status": "passed"
});
formatter.match({
  "location": "perfromSteps.enter_the_incorrect_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 14200731800,
  "status": "passed"
});
formatter.match({
  "location": "perfromSteps.Reset_the_credential()"
});
formatter.result({
  "duration": 1371238900,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Login to Gmail application and verification of incorrect username and password",
  "description": "",
  "id": "login-to-gmail-application;login-to-gmail-application-and-verification-of-incorrect-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "Open the Firefox and launch Gamil URL",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I login with following credentials",
  "rows": [
    {
      "cells": [
        "vinayhg@gmail.com",
        "pass123423"
      ],
      "line": 25
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "perfromSteps.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 9685893900,
  "status": "passed"
});
formatter.match({
  "location": "perfromSteps.enter_the_incorrect_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 14220234400,
  "status": "passed"
});
formatter.match({
  "location": "perfromSteps.Reset_the_credential()"
});
formatter.result({
  "duration": 1226202600,
  "status": "passed"
});
});