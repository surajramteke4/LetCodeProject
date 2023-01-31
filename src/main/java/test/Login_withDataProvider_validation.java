package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.DateProvider;
import pom.POM_Homepage;
import utility.TestBase;

public class Login_withDataProvider_validation  extends TestBase
{
	@Test(dataProvider = "LoginTestData",dataProviderClass=DateProvider.class)
	public void CheckLogin(String email,String password)
	{
		
		POM_Homepage x = new POM_Homepage(driver);
		x.ClickOnLoginButton();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		WebElement loginbutton = driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
		loginbutton.click();
		WebElement errormsg = driver.findElement(By.xpath("/html/body/div/div/div/div[1]"));
		String actual = errormsg.getText();
		log.info(actual);
		String expected = "Error: There is no user record corresponding to this identifier. The user may have been deleted.";
		Assert.assertEquals(actual, expected);
	
	
	}
	

	
	

}
