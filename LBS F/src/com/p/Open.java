package com.p;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Open {
	
	WebDriver driver;
	
	
	
	@BeforeSuite
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");


		driver=new ChromeDriver(options);
	}
	@Test
	public void dashbord() {
		
		driver.get("https://openinapp.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'hidden lg:block')]//div[contains(@class,'w-full flex flex-col justify-center items-center gap-6 p-7')]//button[1]")).click();
		driver.findElement(By.xpath("(//div[@class='aXBtI Wic03c'])[1]")).sendKeys("elangoradhakrishan@gmail.com");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
