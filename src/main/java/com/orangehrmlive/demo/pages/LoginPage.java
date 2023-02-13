package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "username")
    WebElement userNameField;
    @FindBy(name = "password")
    WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @FindBy(xpath = "//div[@class='orangehrm-login-form']")
    WebElement loginPanel;
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement loginPanelText;

    public void enterUserName(String Username){
        sendTextToElement(userNameField,Username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickonLoginButton(){
        clickOnElement(loginButton);
    }
    public String loginPanelForm(){
        return getTextFromElement(loginPanel);
    }
    public String verifyLoginPanelText(){
        return getTextFromElement(loginPanelText);
    }
    public void logintoApplication(String username,String password){
        enterUserName(username);
        enterPassword(password);
        clickonLoginButton();

    }




}

