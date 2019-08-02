package com.coDashboardV1.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;

public class PatientDetailsPage {


    WebDriver localdriver;

    public PatientDetailsPage(WebDriver remotedriver){
        localdriver=remotedriver;
        PageFactory.initElements(remotedriver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Welcome,')]")
    WebElement lblDoctorname;

    @FindBy(xpath = "//div[@class='name-card-value']")
    WebElement lblDocIni;

    @FindBy(xpath = "//span[@class='ant-avatar-string']")
    WebElement lblPatIni;

    @FindBy(xpath = "//p[@id='user-fullname']")
    WebElement lblPatName;

    @FindBy(xpath = "//p[@id='user-gender']")
    WebElement lblGender;

    @FindBy(xpath = "//p[@id='user-age']")
    WebElement lblAge;

    @FindBy(xpath = "//p[@id='user-weight']")
    WebElement lblWeight;

    @FindBy(xpath = "//p[@id='user-height']")
    WebElement lblHeight;

    @FindBy(xpath = "//p[@id='user-affectedSide']")
    WebElement lblAffectedSide;

    @FindBy(xpath = "//p[@id='user-alignment']")
    WebElement lblAlingnment;

    @FindBy(xpath = "//p[@id='user-rangeMotion']")
    WebElement lblRanMotion;

    @FindBy(xpath = "//p[@id='user-medicalLateral']")
    WebElement lblMLInstability;

    @FindBy(xpath = "//p[@id='user-anteriorPosterior']")
    WebElement lblAPInstability;

    @FindBy(xpath = "//a[contains(text(),'Overview')]")
    WebElement lblOverviewTab;

    @FindBy(xpath = "//a[contains(text(),'History')]")
    WebElement lblHistoryTab;

    @FindBy(xpath = "//a[contains(text(),'Medical Record')]")
    WebElement lblMedicalRecordTab;

    public String getDoctorName(){
        String lblDocIniText = lblDocIni.getText();
        return lblDocIniText;
    }
    public void getPatientDetails(){
        String lblPatNameText = lblPatName.getText();
        String lblGenderText = lblGender.getText();
        String lblAgeText = lblAge.getText();
      //  return lblPatNameText;
        List<String> listPatDetails = new ArrayList<String>();
            listPatDetails.add(lblPatNameText);
            listPatDetails.add(lblGenderText);
            listPatDetails.add(lblAgeText);
    }
    public void getPatBodyMeasurement(){
        String lblWeightText = lblWeight.getText();
        String lblHeightText = lblHeight.getText();
        String lblAffectedSideText = lblAffectedSide.getText();
      //  return lblWeightText;
        List<String> listPatBm = new ArrayList<String>();
        listPatBm.add(lblWeightText);
        listPatBm.add(lblHeightText);
        listPatBm.add(lblAffectedSideText);
    }
    public void getKss(){
        String lblAlingnmentText = lblAlingnment.getText();
        String lblRanMotionText = lblRanMotion.getText();
        String lblMLInstabilityText = lblMLInstability.getText();
        String lblAPInstabilityText = lblAPInstability.getText();
        //return lblAlingnmentText;
        List<String> listPatKSS = new ArrayList<String>();
        listPatKSS.add(lblAlingnmentText);
        listPatKSS.add(lblRanMotionText);
        listPatKSS.add(lblMLInstabilityText);
        listPatKSS.add(lblAPInstabilityText);
    }
    public void getTabNames(){
        String lblOverviewTabText = lblOverviewTab.getText();
        String lblHistoryTabText = lblHistoryTab.getText();
        String lblMedicalRecordTabText = lblMedicalRecordTab.getText();
        //return lblOverviewTabText;
        List<String> listGetTab = new ArrayList<String>();
        listGetTab.add(0,lblOverviewTabText);
        listGetTab.add(1,lblHistoryTabText);
        listGetTab.add(2,lblMedicalRecordTabText);
    }


}


