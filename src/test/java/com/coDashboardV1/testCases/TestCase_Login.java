package com.coDashboardV1.testCases;

import com.coDashboardV1.pageObjects.LoginPage;
import org.testng.annotations.Test;



public class TestCase_Login extends BaseClass {
    @Test
    public void Loginverify() throws InterruptedException {
        //String baseURL = "http://13.76.181.108:5000/#/login";
        driver.get(baseURL);
        LoginPage Lp = new LoginPage(driver);
        output("****** Start Execution of Login TestCase ******");
        Lp.loginPageLayout();
        Thread.sleep(10000);
        Lp.loginDoctor();
        Thread.sleep(10000);
    }
}
