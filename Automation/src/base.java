import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
//import package base_package;

public class base {

	//public static void main(String[] args) throws MalformedURLException {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException{
		// TODO Auto-generated method stub
		
		File appDir = new File("src");
		//File app = new File(appDir, "ApiDemos-debug.apk");
		File app = new File(appDir, "General-Store.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Xiaomi M2003J15SC");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		//UI AUTOMATOR - ANDROID APPS
		//UIAUTOMATOR2
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		//8.3.0
		
		return driver;
	}

}
