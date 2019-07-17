//Author - Shekhar Garg
package com.coDashboardV1.testCases;
import com.coDashboardV1.pageObjects.HomePatientDetailsPage;
import org.junit.Test;
import org.testng.Assert;

public class TestCase_HomePage extends BaseClass {

    @Test
    public void headerVerify(){

        driver.get(baseURL);

        HomePatientDetailsPage hp = new HomePatientDetailsPage(driver);
       // hp.getDoctorName();
        System.out.println(hp.getDoctorName());

        if (hp.getDoctorName().equals("DW")){
            Assert.assertTrue(true);
            System.out.println("Pass");

        }   else {
            Assert.assertFalse(false);
            System.out.println("Fails");
        }

    }
}
