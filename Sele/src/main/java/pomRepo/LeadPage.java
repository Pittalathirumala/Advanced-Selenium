package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
	
	public  LeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(linkText="Leads")
	private WebElement LeadLink;

	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement CreateLead ;
	
	@FindBy(name="lastname")
	private WebElement LastName ;
	
	@FindBy(name="company")
	private WebElement Company;
	
	@FindBy(xpath="(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement saveButton;


	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getLeadLink() {
		return LeadLink;
	}

	public WebElement getCreateLead() {
		return CreateLead;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getCompany() {
		return Company;
	}
		
	}
	


