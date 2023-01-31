package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pom.DataFromExcel;
import pom.POM_Homepage;
import utility.TestBase;

public class GetDataFromExcel extends TestBase
{
	@Test(dataProvider = "empLogin",dataProviderClass = DataFromExcel.class)
	public void CheckLogin(String email,String password)
	{
		
		POM_Homepage x = new POM_Homepage(driver);
		x.ClickOnLoginButton();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	
}
