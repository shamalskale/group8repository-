package testng;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.ForgotPassword;
import page.LoginPage;

public class verifyForFotPasswordPage {
	WebDriver driver;
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
	
	@Test
	public void VerifyMessageOnForgotPasswordPage()
	{
		System.out.println("Test 1");
		ForgotPassword forgotPassword= new ForgotPassword(driver);
		String actualMsg = forgotPassword.getTextMessage();
		String expectedMsg ="Please enter your email address or mobile number to search for your account.";
		
		if(actualMsg.equals(expectedMsg))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAILED");
		}
	}
	
	@Test
	public void VerifyCancleButtonOnForgotPassword()
	{
	System.out.println("Test 2");
	ForgotPassword forgotPassword= new ForgotPassword(driver);
	forgotPassword.CancelButton();
	String expectedURL="";
	String expectedTitle="";
	String actualURL=driver.getCurrentUrl();
	String actualTitle=driver.getTitle();
	
	
	//Assert.assertEquals(atualErrorTitle,expectedErrorTitle);  
	if(expectedURL.equals(actualURL) && expectedTitle.equals(actualTitle))
	{
		System.out.println("PASS");
	}
	
	else
	{
		System.out.println("FAILED");
	}
	
	
	}
	@AfterMethod
	public void LogOutFromApplication()
	{
		System.out.println("AfterMethod");
	}
	//log out
	
	@AfterClass
	public void ClosedBrowser()
	{
		System.out.println("AfterClass");
		driver.quit();
	}
	



	

	//private void beforeMethod() {
		// TODO Auto-generated method stub
		
	}


	
	



