package helperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 1)
	public void logout() {
		Reporter.log("user has logout",true);
	}
	@Test(priority = -1)
	public void login() {
		Reporter.log("user has login",true);
	}
	@Test(priority = 0)
	public void Addcart() {
		Reporter.log("user has add product to cart",true);
	}

}
