package Module1_Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFiles.BaseClass;

public class PoorvankFoodsHomePage extends BaseClass
{
	@FindBy(xpath="//span[text()='Logout']") private WebElement logoutBtn;
	
	public PoorvankFoodsHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPoorvankFoodsHomePageLogoutBtnText() 
	{
		String Text = logoutBtn.getText();
		
		return Text;
	}

}
