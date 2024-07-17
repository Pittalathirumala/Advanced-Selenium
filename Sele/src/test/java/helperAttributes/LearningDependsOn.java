package helperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningDependsOn {
	@Test(dependsOnMethods="login",priority = 1)
	public void logout() {
		Reporter.log("user has logout",true);
	}
	@Test()
	public void login() {
		int i=1/0;
		Reporter.log("user has login",true);
	}
	@Test(dependsOnMethods = "login",priority=2)
	public void Addcart() {
		Reporter.log("user has add product to cart",true);
	}


}
