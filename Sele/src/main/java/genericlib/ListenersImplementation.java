package genericlib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.ITest;

public class ListenersImplementation extends BaseClass implements ITestListener {
 @Override
 public void onTestStart(ITestResult result) {
	 Reporter.log("Test Script Execution  Started",true);
	 
 }
 @Override
 public void onTestFailure(ITestResult result) {
	 Reporter.log("Test Script Failed ",true);
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File source=ts.getScreenshotAs(OutputType.FILE);
	 File  target=new File(IConstant.screenShotPath);
	 try {
		FileHandler.copy(source, target);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
}
