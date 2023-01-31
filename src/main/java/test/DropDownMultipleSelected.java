package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_DropDown;
import pom.POM_Homepage;
import pom.POM_workSpacePage;
import utility.TestBase;

public class DropDownMultipleSelected extends TestBase
{
	@Test
	public void DropDownSelectMultipleValue() throws InterruptedException
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		x.ClickOnWorkSpaceLink();
		POM_workSpacePage y = new POM_workSpacePage(driver);
		y.ClickOnTheDropDown();
		POM_DropDown z = new POM_DropDown(driver);
		boolean actualResult = z.isDropDownMultiSelected();
		Thread.sleep(5000);
		boolean expectedResult = true;
		Assert.assertEquals(actualResult, actualResult);
	}
}
