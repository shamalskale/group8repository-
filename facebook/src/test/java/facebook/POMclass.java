package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclass 
{
	@FindBy (xpath = "//input[@name=\\\"firstname\\\"]")
	
     private WebElement FirstName;
     
    public POMclass(WebDriver driver) //constructor
    {
    	PageFactory.initElements(driver, this);
    	
    }
    public void enterFirstName()
    {
    	FirstName.sendKeys("velocity");
    }
    
}
