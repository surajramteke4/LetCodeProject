package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Slider 
{
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath = "//input[@id='generate']")
	WebElement slider;
	public void TestSlider()
	{
		act.dragAndDropBy(slider, 1021, 287).click().build().perform();
		
	}
	@FindBy(xpath = "//h1[@class='subtitle has-text-info']")
	WebElement TextofSlider;
	public String GetTextOfSlider()
	{
	String acutalText =	TextofSlider.getText();
	return acutalText;
	}

	public POM_Slider(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
		act = new Actions(driver);
	}
	
}
