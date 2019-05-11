package UsingAShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class LearningAshot {
	private static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		AShot a=new AShot();
		Screenshot sc=a.takeScreenshot(driver);
		try {
			ImageIO.write(sc.getImage(),"PNG",new File("/home/shashank/Desktop/ForShop/Naukri.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
