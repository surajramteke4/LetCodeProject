package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_Homepage;
import utility.TestBase;

public class WorkSpace_click_to_Go_on_testingPage  extends TestBase
{
	@Test
	public void CheckworkSpaceLabel()
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		x.ClickOnWorkSpaceLink();
		
		String givenUrl = "https://letcode.in/test";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(givenUrl, actualUrl);
		
		String givenTitle = "LetCode - Testing Hub";
		String acutalTitle = driver.getTitle();
		
	}
}
