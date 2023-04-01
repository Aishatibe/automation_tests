import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class eCommerce_tc_2 extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//
		// driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ada");
		driver.hideKeyboard();
		//
		driver.findElementByXPath("//*[@text='Female']").click();
		driver.findElement(By.id("android:id/text1")).click();
		//
		// driver.findElement(MobileBy.AndroidUIAutomator("new
		// UiScrollable(UiSelector()).scrollIntoView(new UiSelector().textMatches(\"" +
		// Nigeria + "\"").instance(0))"));
		driver.findElementsByAndroidUIAutomator("new UiScrollable(UiSelector()).scrollIntoView(text(\"Nigeria\"))");
		driver.findElementByXPath("//android.widget.TextView[@text='Nigeria']").click();
		//
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//
		String toastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		
		System.out.println(toastMessage);
		Assert.assertEquals("Please enter your names", toastMessage);

	}

}
