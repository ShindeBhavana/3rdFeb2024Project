package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	//Author Name: Bhavana
	
	public static String getTD(int rowInd, int colInd) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\EXCEL WORKBOOK.xlsx");
		Sheet sh=(Sheet) WorkbookFactory.create(file).getSheet("DDF");
		
		String value = sh.getRow(rowInd).getCell(colInd).getStringCellValue();
		
		return value;
	}
	

	public static void getFailedTcSS(WebDriver driver,int TCID) throws IOException 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"\\FailedTCesSS\\TestCase"+TCID+".png");
		
		FileHandler.copy(src, dest);
	}
	
	public static String getPFdata(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\PropertyFile.properties");
	    Properties p=new Properties(); 
	    p.load(file);
	    String value = p.getProperty(key);
	    
	    return value;
	}
}
