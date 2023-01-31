package pom;

import java.util.List;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class POM_DropDown 
{
private WebDriver driver;
private Select s;
private Select s1;
private Actions act;

/////////////drop Down1 
@FindBy(xpath ="//select[@id='fruits']")
WebElement dropDownFruit;
public String ByDefaultOption()
{
	WebElement s1 = s.getFirstSelectedOption();
	String ActualByDefautText = s1.getText();
	return ActualByDefautText;
}

public int SizeDropDropValues()
{
	List<WebElement> a = s.getOptions();
	int b = a.size();
	return b;
}
public boolean DropDownSelectMultipleValues()
{
	boolean actualresult = s.isMultiple();
	return actualresult;
}

@FindBy(xpath ="/html/body/app-root/app-dropdowns/section[1]/div/div/div[1]/div/div/div[1]/div/div[2]/div/p")
WebElement SelectedDropDown;
public String VerifyTextFromSelectedOption()
{
	s.selectByVisibleText("Mango");
	String a = SelectedDropDown.getText();
	return a;
	
	
}
////////////////////////////////////////

@FindBy(xpath = "//*[@id=\"superheros\"]")
WebElement MultiSelectDropDown;
public boolean isDropDownMultiSelected() throws InterruptedException
{	s1.selectByVisibleText("Ant-Man");
	
	act.keyDown(Keys.CONTROL).perform();;
	s1.selectByVisibleText("The Avengers");
	
	act.keyUp(Keys.CONTROL).perform();
	List<WebElement> d = s1.getAllSelectedOptions();
	for(WebElement i : d)
	{
		System.out.println(i.getText());
	}
	boolean actualresult = s1.isMultiple();
	return actualresult;
}

public String PrintSelectedDropdownValues() throws InterruptedException
{	s1.selectByVisibleText("Ant-Man");
	
	act.keyDown(Keys.CONTROL).perform();;
	s1.selectByVisibleText("The Avengers");
	String Expectedd [] = {"Ant-Man","The Avengers"};
	act.keyUp(Keys.CONTROL).perform();
	List<WebElement> d = s1.getAllSelectedOptions();
	for(int i = 0;i<d.size();i++)
	{
	String actual = d.get(i).getText();
	String expected = Expectedd[i];
	Assert.assertEquals(actual, expected);
	System.out.println("test case passed");
	}
	return null;
	
}
public int HowManySelectedDropdownValues() throws InterruptedException
{	s1.selectByVisibleText("Ant-Man");
	
	act.keyDown(Keys.CONTROL).perform();;
	s1.selectByVisibleText("The Avengers");
	String Expectedd [] = {"Ant-Man","The Avengers"};
	act.keyUp(Keys.CONTROL).perform();
	List<WebElement> sizeselectedDropdown = s1.getAllSelectedOptions();
	int actual = sizeselectedDropdown.size();
	return actual;

}

public POM_DropDown(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver,this);
	s = new Select(dropDownFruit);
	act = new Actions(driver);
	s1 = new Select(MultiSelectDropDown);
}
}
