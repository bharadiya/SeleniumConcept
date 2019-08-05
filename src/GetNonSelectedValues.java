import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetNonSelectedValues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		WebElement selectDay=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(selectDay);
		List<WebElement>alldays=s.getOptions();
		System.out.println(alldays.size());
		for (WebElement webElement : alldays) {
			boolean selectedorNot=webElement.isSelected();
			if(selectedorNot==false)
			{
				System.out.println(webElement.getText());
			}
		}
	}
}
