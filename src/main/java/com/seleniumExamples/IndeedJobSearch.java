package com.seleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedJobSearch {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.gecko.driver", "/Users/Ashmin/desktop/lib/Selenium/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/Ashmin/desktop/lib/Selenium/chromedriver");

		/*
		 * //Create a firefox driver with Marionette capabilities
		 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 * capabilities.setCapability("marionette", true);
		 *  WebDriver driver = new FirefoxDriver(capabilities);
		 */

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.indeed.com/");

		Thread.sleep(2000);
		driver.findElement(By.id("what")).sendKeys("Selenium");
		driver.findElement(By.id("where")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("where")).sendKeys("New York City");
		Thread.sleep(2000);
		driver.findElement(By.id("fj")).click();

		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("searchCount")).getText());

		driver.close();
	}

}
