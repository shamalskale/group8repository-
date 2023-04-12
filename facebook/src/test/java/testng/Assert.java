package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
//invocationcount used ==
	//to execute the test case multiple  time
	//
	@Test (priority = 1 , invocationCount = 3)
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(priority = 4)
	public void test4()
	{
		System.out.println("test4");
	}  
	
	@Test(priority = 3)
	public void test1()
	{
		System.out.println("test1");
	}
	 
	@Test(priority = 2)
	public void test2()
	{
		System.out.println("test2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
		
	}

	

}
