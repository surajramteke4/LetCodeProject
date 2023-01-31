package utility;

import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot_Class extends TestBase
{
		
		public static void TakesScreenshot(WebDriver driver,String ScreenshotName) throws IOException
		{
			Date d = new Date();
			DateFormat d1 = new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
			String date = d1.format(d);
			TakesScreenshot ts = (TakesScreenshot)driver;
			File seleniumFile = ts.getScreenshotAs(OutputType.FILE);
			File myfile = new File("./Screenshots\\"+ ScreenshotName + date + ".jpg" );
			FileHandler.copy(seleniumFile, myfile);
		}
	
	
	
}
	
	
	

