package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BasePackage.AllRequirements;

public class UsingJavaInBuiltMethod extends AllRequirements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Date d = new Date();
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		Calendar cal = Calendar.getInstance();
		driver.get("https://fb.com");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("/home/shashank/eclipse-workspace/SeleniumConcept/ScreenShotImages/"
					+ monthName[cal.get(Calendar.MONTH)] + "/" + d.toString() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
