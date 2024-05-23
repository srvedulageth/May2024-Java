package firstPkg;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class FileHandling {
	public static void readProperties() throws Exception{
		File f = new File("/Users/gmanjusha/eclipse-workspace-1/May2024-Java/src/TestData/data.properties");
		FileReader fr = new FileReader(f);
		
		Properties prop = new Properties();
		prop.load(fr); //Loading the entire file into memory.
		
		System.out.println(prop.get("Language"));
		System.out.println(prop.get("URL"));
		System.out.println(prop.get("BrowserName"));

	}
	
	 public static void main(String[] args) throws Exception {
		FileHandling.readProperties();
	}

}
