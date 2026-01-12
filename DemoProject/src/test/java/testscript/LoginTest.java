package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

@Test
public class LoginTest extends Base {

	public void verifyTheUserIsAbleToUsingValidCredential() {
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.entertheUsername(username);
		loginpage.enterthePassword(password);
		loginpage.clickonSigninButton();
		boolean homepage = loginpage.isDashboarDisplay();
		Assert.assertTrue(homepage, "by giving valid credentials,home page not load");
	}

	public void verifyUserNotAbleToLoginUsingIncorrectUsername1() {
		String username = "devu";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.entertheUsername(username);
		loginpage.enterthePassword(password);
		loginpage.clickonSigninButton();

	//	boolean alertmessage = loginpage.alertIsDisplayed();
		//Assert.assertEquals(alertmessage, Constant.LOGINVALIDPASSWORD);
	}

	public void verifyUserNotAbleToLoginUsingIncorrectUsername() {
		String username = "admin";
		String password = "12345";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.entertheUsername(username);
		loginpage.enterthePassword(password);
		loginpage.clickonSigninButton();
	}

	public void verifyUserNotAbleToLoginUsingIncorrectUsernameAndPassword() {
		String username = "devu";
		String password = "12345";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.entertheUsername(username);
		loginpage.enterthePassword(password);
		loginpage.clickonSigninButton();
	}
}
