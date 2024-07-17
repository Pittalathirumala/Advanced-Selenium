package ddt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class InsertProperty {
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		p.setProperty("url", "https://www.flipkart.com/");
		p.setProperty("usn", "thirumala");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Prop1.properties");
		p.store(fos, "Prop1");
		System.out.println("values are inserted");
		
		
	
	}
	

}
