$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Feature/Facebook.feature");
formatter.feature({
  "name": "Create an Multiple Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Facebook Acount",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launch the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User click on create new account",
  "keyword": "When "
});
formatter.step({
  "name": "User enter the first name\"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enter the sur name\"\u003csname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User enter the mail id\"\u003cmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enter the password\"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enter the date of birth",
  "keyword": "And "
});
formatter.step({
  "name": "User click on submit",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "surname",
        "mail",
        "pass"
      ]
    },
    {
      "cells": [
        "pasupathi",
        "pasu",
        "pachayanb256@gmail.com",
        "pasu@2496"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Facebook Acount",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User launch the browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click on create new account",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enter the first name\"pasupathi\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enter the sur name\"\u003csname\u003e\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enter the mail id\"pachayanb256@gmail.com\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enter the password\"pasu@2496\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enter the date of birth",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click on submit",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});