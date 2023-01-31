package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Alert 
{
	
	private WebDriver driver;
	
	
	@FindBy(xpath = "/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[2]/div/button")
	WebElement confirmAlertButton;
	public void ComfirtAlertButton()
	{
		confirmAlertButton.click();
	}
	
	
	@FindBy(xpath = "/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[3]/div/button")
	WebElement PromptAlert;
	public void clickonPromptAlert()
	{
		PromptAlert.click();
	}

	
	
	public POM_Alert(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
}
