package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());


    public AdminPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='oxd-topbar-body']/nav/ul/li[1]")
    WebElement userManagementTab;
    @FindBy(xpath = "//div[@class='oxd-topbar-body']/nav/ul/li[2]")
    WebElement jobTab;
    @FindBy(xpath = "//div[@class='oxd-topbar-body']/nav/ul/li[3]")
    WebElement organizationTab;

    public void userManagementDropDownTab(String user){
        selectByVisibleTextFromDropDown(userManagementTab,user);
    }
    public void jobDropDownTab(String job){
        selectByVisibleTextFromDropDown(jobTab,job);
    }
    public void organizationDropDown(String org){
        selectByVisibleTextFromDropDown(organizationTab,org);

    }


}
