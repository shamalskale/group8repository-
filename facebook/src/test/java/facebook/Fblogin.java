package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import page.LoginPage;

public class Fblogin {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shama\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\shama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions ops =new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
	 
		WebDriver driver = new ChromeDriver(ops);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		LoginPage loginpage =new LoginPage (driver);//driver is a local variable of a constructor
		
		loginpage.sendUserName();
		
		Thread.sleep(3000); 
		
		loginpage.sendpassword();
		
		Thread.sleep(3000); 
		
		loginpage.clickOnLoginButton();
		
		//loginpage.clickForgottenpassword();
		
		//loginpage.clickCreatenewaccount();
	   //loginpage.loginToApplication();
	}

}
