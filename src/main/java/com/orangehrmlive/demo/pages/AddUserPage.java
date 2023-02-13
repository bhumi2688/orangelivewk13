package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());


    public AddUserPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement addUserRollDropDown;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;
   // @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[4]")
    //WebElement userName;
   // @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[1]//input[@class='oxd-input oxd-input--active']")
    //WebElement userName;
    @FindBy(xpath = "//div[@class='oxd-form-row']/div/div[4]/div/div[2]")
    WebElement userName;

    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[3]/div/div[2]/div/div")
    WebElement addStatusDropDown;
    @FindBy(xpath = "//div[@class='oxd-form-row user-password-row']/div[1]/div[1]/div[1]/div[2]/input")
    WebElement passwordField;
    @FindBy(xpath = "//div[@class='oxd-form-row user-password-row']/div[1]/div[2]/div[1]/div[2]/input")
    WebElement confirmPassword;
    @FindBy(xpath = "//div[@class='oxd-form-actions']/button[2]")
    WebElement saveButton;
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form/div[3]/button[1]")
    WebElement cancelButton;
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/h6")
    WebElement addUserText;
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]")
    WebElement addAdminDropDown;
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement disableDropDown;
    @FindBy(xpath = "//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Dominic Chase')]")
    WebElement Dominic;

    public void selectaddUserRollDropDown() throws InterruptedException {
        clickOnElement(addUserRollDropDown);
        Thread.sleep(1000);
        clickOnElement(addAdminDropDown);
    }

    public void enterEmployeeName() throws InterruptedException {
        sendTextToElement(employeeName,"D");
        Thread.sleep(3000);
        clickOnElement(Dominic);
    }
    public void enterUsername(String UserName){
        sendTextToElement(userName,UserName);
    }
    public void selectStatusAddDropDown() throws InterruptedException {
        clickOnElement(addStatusDropDown);
        Thread.sleep(1000);
        clickOnElement(disableDropDown);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String confirmpassword){
        sendTextToElement(confirmPassword,confirmpassword);
    }
    public void clickOnSaveButton(){
        log.info("Clicking on Save Button" + saveButton.toString());
        clickOnElement(saveButton);
    }
    public void clickOnCancelButton(){
        log.info("Clicking on Cancel Button" + cancelButton.toString());
        clickOnElement(cancelButton);
    }
    public String verifyAddUserText(){
        return getTextFromElement(addUserText);
    }





}
