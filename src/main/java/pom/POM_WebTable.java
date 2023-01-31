package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_WebTable
{
	private WebDriver driver;
	
	//for how many rows
	
	@FindBy(xpath = "//table[@id='simpletable']/tbody/tr")
	List<WebElement> row;
	
	int rowSize = row.size();
	//for no of columns
	@FindBy(xpath = " //table[@id='simpletable']//tr/th")
	List<WebElement> columns;
	int columnSize = columns.size();
	// fetching specific row and column data
	@FindBy(xpath = " //table[@id='simpletable']//tr[3]/td[3]")
	WebElement SpecificData;
	public void xpathData()
	{
		System.out.println(rowSize);
		System.out.println(columnSize);
		System.out.println(SpecificData.getText());
	}
	
	
	
	
	// to Print all Table we need to find xpath with tr and td
	

	public void toPrintTable()
		{
			for(int i = 1;i<=rowSize;i++)
			{
				for(int j = 1;j<=columnSize;j++)
				{
				WebElement alltable = driver.findElement(By.xpath(" //table[@id='simpletable']//tr["+i+"]//td["+j+"]"));
				System.out.println(alltable.getText());
				}
			}
		
		
		
		}
	
	///////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	//calculation based WebTable Addition
	int actualTotal;
	int sum_price; //globally declared
	
	@FindBy(xpath = "//table[@id='shopping']//tbody//tr//td[2]")
	List<WebElement> all_prices;
	
	
	public int AllProductPrices()
	{
	for(WebElement p :all_prices)
	{
		sum_price= sum_price+Integer.parseInt(p.getText());
	}
	System.out.println(sum_price);
	return sum_price;
	}
	
	
	@FindBy(xpath = "/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[1]/table/tfoot/td[2]/b")
	WebElement total;
	public int TotalPrice()
	{
	actualTotal = Integer.parseInt(total.getText());
	System.out.println(actualTotal);
	return actualTotal;
	}
	
	//////////////////////////////////////////
	
	
	
	
	public void SelectRaj()
	{
		for(int i = 1;i<=rowSize;i++)
		{
		WebElement name = driver.findElement(By.xpath("//table[@id='simpletable']//tr/td[2]"));		
		if(name.equals("Raj"))
		{
			
		}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public POM_WebTable(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}

