package test;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_Alert;
import pom.POM_Homepage;
import pom.POM_workSpacePage;
import utility.TestBase;

public class Veirify_AlertShowsorNot extends TestBase
{
@Test
public void ClickOnAlert()
{
	POM_Homepage x =  new POM_Homepage(driver);	
	x.ClickOnWorkSpaceLink();
	POM_workSpacePage y = new POM_workSpacePage(driver);
	y.ClickOnDialogue();
	POM_Alert z = new POM_Alert(driver);
	z.ComfirtAlertButton();
	Alert alt = driver.switchTo().alert();
	String acutalAlertText = alt.getText();
	String expected = "Are you happy with LetCode?";
	Assert.assertEquals(acutalAlertText, expected);
	alt.accept();
	

}
}
