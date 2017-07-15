package com.seleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LocatingStrategies {
	public static void main(String[] args) throws InterruptedException {

		// SetProperty to launch Mozilla
		System.setProperty("webdriver.gecko.driver", "/Users/Ashmin/desktop/lib/Selenium/geckodriver");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.indeed.com");
		
		/*//Locating by Id
		driver.findElement(By.id("what")).sendKeys("Selenium");*/
		
		/*//Clear the input area
		driver.findElement(By.name("l")).clear();*/
		
		/*//Locating by Name
		driver.findElement(By.name("l")).sendKeys("New York City");*/
		
		//Locating by LinkText
		//driver.findElement(By.linkText("Employers: Post a job")).click();
		
		/*//Locating by ParitalLink
		driver.findElement(By.partialLinkText("Post Job")).click();*/
		
		
		/*//Locating by XPath
		//System.out.println(driver.findElement(By.xpath("//img[@title='Indeed job search']")).getAttribute("src"));
*/		
		
		/*//Locating by CssSelector
		//System.out.println(driver.findElement(By.cssSelector("input.input_submit")).getAttribute("value"));
*/		
		/*//Locating by TagName
			System.out.println(
					driver.findElements(By.tagName("a")).size()
					);
			
			System.out.println(
					driver.findElement(By.tagName("a")).getText()
					);*/
		
		
		/*//Locating by Class Element
		
		System.out.println(
					driver.findElements(By.className("input_text")).size()
				);
		
		driver.findElement(By.className("input_text")).sendKeys("Selenium");*/
		
			
		Thread.sleep(2000);
		
		driver.close();
	}

}
