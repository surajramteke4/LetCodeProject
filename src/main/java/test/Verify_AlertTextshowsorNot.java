package test;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_Alert;
import pom.POM_Homepage;
import pom.POM_workSpacePage;
import utility.TestBase;

public class Verify_AlertTextshowsorNot  extends TestBase
{
	@Test
	public void ClickOnAlert() throws InterruptedException
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		x.ClickOnWorkSpaceLink();
		POM_workSpacePage y = new POM_workSpacePage(driver);
		y.ClickOnDialogue();
		POM_Alert z = new POM_Alert(driver);
		z.ComfirtAlertButton();
		
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		
	
		String acutalAlertText = alt.getText();
		System.out.println(acutalAlertText);
		String expected = "Are you happy with LetCode?";
		Assert.assertEquals(acutalAlertText, expected);
		alt.accept();
	
		
	}
}
