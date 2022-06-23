package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser2;
import POM.ZerodhaDashBoardAddStock;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class ZerodhaAddStock extends BestTest {
@BeforeMethod
public void openBrowser() {
	driver=Browser2.openBrowser();
}
@Test
public void addAnyStockInWatchList() throws EncryptedDocumentException, IOException, InterruptedException {
	ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver) ;
		String username=Parametrization.getData(0, 1);
		String password = Parametrization.getData(1, 1);
		zerodhaLoginPage.enterUserId(username);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogin();
		Thread.sleep(3000);
		ZerodhaPinPage zerodhaPinPage =new ZerodhaPinPage(driver);
		String pin=Parametrization.getData(2, 1);
		System.out.println(pin);
		zerodhaPinPage.enterPin(pin, driver);
		zerodhaPinPage.clickOnContinue();
		ZerodhaDashBoardAddStock zerodhaDashBoardAddStock = new ZerodhaDashBoardAddStock(driver);
		zerodhaDashBoardAddStock.clickOnFolder2();
		String StockName = "TATAMOTORS AUG FUT";
		zerodhaDashBoardAddStock.searchStock(StockName);
		zerodhaDashBoardAddStock.clickOnAnyStock(driver);
		System.out.println(StockName);
	}

}
