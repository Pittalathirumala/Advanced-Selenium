package hardcode;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.WebdriverUtil;

public class Script6 {
	public static void main(String[] args) throws IOException {
		WebdriverUtil wb=new WebdriverUtil();
		ExcelUtil ex=new ExcelUtil();
		WebDriver driver=new ChromeDriver();
		wb.maximizeTheWindow(driver);
		wb.implictlyWait(driver);
		driver.get(ex.getDataFromPropertyFile("url"));
		driver.findElement(By.name("user_name")).sendKeys(ex.getDataFromPropertyFile("username"));
		driver.findElement(By.name("user_password")).sendKeys(ex.getDataFromPropertyFile("password"));
		driver.findElement(By.id("submitButton")).click();
		WebElement searchBox=driver.findElement(By.name("query_string"));
		searchBox.sendKeys("contacts");
		wb.refreshThePage(driver);
		searchBox.sendKeys("contacts");

		
}
}
