package CookiesHandling;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {
	/***
	 * Prints all the cookies accepted by webdriver
	 * 
	 * @param driver
	 */

	public  void getCookies(WebDriver driver) {
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of accepted cookies is" + cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + ": " + cookie.getValue());
		}
	}

	/***
	 * Prints specific cookie according to name
	 *
	 * @param driver
	 */
	public  void getCookieswithSpecificName(WebDriver driver) {
		System.out.println(driver.manage().getCookieNamed("session-id"));
	}

	/***
	 * Adds new Cookie
	 * 
	 * @param driver
	 * @param c
	 */
	public  void creatingNewCookie(WebDriver driver, Cookie c) {
		driver.manage().addCookie(c);
		getCookies(driver);
	}

	/***
	 * Deletes specific cookie
	 * 
	 * @param driver
	 * @param c
	 */
	public  void deleteSpecificCookie(WebDriver driver, Cookie c) {
		driver.manage().deleteCookie(c);
		getCookies(driver);
	}
	/***
	 * Deletes all the cookies accepted by driver
	 * @param driver
	 */
	public  void deleteAllCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
		getCookies(driver);
	}
}
