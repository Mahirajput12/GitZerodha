package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser2 {
public static WebDriver openBrowser() {//here webdriver is return type
	ChromeOptions options = new ChromeOptions();//class of Selenium
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","C:\\oracle my\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(options);//webdriver ki sari method driver is variable
	driver.get("https://kite.zerodha.com/");//method of webdriver interface
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	return driver;
}
}
