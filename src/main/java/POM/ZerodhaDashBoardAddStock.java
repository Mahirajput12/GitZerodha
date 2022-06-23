package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaDashBoardAddStock {
@FindBy(xpath="//input[@type=\"text\"][1]") private WebElement searchstock;
@FindBy(xpath="//span[@class=\"tradingsymbol\"]") private List<WebElement> anyStock;
@FindBy(xpath="//button[@data-balloon=\"Buy\"]") private WebElement Togglebuy;
@FindBy(xpath="//button[@data-balloon=\"Sell\"]") private WebElement Togglesell;
@FindBy(xpath="//li[@data-balloon=\"2\"]")private WebElement SecondFolder;


public ZerodhaDashBoardAddStock(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickOnFolder2() {
	SecondFolder.click();
}
public void searchStock(String stockname) {
	searchstock.sendKeys(stockname);
}
public void clickOnAnyStock(WebDriver driver) {
	int count=anyStock.size();
	for(int i=0;i<count;i++) {
		WebElement stockname =anyStock.get(i);
		String text=stockname.getText();
		if(text.equals("TATAMOTORS AUG FUT"))
		{
			Actions act =new Actions(driver);
			act.moveToElement(stockname);
			act.build().perform();
			stockname.click();
			break;
		}
	}
}
}
