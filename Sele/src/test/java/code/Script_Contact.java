package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.WebdriverUtil;
import pomRepo.ContactPage;
import pomRepo.LoginPage;

public class Script_Contact {
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
	ContactPage cp=new ContactPage(driver);
	cp.getContactsLink().click();
	cp.getCreateConatct().click();
	cp.getLastname().sendKeys(ex.getDataFromExcelFile("Contact", 0, 0));
	Thread.sleep(1000);
	cp.getSaveButton().click();
}
}
