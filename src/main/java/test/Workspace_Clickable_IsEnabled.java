package test;

import org.testng.Assert;

import pom.POM_Homepage;
import utility.TestBase;

public class Workspace_Clickable_IsEnabled extends TestBase
{
	public void CheckworkSpaceLabel()
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		boolean exptected = true;
		boolean actual = x.WorkSpaceLabelEnabled();
		
		Assert.assertEquals(actual, exptected);
		log.info("workspace button is enabled");
		
	}
	
}
