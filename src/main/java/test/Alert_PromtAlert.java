package test;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_Alert;
import pom.POM_Homepage;
import pom.POM_workSpacePage;
import utility.TestBase;

public class Alert_PromtAlert extends TestBase
{
	@Test
	public void SendKeysInPromtAlert() throws InterruptedException
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		x.ClickOnWorkSpaceLink();
		POM_workSpacePage y = new POM_workSpacePage(driver);
		y.ClickOnDialogue();
		POM_Alert z = new POM_Alert(driver);
		z.clickonPromptAlert();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Suraj");
		alt.accept();
			
	}
}