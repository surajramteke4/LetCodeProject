package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_Homepage;
import utility.TestBase;

public class Workspace_Lebel_GetText extends TestBase
{

	@Test
	public void CheckworkSpaceLabel()
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		String acutualLabel = x.WorkSpaceLebel();
		String expected = "Explore Workspace";
		
		Assert.assertEquals(expected, acutualLabel);
		log.info("WorkSpace Label Test Passed");
		
		
	}
}
