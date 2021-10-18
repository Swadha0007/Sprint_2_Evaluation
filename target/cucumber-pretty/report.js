$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Featurefile/signup.feature");
formatter.feature({
  "name": "Sign up feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Automate the course subscription",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the elearning page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the login credentials which are \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on homepage",
  "keyword": "And "
});
formatter.step({
  "name": "user is navigated to the homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on course to be subscribed",
  "keyword": "And "
});
formatter.step({
  "name": "the user is navigated to the course description page with welcome message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Swadha797",
        "Swadha@9707"
      ]
    }
  ]
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the course subscription",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the elearning page",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_is_on_the_elearning_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the login credentials which are \"Swadha797\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_which_are_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on homepage",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on course to be subscribed",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_course_to_be_subscribed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is navigated to the course description page with welcome message",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.the_user_is_navigated_to_the_course_description_page_with_welcome_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the Course description icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks course description icon",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_course_description_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is Able navigate to course description page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_Able_navigate_to_course_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the description icon",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_description_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the description page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to access the course details",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_access_the_course_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the Course agenda icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks on the course name",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_course_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the course description dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_course_description_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on agenda icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_agenda_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to the agenda description page",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_the_agenda_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the agenda to the course",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_see_the_agenda_to_the_course()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to click on the course name in order to return to dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_click_on_the_course_name_in_order_to_return_to_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to return to the dashboard after agenda",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_return_to_the_dashboard_after_agenda()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "keyword": "Scenario"
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
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the links icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks on the selenium for accesing",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_selenium_for_accesing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the course dashboard where all icons are present",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_course_dashboard_where_all_icons_are_present()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on links icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_links_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to the links description page",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_the_links_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the links to the course",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_see_the_links_to_the_course()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the link provided",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_link_provided()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the test icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks on the course name for accesing it",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_course_name_for_accesing_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the course description dashboard where icons are present",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_course_description_dashboard_where_icons_are_present()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on test icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_test_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to the test description page",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_the_test_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the tests to the course",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_see_the_tests_to_the_course()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to click on the test link",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_click_on_the_test_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to the test page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_the_test_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to click on the proceed button in order to take test",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_click_on_the_proceed_button_in_order_to_take_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the test page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_test_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the announcement icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks on the course name for accesing the announcement icon",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_course_name_for_accesing_the_announcement_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the course description dashboard for accessing announcement icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_course_description_dashboard_for_accessing_announcement_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on announcement icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_announcement_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to the announcement description page",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_the_announcement_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the announcements made to the course",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_see_the_announcements_made_to_the_course()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the forums icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks on the course name for accesing the forums icon",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_course_name_for_accesing_the_forums_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the course description dashboard for accessing forums icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_course_description_dashboard_for_accessing_forums_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on forum icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_forum_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to the forum description page",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_the_forum_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the forums in the course",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_see_the_forums_in_the_course()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Automate the groups icon",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User clicks on the course name for accesing the groups icon",
  "keyword": "Given "
});
formatter.step({
  "name": "User is navigated to the course description dashboard for accessing groups icon",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on groups icon",
  "keyword": "Then "
});
formatter.step({
  "name": "User is able to navigate to the groups description page",
  "keyword": "And "
});
formatter.step({
  "name": "User is able to see the search field and gives the values such as \"\u003cname\u003e\" for groups for searching",
  "keyword": "Then "
});
formatter.step({
  "name": "User is navigated to the respective groups page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name"
      ]
    },
    {
      "cells": [
        "swadha"
      ]
    }
  ]
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the groups icon",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User clicks on the course name for accesing the groups icon",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_course_name_for_accesing_the_groups_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the course description dashboard for accessing groups icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_course_description_dashboard_for_accessing_groups_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on groups icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_groups_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to the groups description page",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_the_groups_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the search field and gives the values such as \"swadha\" for groups for searching",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_see_the_search_field_and_gives_the_values_such_as_for_groups_for_searching(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the respective groups page",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_respective_groups_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the user icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks on the course name for accesing the user icon",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_course_name_for_accesing_the_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the course description dashboard for accessing user icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_course_description_dashboard_for_accessing_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on user icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to the user description page",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_the_user_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the user in the course enrolled",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_see_the_user_in_the_course_enrolled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the name to see it arranged in ascending order",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_name_to_see_it_arranged_in_ascending_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on name again to see it arranged in descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_name_again_to_see_it_arranged_in_descending_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the first name to see it arranged in ascending order",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_first_name_to_see_it_arranged_in_ascending_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on first name again to see it arranged in descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_first_name_again_to_see_it_arranged_in_descending_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the last name to see it arranged in ascending order",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_last_name_to_see_it_arranged_in_ascending_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on last name again to see it arranged in descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_last_name_again_to_see_it_arranged_in_descending_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login to see it arranged in ascending order",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_login_to_see_it_arranged_in_ascending_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login again to see it arranged in descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_login_again_to_see_it_arranged_in_descending_order()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the documents icon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks on the course name for accesing the documents icon",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_course_name_for_accesing_the_documents_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the course description dashboard for accessing documents icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_course_description_dashboard_for_accessing_documents_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on documents icon",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_documents_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to the documents description page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_the_documents_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the search field and button and enters the name in field",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_see_the_search_field_and_button_and_enters_the_name_in_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the search button and is able to see the documents related to it",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_search_button_and_is_able_to_see_the_documents_related_to_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on current folder and selects the documents",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_current_folder_and_selects_the_documents()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see the documents arranged in ascendiang order according to the type,name,size,date",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_can_see_the_documents_arranged_in_ascendiang_order_according_to_the_type_name_size_date()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the dropbox icon for sharing a new file",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks on the course name for accesing the dropbox icon",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_course_name_for_accesing_the_dropbox_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the course description dashboard for accessing dropbox icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_course_description_dashboard_for_accessing_dropbox_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on dropbox icon",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_dropbox_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to the dropbox description page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_the_dropbox_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the share a new file button",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_share_a_new_file_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to a page for sharing file",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_a_page_for_sharing_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the dropdown for selecting the person to send file",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_dropdown_for_selecting_the_person_to_send_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the area for uploading file",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_area_for_uploading_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Switch to the other window for selection",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.switch_to_the_other_window_for_selection()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Automate the dropbox icon for adding a new folder",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User clicks on the course name for accesing dropbox icon",
  "keyword": "Given "
});
formatter.step({
  "name": "User is navigated to the description dashboard for accessing dropbox icon",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on dropbox icon in order to navigate to the page",
  "keyword": "And "
});
formatter.step({
  "name": "User is able to navigate to dropbox description page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on the add a new folder button",
  "keyword": "And "
});
formatter.step({
  "name": "User is navigated to a page for creating a new folder",
  "keyword": "Then "
});
formatter.step({
  "name": "User gives the \"\u003cname\u003e\" for creating a new folder",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on create folder",
  "keyword": "Then "
});
formatter.step({
  "name": "User is able to see the message on creating a folder",
  "keyword": "And "
});
formatter.step({
  "name": "User is able to arrange the folders according to type,sent files.",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on selectall and unselectall button",
  "keyword": "And "
});
formatter.step({
  "name": "User selects the folder to be deleted and clicks on the details and then on delete",
  "keyword": "And "
});
formatter.step({
  "name": "the deletion of folder is verified",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name"
      ]
    },
    {
      "cells": [
        "space technology"
      ]
    }
  ]
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
  "name": "User enters the login credentials like \"jai19\" and \"Swadha@9707\"",
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDefinition.user_enters_the_login_credentials_like_and(String,String)"
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
  "name": "Automate the dropbox icon for adding a new folder",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User clicks on the course name for accesing dropbox icon",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_course_name_for_accesing_dropbox_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to the description dashboard for accessing dropbox icon",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_the_description_dashboard_for_accessing_dropbox_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on dropbox icon in order to navigate to the page",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_dropbox_icon_in_order_to_navigate_to_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to navigate to dropbox description page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_navigate_to_dropbox_description_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the add a new folder button",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_the_add_a_new_folder_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to a page for creating a new folder",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_navigated_to_a_page_for_creating_a_new_folder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User gives the \"space technology\" for creating a new folder",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_gives_the_for_creating_a_new_folder(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on create folder",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_create_folder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the message on creating a folder",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_see_the_message_on_creating_a_folder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to arrange the folders according to type,sent files.",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.user_is_able_to_arrange_the_folders_according_to_type_sent_files()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on selectall and unselectall button",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_clicks_on_selectall_and_unselectall_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the folder to be deleted and clicks on the details and then on delete",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationDefinition.user_selects_the_folder_to_be_deleted_and_clicks_on_the_details_and_then_on_delete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the deletion of folder is verified",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDefinition.the_deletion_of_folder_is_verified()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});