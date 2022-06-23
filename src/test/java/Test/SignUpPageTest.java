package Test;


import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POJO.Browser2;
import POM.ZerodhaLoginPage;
import POM.ZerodhaSignUpPage;
import Utility.Parametrization;

public class SignUpPageTest {
WebDriver driver;
@BeforeTest
public void browser() {
	driver=Browser2.openBrowser();
}
@Test
public void enterMobileNo() throws EncryptedDocumentException, IOException {
	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	zerodhaLoginPage.clickOnSignUp();
	Set<String> address =driver.getWindowHandles();
	Iterator<String> i = address.iterator();
	while (i.hasNext()) {
		String A1 = i.next();
		driver.switchTo().window(A1);
		String title = driver.getTitle();
		if (title.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha"))
		{
			ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
			String A = Parametrization.getData(2, 1);
			zerodhaSignUpPage.enterMobileNo(A);
		}
	}
	
}
@Test
public void ClickOnContinue() {
	ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
	zerodhaSignUpPage.clickOnContinue(null);
}
}
