package test;

import javax.servlet.annotation.WebListener;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_Homepage;
import pom.POM_Slider;
import pom.POM_workSpacePage;
import utility.Listeners;
import utility.TestBase;



public class Slider_Funtionality extends TestBase
{
	@Test
	public void ValidateSlider() throws InterruptedException
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		x.ClickOnWorkSpaceLink();
		POM_workSpacePage y = new POM_workSpacePage(driver);
		y.ToGoOnSliderTab();
		POM_Slider z = new POM_Slider(driver);
		z.TestSlider();
		String acutalResult = z.GetTextOfSlider();
		String expectedResult = "Word limit : 50";
		Assert.assertEquals(acutalResult, expectedResult);
		
	}
}
