package genericlib;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtil {
	WebDriver driver;
	
	/**
	 * this method is used to maximize the page
	 * @param driver
	 */
	public static void maximizeTheWindow(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	/**
	 * this method is used to refresh the page
	 * @param driver
	 */
	
	public void refreshThePage(WebDriver driver) {
		driver.navigate().refresh();
	}
	/**
	 * this method is used to perform forward operation
	 * @param driver
	 */
	
	public void forwardThePage(WebDriver driver) {
		driver.navigate().forward();
	}
	/**
	 * this method is used for implicitly wait
	 * @param driver
	 */
	
	public void implictlyWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	/**
	 * this method is used for explicit wait
	 * @param driver
	 * @param element
	 */
	public void elementToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * this method  is used to switch the frame using webelement
	 * @param driver
	 * @param element
	 */
	public void switchBackToParentPage(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	
	public void selectDropdownByValue(WebElement dropdown,String value) {
		Select sel=new Select(dropdown);
		sel.selectByValue(value);
	}
	/**
	 * this method is to switch the frame using webelement
	 * @param driver
	 * @param element
	 */
	
	
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * this method is used to deselect the dropdownusing visible text
	 * @param dropdown
	 * @param visibleText
	 */
	public void deselectDropDownByVisibleText(WebElement dropdown,String visibleText) {
		Select sel=new Select(dropdown);
		sel.deselectByVisibleText(visibleText);
	}
	/**
	 * this method is used to handle your alert popup
	 * @param driver
	 */
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * this method is used to dismiss your alert popup
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
/**
 * 	this method is used to  click on element using actions class
 * @param element
 */
	
	public void clickElement(WebElement element) {
		Actions act=new Actions(driver);
		act.click(element).perform();
	}
	/**
	 * this method is used to perform double click action
	 * @param element
	 */
	public void doubleClick(WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	/**
	 * this method is used to perform right click action
	 * @param element
	 */
	
	public void contextClick(WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * this method is used to scroll up using javascriptexecutor
	 * @param driver
	 */
	
	public void scrollUp(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500);");
	}
	/**
	 * this method is used to scroll down using javascriptexecutor
	 * @param driver
	 */
	public void scrollDown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
