package Module1_Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFiles.BaseClass;

public class PoorvankFoodsDashboardPage extends BaseClass
{
	@FindBy(xpath="//span[text()='Register']")private WebElement registerBtn;
	
	public PoorvankFoodsDashboardPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPoorvankFoodsDashboardPageRegisterBtn() 
	{
		registerBtn.click();
	}
	
	

}
