package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPage {
	@FindBy(xpath = "//input[@id='radio-31']")private WebElement rememberUserId;
	@FindBy(xpath = "//input[@id='radio-32']")private WebElement ForgotUserId;
	@FindBy(xpath = "//input[@placeholder='User ID']")private WebElement UserId;
	@FindBy(xpath = "//input[@placeholder='PAN']")private WebElement PAN;
	@FindBy(xpath = "//input[@id='radio-36']")private WebElement email;
	@FindBy(xpath = "//input[@id='radio-37']")private WebElement sms;
	@FindBy(xpath = "//input[@placeholder='E-mail (as on account)']")private WebElement Emailaccount;
	@FindBy(xpath = "//input[@placeholder='Captcha']")private WebElement captcha;
	@FindBy(xpath = "//input[@//button[@class='button-orange wide']")private WebElement reset;
	@FindBy(xpath = "//a[@class='text-xsmall text-light reset-account-button']")private WebElement backtologin;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp;

	public ZerodhaForgotPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnIRememberMyUserId()
	{
		rememberUserId.click();
	}
	public void ClickOnIForgotMyUserId()
	{
		ForgotUserId.click();
	}
	public void EnterUserId(String userid)
	{
	     UserId.sendKeys(userid);
	}
	public void EnterPannumber(String pannumber)
	{
		PAN.sendKeys(pannumber);
	}
	public void ClickOnEmailRadioButton()
	{
		email.click();
	}
	public void ClickOnSmsRadioButton()
	{
		sms.click();
	}
	public void EnterEmail(String emailaddress)
	{
		email.sendKeys(emailaddress);
	}
	public void EnterCaptcha(String Captcha)
	{
		captcha.sendKeys(Captcha);
	}
	public void ClickOnResetButton()
	{
		reset.click();
	}
	public void ClickOnBackToLogin()
	{
		backtologin.click();
	}
	public void clickOnSignUp()
	{
		signUp.click();
	}
	}
