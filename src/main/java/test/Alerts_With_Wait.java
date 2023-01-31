package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pom.POM_Homepage;
import pom.POM_waits;
import pom.POM_workSpacePage;
import utility.TestBase;

public class Alerts_With_Wait extends TestBase
{
	@Test
	public void TestAlertsWithWait() throws InterruptedException
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		x.ClickOnWorkSpaceLink();
		POM_workSpacePage y = new POM_workSpacePage(driver);
		y.ClickOnTimeoutButton();
		POM_waits z = new POM_waits(driver);
		z.ClickOnTheAlert();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		
	

		
	}

}
