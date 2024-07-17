package scripts_Vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomRepo.ContactPage;
import pomRepo.OrganizationPage;

public class Script2_Test extends BaseClass{
	@Test(groups="functional")
	public void Script2() throws InterruptedException, EncryptedDocumentException, IOException {
		ContactPage cp=new ContactPage(driver);
		cp.getContactsLink().click();
		cp.getCreateConatct().click();
		int ranNum=ja.getRandomNumber();
		cp.getLastname().sendKeys(ex.getDataFromExcelFile("Contact", 0, 0)+ranNum);
		OrganizationPage op=new OrganizationPage(driver);
		op.getSaveButton().click();
     
	}



}
