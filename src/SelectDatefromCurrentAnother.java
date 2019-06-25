import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Tue Feb 29 2019
public class SelectDatefromCurrentAnother {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//home//sb//Desktop//BackUp//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		try {
			driver.switchTo().frame("notification-frame-22a342a1b");
			driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']"))
					.click();
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
			Thread.sleep(2000);
			while (driver.findElements(By.xpath("//div[@aria-label='Sat Feb 01 2020']")).size() == 0) {
				driver.findElement(By.xpath("//*[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				Thread.sleep(2000);
			}
			driver.findElement(By.xpath("//div[@aria-label='Sat Feb 01 2020']")).click();
		}
		// driver.close();
	}
}