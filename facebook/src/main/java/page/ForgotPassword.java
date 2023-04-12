package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
	//variable declaration
		@FindBy (xpath ="//table//div")
		private WebElement Textmessage;

		@FindBy (xpath ="//input[@name=\"email\"]")
		private WebElement EmailOrPhoneNumber;

		@FindBy (xpath ="//a[text()='Cancel']")
		private WebElement CancelButton;

		@FindBy (xpath ="//button[text()='Search']")
		private WebElement SearchButton;
		
		@FindBy (xpath ="//button[text()='Search']")
		private WebElement frame;
		

		@FindBy (xpath ="//form(@id='identify_yourself_flow')/div/div[2]//div)[2]")
		private WebElement Nosuchresultext;
		
		@FindBy (xpath ="//form(@id='identify_yourself_flow')/div/div[2]//div)[3]")
		private WebElement errorMsg;
		
		//find elements methods <return type ---> list<webelement>
		@FindBy(xpath="//a")  // to find mutiple  webelements with same x-path
		private List<WebElement> links;
		
		private WebDriver driver;
		
		//variable initialization
		public ForgotPassword(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public String getErrorTitle()
		{
			return Nosuchresultext.getText() ;
		}
		
		public String getErrorMessage()
		{
			return errorMsg.getText() ;
		}
		
		public void switchtoframe()
		{
			driver.switchTo().frame(frame);
		}
		
		
		
		
		
		
		//variable use
		public String getTextMessage() {//instead of void we used string 
			String text = Textmessage.getText();
			return text;//and call the method	
			}//select date drop down
		
		public void EmailOrPhoneNumber() {
			EmailOrPhoneNumber.sendKeys("velocity@gmail.com");
		}
		public void CancelButton() {
			CancelButton.click();
		}
		public void SearchButton() {
			SearchButton.click();
		}
		
		}



