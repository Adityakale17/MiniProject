package com.cyient.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebDriverWrapper {

	public WebDriver driver;
	 
	 @BeforeMethod
		public void setup() {
			String browser = "ch";

			if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "src/test/resources/driver/iedriverserver.exe");
				driver = new InternetExplorerDriver();

			} else if (browser.equalsIgnoreCase("ff")) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
				driver = new FirefoxDriver();

			} else {
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
				driver = new ChromeDriver(option);
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.homecentre.in/");
		}

		@AfterMethod
		public void teardown() {
			//driver.quit();
		}
	}

