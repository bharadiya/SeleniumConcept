package CSVFile;

import java.io.IOException;

public class test {
	public static void main(String[] args) throws IOException {
		CSVFileReader reader=new CSVFileReader("/home/sb/eclipse-workspace/SeleniumConcept/Data.csv");
		reader.getDataFromCSV();
	}
}
