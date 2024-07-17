package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertMultipleDataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Excel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("five");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	
	for(int i=0;i<links.size();i++) {
		Cell cell=wb.getSheet("five").createRow(i).createCell(0);
		cell.setCellValue(links.get(i).getAttribute("href"));
	}
	FileOutputStream fos=new FileOutputStream("./src/test/resources/Excel.xlsx");
	wb.write(fos);
	wb.close();
	System.out.println("data entered");
	}
		
		
	}


