package WindowHandling;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnNaukriWebsite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String mainwindowid=driver.getWindowHandle();
		System.out.println("Main window id is "+ mainwindowid);
		driver.findElement(By.xpath("//div[@id='post-body-6170641642826198246']//a[1]")).click();
		Thread.sleep(2000);
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());
		ArrayList<String>tabs=new ArrayList<>(allwindows);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 1; j++) {
				driver.switchTo().window(tabs.get(1));
				driver.manage().window().maximize();
			}
			
		}
		
	}
}
