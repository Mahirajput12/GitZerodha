package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;

public class TestListeners extends BestTest implements ITestListener{
public void onTestStart(ITestResult result) {
	System.out.println(result.getName()+"Test has started");
}
public void onTestFailure(ITestResult result) {
	try {
		ScreenShot.screenshot(driver, result.getInstanceName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(result.getName()+"Test has failure");
}
public void onTestSuccess(ITestResult result) {
	System.out.println(result.getName()+"Test success");
}
public void onTestSkipped(ITestResult result) {
	System.out.println(result.getName()+"Test skipped");
}

}
