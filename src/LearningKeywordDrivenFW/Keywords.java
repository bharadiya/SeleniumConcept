package LearningKeywordDrivenFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Keywords {
	static WebDriver driver = null;

	public static void openBrowser(String browsername) {
		switch (browsername) {
		case "chrome": {
			System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
			driver = new ChromeDriver();
			break;
		}
		case "firefox": {
			System.setProperty("webdriver.gecko.driver", "//home//shashank//Downloads//Compressed//geckodriver");
			driver = new FirefoxDriver();
			break;
		}
		default:
			System.err.println("Invalid Browser : " + browsername);
		}
	}

	public static void openURL(String url) {
		driver.get(url);
	}

	public static void enterText(String type, String value, String text) {
/*	
 	switch (type) {
		case "xpath":
			driver.findElement(By.xpath(value)).sendKeys(text);
			break;
		case "css":
			driver.findElement(By.cssSelector(value)).sendKeys(text);
			break;
		case "id":
			driver.findElement(By.id(value)).sendKeys(text);
			break;
		case "linktext":
			driver.findElement(By.linkText(value)).sendKeys(text);
			break;
		case "partiallinktext":
			driver.findElement(By.partialLinkText(value)).sendKeys(text);
			break;
		case "classname":
			driver.findElement(By.className(value)).sendKeys(text);
			break;
		default:
			System.out.println("Invalid Locator type");
			break;
	 }
	 */
		getWebElement(type, value).sendKeys(text);
	}
	/***
	 * returns a WebElement where type should be in form of xpath,cssSelector,id,linkText,partialLinkText,className (Case Sensitive)
	 * 
	 * @param type
	 * @param value
	 * @return {@code WebElement } in the form of driver.findElement(By.{@code type(@code value )})
	 *
	 */
	public static WebElement getWebElement(String type, String value) {
		WebElement element = null;
		switch (type) {
		case "xpath":
			element = driver.findElement(By.xpath(value));
			break;
		case "cssSelector":
			element = driver.findElement(By.cssSelector(value));
			break;
		case "id":
			element = driver.findElement(By.id(value));
			break;
		case "linkText":
			element = driver.findElement(By.linkText(value));
			break;
		case "partialLinkText":
			element = driver.findElement(By.partialLinkText(value));
			break;
		case "className":
			element = driver.findElement(By.className(value));
			break;
		default:
			System.out.println("Invalid Locator type");
			break;

		}
		return element;
	}

	public static void clickOnWebElement(String type, String value) {
		getWebElement(type, value).click();
	}
	public static void selectValueFromDropDown(String type,String value,int index) {
		WebElement element=getWebElement(type, value);
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public static void closeDriver() {
		driver.close();
	}
}
