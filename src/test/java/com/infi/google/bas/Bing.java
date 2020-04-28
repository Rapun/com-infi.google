package com.infi.google.bas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bing {
	
	WebDriver driver;

	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void Verifyurl()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.bing.com/");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
