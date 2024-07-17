package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create fileinputstream
		FileInputStream fis=new FileInputStream("./src/test/resources/Excel.xlsx");
		//workbook obj
		Workbook wb=WorkbookFactory.create(fis);
		//fetching values
//		System.out.println(wb.getSheet("one").getRow(0).getCell(0).getStringCellValue());
//		System.out.println(wb.getSheet("one").getRow(1).getCell(1).getNumericCellValue());
//		System.out.println(wb.getSheet("one").getRow(2).getCell(2).getBooleanCellValue());
//		
		Cell cell1=wb.getSheet("one").getRow(0).getCell(0);
		Cell cell2=wb.getSheet("one").getRow(1).getCell(1);
		Cell cell3=wb.getSheet("one").getRow(2).getCell(2);
		DataFormatter data=new DataFormatter();
		System.out.println(data.formatCellValue(cell1));
		System.out.println(data.formatCellValue(cell2));
		System.out.println(data.formatCellValue(cell3));
		
		
	}

}
