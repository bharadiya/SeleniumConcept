package Dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDropdownList {
	public static void openingBrowser(WebDriver driver) {
		driver.get("https://www.fb.com");
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		openingBrowser(driver);
		Select a = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		a.selectByVisibleText("30");
//		for (int i = 0; i < 30; i++) {
//			a.selectByIndex(i);
//		}
	}
}

/**
 * 1.How to select more number of select tags
 * 
 */

