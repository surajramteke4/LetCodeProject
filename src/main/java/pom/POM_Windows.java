package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Windows
{
private WebDriver driver;


@FindBy(xpath = "//button[@id='multi']")
WebElement multiWindowButton;
public void ClickOnWindow()
{
	multiWindowButton.click();
}




public POM_Windows(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver,this);
}


	
	
}
