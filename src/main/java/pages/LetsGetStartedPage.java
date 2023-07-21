package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LetsGetStartedPage {

	WebDriver driver;
	@FindBy(xpath="//*[@class='label-text big']") WebElement headline;
	@FindBy(xpath="//*[@class='section-heading-2-0']") WebElement subheadline;
	@FindBy(xpath="//*[@id='Company-Name-2']") WebElement entercompanyname;
	@FindBy(xpath="//*[@id='Name-2']") WebElement entername;
	@FindBy(xpath="//*[@id='Email-5']") WebElement enteremail;
	@FindBy(xpath="//*[@id='Discuss']") WebElement selectdiscussiont;
	@FindBy(xpath="//*[@class='field-label']") WebElement something_elselabel;
	@FindBy(xpath="//*[@id='Something-else-2']") WebElement textboxsomething_else;
	@FindBy(xpath="//*[@class='submit-button w-button']") WebElement submitbutton;

	public LetsGetStartedPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void openHomePage() {
		driver.get("https://www.incubyte.co/lets-get-started");
	}

	public String headLine() {
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		return headline.getText();
	}

	public String subHeadLine() {

		return subheadline.getText();
	}

	public void enterCompanyName(String companyname) {
		entercompanyname.sendKeys(companyname);
	}

	public void enterName(String name) {
		entername.sendKeys(name);
	}

	public void enterEmail(String email) {
		enteremail.sendKeys(email);
	}

	public void selectDiscussion() {

		Select select = new Select(selectdiscussiont);
		select.selectByIndex(3);
	}

	public String somethingElseLabel() {
		return something_elselabel.getText();
	}

	public void textboxSomethingElse(String textmsg) {

		textboxsomething_else.sendKeys(textmsg);
	}

	
	public void submitButton() {
		submitbutton.submit();
	}


}
