package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestclassNg {
	
	


	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shama\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);//implicitlyWait(12,TimeUnit.);
		
		//Thread.sleep(3000);
	}
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");

		driver.get("https://www.facebook.com/");
		//home page pom class object
		//click on sign in
		//login to page pom class object
		// send username
        // send password
		//click on login button
		//home page pom class object
		//search product
		//search product
		//search result pom class object
		//select  product - 1 product
	}
	@Test
	public void test()
	{
		System.out.println("Test");
		// product details pom class object
		//click on add to cart
		//cart details page pom class object
		//verification of product
        // product name, price,delivery date
 	}
	
	@Test
	public void test1()
	{ 
		System.out.println("Test1");
		// product details pom class object
		//click on buy now
		// order details page pom class object
		//verify details
	}
	
	@AfterMethod
	public void aftreClass()
	{
		System.out.println("AfterMethod");
		//log out from application
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
		//closed the browser.
	}


}
