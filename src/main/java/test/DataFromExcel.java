package test;

import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.POM_Homepage;
import utility.TestBase;
import utility.XLUtility;

public class DataFromExcel  extends TestBase
{

	@Test(dataProvider = "LoginTestData")
	public void CheckLogin(String email,String password,String data) throws InterruptedException
	{
		
		POM_Homepage x = new POM_Homepage(driver);
		x.ClickOnLoginButton();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		Thread.sleep(2000);
		
		
		//Asserstion by using popup text
		WebElement popup = driver.findElement(By.xpath("/html/body/div/div/div/div[1]"));
		String  s= popup.getText();
		System.out.println(s);
		
		

		if(data.equals("valid"))
		{
			String expected = "Welcome SURAJ RAMTEKE";
			if(s.equals(expected))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		if(data.equals("invalidPassword"))
		{
			String expected = "Error: The password is invalid or the user does not have a password.";
			if(s.equals(expected))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		
		
	
		if(data.equals("invalidUsername"))
		{
			String expected = "Error: There is no user record corresponding to this identifier. The user may have been deleted.";
			if(s.equals(expected))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		//////////////////////
		//Asseration by using URL 
		String actualurl = driver.getCurrentUrl();
		
		
		
		if(data.equals("valid"))
		{
			String expected = "https://letcode.in/";
			if(actualurl.equals(expected))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		
		

		if(data.equals("invalidPassword"))
		{
			String expected = "https://letcode.in";
			if(actualurl.equals(expected))
			{
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		if(data.equals("invalidUsername"))
		{
			String expected = "https://letcode.in";
			if(actualurl.equals(expected))
			{
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		
		
		
		
		
	}
	

	
	
	
	
	
	@DataProvider(name = "LoginTestData")
	public String[][] getData() throws IOException
	{
	String path = "./DataExel\\New Microsoft Excel Worksheet.xlsx//";
	XLUtility xl = new XLUtility(path);
	int totalrows = xl.getRowCount("Sheet1");
	int totalcols = xl.getCellCount("Sheet1",1);
	String loginData[][] = new String[totalrows][totalcols] ;
	
	for(int r = 1;r<=totalrows;r++)
	{
		for(int c = 0;c<totalcols;c++)
		{
			loginData[r-1][c] = xl.getCellData("Sheet1", r, c);
		}
	}
	
	
	 
	return loginData;
	
	}	
				

	
}
