package com.coDashboardV1.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientsListPage  {

    WebDriver localdriver;

    public PatientsListPage(WebDriver remotedriver){
        localdriver=remotedriver;
        PageFactory.initElements(remotedriver,this);
    }

    @FindBy(xpath = "//div[@class='title']")
    WebElement lblPatientListHearder;

    @FindBy(xpath = "//div[@class='total-users']")
    WebElement lblPatientCount;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement editSearch;

    @FindBy(xpath = "//i[@class='anticon anticon-left']")
    WebElement btnLeftPagination;

    @FindBy(xpath = "//i[@class='anticon anticon-right']")
    WebElement btnRightPagination;

    @FindBy(xpath="//tbody[@class='ant-table-tbody']//*")
    WebElement patListTable;

    @FindBy(xpath = "//div[@class='name-card-value']")
    WebElement lblDocIni;

    @FindBy(xpath = "//div[@class='table-wrap']//table//tbody//*[1]")
    WebElement patRow1;

    public Integer totalPatCount;

    public String getPatientHeader(){
        String lblPatPgHeader = lblPatientListHearder.getText();
        System.out.println(lblPatPgHeader);
        return lblPatPgHeader;
    }

    public Integer getPatientCount(){
        String lblPatCount = lblPatientCount.getText();
        lblPatCount = lblPatCount.split("Showing")[0];
        String lblPatCount1 = lblPatCount.split("Members")[1];
        Integer totalPatCount = Integer.valueOf(lblPatCount1.trim());

        System.out.println("Total Patient Count before Search::"+lblPatCount);
        return totalPatCount;
    }

    public void searchPatient(String patientNme) {
        editSearch.sendKeys(patientNme);
        Integer totalPatCount1 = getPatientCount();

        System.out.println("Final Patient Count After Search::" + totalPatCount1);

        if (totalPatCount1 == 1) {
            System.out.println("Search filter passes");
            } else if (totalPatCount1==0) {
                 System.out.println("No Such User");
            } else if (totalPatCount1>1) {
                 System.out.println("Fails");
            }
        System.out.println("Info to be clicked::"+patRow1.getText());
        //String patientName = patRow1.getText().split(" ")[0];
        patRow1.findElement(By.xpath("//a[contains(text(),'2YRQCN')]")).click();
      //  patRow1.findElement(By.xpath("//a[contains(text(),"+patientNme)).click();
        }
}
