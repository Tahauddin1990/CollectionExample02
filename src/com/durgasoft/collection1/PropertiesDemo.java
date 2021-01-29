package com.durgasoft.collection1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {

		Properties properties = new Properties();

		try {
			FileInputStream fileInputStream = new FileInputStream("abc.properties");
			properties.load(fileInputStream);
			System.out.println("User Name     : " + properties.getProperty("UserName"));
			System.out.println("Age           : " + properties.getProperty("Age"));
			System.out.println("Qualification : " + properties.getProperty("Qualification"));
			System.out.println("Occupation    : " + properties.getProperty("Occupation"));
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
