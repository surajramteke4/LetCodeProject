package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_RealWebTable 
{
	private WebDriver driver;
	
	
	public void PrintAllTable()
	{
	int rows= driver.findElements(By.xpath("//table[@id='simpletable']//tbody//tr")).size();
	int columns = driver.findElements(By.xpath("//table[@id='simpletable']//thead//th")).size();
	
	
	for(int i = 1;i<=rows;i++)
	{
		for(int j = 1;j<=columns;j++)
		{
		String data =	driver.findElement(By.xpath("//table[@id='simpletable']//tbody//tr["+i+"]//td["+j+"]")).getText();
		System.out.print(data + "     ");
	
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	public POM_RealWebTable(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

}
