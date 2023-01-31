package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_DropDown;
import pom.POM_Homepage;
import pom.POM_workSpacePage;
import utility.TestBase;

public class Verify_PopUpText_afterSelecting_DropDown extends TestBase
{
	@Test
	public void PopUpText()
	{
	POM_Homepage x =  new POM_Homepage(driver);	
	x.ClickOnWorkSpaceLink();
	POM_workSpacePage y = new POM_workSpacePage(driver);
	y.ClickOnTheDropDown();
	POM_DropDown z = new POM_DropDown(driver);
	String actual = z.VerifyTextFromSelectedOption();
	String expected = "You have selected Mango";
	Assert.assertEquals(actual, expected);
}
}