package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {
@FindBy(xpath="//input[@id=\"user_mobile\"]") private WebElement mobileno;
@FindBy(xpath="//button[@type=\"submit\"]") private WebElement submit;
@FindBy(xpath="//a[text()='Want to open an NRI account?']") private WebElement NRIaccount;

public ZerodhaSignUpPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterMobileNo(String mobileNo) {
	mobileno.sendKeys(mobileNo);
}
public void clickOnContinue(String Submit) {
    submit.click();
}
public void clickOnNRIaccount(String nriaccount) {
	NRIaccount.click();
}

}
