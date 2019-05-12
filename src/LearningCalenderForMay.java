
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningCalenderForMay {

	public static void SwitchingMonths(WebDriver driver) {
		List<WebElement> entirecalendar = driver.findElements(By.xpath("//div[@class='DayPicker-Body']/div"));
		int minAmount = 1000000;
		for (int i = 1; i <= entirecalendar.size(); i++) {
			List<WebElement> weekdays = driver.findElements(
					By.xpath("//div[@class='DayPicker-Body']/div[" + i + "]/div[@aria-disabled='false']"));
			int count = weekdays.size();
			for (int j = 1; j <= count; j++) {
				String amount = driver.findElement(By.xpath("//div[@class='DayPicker-Body']/div[" + i
						+ "]/div[@aria-disabled='false'][" + j + "]/descendant::*[5]")).getText();
				// System.out.println(amount);
				int p = Integer.parseInt(amount);
				if (p < minAmount) {
					minAmount = p;
				}
			}
			// System.out.println("Min"+minAmount);
		}
		for (int i = 1; i <= entirecalendar.size(); i++) {
			String a = Integer.toString(minAmount);
			// System.out.println("a "+a);
			List<WebElement> weekdays = driver.findElements(
					By.xpath("//div[@class='DayPicker-Body']/div[" + i + "]/div[@aria-disabled='false']"));
			int count = weekdays.size();
			for (int j = 1; j <= count; j++) {
				String b = driver.findElement(By.xpath("//div[@class='DayPicker-Body']/div[" + i
						+ "]/div[@aria-disabled='false'][" + j + "]/descendant::*[5]")).getText();
				// System.out.println("b "+b);
				if (a.equals(b)) {
					driver.findElement(By.xpath("//div[@class='DayPicker-Body']/div[" + i
							+ "]/div[@aria-disabled='false'][" + j + "]/descendant::*[5]")).click();
					break;
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		// Thread.sleep(10000);
		try {
			driver.switchTo().frame("notification-frame-22a342a1b");
			driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']"))
					.click();
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys("Hyderabad");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']")).sendKeys("Mumbai");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
			for (int i = 0; i < 3; i++) {
				driver.findElement(By.xpath("//*[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				Thread.sleep(1000);
			}
			SwitchingMonths(driver);
			driver.findElement(By.xpath("//div[@id='pax_link_common']")).click();
			Thread.sleep(2000);
			for (int i = 0; i < 3; i++) {
				driver.findElement(By.xpath("//button[@id='adultPaxPlus']")).click();
				driver.findElement(By.xpath("//button[@id='childPaxPlus']")).click();
			}
			driver.findElement(By.xpath("//button[@id='gi_search_btn']")).click();
		}
	}
}
