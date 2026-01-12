package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {

	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;
	@FindBy(xpath="	//p[text()='Dashboard']")WebElement dashboard;

	public WebDriver driver;
	WaitUtility waitUtility=new WaitUtility();
	public LoginPage(WebDriver driver) {
		this.driver=driver;//this driver-global and driver local
		PageFactory.initElements(driver, this);
	}

	public void entertheUsername(String username2) {
		username.sendKeys(username2);
	}
	
	public void enterthePassword(String password2) {
		password.sendKeys(password2);
	}
	
	public void clickonSigninButton() {
		
		waitUtility.waitForElementToBeClickable(driver,signin);
		signin.click();
	}
	
	public boolean isDashboarDisplay() {
		return dashboard.isDisplayed();
	}
	
	
}
