package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_DropDown;
import pom.POM_Homepage;
import pom.POM_workSpacePage;
import utility.TestBase;

public class Verify_SelectedDropDownSize extends TestBase {
	@Test
	public void DropDownSelectedSize() throws InterruptedException
	{
	POM_Homepage x =  new POM_Homepage(driver);	
	x.ClickOnWorkSpaceLink();
	POM_workSpacePage y = new POM_workSpacePage(driver);
	y.ClickOnTheDropDown();
	POM_DropDown z = new POM_DropDown(driver);
	int actual = z.HowManySelectedDropdownValues();
	int expected = 2;
	
	Assert.assertEquals(actual, expected);
	
	}
}
