package genericlib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import pomRepo.LoginPage;
@Listeners(ListenersImplementation.class)
public class BaseClass {

	
public static WebDriver driver;
public static WebdriverUtil wb= new WebdriverUtil();
public static ExcelUtil ex= new ExcelUtil();
public static JavaUtil ja= new JavaUtil();
LoginPage lp;	

@BeforeSuite(alwaysRun=true)
public void beforeSuite() {
	Reporter.log("Report generation",true);
}

@BeforeClass(alwaysRun=true)
public void beforeClass() throws IOException {
	driver= new ChromeDriver();
	wb.maximizeTheWindow(driver);
	wb.implictlyWait(driver);
	driver.get(ex.getDataFromPropertyFile("url"));
}

@BeforeMethod(alwaysRun=true) 
public void beforeMethod() throws IOException {
	lp= new LoginPage(driver);
	lp.getUserTxtBox().sendKeys(ex.getDataFromPropertyFile("username"));
	lp.getPswdTxtBox().sendKeys(ex.getDataFromPropertyFile("password"));
	lp.getLoginButton().click();
}

@AfterMethod(alwaysRun=true)
public void afterMethod() throws InterruptedException {
	Thread.sleep(3000);
	lp= new LoginPage(driver);
	lp.getAdminButton().click();
	lp.getLogoutButton().click();
}

@AfterClass(alwaysRun=true)
public void afterClass() {
	wb.closeBrowser(driver);
}

@AfterSuite(alwaysRun=true)
public void afterSuite() {
	Reporter.log("Report",true);
}

public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	
}
}








