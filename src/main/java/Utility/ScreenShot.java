package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser2;

public class ScreenShot {
public static void screenshot(WebDriver driver,String name) throws IOException {
	String d =ScreenShot.date();
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination = new File("C:\\MAHENDRA CLASS\\m\\"+name+d+".jpg");
	
	FileHandler.copy(source, destination);
}
public static String date() {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");//format the time date and time as required
	LocalDateTime currentTime = LocalDateTime.now();//return current time
	String d =dtf.format(currentTime);//format the time given my now()method to required format and return string 
	return d;
//	String date =DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss").format(LocalDateTime.now());
//	return date;
//	
}
}
