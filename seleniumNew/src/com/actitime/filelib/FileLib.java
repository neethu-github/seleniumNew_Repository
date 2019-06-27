package com.actitime.filelib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileLib {

	public static void main(String[] args) throws Throwable {
/* get java object of the physical file*/
		
		FileInputStream fobj=new FileInputStream("C:\\Users\\Bothers\\eclipse-workspace\\seleniumNew\\TestData\\commonData.properties.txt");

	/* load the property file common data to pobj */
		 
		Properties pobj=new Properties();
		pobj.load(fobj);
		
	/* read data using Key */
		
		 String URL=pobj.getProperty("Url");
		 
		 String USER=pobj.getProperty("Username");	
	 
		 String PWD=pobj.getProperty("Password");
		 
		 
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(URL);
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.name("username")).sendKeys(USER);
		 driver.findElement(By.name("pwd")).sendKeys(PWD);
		 driver.findElement(By.id("loginButton")).click();
		 driver.close();

	}

}
