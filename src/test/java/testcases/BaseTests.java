package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LetsGetStartedPage;

public class BaseTests {

		public static WebDriver driver;
		HomePage hp;
		LetsGetStartedPage lgsp;
		
		@BeforeSuite
		public void beforeSuite() {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		
		@BeforeClass
		public void createObject() {
			
			hp = new HomePage(driver);
			lgsp = new LetsGetStartedPage(driver);
		}
	
}
