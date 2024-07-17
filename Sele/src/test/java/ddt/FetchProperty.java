package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchProperty {
	public static void main(String[] args) throws IOException {
		//create fileinput stream obj
		FileInputStream fis=new FileInputStream("./src/test/resources/Prop.properties");
		
		//create property file obj
		Properties p=new Properties();
		
		//load file
		p.load(fis);
		
		//fetch the data
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("usn"));
		System.out.println(p.getProperty("pwsd"));
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String url=p.getProperty("url");
	driver.get(url);
		
		
		
	}

}
