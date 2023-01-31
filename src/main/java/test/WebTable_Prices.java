package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.POM_Homepage;
import pom.POM_WebTable;
import pom.POM_workSpacePage;
import utility.TestBase;

public class WebTable_Prices extends TestBase
{
	@Test
	public void TestWebTablePrices()
	{
		POM_Homepage x =  new POM_Homepage(driver);	
		x.ClickOnWorkSpaceLink();
		POM_workSpacePage y = new POM_workSpacePage(driver);
		y.simpleTableClickOnSimpleTable();
		POM_WebTable z = new POM_WebTable(driver);
		int calculatedResult = z.AllProductPrices();
		int Acutalresult = z.TotalPrice();
		Assert.assertEquals(calculatedResult, Acutalresult);
		
	
		
		
	}
	
	
	
	
}
