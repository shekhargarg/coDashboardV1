package com.coDashboardV1.pageObjects;

import com.coDashboardV1.testCases.commonFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends commonFunction {

    WebDriver localdriver;
    String expHeader, expUserName, expPassword, expSignIn, expRememberme, expindividuallogin;

    public LoginPage(WebDriver remotedriver) {
        localdriver = remotedriver;
        PageFactory.initElements(remotedriver, this);
        expHeader = "Sign in to ConnectedLife";
        expUserName = "Username";
        expPassword = "Password";
        expSignIn = "Sign In";
        expRememberme = "Remember me";
        expindividuallogin = "Sign In with Individual Account";
    }


    @FindBy(xpath = "//h3[contains(text(),'Sign in to ConnectedLife')]")
    WebElement lblLoginHeader;

    @FindBy(xpath = "//span[contains(text(),'Username')]")
    WebElement lblUserName;

    @FindBy(xpath = "//div[@class='login-form']//div[1]//label[1]//input[1]")
    WebElement objUserNameWebEdit;

    @FindBy(xpath = "//div[@class='divisions']//div[2]//label[1]//input[1]")
    WebElement objPasswordWebEdit;

    @FindBy(xpath = "//span[contains(text(),'Password')]")
    WebElement lblPassword;

    @FindBy(xpath = "//input[@value='Sign In']")
    WebElement objSubmitBtn;

    @FindBy(xpath = "//span[contains(text(),'Remember me')]")
    WebElement lblRememberme;

    @FindBy(xpath = "//label[@class='user-option']//input")
    WebElement objRemembermechkbx;

    @FindBy(xpath = "//a[@class='individual-login']")
    WebElement objSignInWithAnotherUserLnk;


    public void loginPageLayout() {
        boolean blnHeaderVerify = false;
        boolean blnRemembermehkBx = false;
        boolean blnLoginWebedit = false;
        boolean blnPasswordWebedit = false;
        boolean blnSignInBtn = false;
        boolean blnIndividualSignIn = false;

        blnHeaderVerify = lblLoginHeader.isDisplayed();
        if (blnHeaderVerify) {
            output("Login Header is Displayed");
            if (lblLoginHeader.getText().equalsIgnoreCase(expHeader)) {
                output("The Header Text is Verified and Correct:: " + lblLoginHeader.getText());
            } else {
                output("The Header Text is Incorrect " + lblLoginHeader.getText());
            }
        } else {
            output("Login Header is NOT Displayed");
        }

        blnLoginWebedit = objUserNameWebEdit.isDisplayed();
        if (blnLoginWebedit) {
            output("The UserId Field is Displayed");
            if (objUserNameWebEdit.isEnabled()) {
                output("The UserID Field is Enabled and ready to use");
            } else {
                output("The UserID field id Disabled");
            }
        } else {
            output("The UserID Field is NOT Displayed");
        }

        blnPasswordWebedit = objPasswordWebEdit.isDisplayed();
        if (blnPasswordWebedit) {
            output("The Password Field is Displayed");
            if (objPasswordWebEdit.isEnabled()) {
                output("The Password Field is Enabled and ready to use");
            } else {
                output("The Password field id Disabled");
            }
        } else {
            output("The Password Field is NOT Displayed");
        }

        blnSignInBtn = objSubmitBtn.isDisplayed();
        if (blnSignInBtn) {
            output("The Sign In button is Displayed");
            if (objSubmitBtn.isEnabled()) {
                output("The Sign In button is Enabled and ready to use");
            } else {
                output("The Sign In button is Disabled");
            }
        } else {
            output("The Sign In button is NOT Displayed");
        }


    }

    public void siginBtnEnable() {
        boolean blnSignInBtn = false;
        blnSignInBtn = objSubmitBtn.isDisplayed();
        if (blnSignInBtn) {
            output("The Sign In button is Displayed");
            if (objSubmitBtn.isEnabled()) {
                output("The Sign In button is Enabled and ready to use");
            } else {
                output("The Sign In button is Disabled");
            }
        } else {
            output("The Sign In button is NOT Displayed");
        }


    }

    public void loginDoctor() {
        output("Login initiated");
        objUserNameWebEdit.sendKeys("admin");
        objPasswordWebEdit.sendKeys("admin");
        objSubmitBtn.click();
    }

    public void loginIndividual() {

    }

}
