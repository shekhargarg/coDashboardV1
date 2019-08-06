package com.coDashboardV1.testCases;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;

public class BaseClass extends commonFunction{

    public String baseURL = "http://13.76.181.108:5000/#/login";
    public static WebDriver driver;


    @BeforeTest
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,800");
        options.addArguments("headless");

        System.setProperty("webdriver.chrome.driver","/Users/shekhargarg/Desktop/Connected Life/coDashboardV1/Drivers/chromedriver");
        //System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"Drivers/chromedriver");
        System.out.println("Launching Chrome in Headless Mode");
        driver = new ChromeDriver(options);
        System.out.println("Navigating to Test URL");
        driver.get(baseURL);

    }

    @AfterTest
    public void teardown(){
      //driver.quit();
    }
}