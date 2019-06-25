import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Tue Feb 29 2019
public class SelectDatefromCurrent {
	public static void main(String[] args) throws InterruptedException {
		Date d = new Date();
		int currentday = d.getDate();
		int tobeSelected = currentday + 10;
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		System.out.println();
		System.out.println("today:    " + today);
		calendar.add(Calendar.DAY_OF_YEAR, 15);
		Date tomorrow = calendar.getTime();
		System.out.println("tomorrow: " + tomorrow);
		System.out.println(tomorrow.getDate());
		System.setProperty("webdriver.chrome.driver", "//home//sb//Desktop//BackUp//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
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
			try {
				driver.findElement(By.xpath("//div[contains(text(),'" + tobeSelected + "')]")).click();
			} catch (Exception e) {
				driver.findElement(By.xpath("//*[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				Thread.sleep(2000);
				System.out.println("hi");
				List<WebElement> entirecalendar = driver.findElements(By.xpath("//div[@class='DayPicker-Body']/div"));
				System.out.println(entirecalendar.size());
				for (int i = 1; i <= entirecalendar.size(); i++) {
					List<WebElement> weekdays = driver.findElements(
							By.xpath("//div[@class='DayPicker-Body']/div[" + i + "]/div[@aria-disabled='false']"));
					System.out.println(weekdays.size());
					for (int j = 1; j <= weekdays.size(); j++) {
						String s = driver.findElement(By.xpath(
								"//div[@class='DayPicker-Body']/div[" + i + "]/div[@aria-disabled='false'][" + j + "]"))
								.getText();
						if (s.equals(Integer.toString(tomorrow.getDate()))) {
							driver.findElement(By.xpath("//div[@class='DayPicker-Body']/div[" + i
									+ "]/div[@aria-disabled='false'][" + j + "]")).click();
							break;
						}
					}
				}
			}
		}
		driver.close();
	}
}
