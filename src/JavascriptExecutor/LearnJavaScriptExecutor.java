package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import BasePackage.AllRequirements;

public class LearnJavaScriptExecutor extends AllRequirements {
	public static void clickOnWebElement(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("document.getElementById(\"u_0_2\").click();");
	}
	public static void doScrolling(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy(1000,1000);");
	}
	public static void windowResize(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.resizeTo(250,250);window.focus();");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		//clickOnWebElement(driver);
		//doScrolling(driver);
		windowResize(driver);
	}
}
