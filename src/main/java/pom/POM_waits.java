package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_waits 
{
	private WebDriver driver;
	
	@FindBy(xpath = "/html/body/app-root/app-waits/section[1]/div/div/div[1]/div/div/div[1]/div/button")
	WebElement AlertWait;
	public void ClickOnTheAlert()
	{
		AlertWait.click();
		
	}
	
	
	public POM_waits(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
}
