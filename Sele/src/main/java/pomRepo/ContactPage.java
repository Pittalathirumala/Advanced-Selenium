package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
	@FindBy(linkText="Contacts")
	private WebElement ContactsLink;


@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement createConatct;

@FindBy(name="lastname")
private WebElement lastname;


@FindBy(xpath = "assigntype")
private WebElement groupRadioButton ;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveButton;


public WebElement getSaveButton() {
	return saveButton;
}


public WebElement getContactsLink() {
	return ContactsLink;
}

public WebElement getCreateConatct() {
	return createConatct;
}

public WebElement getLastname() {
	return lastname;
}


public WebElement getGroupRadioButton() {
	return groupRadioButton;
}


}