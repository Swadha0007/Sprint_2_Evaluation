package StepDefinition;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hookclass;

public class AutomationDefinition {
	
	WebDriver driver = Hookclass.driver;
	//This driver will only be specified when you have to subscribe a course 
	/* WebDriver driver1 = Hookclass.driver1; */

	
	  @Given("User is on the elearning application page")
	  public void user_is_on_the_elearning_application_page() {
		  // Write code here that turns the phrase above into concrete actions
		  String title = driver.getTitle();
	      System.out.println(title);
	  
	  }
	  
	  @When("User enters the login credentials like username and password") 
	  public void user_enters_the_login_credentials_like_username_and_password() { 
		  // Write code here that turns the phrase above into concrete actions 
	  try {
	  driver.findElement(By.id("login")).sendKeys("jai19");
	  driver.findElement(By.id("password")).sendKeys("Swadha@9707"); }
	  catch(Exception e) {
	  System.out.println("Not Able to enter the login details "+e); } }
	  
	  @Then("User clicks on the login button") 
	  public void user_clicks_on_the_login_button() { 
		  // Write code here that turns the phrase above into concrete actions 
	  try {
	  driver.findElement(By.id("form-login_submitAuth")).click();
	  System.out.println(" able to click on login button");
	  
	  } catch(Exception e) {
	  System.out.println("Not able to click on login button"+e); }
	  
	  }
	  
	  @Then("User is navigated to the user portal") 
	  public void user_is_navigated_to_the_user_portal() {
		  // Write code here that turns the phrase above into concrete actions 
	  try { 
		  Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - My courses"; 
		  String actualtitle = driver.getTitle();
	  Assert.assertEquals(expectedtitle,actualtitle);
	  System.out.println("You are able  to navigate to the user portal");
	  
	  } catch(Exception e) {
	  System.out.println("Not able to navigate to the user portal"+e);
	  Assert.fail(); } }
	  
	  @Then("User is able to see all the courses in user portal") 
	  public void user_is_able_to_see_all_the_courses_in_user_portal() {
		  // Write code here that turns the phrase above into concrete actions
	  try {
	  System.out.println("The user is able to see all the courses subscribed");
	  
	  } catch(Exception e) {
	  System.out.println("The user is not able to see all the courses subscribed"+e); }
	  }
	  
	  @Given("The user is on the user portal")
	  public void the_user_is_on_the_user_portal() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String title = driver.getTitle();
			  System.out.println(title);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	    
	  }

	  @Given("User clicks on the homepage")
	  public void user_clicks_on_the_homepage() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
				 driver.findElement(By.xpath("//*[@title='Homepage']")).click();
				 System.out.println("Able to click on the homepage"); } 
		  catch(Exception e) {
				 System.out.println("Not Able to click on the homepage" +e); }
	    
	  }

	  @Then("The user is navigated to the homepage")
	  public void the_user_is_navigated_to_the_homepage() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			 Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education"; 
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle,actualtitle);
		  System.out.println("You are able  to navigate to the home page");
		  }
		  catch(Exception e)
		  {
			  System.out.println("You are not able to navigate to the homepage"+e);
		  }
	     
	  }

	  @Then("The user gives rating to the course")
	  public void the_user_gives_rating_to_the_course() {
	      // Write code here that turns the phrase above into concrete actions
		  try
		  {
			 driver.findElement(By.xpath("(//*[@id=\"star_1079\"]/li[6]/a)[1]")).click(); 
		  }
		  catch(Exception e)
		  {
			  System.out.println("Not able to click on the rating");
		  }
	     
	  }

	  @Then("The user is able to see the rating")
	  public void the_user_is_able_to_see_the_rating() {
	      // Write code here that turns the phrase above into concrete actions
		  try
		  {
			  Thread.sleep(3000);
			  String expectedtitle = "1 Vote | 43 Visits | Your vote [5]"; 
			  String actualtitle = driver.findElement(By.id("vote_label_star_1079")).getText();
			  Assert.assertEquals(expectedtitle,actualtitle);
			  System.out.println("You are able to see the votes");

			  
		  }
		  catch(Exception e)
		  {
			  System.out.println("You are not able to see the votes");
		  }
	  
	  }

