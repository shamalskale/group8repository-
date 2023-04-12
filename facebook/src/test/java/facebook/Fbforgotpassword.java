package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.ForgotPassword;

public class Fbforgotpassword
{
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdrive.chrome.drive","C:\\java selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		ForgotPassword forgetpassword = new ForgotPassword(driver);

  }
}