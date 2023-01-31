package test;

import org.testng.annotations.Test;

import pom.POM_Homepage;
import pom.POM_RealWebTable;
import pom.POM_WebTable;
import pom.POM_workSpacePage;
import utility.TestBase;

public class WebTable_PrintSpecificData extends TestBase
{
	@Test
	public void PrintSpecificData()
	{POM_Homepage x =  new POM_Homepage(driver);	
	x.ClickOnWorkSpaceLink();
	POM_workSpacePage y = new POM_workSpacePage(driver);
	y.simpleTableClickOnSimpleTable();
	POM_RealWebTable z = new POM_RealWebTable(driver);
	
	z.PrintAllTable();
		
	}

}
