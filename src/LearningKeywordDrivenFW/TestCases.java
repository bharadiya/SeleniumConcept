  package LearningKeywordDrivenFW;

import org.testng.annotations.Test;

import LearningKeywordDrivenFW.FileUtilities.PropertiesFile;

public class TestCases {
	@Test
	public void tc_01() {
		Keywords.openBrowser("chrome");
		Keywords.openURL("https://www.fb.com");
		String [] emailid=PropertiesFile.getAllValues("email");
		String [] pass=PropertiesFile.getAllValues("password");
		String [] d=PropertiesFile.getAllValues("day");
		String [] month=PropertiesFile.getAllValues("month");
		String [] year=PropertiesFile.getAllValues("year");
		Keywords.getWebElement(emailid[0],emailid[1]).sendKeys(emailid[2]);
	    Keywords.getWebElement(pass[0],pass[1]).sendKeys(pass[2]);
		Keywords.selectValueFromDropDown(d[0],d[1],5);
		Keywords.selectValueFromDropDown(month[0],month[1],3);
		Keywords.selectValueFromDropDown(year[0],year[1],50);
		//Keywords.clickOnWebElement("xpath", "//input[@id='u_0_2']");
	}
}
