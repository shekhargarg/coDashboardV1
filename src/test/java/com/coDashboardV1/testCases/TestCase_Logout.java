package com.coDashboardV1.testCases;

import com.coDashboardV1.pageObjects.LoginPage;
import com.coDashboardV1.pageObjects.LogoutPage;
import org.testng.annotations.Test;




public class TestCase_Logout extends BaseClass {
    @Test
    public void Logoutverify() throws InterruptedException {
        LogoutPage Log = new LogoutPage(driver);
        output("****** Start Execution of Logout TestCase ******");
        Log.LogoutVerify();
        Thread.sleep(3000);
    }
}