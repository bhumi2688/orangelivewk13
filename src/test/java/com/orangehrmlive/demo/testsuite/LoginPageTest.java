package com.orangehrmlive.demo.testsuite;


import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();

    }
    @Test(dataProvider = "Credentials", dataProviderClass = TestData.class)
    public void verifyUserShouldLoginSuccessfully(String username,String password){
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickonLoginButton();
        String actualMsg = homePage.verifyWelcomeText();
        String expectedMsg = "Dashboard";
        Assert.assertEquals(actualMsg,expectedMsg,"Text is verified");
    }
    @Test(dataProvider = "Credentials", dataProviderClass = TestData.class)
    public void verifyLogoDisplayOnHomePage(String username,String password){
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickonLoginButton();
        String actualMsg = homePage.verifyWelcomeText();
        String expectedMsg = "Dashboard";
        Assert.assertEquals(actualMsg,expectedMsg,"Text is verified");
        homePage.verifyorangeHRMLogo();
    }
    @Test(dataProvider = "Credentials", dataProviderClass = TestData.class)
    public void verifyUserShouldLogOutSuccessfully(String username,String password){
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickonLoginButton();
        homePage.verifyUserProfileLogo();
        homePage.clickOnHomeDropDown();
        homePage.clickOnLogOut();
        String actualMsg1 = loginPage.verifyLoginPanelText();
        String expectedMsg1 = "Login";
        Assert.assertEquals(actualMsg1,expectedMsg1,"Text is verified");


    }


    }



