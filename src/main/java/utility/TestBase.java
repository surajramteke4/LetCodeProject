package utility;





import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;






public class TestBase {
	
	
	

public Logger log = Logger.getLogger("letcode");

public static WebDriver driver;

	@Parameters("BrowserName")
	@BeforeMethod
	public void setUp(String BrowserName) throws IOException
	{	
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
					
		}
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\DRIVERS\\geckodriver.exe\\");
			driver = new FirefoxDriver();
		
		}
		else
		{
			log.info("show exception");
		}
		PropertyConfigurator.configure("log4j.properties");
		log.info("browser is opened");
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		log.info("site is opened");
		
	}
	
	
	
@AfterMethod
public void tearDown() throws InterruptedException  
{
	Thread.sleep(2000);
	log.info("close the browser");
	driver.quit();
}






}
