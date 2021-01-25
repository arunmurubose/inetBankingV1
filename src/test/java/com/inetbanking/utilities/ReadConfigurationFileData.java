package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigurationFileData {
	public static Properties prop;
	public ReadConfigurationFileData() {
		// TODO Auto-generated constructor stub

		File src=new File("./configurationFiles/config.properties");
		try {
			FileInputStream file=new FileInputStream(src);
			prop=new Properties();
			prop.load(file);



		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is"+e.getMessage());
		}

	}

	public  static String readConfigFileDataUsingKey(String key)
	{
		String value = prop.getProperty(key);
		return value;
	}

}
