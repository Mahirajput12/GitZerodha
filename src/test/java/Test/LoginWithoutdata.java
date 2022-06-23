package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser2;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;
@Listeners(TestListeners.class)
public class LoginWithoutdata {
WebDriver driver;
@BeforeMethod
public void browser() {
	driver=Browser2.openBrowser();
}
@Test
public void clickOnLoginWithoutDataTest() throws EncryptedDocumentException, IOException {
	ZerodhaLoginPage zerodhaLoginPage =new ZerodhaLoginPage(driver);
	zerodhaLoginPage.clickOnLogin();
	String text=zerodhaLoginPage.getErrorText();
	String expectedText = "User ID should be minimum 9 characters.";
	Assert.assertEquals(text,expectedText);//Hard Assert
	String userName =Parametrization.getData(0, 1);
	String password =Parametrization.getData(1, 1);
	zerodhaLoginPage.enterUserId(userName);
	zerodhaLoginPage.enterPassword(password);
	zerodhaLoginPage.clickOnLogin();
}
}
