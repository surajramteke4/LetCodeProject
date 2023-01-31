package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_workSpacePage
{
private WebDriver driver;

@FindBy(xpath = "//p[text()=' Input ']")
WebElement InputLabel;
public String getTextFromInputLabel()
{
	String labeltext = InputLabel.getText();
	return labeltext;
}
@FindBy(xpath = ("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/header/div/figure/img"))
WebElement imageDisplay;
public boolean imageDisplayed()
{
	boolean actualResult = imageDisplay.isDisplayed();
	return actualResult;
}
/////////drop down
@FindBy(xpath ="//a[text()='Drop-Down']")
WebElement DropDownLink;

public void ClickOnTheDropDown()
{
	DropDownLink.click();
}

/////////to to alert
@FindBy(xpath = "//a[text()='Dialog']")
WebElement dialoguebutton;
public void ClickOnDialogue()
{
	dialoguebutton.click();
}
//////////to multiple windows

@FindBy(xpath = "//a[text()='Tabs']")
WebElement tabs;
public void clickonMultiTabs()
{
	tabs.click();
}


@FindBy(xpath = "//a[text()='Simple table']")
WebElement simpleTable ;

public void simpleTableClickOnSimpleTable()
{
	simpleTable.click();
}


////////timeout
@FindBy(xpath = "//a[text()='Timeout']")
WebElement TimeoutButton;
public void ClickOnTimeoutButton()
{
	TimeoutButton.click();
}

///slider
@FindBy(xpath = "//a[text()='AUI - 5']")
WebElement SliderButton;
public void ToGoOnSliderTab()
{
	SliderButton.click();
}

//constructor
public POM_workSpacePage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver,this);
}







	
	
	
}
