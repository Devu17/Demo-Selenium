package testscript;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant.Constant;
import utilities.WaitUtility;

public class Base {

	public WebDriver driver;
	FileInputStream fileinputstream;
	Properties properties;
	@BeforeMethod
	@Parameters("browser")
	public void initialBrowser(String browser) throws Exception {
		try {
			properties=new Properties();
			fileinputstream=new FileInputStream(Constant.FILEINPUTSTREAM);
			properties.load(fileinputstream);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if (browser.equalsIgnoreCase("ChromeTest")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edgetest")) {
			driver = new EdgeDriver();
		} else {
			throw new Exception("not connect");
		}
		//driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.get(properties.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITYWAIT));
		driver.manage().window().maximize();

	}

//@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
