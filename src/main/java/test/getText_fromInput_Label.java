package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_Homepage;
import pom.POM_workSpacePage;
import utility.TestBase;

public class getText_fromInput_Label extends TestBase
{
	@Test
	public void GetTextFromLabel()
	{	POM_Homepage x =  new POM_Homepage(driver);	
		x.ClickOnWorkSpaceLink();
		POM_workSpacePage y = new POM_workSpacePage(driver);
		String acutalText = y.getTextFromInputLabel();
		log.info(acutalText);
		String givenText = "Input";
		Assert.assertEquals(givenText, acutalText);
		log.info("we got the right 'Input' text");
	}
	
	
}
