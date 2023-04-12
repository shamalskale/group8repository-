package page;
//its pom class
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//variable declaration
	@FindBy (xpath ="//input[@id='email']")
	private WebElement sendUserName;

	@FindBy (xpath ="//input[@type='password']")
	private WebElement password;

	@FindBy (xpath ="//button[@name='login']")
	private WebElement loginButton;

	@FindBy (xpath ="//a[text()='Forgotten password?']")
	private WebElement Forgottenpassword;

	@FindBy (xpath ="//a[text()='Create new account']")
	private WebElement Createnewaccount;
	
	@FindBy (xpath ="//a[@class='_42ft _4jy0 _9nq1 textPadding20px _4jy3 _517h _51sy']]")
	private WebElement CancleButton;
	
	//variable initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//driver is a local variable of a main method
	}

	//variable use
	public void sendUserName()
	{
		sendUserName.sendKeys("velocity@gmail.com");
		}
	public void getTextofUserName() 
	{
		String text = sendUserName.getAttribute("aria-label");
		
		}
	public void sendpassword() {
		password.sendKeys("123456789");
		}
	public void clickOnLoginButton()
	{
		loginButton.click();
		}

	public void clickForgottenpassword()
	{
		Forgottenpassword.click();
		}
	public void clickCreatenewaccount()
	{
		Createnewaccount.click();
		}
	public void CancleButton()
	{
		CancleButton.click();
	}
	public void loginToApplication()
	{
		sendUserName.sendKeys("velocity@gmail.com");
		password.sendKeys("123456789");
		loginButton.click();
	}
}

//
//

//