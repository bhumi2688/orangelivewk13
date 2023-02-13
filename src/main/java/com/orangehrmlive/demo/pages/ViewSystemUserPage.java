package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ViewSystemUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUserPage.class.getName());


    public ViewSystemUserPage() {
        PageFactory.initElements(driver, this);
    }

    //SYSTEM USER username,user role,employee name,status,reset,search,add
    @FindBy(xpath = "//div[@class='oxd-table-filter-header-title']")
    WebElement systemUserText;
    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[1]//input[@class='oxd-input oxd-input--active']")
    WebElement userNameField;
    @FindBy(xpath = "//div[@class='oxd-table-filter-area']/form/div/div/div[2]/div/div/div/div//div[@class='oxd-select-text-input']")
    WebElement viewUserRollDropDown;
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]")
    WebElement viewAdminDropDown;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameField;
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[4]/div/div[2]")
    WebElement viewStatusDropDown;
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement disableDropDown;
    @FindBy(xpath = "//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Dominic Chase')]")
    WebElement DominicC;
    @FindBy(xpath = "//div[@class='oxd-form-actions']/button[2]")
    WebElement searchButton;
    @FindBy(xpath = "//div[@class='oxd-form-actions']/button[1]")
    WebElement resetButton;
    @FindBy(xpath = "//div[@class='orangehrm-header-container']/button")
    WebElement addButton;
    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/div/button//i[@class='oxd-icon bi-trash-fill oxd-button-icon']")
    WebElement deleteButton;
    @FindBy(xpath = "//div[@class='oxd-table-body']/div[1]/div/div//div/label//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']")
    WebElement checkBoxUser;
    @FindBy(xpath = "//div[@class='orangehrm-modal-footer']/button[2]//i[@class='oxd-icon bi-trash oxd-button-icon']" )
    WebElement deletedmessage;
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[4]/div/div[2]")
    WebElement enViewStatusDropDown;
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]")
    WebElement enableStatus;
    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']")
    WebElement noRecordFound;

    public String verifySystemUserText() {
        return getTextFromElement(systemUserText);
    }

    public void enterUsernameField(String username) {
        sendTextToElement(userNameField, username);
    }

    public void selectViewUserRollDropDown() throws InterruptedException {
        clickOnElement(viewUserRollDropDown);
        Thread.sleep(1000);
        clickOnElement(viewAdminDropDown);
    }

    public void selectViewStatusAddDropDown() throws InterruptedException {
        clickOnElement(viewStatusDropDown);
        Thread.sleep(1000);
        clickOnElement(disableDropDown);
    }
    public  void selectenViewStatusAddDropDown() throws InterruptedException {
        clickOnElement(enViewStatusDropDown);
        Thread.sleep(1000);
        clickOnElement(enableStatus);
    }

    public void enterEmployeeName() throws InterruptedException {
        sendTextToElement(employeeNameField, "D");
        Thread.sleep(3000);
        clickOnElement(DominicC);
    }

    public void clickOnSearchButton() {
        log.info("Click on Search Button" + searchButton.toString());
        clickOnElement(searchButton);
    }

    public void clickOnResetButton() {
        log.info("Clicking on Reset Button" + resetButton.toString());
        clickOnElement(resetButton);
    }

    public void clickOnAddbutton() {
        log.info("Clicking on Add Button" + addButton.toString());
        clickOnElement(addButton);
    }

    public void clickOnDeleteButton() {
        log.info("Clicking on DeleteButton" + deleteButton.toString());
        clickOnElement(deleteButton);
    }
    public void clickOnCheckBox(){
        log.info("Clicking on CheckBox" + checkBoxUser.isSelected());
        clickOnElement(checkBoxUser);
    }
    public void clickOnDeleteMessage(){
        log.info("Clicking on Delete Popup" + deletedmessage.toString());
        clickOnElement(deletedmessage);
    }
    public String verifyNoRecordFound(){
        return getTextFromElement(noRecordFound);
    }


}