// These functions will only be specified when you are using the driver1 to subscribe the course
	 
		/*
		 * @Given("User is on the elearning page") public void
		 * user_is_on_the_elearning_page() { // Write code here that turns the phrase
		 * above into concrete actions String title = driver1.getTitle();
		 * System.out.println(title); }
		 * 
		 * 
		 * @When("User enters the login credentials which are {string} and {string}")
		 * public void user_enters_the_login_credentials_which_are_and(String string,
		 * String string2) { // Write code here that turns the phrase above into
		 * concrete actions try { driver1.findElement(By.id("login")).sendKeys(string);
		 * driver1.findElement(By.id("password")).sendKeys(string2); } catch(Exception
		 * e) { System.out.println("Not Able to enter the login details "+e); }
		 * 
		 * }
		 * 
		 * @When("User clicks on login button") public void
		 * user_clicks_on_login_button() { // Write code here that turns the phrase
		 * above into concrete actions try {
		 * driver1.findElement(By.id("form-login_submitAuth")).click();
		 * System.out.println(" able to click on login button");
		 * 
		 * } catch(Exception e) {
		 * System.out.println("Not able to click on login button"+e); } }
		 * 
		 * @Then("User clicks on homepage") public void user_clicks_on_homepage() { //
		 * Write code here that turns the phrase above into concrete actions try {
		 * driver1.findElement(By.xpath("//*[@title='Homepage']")).click();
		 * System.out.println("Able to click on the homepage"); } catch(Exception e) {
		 * System.out.println("Not Able to click on the homepage" +e); }
		 * 
		 * }
		 * 
		 * @Then("user is navigated to the homepage") public void
		 * user_is_navigated_to_the_homepage() { // Write code here that turns the
		 * phrase above into concrete actions try { Thread.sleep(3000); String
		 * expectedtitle = "My Organization - My education"; String actualtitle =
		 * driver1.getTitle(); Assert.assertEquals(expectedtitle,actualtitle);
		 * System.out.println("You are able  to navigate to the home page");
		 * 
		 * } catch(Exception e) {
		 * System.out.println("Not able to navigate to the home page"+e); Assert.fail();
		 * } }
		 * 
		 * @Then("User clicks on course to be subscribed") public void
		 * user_clicks_on_course_to_be_subscribed() { // Write code here that turns the
		 * phrase above into concrete actions try { driver1.findElement(By.xpath(
		 * "(//*[@id=\"list-hot-courses\"]/div/div[6]/div/div[2]/div[3]/div[2]/div/a)[1]"
		 * )).click(); System.out.println("Able to click on the subscription button"); }
		 * catch(Exception e ) {
		 * System.out.println("Able to click on the subscription button"+e); }
		 * 
		 * }
		 * 
		 * @Then("the user is navigated to the course description page with welcome message"
		 * ) public void
		 * the_user_is_navigated_to_the_course_description_page_with_welcome_message() {
		 * // Write code here that turns the phrase above into concrete actions try {
		 * Thread.sleep(3000); String expectedtitle =
		 * "User Jyotiraditya Gautam (jyotir19) has been registered to course Css1";
		 * String actualtitle =
		 * driver1.findElement(By.xpath("//*[@class='alert alert-info']")).getText();
		 * Assert.assertEquals(expectedtitle,actualtitle);
		 * System.out.println("You are able  to navigate to the welcome page");
		 * 
		 * } catch(Exception e) {
		 * System.out.println("Not able to navigate to the welcome page"+e);
		 * Assert.fail(); }
		 * }
		 */
	  @Given("User clicks course description icon")
	  public void user_clicks_course_description_icon() { 
		  // Write code here that turns the phrase above into concrete actions 
	  try {
	  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
	  System.out.println("You are able  to click on the selenium11");
	  } 
	  catch(Exception e) { 
		  System.out.println("Not able to click on selenium11"+e);
	  
	  }
	  
	  
	  }
	  
	  @Then("User is Able navigate to course description page") 
	  public void user_is_Able_navigate_to_course_description_page() { 
		  try {
	  String actualtitle = driver.getTitle();
	  System.out.println("You are able  to navigate to the course description page"+actualtitle);
	  System.out.println("In order to click on the icon it must be present there ");
	  boolean val=driver.findElement(By.id("toolimage_24894")).isDisplayed();
	  if(val)
	  {
		  System.out.println("You are able to see the icon");
	  }
	  else
	  {
		  System.out.println("You are not able to see the icon");
	  }
	  
	  } catch(Exception e) {
	  System.out.println("Not able to navigate to the course description page"+e);
	  } 
		  }
	  
	  @Then("user clicks on the description icon") 
	  public void user_clicks_on_the_description_icon() { // Write code here that turns the phrase above into concrete actions 
		  try {
	  driver.findElement(By.id("istooldesc_24894")).click();
	  System.out.println(" able to click on the icon"); }
	  catch(Exception e) {
	  System.out.println("Not able to click on the icon"+e); } }
	  
	  @Then("User is navigated to the description page") 
	  public void user_is_navigated_to_the_description_page() { 
		  // Write code here that turns the phrase above into concrete actions 
	  try { 
		  Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - Selenium11 - Description";
	  String actualtitle = driver.getTitle();
	  Assert.assertEquals(expectedtitle,actualtitle); 
	  System.out.println("You are able  to navigate to the selenium 11 course description");
	  
	  } catch(Exception e) {
		  System.out.println("Not able to navigate to the selenium 11 course description"+e);
	  Assert.fail(); }
	  
	  }
	  
	  @Then("User is able to access the course details")
	  public void user_is_able_to_access_the_course_details() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
			  String expectedtitle = "Description";
		  String actualtitle = driver.findElement(By.xpath("(//*[@id=\"cm-content\"]/div/ul/li[2]/a)[1]")).getText();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course description");
		  System.out.println("You are not able to see the course details");
		  Assert.fail();
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course description"+e);
		   }
		  
	     
	  }
	  
	  @Given("User clicks on the course name")
	  public void user_clicks_on_the_course_name() {
	      // Write code here that turns the phrase above into concrete actions
		  // Write code here that turns the phrase above into concrete actions 
		  try {
		  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
		  System.out.println("You are able  to click on the selenium11");
		  } 
		  catch(Exception
		  e) { System.out.println("Not able to click on selenium11"+e);
		  
		  }
	  
	  }

	  @Then("User is navigated to the course description dashboard")
	  public void user_is_navigated_to_the_course_description_dashboard() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the course description page"+actualtitle);
			  System.out.println("In order to click on the icon it must be present there ");
			  boolean val=driver.findElement(By.id("toolimage_24895")).isDisplayed();
			  if(val)
			  {
				  System.out.println("You are able to see the icon");
			  }
			  else
			  {
				  System.out.println("You are not able to see the icon");
			  }
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the course description page"+e);
			  } 
	  }

	  @Then("User clicks on agenda icon")
	  public void user_clicks_on_agenda_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.id("istooldesc_24895")).click();
			  System.out.println(" able to click on the icon"); 
			  }
			  catch(Exception e) {
			  System.out.println("Not able to click on the icon"+e); 
			  } 
		  }
	   

	  @Then("User is able to navigate to the agenda description page")
	  public void user_is_able_to_navigate_to_the_agenda_description_page() {
	      // Write code here that turns the phrase above into concrete action
		  try { Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - Selenium11 - Agenda";
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course agenda");
		  
		  } catch(Exception e) { System.out.
		  println("Not able to navigate to the selenium 11 course agend"+e);
		  Assert.fail(); }
		  
	   
	  }

	  @Then("User is able to see the agenda to the course")
	  public void user_is_able_to_see_the_agenda_to_the_course() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
			  String expectedtitle = "Agenda";
		  String actualtitle = driver.findElement(By.xpath("(//*[@id=\"cm-content\"]/div/ul/li[2])[1]")).getText();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course agenda");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course agenda"+e);
		  Assert.fail(); }
	   
	  }

	  @Then("User is able to click on the course name in order to return to dashboard")
	  public void user_is_able_to_click_on_the_course_name_in_order_to_return_to_dashboard() {
	      // Write code here that turns the phrase above into concrete actions
		  try
		  {
			  driver.findElement(By.xpath("(//*[@id=\"cm-content\"]/div/ul/li[1]/a)[1]")).click();
			  System.out.println("able to access toclick on selenium1");
		  }
	   catch(Exception e)
		  {
		   System.out.println("Not able to access toclick on selenium11 "+e);
		  }
	
	  }
	  @Then("User is able to return to the dashboard after agenda")
	  public void user_is_able_to_return_to_the_dashboard_after_agenda() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are on dashboard"+actualtitle);
			  
			  } catch(Exception e) {
			  System.out.println("Not on dashboard "+e);
			  } 
	  }
	  
	  @Given("User clicks on the course name for accesing")
	  public void user_clicks_on_the_course_name_for_accesing() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
			  System.out.println("You are able  to click on the selenium11");
			  } 
			  catch(Exception e) { 
				  System.out.println("Not able to click on selenium11"+e);
			  
			  }
	  }

	  @Then("User is navigated to the course description dashboard where all icons are present")
	  public void user_is_navigated_to_the_course_description_dashboard_where_all_icons_are_present() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the course description page"+actualtitle);
			  System.out.println("In order to click on the icon it must be present there ");
			  boolean val=driver.findElement(By.id("istooldesc_24897")).isDisplayed();
			  if(val)
			  {
				  System.out.println("You are able to see the icon");
			  }
			  else
			  {
				  System.out.println("You are not able to see the icon");
			  }
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the course description page"+e);
			  } 
	      
	  }

	  @Then("User clicks on learning path icon")
	  public void user_clicks_on_learning_path_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.id("istooldesc_24897")).click();
			  System.out.println(" able to click on the icon"); 
			  }
			  catch(Exception e) {
			  System.out.println("Not able to click on the icon"+e); 
			  } 
		  }
	  

	  @Then("User is able to navigate to the learning path description page")
	  public void user_is_able_to_navigate_to_the_learning_path_description_page() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - Selenium11 - Learning paths";
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course agenda");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course agend"+e);
		     Assert.fail(); }
	  }

	  @Then("User is able to see the learning path to the course")
	  public void user_is_able_to_see_the_learning_path_to_the_course() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
			  String expectedtitle = "Learning paths";
		  String actualtitle = driver.findElement(By.xpath("(//*[@id=\"cm-content\"]/div/ul/li[2])[1]")).getText();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course agenda");
		  System.out.println("The user is not able to see the learning path to the course");
		  Assert.fail();
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course agenda"+e);
		   }
	      
	  }
	  
	  @Given("User clicks on the selenium for accesing")
	  public void user_clicks_on_the_selenium_for_accesing() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
			  System.out.println("You are able  to click on the selenium11");
			  } 
			  catch(Exception e) {
				  System.out.println("Not able to click on selenium11"+e);
			  
			  }
	
	  }

	  @Then("User is navigated to the course dashboard where all icons are present")
	  public void user_is_navigated_to_the_course_dashboard_where_all_icons_are_present() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the course description page"+actualtitle);
			  System.out.println("In order to click on the icon it must be present there ");
			  boolean val=driver.findElement(By.id("istooldesc_24898")).isDisplayed();
			  if(val)
			  {
				  System.out.println("You are able to see the icon");
			  }
			  else
			  {
				  System.out.println("You are not able to see the icon");
			  }
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the course description page"+e);
			  } 
		  
		  
	    
	  }

	  @Then("User clicks on links icon")
	  public void user_clicks_on_links_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.id("istooldesc_24898")).click();
			  System.out.println(" able to click on the icon"); 
			  }
			  catch(Exception e) {
			  System.out.println("Not able to click on the icon"+e); 
			  } 

	  }

	  @Then("User is able to navigate to the links description page")
	  public void user_is_able_to_navigate_to_the_links_description_page() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - Selenium11 - Links";
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course links");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course links"+e);
		     Assert.fail(); }
	    
	  }

	  @Then("User is able to see the links to the course")
	  public void user_is_able_to_see_the_links_to_the_course() {
	      // Write code here that turns the phrase above into concrete actions
	     
		  try
		  {
			  String str;
	      str = driver.findElement(By.xpath("(//*[@id='cm-content']/div/div[3]/div/h4/a)[1]")).getText();
	      System.out.println(str);
		  }
		  catch(Exception e)
		  {
			  System.out.println("not able to see links"+e);
		  }
	  }


	  @Then("User clicks on the link provided")
	  	public void user_clicks_on_the_link_provided() {
    // Write code here that turns the phrase above into concrete actions
	 try
	  {
     driver.findElement(By.xpath("(//*[@id=\"cm-content\"]/div/div[3]/div/h4/a)[1]")).click();
     System.out.println(" able to click on the links");
	  }
	  catch(Exception e)
	  {
		  System.out.println("not able to click on the links"+e);
	  }
	  }

	  @Given("User clicks on the course name for accesing it")
	  public void user_clicks_on_the_course_name_for_accesing_it() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
			  System.out.println("You are able  to click on the selenium11");
			  } 
			  catch(Exception e) {
				  System.out.println("Not able to click on selenium11"+e);
			  
			  }
	 
	  }

	  @Then("User is navigated to the course description dashboard where icons are present")
	  public void user_is_navigated_to_the_course_description_dashboard_where_icons_are_present() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the course description page"+actualtitle);
			  System.out.println("In order to click on the icon it must be present there ");
			  boolean val=driver.findElement(By.id("istooldesc_24899")).isDisplayed();
			  if(val)
			  {
				  System.out.println("You are able to see the icon");
			  }
			  else
			  {
				  System.out.println("You are not able to see the icon");
			  }
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the course description page"+e);
			  } 
		  
		  
	  }

	  @Then("User clicks on test icon")
	  public void user_clicks_on_test_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.id("istooldesc_24899")).click();
			  System.out.println(" able to click on the icon"); 
			  }
			  catch(Exception e) {
			  System.out.println("Not able to click on the icon"+e); 
			  } 
	  }

	  @Then("User is able to navigate to the test description page")
	  public void user_is_able_to_navigate_to_the_test_description_page() {
	      // Write code here that turns the phrase above into concrete actions

		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - Selenium11 - Tests";
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course tests");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course tests"+e);
		     Assert.fail(); }
	    
	  }

	  @Then("User is able to see the tests to the course")
	  public void user_is_able_to_see_the_tests_to_the_course() {
	      // Write code here that turns the phrase above into concrete actions

		  try
		  {
			  String str;
	      str = driver.findElement(By.xpath("(//*[@id=\"exercise_list_467\"]/td[1]/a)[1]")).getText();
	      System.out.println(str);
	      System.out.println(" able to see tests");
		  }
		  catch(Exception e)
		  {
			  System.out.println("not able to see tests"+e);
		  }
	     
	  }

	  @Then("User is able to click on the test link")
	  public void user_is_able_to_click_on_the_test_link() {
	      // Write code here that turns the phrase above into concrete actions
		  try
		  {
	     driver.findElement(By.xpath("(//*[@id=\"exercise_list_467\"]/td[1]/a)[1]")).click();
	     System.out.println(" able to click on the tests");
		  }
		  catch(Exception e)
		  {
			  System.out.println("not able to click on the tests"+e);
		  }
	  }

	  @Then("User is able to navigate to the test page")
	  public void user_is_able_to_navigate_to_the_test_page() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the page which contains test"+actualtitle);
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the page which contains test"+e);
			  } 
	  
	  }

	  @Then("User is able to click on the proceed button in order to take test")
	  public void user_is_able_to_click_on_the_proceed_button_in_order_to_take_test() {
	      // Write code here that turns the phrase above into concrete action
		  try {
		  driver.findElement(By.xpath("(//*[@id=\"cm-content\"]/div/div[2]/div[2]/div/a)[1]")).click();
		  System.out.println(" able to click on the proceed button"); 
		  }
		  catch(Exception e) {
		  System.out.println("Not able to click on the proceed button"+e); 
		  } 
		  
	  }
	  @Then("User is navigated to the test page")
	  public void user_is_navigated_to_the_test_page() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the test page"+actualtitle);
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the test page"+e);
			  } 
	     
	  }

	  @Given("User clicks on the course name for accesing the announcement icon")
	  public void user_clicks_on_the_course_name_for_accesing_the_announcement_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
			  System.out.println("You are able  to click on the selenium11");
			  } 
			  catch(Exception e) {
				  System.out.println("Not able to click on selenium11"+e);
			  
			  }
	   
	  }

	  @Then("User is navigated to the course description dashboard for accessing announcement icon")
	  public void user_is_navigated_to_the_course_description_dashboard_for_accessing_announcement_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the course description page"+actualtitle);
			  System.out.println("In order to click on the icon it must be present there ");
			  boolean val=driver.findElement(By.id("istooldesc_24900")).isDisplayed();
			  if(val)
			  {
				  System.out.println("You are able to see the icon");
			  }
			  else
			  {
				  System.out.println("You are not able to see the icon");
			  }
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the course description page"+e);
			  } 

	  }

	  @Then("User clicks on announcement icon")
	  public void user_clicks_on_announcement_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.id("istooldesc_24900")).click();
			  System.out.println(" able to click on the icon"); 
			  }
			  catch(Exception e) {
			  System.out.println("Not able to click on the icon"+e); 
			  } 
	  
	  }

	  @Then("User is able to navigate to the announcement description page")
	  public void user_is_able_to_navigate_to_the_announcement_description_page() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - Selenium11 - Announcements";
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course announcement");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course announcements"+e);
		     Assert.fail(); }
	    
		  
	   
	  }

	  @Then("User is able to see the announcements made to the course")
	  public void user_is_able_to_see_the_announcements_made_to_the_course() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "There are no announcements.";
		  String actualtitle = driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]")).getText();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to see the announcement");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to see the announcement"+e);
		     Assert.fail(); }
	      
	  }
	  
	  @Given("User clicks on the course name for accesing the forums icon")
	  public void user_clicks_on_the_course_name_for_accesing_the_forums_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
			  System.out.println("You are able  to click on the selenium11");
			  } 
			  catch(Exception e) {
				  System.out.println("Not able to click on selenium11"+e);
			  
			  }
	    
	  }

	  @Then("User is navigated to the course description dashboard for accessing forums icon")
	  public void user_is_navigated_to_the_course_description_dashboard_for_accessing_forums_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the course description page"+actualtitle);
			  System.out.println("In order to click on the icon it must be present there ");
			  boolean val=driver.findElement(By.id("istooldesc_24901")).isDisplayed();
			  if(val)
			  {
				  System.out.println("You are able to see the icon");
			  }
			  else
			  {
				  System.out.println("You are not able to see the icon");
			  }
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the course description page"+e);
			  } 
		  
	   
	  }

	  @Then("User clicks on forum icon")
	  public void user_clicks_on_forum_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.id("istooldesc_24901")).click();
			  System.out.println(" able to click on the icon"); 
			  }
			  catch(Exception e) {
			  System.out.println("Not able to click on the icon"+e); 
			  } 
	     
	  }

	  @Then("User is able to navigate to the forum description page")
	  public void user_is_able_to_navigate_to_the_forum_description_page() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - Selenium11 - Forums";
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course forum");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course forum"+e);
		     Assert.fail(); }
	     
	  }

	  @Then("User is able to see the forums in the course")
	  public void user_is_able_to_see_the_forums_in_the_course() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "There are no forums in this category";
		  String actualtitle = driver.findElement(By.xpath("(//*[@id=\"cm-content\"]/div/div[2]/div/div[2])[1]")).getText();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to see the forums");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to see the forums"+e);
		     Assert.fail(); }
	  
	  }
	  
	  @Given("User clicks on the course name for accesing the groups icon")
	  public void user_clicks_on_the_course_name_for_accesing_the_groups_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
			  System.out.println("You are able  to click on the selenium11");
			  } 
			  catch(Exception e) {
				  System.out.println("Not able to click on selenium11"+e);
			  
			  }
	      
	  }

	  @Then("User is navigated to the course description dashboard for accessing groups icon")
	  public void user_is_navigated_to_the_course_description_dashboard_for_accessing_groups_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the course description page"+actualtitle);
			  System.out.println("In order to click on the icon it must be present there ");
			  boolean val=driver.findElement(By.id("istooldesc_24904")).isDisplayed();
			  if(val)
			  {
				  System.out.println("You are able to see the icon");
			  }
			  else
			  {
				  System.out.println("You are not able to see the icon");
			  }
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the course description page"+e);
			  } 
	     
	  }

	  @Then("User clicks on groups icon")
	  public void user_clicks_on_groups_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.id("istooldesc_24904")).click();
			  System.out.println(" able to click on the icon"); 
			  }
			  catch(Exception e) {
			  System.out.println("Not able to click on the icon"+e); 
			  } 
	     
	    
	  }

	  @Then("User is able to navigate to the groups description page")
	  public void user_is_able_to_navigate_to_the_groups_description_page() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - Selenium11 - Groups";
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course groups");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course groups"+e);
		     Assert.fail(); }
	     
	     
	  }
	  @Then("User is able to see the search field and gives the values such as {string} for groups for searching")
	  public void user_is_able_to_see_the_search_field_and_gives_the_values_such_as_for_groups_for_searching(String string) {
	      // Write code here that turns the phrase above into concrete actions
	    
		  try
			{
				driver.findElement(By.xpath("//*[@id='search_groups_keyword']")).sendKeys(string);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"search_groups_submit\"]")).click();
				System.out.println("Able to enter the fields ");

			}
			catch(Exception e)
			{
				System.out.println("Not Able to enter the fields "+e);
			}
	  }

	  @Then("User is navigated to the respective groups page")
	  public void user_is_navigated_to_the_respective_groups_page() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "Groups";
		  String actualtitle = driver.findElement(By.xpath("(//*[@id=\"cm-content\"]/div/ul/li[2]/a)[1]")).getText();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course groups present");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course groups present"+e);
		     Assert.fail(); }
	   
	    
	  }
	  
	  @Given("User clicks on the course name for accesing the user icon")
	  public void user_clicks_on_the_course_name_for_accesing_the_user_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
			  System.out.println("You are able  to click on the selenium11");
			  } 
			  catch(Exception e) {
				  System.out.println("Not able to click on selenium11"+e);
			  
			  }
	     
	  }

	  @Then("User is navigated to the course description dashboard for accessing user icon")
	  public void user_is_navigated_to_the_course_description_dashboard_for_accessing_user_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the course description page"+actualtitle);
			  System.out.println("In order to click on the icon it must be present there ");
			  boolean val=driver.findElement(By.id("istooldesc_24903")).isDisplayed();
			  if(val)
			  {
				  System.out.println("You are able to see the icon");
			  }
			  else
			  {
				  System.out.println("You are not able to see the icon");
			  }
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the course description page"+e);
			  } 
	     
	  }

	  @Then("User clicks on user icon")
	  public void user_clicks_on_user_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.id("istooldesc_24903")).click();
			  System.out.println(" able to click on the icon"); 
			  }
			  catch(Exception e) {
			  System.out.println("Not able to click on the icon"+e); 
			  } 
	     
	  
	  }

	  @Then("User is able to navigate to the user description page")
	  public void user_is_able_to_navigate_to_the_user_description_page() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - Selenium11 - Users";
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course users");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course users"+e);
		     Assert.fail(); }
	    
	  }

	  @Then("User is able to see the user in the course enrolled")
	  public void user_is_able_to_see_the_user_in_the_course_enrolled() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
			  boolean s =driver.findElement(By.xpath("(//*[@id=\"cm-content\"]/div/ul/li[2])[1]")).isDisplayed();
			  if(s)
			  {
				  System.out.println("You are able to see the users");
			  }
		  } catch(Exception e) { 
			  System.out.println("Not able to see the users"+e);
		     Assert.fail(); }
	      
	  }

	  @Then("User clicks on the name to see it arranged in ascending order")
	  public void user_clicks_on_the_name_to_see_it_arranged_in_ascending_order() {
	      // Write code here that turns the phrase above into concrete actions
			try
			{
				driver.findElement(By.xpath("//a[contains(text(),'Code')]")).click();
				Thread.sleep(3000);
				  String str="AKSHARA";
				  String s=driver.findElement(By.xpath("//td[text()='AKSHARA']")).getText();
				  Assert.assertTrue(str.contains(s));
				  System.out.println("The user is able to see the codes arranged in ascending order");


			}
			catch(Exception e)
			{
				System.out.println("Not Able to see the codes in ascending order "+e);
			}
			
		  
	    
	  }

	  @Then("User clicks on name again to see it arranged in descending order")
	  public void user_clicks_on_name_again_to_see_it_arranged_in_descending_order() {
	      // Write code here that turns the phrase above into concrete actions
		  try
			{
				driver.findElement(By.xpath("//a[contains(text(),'Code')]")).click();
				Thread.sleep(3000);
				  
				  String str="TANUJA123";
				  String s=driver.findElement(By.xpath("//td[text()='TANUJA123']")).getText();
				  Assert.assertTrue(str.contains(s));
				  System.out.println("The user is able to see the codes arranged in descending order");

			}
			catch(Exception e)
			{
				System.out.println("Not Able to see the code in descending order "+e);
			}
	    
	  }
	  @Then("User clicks on the first name to see it arranged in ascending order")
	  public void user_clicks_on_the_first_name_to_see_it_arranged_in_ascending_order() {
	      // Write code here that turns the phrase above into concrete actions
		  try
			{
				driver.findElement(By.xpath("//a[contains(text(),'First name')]")).click();
				Thread.sleep(3000);
				String str="Akshara";
				  String s=driver.findElement(By.xpath("//td[text()='Akshara']")).getText();
				  Assert.assertTrue(str.contains(s));
				  System.out.println("You are able  to see the first name arranged in ascending order ");
				
			}
			catch(Exception e)
			{
				System.out.println("Not Able to see the first name in ascending order "+e);
			}
	  }

	  @Then("User clicks on first name again to see it arranged in descending order")
	  public void user_clicks_on_first_name_again_to_see_it_arranged_in_descending_order() {
	      // Write code here that turns the phrase above into concrete actions
		  try
			{
				driver.findElement(By.xpath("//a[contains(text(),'First name')]")).click();
				Thread.sleep(3000);
				String str="Tanuja";
				  String s=driver.findElement(By.xpath("//td[text()='Tanuja']")).getText();
				  Assert.assertTrue(str.contains(s));
				  System.out.println("You are able  to see the first name arranged in descending order ");

			}
			catch(Exception e)
			{
				System.out.println("Not Able to see the first name in descending order "+e);
			}
	  }

	  @Then("User clicks on the last name to see it arranged in ascending order")
	  public void user_clicks_on_the_last_name_to_see_it_arranged_in_ascending_order() {
	      // Write code here that turns the phrase above into concrete actions
		  try
			{
				driver.findElement(By.xpath("//a[contains(text(),'Last name')]")).click();
				Thread.sleep(3000);
				String str="aaa";
				  String s=driver.findElement(By.xpath("//td[text()='aaa']")).getText();
				  Assert.assertTrue(str.contains(s));
				  System.out.println("You are able  to see the last name arranged in ascending order ");

			}
			catch(Exception e)
			{
				System.out.println("Not Able to see the last name in ascending order "+e);
			}
	  }

	  @Then("User clicks on last name again to see it arranged in descending order")
	  public void user_clicks_on_last_name_again_to_see_it_arranged_in_descending_order() {
	      // Write code here that turns the phrase above into concrete actions
		  try
			{
				driver.findElement(By.xpath("//a[contains(text(),'Last name')]")).click();
				Thread.sleep(3000);
				String str="Singh";
				  String s=driver.findElement(By.xpath("//td[text()='Singh']")).getText();
				  Assert.assertTrue(str.contains(s));
				  System.out.println("You are able  to see the last name arranged in descending order ");

			}
			catch(Exception e)
			{
				System.out.println("Not Able to see the last name in descending order "+e);
			}
	  }

	  @Then("User clicks on the login to see it arranged in ascending order")
	  public void user_clicks_on_the_login_to_see_it_arranged_in_ascending_order() {
	      // Write code here that turns the phrase above into concrete actions
		  try
			{
				driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
				Thread.sleep(3000);
				String str="Akshara";
				  String s=driver.findElement(By.xpath("//td[text()='Akshara']")).getText();
				  Assert.assertTrue(str.contains(s));
				  System.out.println("You are able  to see the login arranged in ascending order ");

			}
			catch(Exception e)
			{
				System.out.println("Not Able to see the login in ascending order "+e);
			}
	  }

	  @Then("User clicks on login again to see it arranged in descending order")
	  public void user_clicks_on_login_again_to_see_it_arranged_in_descending_order() {
	      // Write code here that turns the phrase above into concrete actions
		  try
			{
				driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
				Thread.sleep(3000);
				String str="Tanuja123";
				  String s=driver.findElement(By.xpath("//td[text()='Tanuja123']")).getText();
				  Assert.assertTrue(str.contains(s));
				  System.out.println("You are able  to see the login arranged in descending order ");

			}
			catch(Exception e)
			{
				System.out.println("Not Able to see the login in descending order "+e);
			}
	  }
	  
	  @Given("User clicks on the course name for accesing the documents icon")
	  public void user_clicks_on_the_course_name_for_accesing_the_documents_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
			  System.out.println("You are able  to click on the selenium11");
			  } 
			  catch(Exception e) {
				  System.out.println("Not able to click on selenium11"+e);
			  }
	  }

	  @Then("User is navigated to the course description dashboard for accessing documents icon")
	  public void user_is_navigated_to_the_course_description_dashboard_for_accessing_documents_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the course description page"+actualtitle);
			  System.out.println("In order to click on the icon it must be present there ");
			  boolean val=driver.findElement(By.id("istooldesc_24896")).isDisplayed();
			  if(val)
			  {
				  System.out.println("You are able to see the icon");
			  }
			  else
			  {
				  System.out.println("You are not able to see the icon");
			  }
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the course description page"+e);
			  } 
	     
	    
	  }

	  @Then("User clicks on documents icon")
	  public void user_clicks_on_documents_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.id("istooldesc_24896")).click();
			  System.out.println(" able to click on the icon"); 
			  }
			  catch(Exception e) {
			  System.out.println("Not able to click on the icon"+e); 
			  } 

	  }

	  @Then("User is able to navigate to the documents description page")
	  public void user_is_able_to_navigate_to_the_documents_description_page() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - Selenium11";
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course documents");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course documents"+e);
		     Assert.fail(); }
	  }

	  @Then("User is able to see the search field and button and enters the name in field")
	  public void user_is_able_to_see_the_search_field_and_button_and_enters_the_name_in_field() {
	      // Write code here that turns the phrase above into concrete actions
		  try
			{
				driver.findElement(By.xpath("//*[@id='search_document_keyword']")).sendKeys("swadha");
				Thread.sleep(3000);
				driver.findElement(By.id("search_document_submit")).click();
				System.out.println("Able to enter the fields ");

			}
			catch(Exception e)
			{
				System.out.println("Not Able to enter the fields "+e);
			
			}
	      
	  }

	  @Then("User clicks on the search button and is able to see the documents related to it")
	  public void user_clicks_on_the_search_button_and_is_able_to_see_the_documents_related_to_it() {
	      // Write code here that turns the phrase above into concrete actions
		  try
		  {
			  Thread.sleep(3000); 
			  String expectedtitle = "There are no documents to be displayed.";
			  String actualtitle = driver.findElement(By.xpath("(//*[@id=\"cm-content\"]/div/div[4])[1]")).getText();
			  Assert.assertEquals(expectedtitle,actualtitle); 
			  System.out.println("Able to see the documents");  
		  }
		  catch(Exception e)
			{
				System.out.println("Not Able to see the documents "+e);
				Assert.fail();
			}
	  }
		 

	  @Then("User clicks on current folder and selects the documents")
	  public void user_clicks_on_current_folder_and_selects_the_documents() {
	      // Write code here that turns the phrase above into concrete actions
		  try
			{
				driver.findElement(By.xpath("//*[@class='filter-option-inner-inner']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[contains(text(),'Documents')]")).click();
				System.out.println("Able to enter the current folder fields ");

			}
			catch(Exception e)
			{
				System.out.println("Not Able to enter the current folder fields "+e);
			}
	 
	  }

	  @Then("user can see the documents arranged in ascendiang order according to the type,name,size,date")
	  public void user_can_see_the_documents_arranged_in_ascendiang_order_according_to_the_type_name_size_date() {
	      // Write code here that turns the phrase above into concrete actions
		  try
			{
				driver.findElement(By.xpath("//a[contains(text(),'Type')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Type')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Name')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Name')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Size')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Size')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Date')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Date')]")).click();
				Thread.sleep(3000);
				
				
				  System.out.println("You are able  to see the type,name,size,date arranged in descending and ascending order ");

			}
			catch(Exception e)
			{
				System.out.println("Not Able to see the details arranged in descending and ascending order "+e);
			}
	     
	  }
	  
	  @Given("User clicks on the course name for accesing the dropbox icon")
	  public void user_clicks_on_the_course_name_for_accesing_the_dropbox_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
			  System.out.println("You are able  to click on the selenium11");
			  } 
			  catch(Exception e) {
				  System.out.println("Not able to click on selenium11"+e);
			  }
	    
	  }

	  @Then("User is navigated to the course description dashboard for accessing dropbox icon")
	  public void user_is_navigated_to_the_course_description_dashboard_for_accessing_dropbox_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  String actualtitle = driver.getTitle();
			  System.out.println("You are able  to navigate to the course description page"+actualtitle);
			  System.out.println("In order to click on the icon it must be present there ");
			  boolean val=driver.findElement(By.id("istooldesc_24902")).isDisplayed();
			  if(val)
			  {
				  System.out.println("You are able to see the icon");
			  }
			  else
			  {
				  System.out.println("You are not able to see the icon");
			  }
			  
			  } catch(Exception e) {
			  System.out.println("Not able to navigate to the course description page"+e);
			  } 
		  
	      
	  }

	  @Then("User clicks on dropbox icon")
	  public void user_clicks_on_dropbox_icon() {
	      // Write code here that turns the phrase above into concrete actions
		  try {
			  driver.findElement(By.id("istooldesc_24902")).click();
			  System.out.println(" able to click on the icon"); 
			  }
			  catch(Exception e) {
			  System.out.println("Not able to click on the icon"+e); 
			  } 
	     
	  }

	  @Then("User is able to navigate to the dropbox description page")
	  public void user_is_able_to_navigate_to_the_dropbox_description_page() {
	      // Write code here that turns the phrase above into concrete actions
		  try { 
			  Thread.sleep(3000); 
		  String expectedtitle = "My Organization - My education - Selenium11 - Sent Files";
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle,actualtitle); 
		  System.out.println("You are able  to navigate to the selenium 11 course dropbox");
		  
		  } catch(Exception e) { 
			  System.out.println("Not able to navigate to the selenium 11 course dropbox"+e);
		     Assert.fail(); }
	  }
		  @Then("user clicks on the share a new file button")
		  public void user_clicks_on_the_share_a_new_file_button() {
		      // Write code here that turns the phrase above into concrete actions
		    
			  try {
				  driver.findElement(By.xpath("//*[@title='Share a new file']")).click();
				  System.out.println(" able to click on the share new file icon"); 
				  }
				  catch(Exception e) {
				  System.out.println("Not able to click on the share new file icon"+e); 
				  } 
			  
	   
	  }
		  @Then("User is navigated to a page for sharing file")
		  public void user_is_navigated_to_a_page_for_sharing_file() {
		      // Write code here that turns the phrase above into concrete actions
			  try { 
				  Thread.sleep(3000); 
			  String expectedtitle = "My Organization - My education - Selenium11 - Share a new file";
			  String actualtitle = driver.getTitle();
			  Assert.assertEquals(expectedtitle,actualtitle); 
			  System.out.println("You are able  to navigate to the dropbox share a new file");
			  
			  } catch(Exception e) { 
				  System.out.println("Not able to navigate to the dropbox share a new file"+e);
			     Assert.fail(); }
			  
		     
		  }

		  @Then("user clicks on the dropdown for selecting the person to send file")
		  public void user_clicks_on_the_dropdown_for_selecting_the_person_to_send_file() {
		      // Write code here that turns the phrase above into concrete actions
			  try
			  {
				  Thread.sleep(3000);
				  driver.findElement(By.xpath("//*[@class='filter-option-inner-inner']")).click();
				  driver.findElement(By.xpath("//*[contains(text(),'Akshara J')]")).click();
				  System.out.println("Able to select the name to whom we are sending files");
			  }
			  catch(Exception e)
			  {
				  System.out.println("Not Able to select the name to whom we are sending files"+e);
			  }
		    
		  }
		  
		  @Then("User clicks on the area for uploading file")
		  public void user_clicks_on_the_area_for_uploading_file() {
		      // Write code here that turns the phrase above into concrete actions
			  try {
				  driver.findElement(By.xpath("//*[@class='button-load']")).click();
				  System.out.println(" able to click on the area to upload file"); 
				  }
				  catch(Exception e) {
				  System.out.println("Not able to click on the area to upload file"+e); 
				  } 
		  }
		  
		  @Then("Switch to the other window for selection")
		  public void switch_to_the_other_window_for_selection() {
		      // Write code here that turns the phrase above into concrete actions
			  try
			  {
				  String parent=driver.getWindowHandle();
				  Set<String> s = driver.getWindowHandles();
				  for(String child :s)
				  {
					  if(!parent.equals(child)){
						  driver.switchTo().window(child);
						  driver.getTitle();
					  }
				  }
				  Thread.sleep(3000);
				  System.out.println("The user is able to switch to the other window");
				  
			  }
			  catch(Exception e) {
				  System.out.println("The user is not able to switch to the other window"+e);
				  Assert.fail();
				  
			  }
		    
		  }
		     
		  @Given("User clicks on the course name for accesing dropbox icon")
		  public void user_clicks_on_the_course_name_for_accesing_dropbox_icon() {
		      // Write code here that turns the phrase above into concrete actions
			  try {
				  driver.findElement(By.xpath("(//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a)[1]")).click();
				  System.out.println("You are able  to click on the selenium11");
				  } 
				  catch(Exception e) {
					  System.out.println("Not able to click on selenium11"+e);
				  }
		   
		  }

		  @Then("User is navigated to the description dashboard for accessing dropbox icon")
		  public void user_is_navigated_to_the_description_dashboard_for_accessing_dropbox_icon() {
		      // Write code here that turns the phrase above into concrete actions
			  try {
				  String actualtitle = driver.getTitle();
				  System.out.println("You are able  to navigate to the course description page"+actualtitle);
				  System.out.println("In order to click on the icon it must be present there ");
				  boolean val=driver.findElement(By.id("istooldesc_24902")).isDisplayed();
				  if(val)
				  {
					  System.out.println("You are able to see the icon");
				  }
				  else
				  {
					  System.out.println("You are not able to see the icon");
				  }
				  
				  } catch(Exception e) {
				  System.out.println("Not able to navigate to the course description page"+e);
				  } 
		    
		  }

		  @Then("User clicks on dropbox icon in order to navigate to the page")
		  public void user_clicks_on_dropbox_icon_in_order_to_navigate_to_the_page() {
		      // Write code here that turns the phrase above into concrete actions
			  try {
				  driver.findElement(By.id("istooldesc_24902")).click();
				  System.out.println(" able to click on the icon"); 
				  }
				  catch(Exception e) {
				  System.out.println("Not able to click on the icon"+e); 
				  } 
		     
		  }

		  @Then("User is able to navigate to dropbox description page")
		  public void user_is_able_to_navigate_to_dropbox_description_page() {
		      // Write code here that turns the phrase above into concrete actions
			  try { 
				  Thread.sleep(3000); 
			  String expectedtitle = "My Organization - My education - Selenium11 - Sent Files";
			  String actualtitle = driver.getTitle();
			  Assert.assertEquals(expectedtitle,actualtitle); 
			  System.out.println("You are able  to navigate to the selenium 11 course dropbox");
			  
			  } catch(Exception e) { 
				  System.out.println("Not able to navigate to the selenium 11 course dropbox"+e);
			     Assert.fail(); }
		   
		  }

		  @Then("User clicks on the add a new folder button")
		  public void user_clicks_on_the_add_a_new_folder_button() {
		      // Write code here that turns the phrase above into concrete actions
			  try {
				  driver.findElement(By.xpath("//*[@title='Add a new folder']")).click();
				  System.out.println(" able to click on the add new folder icon"); 
				  }
				  catch(Exception e) {
				  System.out.println("Not able to click on the add new folder icon"+e); 
				  } 
		      
		  }

		  @Then("User is navigated to a page for creating a new folder")
		  public void user_is_navigated_to_a_page_for_creating_a_new_folder() {
		      // Write code here that turns the phrase above into concrete actions
			  try { 
				  Thread.sleep(3000); 
			  String expectedtitle = "My Organization - My education - Selenium11 - Add a new folder";
			  String actualtitle = driver.getTitle();
			  Assert.assertEquals(expectedtitle,actualtitle); 
			  System.out.println("You are able  to navigate to the dropbox add new folder page");
			  
			  } catch(Exception e) { 
				  System.out.println("Not able to navigate to the dropbox add new folder page"+e);
			     Assert.fail(); }
		      
		  }

		  @Then("User gives the name for creating a new folder")
		  public void user_gives_the_name_for_creating_a_new_folder() {
		      // Write code here that turns the phrase above into concrete actions
			  try {
				  driver.findElement(By.id("add_new_category_category_name")).sendKeys("information science");
				  System.out.println(" able to enter the folder name"); 
				  }
				  catch(Exception e) {
				  System.out.println("Not able to enter the folder name"+e); 
				  } 
		    
		  }

		  @Then("User clicks on create folder")
		  public void user_clicks_on_create_folder() {
		      // Write code here that turns the phrase above into concrete actions
			  try {
				  driver.findElement(By.id("add_new_category_StoreCategory")).click();
				  System.out.println(" able to click on create folder"); 
				  }
				  catch(Exception e) {
				  System.out.println("Not able to click on the create new folder"+e); 
				  } 
		    
		  }

		  @Then("User is able to see the message on creating a folder")
		  public void user_is_able_to_see_the_message_on_creating_a_folder() {
		      // Write code here that turns the phrase above into concrete actions
			  try { 
				  Thread.sleep(3000); 
			  String expectedtitle = "The folder has been created";
			  String actualtitle = driver.findElement(By.xpath("//*[@class='alert alert-success']")).getText();
			  Assert.assertEquals(expectedtitle,actualtitle); 
			  System.out.println("You are able  to see the folder creation message");
			  
			  } catch(Exception e) { 
				  System.out.println("Not able to see the folder creation message"+e);
			     Assert.fail(); }
		      
		  }
		  
		  @Then("User is able to arrange the folders according to type,sent files.")
		  public void user_is_able_to_arrange_the_folders_according_to_type_sent_files() {
		      // Write code here that turns the phrase above into concrete actions
			  try
				{
					driver.findElement(By.xpath("//a[contains(text(),'Type')]")).click();
					driver.findElement(By.xpath("//a[contains(text(),'Type')]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//a[contains(text(),'Sent Files')]")).click();
					String str="computers";
					  String s=driver.findElement(By.xpath("//*[text()='computers']")).getText();
					  Assert.assertTrue(str.contains(s));
					  Thread.sleep(3000);
					  driver.findElement(By.xpath("//a[contains(text(),'Sent Files')]")).click();
					  String str1="science";
					  String s1=driver.findElement(By.xpath("//*[text()='science']")).getText();
					  Assert.assertTrue(str1.contains(s1));
					  System.out.println("You are able  to see the arrangement  ");
				}
				catch(Exception e)
				{
					System.out.println("Not Able to see the arrangement "+e);
				}
		    
		  }

		  @Then("User clicks on selectall and unselectall button")
		  public void user_clicks_on_selectall_and_unselectall_button() {
		      // Write code here that turns the phrase above into concrete actions
			  try {
				  
			  
			  driver.findElement(By.xpath("//a[contains(text(),'Select all')]")).click();
			  boolean b = driver.findElement(By.name("id[]")).isSelected();
			  if(b)
			  {
				  System.out.println("The records are selected after clicking on select all");
			  }
			  else
			  {
				  System.out.println("The records are not selected after clicking on select all");  
			  }
				driver.findElement(By.xpath("//a[contains(text(),'Unselect all')]")).click();
				boolean a = driver.findElement(By.name("id[]")).isSelected();
				if(!a)
				{
					System.out.println("The records are deselected after clicking on unselect all");
				}
				else
				{
					System.out.println("The records are not deselected after clicking on unselect all");	
				}
				
			  }
			  catch(Exception e){
				  System.out.println("The select and deselect buttons are not working properly"+e);
				  
			  } 
			  
			  
		  }
		  
		  @Then("User selects the folder to be deleted and clicks on the details and then on delete")
		  public void user_selects_the_folder_to_be_deleted_and_clicks_on_the_details_and_then_on_delete() {
		      // Write code here that turns the phrase above into concrete actions
			  try {
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("(//*[@title='Delete'])[8]")).click();
			  Thread.sleep(3000);
			  Alert alert = driver.switchTo().alert();
			  alert.getText();
			  alert.accept();
			  System.out.println("Able to accept the alert box");
			  System.out.println("The record is deleted successfully");
			  }
			  catch(Exception e)
			  {
				  System.out.println("The record is not deleted successfully"+e);
			  }
			  
		    
		  }
		  @Then("the deletion of folder is verified")
		  public void the_deletion_of_folder_is_verified() {
		      // Write code here that turns the phrase above into concrete actions
			  try { 
				  Thread.sleep(3000); 
			  String expectedtitle = "The folder has been deleted";
			  String actualtitle = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
			  Assert.assertEquals(expectedtitle,actualtitle); 
			  System.out.println("You are able  to see the deletion confirmation");
			  
			  } catch(Exception e) { 
				  System.out.println("Not able to see the deletion confirmation"+e);
			     Assert.fail(); }
		    
		  }


		
}
