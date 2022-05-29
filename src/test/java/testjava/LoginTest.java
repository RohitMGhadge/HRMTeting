package testjava;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test(priority=0)
	public void VerifyLoginTitle() {
		String title = loginpagemain.verifyTitle();
		Assert.assertEquals(title,"OrangeHRM");
	}
	
	@Test(priority=1)
	public void VerifyUrl() {
		String url= loginpagemain.verifyUrl();
	}
	@Test(priority=2)
	public void verifyLoginWithCorrectCred() {
		loginpagemain.ValidLoginCred("Admin", "admin123");
		boolean verifyLoginSuccessful = dashboardpage.titleOfDashBoard();
		AssertJUnit.assertEquals(verifyLoginSuccessful, true);
	}
}
