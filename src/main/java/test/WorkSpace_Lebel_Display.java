package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_Homepage;
import utility.TestBase;

public class WorkSpace_Lebel_Display extends TestBase
{

	@Test
	public void CheckworkSpaceLabel()
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		boolean exptected = true;
		boolean actual = x.WorkSpaceDisplayed();
		
		Assert.assertEquals(actual, exptected);
		
	}
	
	
}
