package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTests {
	
	@Test(priority = 1)
	public void openHomePageValidation() {
		
		hp.openHomePage();
	}

	@Test(priority = 2)
	public void scrollPageValidation() {
		
		hp.scrollPage();
	}
	
	@Test(priority = 3)
	public void contactLinkValidation() {
		hp.contactLink();
	}
	
	@Test(priority = 4)
	public void contactLinkTextValidation() {
		String actualText = hp.contactLinkText();
		String expectedText = "contact";
		Assert.assertEquals(expectedText, actualText);
	}
}
