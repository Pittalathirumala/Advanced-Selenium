package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class InsertDataUsingMap {
	           public static void main(String[] args) throws EncryptedDocumentException, IOException {
				FileInputStream fis=new FileInputStream("./src/test/resources/Excel.xlsx");
				Workbook wb=WorkbookFactory.create(fis) ;
				Sheet sheet=wb.getSheet("seven");
				LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
				map.put("Shrikanth", "gudelli");
				map.put("shirisha", "pittala");
				map.put("thirumala", "gudelli");
				int rowNo=0;
				for(Entry<String,String>m:map.entrySet()) {
				Row row=sheet.createRow(rowNo++);
				row.createCell(0).setCellValue((String)m.getKey());
				row.createCell(1).setCellValue((String)m.getValue());
				}
				FileOutputStream fos=new FileOutputStream("./src/test/resources/Excel.xlsx");
				wb.write(fos);
				wb.close();
				System.out.println("data is added");
				
				
			}

}
