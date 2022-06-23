package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser2;
import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;
import Utility.Report;
@Listeners(TestListeners.class)
public class ZerodhaHomePageTest extends BestTest {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void extentReports() {
		reports=Report.createReport();
	}
	
//WebDriver driver;
@BeforeMethod
public void browser() {
	driver=Browser2.openBrowser();
}
@Test(priority=-1)
public void loginToZerodhaPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
	test=reports.createTest("loginToZerodhaPinTest");
	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	String userName = Parametrization.getData(0, 1);
	String password = Parametrization.getData(1, 1);
	zerodhaLoginPage.enterUserId(userName);
	zerodhaLoginPage.enterPassword(password);
	zerodhaLoginPage.clickOnLogin();
Thread.sleep(5000);
ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
String pin = Parametrization.getData(2, 1);
System.out.println(pin);
zerodhaPinPage.enterPin(pin,driver);
zerodhaPinPage.clickOnContinue();
Thread.sleep(5000);
ZerodhaHomePage zerodhaHomePage = new ZerodhaHomePage(driver);
String StockName ="TATACOFFEE";
zerodhaHomePage.EnterStockName(StockName);
Actions action = new Actions(driver);
WebElement Stock=driver.findElement(By.xpath("//span[text()='TATACOFFEE']"));
action.moveToElement(Stock);
action.perform();
WebElement Buy =driver.findElement(By.xpath("//button[@data-balloon=\"Buy\"]"));
action.moveToElement(Buy);
action.perform();
Thread.sleep(3000);
action.click();
action.perform();
Thread.sleep(3000);
zerodhaHomePage.ClickOnToggle();
//zerodhaHomePage.ClickOnBSE();
zerodhaHomePage.ClickOnNSE();
zerodhaHomePage.ClickOnLongterm();
//zerodhaHomePage.ClickOnIntraday();
//zerodhaHomePage.ClickOnStopLoss();
Thread.sleep(2000);       
//zerodhaHomePage.ClickOnQty();
zerodhaHomePage.ClickOnLimit();
zerodhaHomePage.ClickOnQty();
Thread.sleep(2000);
zerodhaHomePage.ClickOnPrice();
Thread.sleep(2000);
//zerodhaHomePage.ClickOnTrigger();
//zerodhaHomePage.ClickOnMarket();
zerodhaHomePage.Clickonsell();
//zerodhaHomePage.ClickOnbuy();




}
@AfterMethod
public void closeBrowser(ITestResult result) {
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL,result.getName());
	}
	else if (result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS,result.getName());
	}
	
}
@AfterTest
public void flushResult() {
	reports.flush();
}

}
