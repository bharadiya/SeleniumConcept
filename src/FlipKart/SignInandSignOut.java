package FlipKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SignInandSignOut {
	WebDriver driver = null;

	@Test
	public void doLoginandLogout() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("jakhotiyaabhishek@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Abhishek@123");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		WebElement arrow = driver.findElement(By.xpath(
				"//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[3]/div[1]"));
		a.moveToElement(arrow).build().perform();
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//div[contains(text(),'Log')]"));
		logout.click();
	}
}
