package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.ForgotPassword;
import page.LoginPage;

public class Fbobj{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		LoginPage loginpage =new LoginPage (driver);
		
        loginpage.sendUserName();
		
		Thread.sleep(3000); 
		
		loginpage.sendpassword();
		
		Thread.sleep(3000); 
		
	//	loginpage.clickOnLoginButton();
		
		loginpage.clickForgottenpassword();
		
		Thread.sleep(3000);
		
		ForgotPassword forgotpassword = new ForgotPassword(driver);
		
		forgotpassword.CancelButton();
		
		//loginpage.clickCreatenewaccount();
	}

}
