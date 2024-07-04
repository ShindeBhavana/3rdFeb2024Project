package Module1_Signup_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_Signup.PoorvankFoodsDashboardPage;
import Module1_Signup.PoorvankFoodsHomePage;
import Module1_Signup.PoorvankFoodsSignUpPopupPage;

public class PoorvankFoodsSignUpTest extends BaseClass
{
	PoorvankFoodsDashboardPage dp;
	PoorvankFoodsSignUpPopupPage pp;
	PoorvankFoodsHomePage hp;
	int TCID;
	
	
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException 
	{
		initializeBrowser();
		Thread.sleep(2000);
		
		dp=new PoorvankFoodsDashboardPage(driver);
		pp=new PoorvankFoodsSignUpPopupPage(driver);
		hp=new PoorvankFoodsHomePage(driver);
	}
	
	@BeforeMethod
	public void signupToApp() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		dp.clickPoorvankFoodsDashboardPageRegisterBtn();
		Thread.sleep(2000);
		pp.inpPoorvankFoodsSignUpPopupPageEmail(UtilityClass.getTD(0, 0));
		Thread.sleep(2000);
		pp.inpPoorvankFoodsSignUpPopupPageFirstName(UtilityClass.getTD(0, 1));
		Thread.sleep(2000);
		pp.inpPoorvankFoodsSignUpPopupPageLastName(UtilityClass.getTD(0, 2));
		Thread.sleep(2000);
		pp.inpPoorvankFoodsSignUpPopupPagePWD(UtilityClass.getTD(0, 3));
		Thread.sleep(2000);
		pp.inpPoorvankFoodsSignUpPopupPageCPWD(UtilityClass.getTD(0, 4));
		Thread.sleep(2000);
		pp.clickPoorvankFoodsSignUpPopupPageAcptTerms();
		Thread.sleep(2000);
		pp.clickPoorvankFoodsSignUpPopupPageSignup();
		Thread.sleep(2000);
	}
	
	@Test
	public void Signup() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		TCID=101;
		
		String actText = hp.verifyPoorvankFoodsHomePageLogoutBtnText();
		String expText = UtilityClass.getTD(0, 5);
		
		Assert.assertEquals(actText, expText, "Failed due to variation in both results");
	}
	
	@AfterMethod
	public void logOut(ITestResult s1) throws IOException 
	{
		if(s1.getStatus()==ITestResult.FAILURE) 
		{
			UtilityClass.getFailedTcSS(driver, TCID);
		}
	}
	
//	@AfterClass
//	public void closeBrowser() 
//	{
//		driver.quit();
//	}
//	

}
