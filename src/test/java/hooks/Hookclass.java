package hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookclass {
	
	

	public static WebDriver driver;
	public static WebDriver driver1;

	
	@Before
	public void initialization()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swadha Pankhudi\\eclipse-workspace\\Automation\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/index.php");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swadha Pankhudi\\eclipse-workspace\\Automation\\chromedriver.exe");
	    driver1 = new ChromeDriver();
		driver1.get("http://elearningm1.upskills.in/index.php");
		 
	}

	@After
	public void closedriver()
	{
		System.out.println("The browser is closing now");
		
		driver.quit();
		driver1.quit();
		
	}
}


