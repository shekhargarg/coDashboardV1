package com.coDashboardV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    WebDriver localdriver;

    public LogoutPage(WebDriver remotedriver) {
        localdriver = remotedriver;
        PageFactory.initElements(remotedriver, this);

    }


    @FindBy(xpath = "//div[@class='name-card-value']")
    WebElement lblDocIni;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-log-out']")
    WebElement lblLogout;


    public void LogoutVerify(){
        boolean blnLogoutTag = false;
        lblDocIni.click();

                if (lblLogout.isDisplayed()) {
                    blnLogoutTag = true;
                    System.out.println("Logout Button is Visible");
                    if (lblLogout.isEnabled()) {
                        System.out.println("Logout Button is Enabled");
                        lblLogout.click();
                        //Verify if Login Screen is Displayed
                    }else {
                        System.out.println("Logout Button is Not Enabled");
                    }
                }else{
                    System.out.println("Logout Button is NOT Visible");
                }

    }
}
