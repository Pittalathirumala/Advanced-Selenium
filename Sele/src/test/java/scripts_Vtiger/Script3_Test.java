package scripts_Vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomRepo.CampaignPage;
import pomRepo.ContactPage;
import pomRepo.OrganizationPage;

public class Script3_Test extends BaseClass {
	
	@Test(groups="endtoend")
	public void Script3() throws EncryptedDocumentException, IOException, InterruptedException {


		driver.findElement(By.linkText("More")).click();

		CampaignPage ca=new CampaignPage(driver);
	ca.getCampaigns().click();
	ca.getCreateCampaign().click();
	int ranNum=ja.getRandomNumber();
	ca.getCampaignName().sendKeys(ex.getDataFromExcelFile("Campaign", 0, 0));
	ca.getCloseDate().sendKeys(ex.getDataFromExcelFile("Campaign", 1, 0));
	OrganizationPage op=new OrganizationPage(driver);
	op.getSaveButton().click();
	
	
	
}
}
