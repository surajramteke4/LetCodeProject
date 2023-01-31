package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_Alert;
import pom.POM_DropDown;
import pom.POM_Homepage;
import pom.POM_Windows;
import pom.POM_workSpacePage;
import utility.TestBase;

public class Verify_MultipleWindows extends TestBase
{
	@Test
	public void TestMultipleWindows() throws InterruptedException
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		x.ClickOnWorkSpaceLink();
		POM_workSpacePage y = new POM_workSpacePage(driver);
		y.clickonMultiTabs();
		POM_Windows z = new POM_Windows(driver);
		z.ClickOnWindow();
		List<String> allAdresses = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allAdresses.get(2));
		POM_DropDown a = new POM_DropDown(driver);
		boolean acutalResult = a.DropDownSelectMultipleValues();
		boolean expectedResult = false;
		Assert.assertEquals(acutalResult, expectedResult);
	
		driver.switchTo().window(allAdresses.get(1));
		POM_Alert b = new POM_Alert(driver);
		b.ComfirtAlertButton();
		
		Alert alt = driver.switchTo().alert();
		String acutalAlertText = alt.getText();
		String expected = "Are you happy with LetCode?";
		Assert.assertEquals(acutalAlertText, expected);
		alt.accept();
	
	}
}
