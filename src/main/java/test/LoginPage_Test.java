package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Screenshot_Class;
import utility.TestBase;

public class LoginPage_Test extends TestBase
{
@Test
public void checkLoginPage() throws IOException 
{
	String givenurl = "https://letcode.in/";
	
	String acutalurl = driver.getCurrentUrl();
	Assert.assertEquals(acutalurl,givenurl);
	
	String givenTitle = "LetCode with Koushik";
	String actualUrl = driver.getTitle();
	Assert.assertEquals(actualUrl,givenTitle );
	log.info("test case passed");
	
}
}

