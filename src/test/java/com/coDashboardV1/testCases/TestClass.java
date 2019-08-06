package com.coDashboardV1.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    //public String baseURL = "http://13.76.181.108:5000/#/login";
    //public static WebDriver driver;

    public static void main(String[] args) {
        WebDriver driver;
        String baseURL = "http://13.76.181.108:5000/#/patients/2YRQCN/overview";
        System.setProperty("webdriver.chrome.driver","/Users/shekhargarg/Desktop/Connected Life/coDashboardV1/Drivers/chromedriver");
        //System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(baseURL);
        String text = driver.findElement(By.xpath("//body/app-root/div[@class='mainBody']/app-profile/div/div/div[@class='router-container']/app-overview/div[@class='info-wrap']/div[1]")).getText();
        System.out.println(text);
    }
}
