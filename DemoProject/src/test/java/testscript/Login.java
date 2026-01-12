package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base {

	@Test
	
	public void loginSuccess() throws InterruptedException {
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		String user="admin";
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		String password1="admin";
		password.sendKeys(password1);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		//Thread.sleep(1000);
	}
	@Test
	public void incorrectUsername() {
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		String user="devu";
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		String password1="admin";
		password.sendKeys(password1);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		
	}
	
	@Test
	public void incorrectPassword() {
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		String user="admin";
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		String password1="12345";
		password.sendKeys(password1);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		
	}
	
	@Test
	public void incorrectUsernamePassword() {
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		String user="devu";
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		String password1="1234";
		password.sendKeys(password1);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		
	}
	
}
