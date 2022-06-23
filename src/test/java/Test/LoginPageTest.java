package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser2;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;
import Utility.Report;
import junit.framework.TestListener;
@Listeners(TestListeners.class)

public class LoginPageTest extends BestTest {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void extentReports() {
		reports =Report.createReport();
	}

	//WebDriver driver;
	@BeforeMethod
	public void browser() {
		
		driver=Browser2.openBrowser();
		
	}
	@Test
	public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException {
		test=reports.createTest("loginWithValidCredentialsTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String userName = Parametrization.getData(0, 1);
		String password =Parametrization.getData(1, 1);
		zerodhaLoginPage.enterUserId(userName);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogin();
		}
	
	@Test
	public void forgotPasswordLinkTest() {
		test=reports.createTest("forgotPasswordLinkTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgot();

	}
	@Test
	public void signupLinkTest() {
		test=reports.createTest("signupLinkTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignUp();

	}
	@Test
	public void ClickOnLoginWithoutDataTest() {
		test=reports.createTest("ClickOnLoginWithoutDataTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnLogin();
		String text=zerodhaLoginPage.getErrorText();
		System.out.println(text);
		String expectedText = "User ID should be minimum 6 characters.";
		Assert.assertEquals(text, expectedText);// hard Assertion
		zerodhaLoginPage.enterPassword("Velocity");
		
	}
	
	@Test
	public void clickOnLoginWithoutDataTest() throws EncryptedDocumentException, IOException {
		test=reports.createTest("clickOnLoginWithoutDataTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnLogin();
		String text=zerodhaLoginPage.getErrorText();
		System.out.println(text);
		String expectedText = "User ID should be minimum 9 characters.";
		SoftAssert softassert = new SoftAssert ();
		softassert.assertEquals(text, expectedText);// soft Assert
		
		//zerodhaLoginPage.clickOnLogin();
		//zerodhaLoginPage.clickOnSignUp();
		String userName = Parametrization.getData(0, 1);
		String  password = Parametrization.getData(1, 1);
		zerodhaLoginPage.enterUserId(userName);
		zerodhaLoginPage.enterPassword(password);
		softassert.assertAll();
		zerodhaLoginPage.clickOnLogin();
		//softassert.assertAll();
	}
@AfterMethod
 public void closeBrowser(ITestResult result) {
	 if(result.getStatus()==ITestResult.FAILURE) {
		 test.log(Status.FAIL, result.getName());
	 }
	 else if (result.getStatus()==ITestResult.SUCCESS){
		 test.log(Status.PASS, result.getName());
	 }
		 
	 }
	@AfterTest
	public void flushResult() {
		reports.flush();
	}
	
}
	
	


