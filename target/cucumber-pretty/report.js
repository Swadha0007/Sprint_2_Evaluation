$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Featurefile/signup.feature");
formatter.feature({
  "name": "Sign up feature",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Automate the login with the help of credentials",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the elearning application page",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_is_on_the_elearning_application_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the login credentials like username and password",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the user portal",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_user_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see all the courses in user portal",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_see_all_the_courses_in_user_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Automate the learning path icon",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@icon3"
    }
  ]
});
formatter.step({
  "name": "User clicks on the course name for accesing",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_course_name_for_accesing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the course description dashboard where all icons are present",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_course_description_dashboard_where_all_icons_are_present()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on learning path icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_learning_path_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to the learning path description page",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_the_learning_path_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the learning path to the course",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_see_the_learning_path_to_the_course()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.fail(Assert.java:96)\r\n\tat StepDefinition.AutomationDefinition.user_is_able_to_see_the_learning_path_to_the_course(AutomationDefinition.java:483)\r\n\tat ✽.User is able to see the learning path to the course(file:src/test/java/Featurefile/signup.feature:57)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});