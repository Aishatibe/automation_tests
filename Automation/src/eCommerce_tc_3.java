import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class eCommerce_tc_3 extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ada");
		driver.hideKeyboard();
		//
		driver.findElementByXPath("//*[@text='Female']").click();
		driver.findElement(By.id("android:id/text1")).click();
		//
		// driver.findElement(MobileBy.AndroidUIAutomator("new
		// UiScrollable(UiSelector()).scrollIntoView(new UiSelector().textMatches(\"" +
		// Nigeria + "\"").instance(0))"));
		driver.findElementsByAndroidUIAutomator("new UiScrollable(UiSelector()).scrollIntoView(text(\"Aruba\"))");
		driver.findElementByXPath("//android.widget.TextView[@text='Aruba']").click();
		//
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//
		System.out.println(driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size());
		// driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable"));
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase( "Jordan 6 Rings")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	}

}
