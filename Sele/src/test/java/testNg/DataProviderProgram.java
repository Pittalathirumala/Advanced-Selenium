package testNg;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgram {
	@DataProvider
	public String[][]getdata(){
	String[][]	data=new String[2][3];
	data[0][0]="srikanth";
	data[0][1]="O-";
	data[0][2]="srikanth26@gmail.com";
	
	data[1][0]="thirumala";
	data[1][1]="O+";
	data[1][2]="pittala.thirumala11@gmail.com";
	return data;
	}
	@Test(dataProvider = "getdata")
	public void details(String name,String bloodgroup,String email) {
		Reporter.log(name,true);
		Reporter.log(bloodgroup,true);
		Reporter.log(email,true);
	}
		
	

}
