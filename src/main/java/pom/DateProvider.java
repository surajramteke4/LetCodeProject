package pom;

import java.util.Objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DateProvider
{ public WebDriver driver;


@DataProvider(name = "LoginTestData")
public Object[][] testdate()
{
	Object[][] data = new  Object[2][2];
	data[0][0] = "Surajramteke956@gmail.com";
	data[0][1] = "Admin123";
			
	data[1][0] = "Dhanashree5465@gmail.com";
	data[1][1] = "Test123";
	return data;
}


		
	


}
