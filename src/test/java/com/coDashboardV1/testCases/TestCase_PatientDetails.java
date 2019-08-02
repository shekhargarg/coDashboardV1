package com.coDashboardV1.testCases;

import com.coDashboardV1.pageObjects.LoginPage;
import com.coDashboardV1.pageObjects.PatientDetailsPage;
import org.testng.annotations.Test;



public class TestCase_PatientDetails extends BaseClass {

    @Test
         public void VerifyPatientDetails() throws InterruptedException {
            LoginPage Lp = new LoginPage(driver);
            output("****** Start Execution of Login TestCase ******");
            Lp.loginPageLayout();
            Thread.sleep(10000);
            Lp.loginDoctor();
            Thread.sleep(10000);

            PatientDetailsPage Pd = new PatientDetailsPage(driver);

            //Pd.

    }


}
