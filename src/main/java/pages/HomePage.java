package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	@FindBy(xpath="(//*[text()='contact'])[2]") WebElement Contact;
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.js = (JavascriptExecutor) driver;
		
	}
	
	public void openHomePage() {
		driver.get("https://www.incubyte.co/");
	}
	
	public void scrollPage() {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		js.executeScript("arguments[0].scrollIntoView();", Contact);
		
	}
	
	public void contactLink() {
		
		Contact.click();
	}
	
	public String contactLinkText() {
		return Contact.getText();
	}
}
