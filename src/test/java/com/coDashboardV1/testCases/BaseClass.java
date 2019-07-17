package com.coDashboardV1.testCases;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public String baseURL = "http://13.76.181.108:5000/#/patients/7C4Y3Q/2019-07-14/overview";
    public String username = "admin";
    public String password = "admin";

    public static WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","/Users/shekhargarg/Desktop/Connected Life/coDashboardV1/Drivers/chromedriver");
        //System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"Drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void teardown(){
        //driver.quit();
    }
}