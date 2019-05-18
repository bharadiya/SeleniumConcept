import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import CookiesHandling.HandlingCookies;

public class CookiesMainMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		//getCookieswithSpecificName(driver);
		Cookie c = new Cookie("MyCookie", "123456789");
		HandlingCookies hc=new HandlingCookies();
		hc.creatingNewCookie(driver, c);
	}
}
