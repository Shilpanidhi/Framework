package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider2 {
	Properties pro;
	
	public  ConfigDataProvider2() {
		
		try {
	
		File src=new File("./Config/Config.properties");
		
		FileInputStream sri=new FileInputStream (src);
		
		pro=new Properties();
		
		pro.load(sri);
			
		}

		
	catch (Exception  e) 
	{
		System.out.println("faZHjzh");
	}
}
		

public String getDataConfig(String Keytosearch) {
			
			return pro.getProperty(Keytosearch);
		}
public String getBrowser() {
			
			return pro.getProperty("browser");
		}
	
	
public String getstagingURL() {
	
	return pro.getProperty("qaUrl");
}

}
	
	