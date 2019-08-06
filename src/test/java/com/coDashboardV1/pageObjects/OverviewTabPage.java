package com.coDashboardV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewTabPage {

    WebDriver localdriver;
    public OverviewTabPage(WebDriver remotedriver){
        localdriver=remotedriver;
        PageFactory.initElements(remotedriver,this);

    }
    @FindBy(xpath = "//a[@id='Overview']")
    WebElement lblTabOverview;

    @FindBy(xpath = "//div[contains(text(),'4 Aug 2019')]")
    WebElement lblOverViewDate;

    @FindBy(xpath = "//span[@id='Average Heart Rate']")
    WebElement lblAvgHR;

    @FindBy(xpath = "//span[@id='Steps']")
    WebElement  lblSteps;

    @FindBy(xpath = "//span[@id='Distance']")
    WebElement lblDistance ;

    @FindBy(xpath =  "//span[contains(text(),'Average Stride Length']")
    WebElement lblAvgStrLen ;

    @FindBy(xpath = "//span[contains(text(),'Steps Analysis')]")
    WebElement lblStpAnalysis ;

    @FindBy(xpath = "//span[contains(text(),'Discomfort Level')]")
    WebElement lblDisLevel ;

    @FindBy(xpath = "//div[@class='discomfort-overview-wrap']//div[@id='tab1']//span[contains(text(),'Day')]")
    WebElement lblDisDay ;

    @FindBy(xpath = "//div[@class='discomfort-overview-wrap']//div[@id='tab2']//span[contains(text(),'Week')]")
    WebElement lblDisWeek ;

    @FindBy(xpath = "//span[contains(text(),'Speed of Motion')]")
    WebElement lblSpdMotion ;

    @FindBy(xpath = "//span[contains(text(),'Stability of Motion')]")
    WebElement lblStbMotion ;

    @FindBy(xpath = "//div[@class='navigation-bar-option active']")
    WebElement lblActiveTab ;

    //body/app-root/div[@class='mainBody']/app-profile/div/div/div[@class='router-container']/app-overview/div[@class='info-wrap']/div[1]



}
