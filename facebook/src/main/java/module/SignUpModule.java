package module;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpModule {  //it gives pop up thats why we create a pop up page

			@FindBy (xpath ="//input[@name='firstname']")
			private WebElement firstname;

			@FindBy (xpath ="//input[@name='lastname']")
			private WebElement lastname;

			@FindBy (xpath ="//select[@aria-label='Day']")
			private WebElement day;

			@FindBy (xpath ="//select[@aria-label='Month']")
			private WebElement month;
			
			@FindBy (xpath ="//select[@aria-label='Year']")
			private WebElement year;
			
			@FindBy (xpath ="//label[@for='u_4_4_AM']")
			private WebElement female;
			
			@FindBy (xpath ="//label[@for='u_d_5_Na']")
			private WebElement male;
			
			@FindBy (xpath ="//label[@for='u_d_6_sj']")
			private WebElement custom;

			 WebDriver driver;//***
			 WebDriverWait wait;//global declaration
			 Actions action ;
			 JavascriptExecutor  javascriptExecutor;
			 
			//variable initialization
			public SignUpModule(WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver = driver;//***
				wait = new WebDriverWait (driver , 20);
				Actions action = new Actions(driver);
				 javascriptExecutor =( JavascriptExecutor)driver;
			}
			//variable use
			public void sendfirstname() {
				firstname.sendKeys("ram");
				}
			
			public void clickOnCustom() {
				Actions action = new Actions(driver);//***
				
				//WebDriverWait wait = new WebDriverWait(driver,20);//20sec
				wait = new WebDriverWait (driver , 20);
				wait.until(ExpectedConditions.visibilityOf(custom));
				javascriptExecutor.executeScript("argumentS[0],scrillIntoView(true);" , custom);
				javascriptExecutor.executeScript("window.scrollBy(0,1000)",custom);
				action.moveToElement(custom).click().build().perform();
				}
			
			
			
			public void selectday() {
				Select select = new Select(day);
				//WebDriverWait wait = new WebDriverWait(driver,20);//20sec
				wait = new WebDriverWait (driver , 20);
				wait.until(ExpectedConditions.visibilityOf(day));
				select.selectByVisibleText("1");
			}
			public void selectmonth() {
				Select select = new Select(month);
				select.selectByVisibleText("January");
			}
			
			
			
}
//input[@name='email']




