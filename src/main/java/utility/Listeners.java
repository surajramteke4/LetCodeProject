package utility;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners  extends Screenshot_Class implements ITestListener 
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Testing has been started");
		try {
			TakesScreenshot( driver, "Suraj");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Testing is succesfull");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Failed");
	}

	
	
}
