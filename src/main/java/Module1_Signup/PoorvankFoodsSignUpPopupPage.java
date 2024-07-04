package Module1_Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFiles.BaseClass;

public class PoorvankFoodsSignUpPopupPage extends BaseClass
{
	@FindBy(xpath="//input[@type='email']")private WebElement email;
	@FindBy(xpath="//input[@placeholder='First Name']")private WebElement firstName;
	@FindBy(xpath="//input[@placeholder='Last Name']")private WebElement lastName;
	@FindBy(xpath="(//input[@autocomplete='new-password'])[1]")private WebElement pwd;
	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]")private WebElement cpwd;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")private WebElement acptTerms;
	@FindBy(xpath="//button[text()='Sign Up']")private WebElement Signup;
	
	public PoorvankFoodsSignUpPopupPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpPoorvankFoodsSignUpPopupPageEmail(String Email) 
	{
		email.sendKeys(Email);
	}

	public void inpPoorvankFoodsSignUpPopupPageFirstName(String FirstName) 
	{
		firstName.sendKeys(FirstName);
	}
	
	public void inpPoorvankFoodsSignUpPopupPageLastName(String LastName) 
	{
		lastName.sendKeys(LastName);
	}
	
	public void inpPoorvankFoodsSignUpPopupPagePWD(String PWD) 
	{
		pwd.sendKeys(PWD);
	}
	
	public void inpPoorvankFoodsSignUpPopupPageCPWD(String CPWD) 
	{
		cpwd.sendKeys(CPWD);
	}
	
	public void clickPoorvankFoodsSignUpPopupPageAcptTerms() 
	{
		acptTerms.click();
	}
	
	public void clickPoorvankFoodsSignUpPopupPageSignup() 
	{
		Signup.click();
	}
}
