package FlipKart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FKIphoneAveragePrice {
	WebDriver driver = null;
	double avg = 0;
	private int sum;

	@Test
	public void doLoginandLogout() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("jakhotiyaabhishek@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Abhishek@123");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(3000);
		WebElement enterText = driver
				.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		enterText.sendKeys("iphone");
		WebElement search = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		search.click();
		Thread.sleep(3000);
		List<WebElement> iphonePrice = driver.findElements(By.xpath("(//div[@class='_1vC4OE _2rQ-NK'])"));
		for (int i = 1; i <= iphonePrice.size(); i++) {
			WebElement iphone = driver.findElement(By.xpath("(//div[@class='_1vC4OE _2rQ-NK'])[" + i + "]"));
			String iphoneAmount = iphone.getText();
			String temp=iphoneAmount;
			String iphoneName = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[" + i + "]")).getText();
			// System.out.println(iphoneName + " : " + iphoneAmount);
			iphoneAmount = iphoneAmount.replaceAll("[^0-9]", "");
			sum += Integer.parseInt(iphoneAmount);
			if (Integer.parseInt(iphoneAmount) > 50000) {
				System.out.println(iphoneName + " : " + temp);
			}
		}
		// avg = (double) sum / (double) iphonePrice.size();
		// System.out.println(avg);
//		Actions a = new Actions(driver);
//		WebElement arrow = driver.findElement(By.xpath(
//				"//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[3]/div[1]"));
//		a.moveToElement(arrow).build().perform();
//		Thread.sleep(2000);
//		WebElement logout = driver.findElement(By.xpath("//div[contains(text(),'Log')]"));
//		logout.click();
	}
}
