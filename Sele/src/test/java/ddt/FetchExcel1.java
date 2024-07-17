package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchExcel1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create fileinputstream
		FileInputStream fis=new FileInputStream("./src/test/resources/Excel.xlsx");
		//workbook obj
		Workbook wb=WorkbookFactory.create(fis);
		//fetching values
		System.out.println(wb.getSheet("two").getRow(0).getCell(0).getStringCellValue());
		System.out.println(wb.getSheet("two").getRow(1).getCell(0).getStringCellValue());
		System.out.println(wb.getSheet("two").getRow(2).getCell(0).getStringCellValue());
		
//		Cell cell1=wb.getSheet("two").getRow(0).getCell(0);
//		Cell cell2=wb.getSheet("two").getRow(1).getCell(0);
//		Cell cell3=wb.getSheet("two").getRow(2).getCell(0);
//		DataFormatter data=new DataFormatter();
//		System.out.println(data.formatCellValue(cell1));
//		System.out.println(data.formatCellValue(cell2));
//		System.out.println(data.formatCellValue(cell3));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url=wb.getSheet("two").getRow(0).getCell(0).getStringCellValue();
		driver.get(url);
		
}
}
