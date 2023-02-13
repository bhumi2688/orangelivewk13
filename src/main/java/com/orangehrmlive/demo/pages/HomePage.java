package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='oxd-brand-banner']/img")
    WebElement orangeHRMLogo;
    @FindBy(xpath = "//nav[@class='oxd-navbar-nav']/div[2]/ul/li[1]")
    WebElement adminTab;
    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[2]")
    WebElement pimSideTab;
    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[3]")
    WebElement leaveSideTab;
    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul/li[8]" )
    WebElement dashBoardSideTab;
    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
    WebElement welcomeTextMsg;

    @FindBy(xpath = "//div[@class='oxd-topbar-header']/div[2]/ul/li/span")
    WebElement userProfileLogo;
    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    WebElement homeDropDownicon;
    @FindBy(xpath = "//li[@class='--active oxd-userdropdown']/ul/li[4]")
    WebElement clickLogout;

    public String verifyorangeHRMLogo() {
        return getTextFromElement(orangeHRMLogo);
    }
    public void clickOnAdminTab(){
        clickOnElement(adminTab);
        log.info("Click on Admin Tab" +adminTab.toString());
    }
    public void clickOnPimTab (){
        clickOnElement(pimSideTab);
        log.info("Click on PimTab" +pimSideTab.toString());

    }
    public void clickOnleaveTab(){
        clickOnElement(leaveSideTab);
        log.info("Click on LeaveTab" + leaveSideTab.toString());

    }
    public void clickOndashboardTab(){
        clickOnElement(dashBoardSideTab);
        log.info("Click on DashboarTab" + dashBoardSideTab.toString());

    }
    public String verifyWelcomeText(){
        return getTextFromElement(welcomeTextMsg);
    }
    public String verifyUserProfileLogo(){
        return getTextFromElement(userProfileLogo);
    }
    public void clickOnHomeDropDown(){
        clickOnElement(homeDropDownicon);
        log.info("Clicking on HomeDropDown" + homeDropDownicon.toString());
    }
    public void clickOnLogOut(){
        clickOnElement(clickLogout);
        log.info("Click on logout" + clickLogout.toString());
    }

}
