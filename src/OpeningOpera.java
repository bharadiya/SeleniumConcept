import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OpeningOpera {
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.opera.driver", "./Drivers//operadriver");
		WebDriver driver=new OperaDriver();
	}
}
