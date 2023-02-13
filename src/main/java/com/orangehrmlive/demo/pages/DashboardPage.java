package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());


    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
    WebElement dashBoardText;

    public String verifyDashBoardText(){
        return getTextFromElement(dashBoardText);
    }



}
