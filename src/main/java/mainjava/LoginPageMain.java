package mainjava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMain extends BaseClass {
	
	@FindBy(id="txtUsername") WebElement username;
	@FindBy(id="txtPassword") WebElement Password;
	@FindBy(id="btnLogin") WebElement btnLogin;
	@FindBy(id="spanMessage") WebElement invalidMSg;

	public LoginPageMain(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyBtn() {
		
		return btnLogin.isDisplayed();
	}
	
	public String verifyTitle() {
		return driver.getTitle();
	}
	public String verifyUrl() {
		return driver.getCurrentUrl();
	}
	public void ValidLoginCred(String user , String pass) {
		username.sendKeys(user);
		Password.sendKeys(pass);
		btnLogin.click();
	}
	
	public String msgUponInvalidCred(String expectedInvMsg) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String invMsg= invalidMSg.getText();
		return invMsg;
	}
	public boolean verifyBtnLoginIsDisplayed() {
		return btnLogin.isDisplayed();
	}
}
