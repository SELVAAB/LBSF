package com.p;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lbs {
	
	
	WebDriver driver;
	
	@BeforeClass
	
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");


		driver=new ChromeDriver(options);
		 
			
		driver.get("https://www.google.com/");
		
		
	}

	
	
	
	@Test(priority=1)
	public void first1() {
		System.out.println("best");
	}
	@Test(alwaysRun=true)
	public void first() {
		System.out.println("best");
	}
	@Test(alwaysRun=true)
	public void second() {
		System.out.println("best");
	}
	@Test
	public void third() {
		System.out.println("two");
		
		
		
	}
	

	
@AfterClass
public void closebrowser() throws InterruptedException {
	Thread.sleep(6000);
	
driver.quit();
	
}
}





	


