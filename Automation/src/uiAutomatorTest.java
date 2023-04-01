import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiAutomatorTest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//
//identify using attributes
//	driver.findElementByAndroidUIAutomator("attribute("value")");
		//
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
//identify using property
//driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)")
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()) ;
	}

}
