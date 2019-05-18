package LearningKeywordDrivenFW.FileUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public static String getProperty(String key) {
		String value = null;
		try {
			FileInputStream f = new FileInputStream(
					"/home/shashank/eclipse-workspace/SeleniumConcept/src/LearningKeywordDrivenFW/FileUtilities/InputContents.properties");
			Properties p = new Properties();
			p.load(f);
			value = p.getProperty(key);

		} catch (FileNotFoundException e) {
			System.err.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return value;
	}
/***
 * 
 * Returns a {@code String [] } with locator,value,and content
 * @param key
 * @return all the values in the form of{@code String[] } where  locator at index 0 , value at index 1,content at index 2
 */
	public static String[] getAllValues(String key) {
		String[] values = null;
		try {
			FileInputStream f = new FileInputStream(
					"/home/shashank/eclipse-workspace/SeleniumConcept/src/LearningKeywordDrivenFW/FileUtilities/InputContents.properties");
			Properties p = new Properties();
			p.load(f);
			values = p.getProperty(key).split("\\s{1,}");
		} catch (FileNotFoundException e) {
			System.err.println("File Not Found");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Unable to load the file");
			e.printStackTrace();
		}
		return values;
	}
}
