package scripts_Vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomRepo.ContactPage;
import pomRepo.LeadPage;
import pomRepo.OrganizationPage;

public class Script4_Test  extends BaseClass{
	
	@Test(groups="functional")
	public void Script4() throws EncryptedDocumentException, IOException, InterruptedException {
		LeadPage ip=new LeadPage(driver);
		ip.getLeadLink().click();
		ip.getCreateLead().click();
		int ranNum=ja.getRandomNumber();
		ip.getLastName().sendKeys(ex.getDataFromExcelFile("Lead", 0, 0));
		ip.getCompany().sendKeys(ex.getDataFromExcelFile("Lead", 1, 0));
		OrganizationPage op=new OrganizationPage(driver);
		op.getSaveButton().click();
	
	}

}
