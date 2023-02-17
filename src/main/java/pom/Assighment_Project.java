package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assighment_Project 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/table");
		
		List<WebElement> webTable = driver.findElements(By.xpath("//table[@id='simpletable']//tbody//tr"));
		int WebTableRows  = webTable.size();
		System.out.println("number of rows in web table are : " + WebTableRows);
		
		driver.quit();
	}
	
	
	
}
