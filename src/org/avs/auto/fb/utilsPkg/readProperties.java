package org.avs.auto.fb.utilsPkg;

import java.io.FileReader;
import java.util.Properties;

public class readProperties {
	
	public static String readConfig(String key) throws Exception {
		FileReader fr = new FileReader("/Users/gmanjusha/eclipse-workspace-1/May2024-Java/DataFolder/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(key);
		System.out.println(prop.get(key).toString());
		return prop.get(key).toString();
	}

	public static String readElement(String key) throws Exception {
		FileReader fr = new FileReader("/Users/gmanjusha/eclipse-workspace-1/May2024-Java/DataFolder/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(key);
		System.out.println(prop.get(key).toString());
		return prop.get(key).toString();
	}
}
