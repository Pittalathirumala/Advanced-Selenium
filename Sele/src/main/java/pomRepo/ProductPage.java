package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public  ProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Products")
	private WebElement ProductLink;
	
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement CreateProduct;
	
	@FindBy(name="productname")
	private WebElement ProductName;
	
	@FindBy(xpath="(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement saveButton;

	public WebElement getProductLink() {
		return ProductLink;
	}

	public WebElement getCreateProduct() {
		return CreateProduct;
	}

	public WebElement getProductName() {
		return ProductName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	

}
