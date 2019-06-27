package com.actitime.filelib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	        WebDriver driver;
			@BeforeClass
			public void setUp()
			{
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			
			@BeforeMethod
			public void logIn()
			{
				 driver.get("http://localhost/login.do");
				 driver.findElement(By.name("username")).sendKeys("admin");
				 driver.findElement(By.name("pwd")).sendKeys("manager");
				 driver.findElement(By.id("loginButton")).click();
			}
			
			@AfterMethod
			public void logOut() 
			{
				driver.findElement(By.id("//a[@id='logoutLink']")).click();
			}
			
			@AfterClass
			public void closeBrowser()
			{
				driver.close();
			}

	}


