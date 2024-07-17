package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.JavaUtil;
import genericlib.WebdriverUtil;
import pomRepo.LoginPage;
import pomRepo.OrganizationPage;

public class Script_Org {
	public static void main(String[] args) throws IOException, InterruptedException {
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
		Thread.sleep(1000);
		OrganizationPage op=new OrganizationPage(driver);
		op.getOrganisationLink().click();
		op.getCreateOrganisation().click();
		Thread.sleep(1000);
		JavaUtil ja=new JavaUtil();
		int num=ja.getRandomNumber();
		op.getNameTxtBox().sendKeys(ex.getDataFromExcelFile("organisation", 0, 0)+num);
		Thread.sleep(1000);
		wb.selectDropdownByValue(op.getIndustryDropdown(),"Healthcare");
		Thread.sleep(1000);
		op.getSaveButton().click();
	}

}
