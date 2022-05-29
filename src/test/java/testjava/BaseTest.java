package testjava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.DashboardPage;
import mainjava.LoginPageMain;

public class BaseTest extends BaseClass {

	@BeforeClass
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOption);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@BeforeMethod
	public void allPageObjects() {
		loginpagemain = new LoginPageMain(driver);
		dashboardpage = new DashboardPage(driver);
	}
	@AfterClass
	public void TearDown() {
	driver.quit();
	}
}
