package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	public CampaignPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//@FindBy(linkText="Campaigns")
	//private WebElement campaignLink;
	
	
	@FindBy(name="Campaigns")
	private WebElement campaigns;

	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement createCampaign;
	
	@FindBy(name="campaignname")
	private WebElement campaignName;
	
	public WebElement getCampaigns() {
		return campaigns;
	}

	@FindBy(name="closingdate")
	private WebElement closeDate;
	
	
	//public WebElement getCampaignLink() {
		//return campaignLink;
	


	public WebElement getCreateCampaign() {
		return createCampaign;
	}


	public WebElement getCampaignName() {
		return campaignName;
	}


	public WebElement getCloseDate() {
		return closeDate;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;

}
