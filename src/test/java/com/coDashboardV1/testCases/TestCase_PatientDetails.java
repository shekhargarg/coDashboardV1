package com.coDashboardV1.testCases;

import com.coDashboardV1.pageObjects.LoginPage;
import com.coDashboardV1.pageObjects.PatientDetailsPage;
import com.coDashboardV1.pageObjects.PatientsListPage;
import org.openqa.selenium.By;
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

        PatientsListPage Plist = new PatientsListPage(driver);
            Plist.getPatientHeader();
            Plist.getPatientCount();
            Plist.searchPatient("2YRQCN");
            Thread.sleep(5000);

        PatientDetailsPage PDetails = new PatientDetailsPage(driver);
            PDetails.getDoctorName();
            PDetails.getPatientDetails();
            PDetails.getPatBodyMeasurement();
            PDetails.getKss();
            PDetails.getTabNames();


     //-----------*******AVG HR
        String lblBPM = driver.findElement(By.xpath("//div[@class='info-wrap']//div[1]//div[2]")).getText();
        System.out.println("The Avg B::"+lblBPM);

        String lblBPMPCTChange = driver.findElement(By.xpath("//div[@class='info-wrap']//div[1]//div[3]")).getText();
        System.out.println("The Avg B::"+lblBPMPCTChange);

        String lblhrShowMore = driver.findElement(By.xpath("//div[@class='info-wrap']//div[1]//div[4]")).getText();
        System.out.println("The HR Show More is::"+lblhrShowMore);

        driver.findElement(By.xpath("//div[@class='info-wrap']//div[1]//div[4]")).click();








    }
}
