package com.dalal.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {
		String path = "E:\\software testing notes\\FrameWork WorkSpace\\"
				+ "DalalStreet_PP_New_met\\src\\test\\resources\\config\\Config.properties";
		try {
			File f = new File (path);
			FileInputStream fis = new FileInputStream(f);
			prop  = new Properties();
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();

		}

	}
	public String getUrl() {
       System.out.println(prop.getProperty("url"));
		return prop.getProperty("url");

	}
     
	public String getEmailId() {

		return prop.getProperty("email");
		

	}
     
	public String getPassword() {
        
		return prop.getProperty("password");

	}

}
