package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.WebdriverUtil;
import pomRepo.LoginPage;
import pomRepo.OrganizationPage;

public class ScriptUsingPom {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		WebdriverUtil wb=new WebdriverUtil();
		ExcelUtil ex=new ExcelUtil();
		wb.maximizeTheWindow(driver);
		wb.implictlyWait(driver);
		driver.get(ex.getDataFromPropertyFile("url"));
		LoginPage lp=new LoginPage(driver);
		lp.getUserTxtBox().sendKeys(ex.getDataFromPropertyFile("username"));
		lp.getPswdTxtBox().sendKeys(ex.getDataFromPropertyFile("password"));
		lp.getLoginButton().click();
	
	}

}
