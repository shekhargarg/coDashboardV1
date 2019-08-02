//Author - Shekhar Garg
package com.coDashboardV1.testCases;
import com.coDashboardV1.pageObjects.PatientDetailsPage;
import com.coDashboardV1.pageObjects.LoginPage;
import com.coDashboardV1.pageObjects.PatientsListPage;
import org.testng.annotations.Test;


public class TestCase_HomePage extends BaseClass {

    @Test
    public void headerVerify() throws InterruptedException {
        //String baseURL = "http://13.76.181.108:5000/#/login";
        //driver.get(baseURL);

        LoginPage Lp = new LoginPage(driver);
        output("****** Start Execution of Login TestCase ******");
        Lp.loginPageLayout();
        Thread.sleep(10000);
        Lp.loginDoctor();
        Thread.sleep(10000);

        PatientDetailsPage hp = new PatientDetailsPage(driver);
        output("****** Start Execution of Home Page TestCase ******");
        System.out.println(hp.getDoctorName());
        if (hp.getDoctorName().equals("DW")){
            //Assertion.assertTrue(true);
            System.out.println("Pass");

        }   else {
           // Assert.assertFalse(false);
            System.out.println("Fails");
        }

        PatientsListPage Plist = new PatientsListPage(driver);
        Plist.getPatientHeader();
        Plist.getPatientCount();
        Plist.searchPatient("2YRQCN");



/*
        LogoutPage Log = new LogoutPage(driver);
        output("****** Start Execution of Logout TestCase ******");
        Log.LogoutVerify();
        Thread.sleep(3000);
*/

    }
}
