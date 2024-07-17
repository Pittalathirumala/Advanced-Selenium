package testNg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericlib.ExcelUtil;
import genericlib.WebdriverUtil;

public class LearningCrossBrowserTesting {
	WebDriver driver;
	WebdriverUtil wb=new WebdriverUtil();
	ExcelUtil ex=new ExcelUtil();
	@Parameters("browser")
	@Test
	public void launch(String bname) throws IOException {
		if(bname.contains("chrome")) {
			driver=new ChromeDriver();
			wb.maximizeTheWindow(driver);
			driver.get(ex.getDataFromPropertyFile("url"));
		}
		else if(bname.contains("Edge")) {
			driver=new ChromeDriver();
			wb.maximizeTheWindow(driver);
			driver.get(ex.getDataFromPropertyFile("url"));	
		}
	}

}
