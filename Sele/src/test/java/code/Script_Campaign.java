package code;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.WebdriverUtil;
import pomRepo.CampaignPage;
import pomRepo.LoginPage;

public class Script_Campaign {
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
		driver.findElement(By.linkText("More")).click();
		CampaignPage ca=new CampaignPage(driver);
		ca.getCampaigns().click();
		ca.getCreateCampaign().click();
		ca.getCampaignName().sendKeys(ex.getDataFromExcelDF("Campaign",0,0));
		ca.getCloseDate().sendKeys(ex.getDataFromExcelDF("Campaign", 1, 0));
		Thread.sleep(1000);
		ca.getSaveButton().click();
}
}
