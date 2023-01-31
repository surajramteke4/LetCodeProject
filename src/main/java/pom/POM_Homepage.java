package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Homepage 

{
	private WebDriver driver;
	private Actions act;
	@FindBy(xpath = "//a[text()='Explore Workspace']")
	WebElement WorkSpaceLink;
	
	
	//isEnabledMethod
	public boolean WorkSpaceLabelEnabled()
	{
		boolean actualresult = WorkSpaceLink.isEnabled();
		return actualresult;
		
	}
	
	//to get text from a lebel
	public String WorkSpaceLebel()
	{
		act.moveToElement(WorkSpaceLink);
		String workspaceText = WorkSpaceLink.getText();
		return workspaceText;
		
	}
	//click on the button or link
	public void ClickOnWorkSpaceLink() 
	{
		WorkSpaceLink.click();
	}
	
	// to check whether lebel is displaying or not
	public boolean WorkSpaceDisplayed()
	{
		act.moveToElement(WorkSpaceLink);
		boolean WorkSpaceLabelDisplay = WorkSpaceLink.isDisplayed();
		return WorkSpaceLabelDisplay;
		
	}
	
	///////////////////////////////////////////////////////
	
	 @FindBy(xpath = "//a[text()='Log in']")
	WebElement loginbutton;
	 public void ClickOnLoginButton()
	 {
		 loginbutton.click();
	 }
	
	
	public POM_Homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		act = new Actions(driver);
	}
	
	
	
	
}
