package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LoginPage
{
	private WebDriver driver;
	
	@FindBy(xpath = "driver.findElement(By.xpath(\"//input[@name='email']\"))")
	WebElement emailbutton;
	@FindBy(xpath = "driver.findElement(By.xpath(\"//input[@name='password']\"))")
	WebElement passwordbutton;
	@FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")
	WebElement loginButton;
	
	public void SendUsername(String email,String password)
	{
		emailbutton.sendKeys(email);
		passwordbutton.sendKeys(password);
		loginButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	public POM_LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
