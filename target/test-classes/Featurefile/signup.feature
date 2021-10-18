Feature: Sign up feature

  Background: Automate the login with the help of credentials
    Given User is on the elearning application page
    When User enters the login credentials like "jai19" and "Swadha@9707"
    Then User clicks on the login button
    And User is navigated to the user portal
    Then User is able to see all the courses in user portal

  Scenario Outline: Automate the course subscription
    Given User is on the elearning page
    When User enters the login credentials which are "<username>" and "<password>"
    And User clicks on login button
    And User clicks on homepage
    Then user is navigated to the homepage
    And User clicks on course to be subscribed
    Then the user is navigated to the course description page with welcome message

    Examples: 
      | username  | password    |
      | Swadha797 | Swadha@9707 |

  Scenario: Automate the Course description icon
    Given User clicks course description icon
    Then User is Able navigate to course description page
    And user clicks on the description icon
    Then User is navigated to the description page
    And User is able to access the course details

  Scenario: Automate the Course agenda icon
    Given User clicks on the course name
    Then User is navigated to the course description dashboard
    Then User clicks on agenda icon
    And User is able to navigate to the agenda description page
    Then User is able to see the agenda to the course
    And User is able to click on the course name in order to return to dashboard
    Then User is able to return to the dashboard after agenda

  Scenario: Automate the learning path icon
    Given User clicks on the course name for accesing
    Then User is navigated to the course description dashboard where all icons are present
    Then User clicks on learning path icon
    And User is able to navigate to the learning path description page
    Then User is able to see the learning path to the course

  Scenario: Automate the links icon
    Given User clicks on the selenium for accesing
    Then User is navigated to the course dashboard where all icons are present
    Then User clicks on links icon
    And User is able to navigate to the links description page
    Then User is able to see the links to the course
    And User clicks on the link provided

  Scenario: Automate the test icon
    Given User clicks on the course name for accesing it
    Then User is navigated to the course description dashboard where icons are present
    Then User clicks on test icon
    And User is able to navigate to the test description page
    Then User is able to see the tests to the course
    And User is able to click on the test link
    Then User is able to navigate to the test page
    And User is able to click on the proceed button in order to take test
    Then User is navigated to the test page

  Scenario: Automate the announcement icon
    Given User clicks on the course name for accesing the announcement icon
    Then User is navigated to the course description dashboard for accessing announcement icon
    Then User clicks on announcement icon
    And User is able to navigate to the announcement description page
    Then User is able to see the announcements made to the course

  Scenario: Automate the forums icon
    Given User clicks on the course name for accesing the forums icon
    Then User is navigated to the course description dashboard for accessing forums icon
    Then User clicks on forum icon
    And User is able to navigate to the forum description page
    Then User is able to see the forums in the course

  Scenario Outline: Automate the groups icon
    Given User clicks on the course name for accesing the groups icon
    Then User is navigated to the course description dashboard for accessing groups icon
    Then User clicks on groups icon
    And User is able to navigate to the groups description page
    Then User is able to see the search field and gives the values such as "<name>" for groups for searching
    And User is navigated to the respective groups page

    Examples: 
      | name   |
      | swadha |

  Scenario: Automate the user icon
    Given User clicks on the course name for accesing the user icon
    Then User is navigated to the course description dashboard for accessing user icon
    Then User clicks on user icon
    And User is able to navigate to the user description page
    Then User is able to see the user in the course enrolled
    And User clicks on the name to see it arranged in ascending order
    Then User clicks on name again to see it arranged in descending order
    And User clicks on the first name to see it arranged in ascending order
    Then User clicks on first name again to see it arranged in descending order
    And User clicks on the last name to see it arranged in ascending order
    Then User clicks on last name again to see it arranged in descending order
    And User clicks on the login to see it arranged in ascending order
    Then User clicks on login again to see it arranged in descending order

  Scenario: Automate the documents icon
    Given User clicks on the course name for accesing the documents icon
    Then User is navigated to the course description dashboard for accessing documents icon
    And User clicks on documents icon
    Then User is able to navigate to the documents description page
    And User is able to see the search field and button and enters the name in field
    Then User clicks on the search button and is able to see the documents related to it
    And User clicks on current folder and selects the documents
    Then user can see the documents arranged in ascendiang order according to the type,name,size,date

  Scenario: Automate the dropbox icon for sharing a new file
    Given User clicks on the course name for accesing the dropbox icon
    Then User is navigated to the course description dashboard for accessing dropbox icon
    And User clicks on dropbox icon
    Then User is able to navigate to the dropbox description page
    And user clicks on the share a new file button
    Then User is navigated to a page for sharing file
    And user clicks on the dropdown for selecting the person to send file
    Then User clicks on the area for uploading file
    And Switch to the other window for selection

  Scenario Outline: Automate the dropbox icon for adding a new folder
    Given User clicks on the course name for accesing dropbox icon
    Then User is navigated to the description dashboard for accessing dropbox icon
    And User clicks on dropbox icon in order to navigate to the page
    Then User is able to navigate to dropbox description page
    And User clicks on the add a new folder button
    Then User is navigated to a page for creating a new folder
    And User gives the "<name>" for creating a new folder
    Then User clicks on create folder
    And User is able to see the message on creating a folder
    Then User is able to arrange the folders according to type,sent files.
    And User clicks on selectall and unselectall button
    And User selects the folder to be deleted and clicks on the details and then on delete
    Then the deletion of folder is verified

    Examples: 
      | name             |
      | space technology |
