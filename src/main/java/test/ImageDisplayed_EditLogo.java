package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_Homepage;
import pom.POM_workSpacePage;
import utility.TestBase;

public class ImageDisplayed_EditLogo extends TestBase 
{
	@Test
	public void ImageDislay()
	{	POM_Homepage x =  new POM_Homepage(driver);	
		x.ClickOnWorkSpaceLink();
		POM_workSpacePage x1 = new POM_workSpacePage(driver);
		boolean actual = x1.imageDisplayed();
		boolean expected = true;
		Assert.assertEquals(actual,expected);
		
}
}
