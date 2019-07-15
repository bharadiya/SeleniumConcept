package CSVFile;

import java.io.IOException;
import java.util.Arrays;

public class test {
	public static void main(String[] args) throws IOException {
		CSVFileReader reader=new CSVFileReader("./Data.csv");
		System.out.println(Arrays.deepToString(reader.getDataFromCSV()));
	}
}
