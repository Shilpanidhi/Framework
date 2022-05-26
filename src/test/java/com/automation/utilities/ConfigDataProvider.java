package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider()
	{
		try {
		File src=new File("./Config/Config.properties");
		
		
		FileInputStream abcd=new FileInputStream (src);
		
		pro=new Properties();
		
		pro.load(abcd);
	}

	catch(Exception  e) {
		
		
		System.out.println("not able to load config file>"+ e.getMessage());
	}
	
}
	
public String getDataConfig(String keyToSearch)
{
	return pro.getProperty(keyToSearch);
}
public String getBrowser()
{
	return pro.getProperty("Browser");
	
}


public String getstagingURL()
{
	return pro.getProperty("qaUrl");
}
}