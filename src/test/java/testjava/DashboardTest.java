package testjava;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import mainjava.BaseClass;

public class DashboardTest extends BaseClass{
	@Test(priority=5)
	public void verifyLogoutOption() {
		loginpagemain.ValidLoginCred("Admin", "admin123");
		dashboardpage.logoutProcess();
		boolean verifyLoginBtnDisplayed = loginpagemain.verifyBtnLoginIsDisplayed();
		AssertJUnit.assertEquals(verifyLoginBtnDisplayed, true);
	}

}
