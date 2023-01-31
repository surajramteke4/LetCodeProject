package test;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.POM_Homepage;
import utility.TestBase;


public class LoginData_DataProvider extends TestBase 
{
	
	@Test(dataProvider = "LoginTestData")
	public void CheckLogin(String email,String password)
	{
		
		POM_Homepage x = new POM_Homepage(driver);
		x.ClickOnLoginButton();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	

	@DataProvider(name = "LoginTestData")
		public Object[][] testdata()
		{
			Object[][] data = new  Object[2][2];
			data[0][0] = "Suraj";
			data[0][1] = "Admin123";
					
			data[1][0] = "Dhanashree";
			data[1][1] = "Test123";
			return data;
		}
	
	
		
}
