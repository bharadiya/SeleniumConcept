import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckboxes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//sb//Desktop//BackUp//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		//Assert.assertFalse takes only boolean as a "false" if input is given as true it fails
		//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

	}
}
	