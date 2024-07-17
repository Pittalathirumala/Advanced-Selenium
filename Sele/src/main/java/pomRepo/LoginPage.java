package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public WebElement getUserTxtBox() {
		return userTxtBox;
	}

	public WebElement getPswdTxtBox() {
		return pswdTxtBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getText() {
		return text;
	}


	@FindBy(name="user_name")
	private WebElement userTxtBox;
	
	@FindBy(name="user_password")
	private WebElement pswdTxtBox;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	@FindBy(name="//div[text()='Powered by vtiger CRM - 5.4.0']")
	private WebElement text;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement AdminButton;
	
	@FindBy(linkText="Sign Out")
	private WebElement LogoutButton;






	public WebElement getAdminButton() {
		return AdminButton;
	}



	public WebElement getLogoutButton() {
		return LogoutButton;
	}

	
	}
	
	
		
	

