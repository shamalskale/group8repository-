package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import page.LoginPage;

public class VerifySignUpPage {
	
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeClass
	public void beforeClass()
	{
		
		
			System.out.println("BeforeClass");
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\shama\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
		    driver = new ChromeDriver();
		
			driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);//implicitlyWait(12,TimeUnit.);
			
		//driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);//implicitlyWait(12,TimeUnit.);
		
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");

		driver.get("https://www.facebook.com/");
	LoginPage loginPage = new LoginPage(driver);
	loginPage.clickForgottenpassword();
	
}
}
