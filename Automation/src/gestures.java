import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;

import org.openqa.selenium.WebElement;

//import org.openqa.selenium.interactions.touch.TouchActions ;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;


public class gestures extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
//TAP
		TouchAction t = new TouchAction(driver);
	WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text = 'Expandable Lists']");
			t.tap(tapOptions().withElement(element(expandList))).perform();
			driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
			t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
			//
			//Thread.sleep(2000);
			System.out.println(driver.findElementById("android:id/title").isDisplayed());
						
	}

}
