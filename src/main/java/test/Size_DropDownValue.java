package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_DropDown;
import pom.POM_Homepage;
import pom.POM_workSpacePage;
import utility.TestBase;

public class Size_DropDownValue extends TestBase
{
	@Test
	public void SizeOfDropDown()
	{
	POM_Homepage x =  new POM_Homepage(driver);	
	x.ClickOnWorkSpaceLink();
	POM_workSpacePage y = new POM_workSpacePage(driver);
	y.ClickOnTheDropDown();
	POM_DropDown z = new POM_DropDown(driver);
	int acutalsize = z.SizeDropDropValues();
	int expectedSize = 6;
	
	Assert.assertEquals(acutalsize, expectedSize);
	
	}
	
}
