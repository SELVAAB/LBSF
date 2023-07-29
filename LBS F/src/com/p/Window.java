package com.p;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Window {


	WebDriver driver;




	@BeforeSuite
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");


		driver=new ChromeDriver(options);
	}


	@Test
	public void opengoogle() throws InterruptedException {

		driver.get("https://www.google.com/");
		driver.manage().window();

		Thread.sleep(400);




	}


	@Test
	public void openyahoo() throws InterruptedException {

		driver.get("https://login.yahoo.com/");
		driver.manage().window();
		Thread.sleep(5000);



	}
	@Test
	public void openyoutube() throws InterruptedException {

		driver.get("https://www.youtube.com/");

		driver.manage().window();
		Thread.sleep(5000);



	}

	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
	}
}







