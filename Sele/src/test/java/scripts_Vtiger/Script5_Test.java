package scripts_Vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomRepo.OrganizationPage;
import pomRepo.ProductPage;

public class Script5_Test extends BaseClass{
	
	@Test(groups="endtoend")
	public void Script5() throws EncryptedDocumentException, IOException, InterruptedException {
		ProductPage pp=new ProductPage(driver);
		pp.getProductLink().click();
		pp.getCreateProduct().click();
		pp.getProductName().sendKeys(ex.getDataFromExcelFile("Product", 0, 0));
		OrganizationPage op=new OrganizationPage(driver) ;
		op.getSaveButton().click();
		
	}

}
