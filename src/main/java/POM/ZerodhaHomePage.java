package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
@FindBy(xpath ="//input[@type='text']") private WebElement searchBox;
@FindBy(xpath="//span[text()='TATACOFFEE']")private WebElement TATACOFFEE;
@FindBy(xpath = "//button[@data-balloon=\"Buy\"]") private WebElement Buy;
@FindBy(xpath ="//label[@class=\"su-radio-label\"][1]") private WebElement BSEradio;
@FindBy(xpath ="//label[@class=\"su-switch-control\"]") private WebElement Toggle;
@FindBy(xpath ="//label[@for=\"radio-118\"]")private WebElement NSEradio;
@FindBy(xpath ="//span[@class=\"icon icon-info\"][1]")private WebElement helpIcon;
@FindBy(xpath ="//label[text()='Regular']")private WebElement Regular;
@FindBy(xpath ="//*[@id=\"app\"]/form/section/div/div[2]/div[1]/div/div[1]/label") private WebElement IntradayMIS;
@FindBy(xpath ="//label[text()='Longterm ']") private WebElement LongtermCNC;
@FindBy(xpath ="//input[@type=\"number\"][1]")private WebElement Quantity;
@FindBy(xpath ="//input[@label=\"Price\"]")private WebElement Price;
@FindBy(xpath ="//input[@label=\"Trigger price\"]")private WebElement TriggerPrice;
@FindBy(xpath ="//*[@id=\"app\"]/form/section/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/label")private WebElement Market;
@FindBy(xpath ="//label[text()='Limit']")private WebElement Limit;
@FindBy(xpath ="//label[text()='SL']")private WebElement StopLoss;
@FindBy(xpath ="//label[@for=\"radio-156\"]")private WebElement StopLossMarket;
@FindBy(xpath ="//a[@class=\"text-xsmall more-options\"]")private WebElement MoreOption;
@FindBy(xpath ="//button[@type=\"submit\"]")private WebElement buy;
@FindBy(xpath ="//button[@class=\"button-outline cancel\"]")private WebElement Cancel;
@FindBy(xpath ="//button[@type=\"submit\"]")private WebElement sell;

public ZerodhaHomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void EnterStockName(String StockName) {
	searchBox.sendKeys(StockName);
}
public void ClickOnBuy() {
	Buy.click();
}
public void ClickOnHelp() {
	helpIcon.click();
}
public void ClickOnToggle() {
	Toggle.click();
}
public void ClickOnBSE() {
	BSEradio.click();
}
public void ClickOnNSE() {
	NSEradio.click();
}

public void ClickOnIntraday() {
	IntradayMIS.click();
}
public void ClickOnLongterm() {
	LongtermCNC.click();
}
public void ClickOnQty() {
	Quantity.clear();
	Quantity.sendKeys("2");
}
public void ClickOnPrice() {
	Price.clear();
	Price.clear();
	Price.sendKeys("207");
}
public void ClickOnStopLoss() {
	StopLoss.click();
}
public void ClickOnTrigger() {
	TriggerPrice.clear();
	TriggerPrice.clear();
	TriggerPrice.sendKeys("195");
}
public void ClickOnMarket() {
	Market.click();
}
public void ClickOnLimit() {
	Limit.click();
}
public void ClickOnbuy() {
	buy.click();
}
public void Clickonsell() {
	sell.click();
}




}
