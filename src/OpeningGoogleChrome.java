import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningGoogleChrome {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9665732659");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcd");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		System.err.println(driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText());
		
	}
}
