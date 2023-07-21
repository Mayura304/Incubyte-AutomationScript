package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utitlity.ReadDataFromPropFile;

public class LetsGetStartedPageTest extends BaseTests {
	
	@Test(priority = 1)
	public void openHomePageValidation() {
		lgsp.openHomePage();
	}
	
	@Test(priority = 2)
	public void headLineValidation() {
		
		String actualtext = lgsp.headLine();
		String expectedtext = "let's talk";
		Assert.assertEquals(expectedtext, actualtext);
	}
	
	@Test(priority= 3)
	public void subHeadLineValidation() {
		String actualtext = lgsp.subHeadLine();
		String expectedtext = "We'd love to hear from you";
		Assert.assertEquals(expectedtext,actualtext);
	}
	
	@Test(priority= 4)
	public void enterCompanyNameValidation() throws IOException {
		
		lgsp.enterCompanyName(ReadDataFromPropFile.readConfigData("companyname"));
	}

	@Test(priority = 5)
	public void enterNameValidation() throws IOException {
		
		lgsp.enterName(ReadDataFromPropFile.readConfigData("name"));
	}

	@Test(priority = 6)
	public void enterEmailValidation() throws IOException {
		
		lgsp.enterEmail(ReadDataFromPropFile.readConfigData("email"));
	}

	@Test(priority = 7)
	public void selectDiscussionValidation() {
		
		lgsp.selectDiscussion();
	}

	@Test(priority = 8)
	public void somethingElseLabelValidation() {
		String actualtext = lgsp.somethingElseLabel();
		String expectedtext = "If you choose 'Something else', please let us know below what you would like to discuss:";
		Assert.assertEquals(expectedtext,actualtext);
	}

	@Test(priority = 9)
	public void textboxSomethingElseValidation() throws IOException {
		
		lgsp.textboxSomethingElse(ReadDataFromPropFile.readConfigData("textmsg"));
	}
	
	
	@Test(priority = 10)
	public void submitButtonValidation() {
		lgsp.submitButton();
	}


}
