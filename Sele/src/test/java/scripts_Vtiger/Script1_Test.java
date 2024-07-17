package scripts_Vtiger;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlib.BaseClass;
import pomRepo.OrganizationPage;

public class Script1_Test extends BaseClass {
	

	
	@Test(groups="integration")
	public void script1() throws EncryptedDocumentException, IOException, InterruptedException {
		OrganizationPage op= new OrganizationPage(driver);
		op.getOrganisationLink().click();
		SoftAssert sa=new SoftAssert();
		
         sa.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM","Actual & expected condition not matching");
op.getCreateOrganisation().click();
assertEquals(op.getCreateOrgTxt().isDisplayed(), true,"not displayed the text");
int ranNum = ja.getRandomNumber();
String data = ex.getDataFromExcelFile("Organisation", 0, 0)+ranNum;
WebElement ele = op.getNameTxtBox();
ele.sendKeys(ex.getDataFromExcelFile("Organisation", 0, 0)+ranNum);
assertEquals(ele.getAttribute("value"), data,"data are not matching");
op.getSaveButton().click();
assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM","not matching");
Thread.sleep(2000);
}
}
	
	


