package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_DropDown;
import pom.POM_Homepage;
import pom.POM_workSpacePage;
import utility.TestBase;

public class DropDownSelectMultipleValues extends TestBase
{
	@Test
	public void DropDownSelectMultipleValue()
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		x.ClickOnWorkSpaceLink();
		POM_workSpacePage y = new POM_workSpacePage(driver);
		y.ClickOnTheDropDown();
		POM_DropDown z = new POM_DropDown(driver);
		boolean acutalResult = z.DropDownSelectMultipleValues();
		boolean expectedResult = false;
		Assert.assertEquals(acutalResult, expectedResult);
	}
	
}
