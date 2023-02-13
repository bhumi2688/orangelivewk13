package com.orangehrmlive.demo.testsuite;


import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class UsersTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    ViewSystemUserPage viewSystemUserPage;
    AddUserPage addUserPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        viewSystemUserPage = new ViewSystemUserPage();
        addUserPage = new AddUserPage();

    }

    @Test(dataProvider = "Credentials", dataProviderClass = TestData.class)
    public void adminShouldAddUserSuccessfully(String username,String password) throws InterruptedException {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickonLoginButton();
        homePage.clickOnAdminTab();
        String actualText = viewSystemUserPage.verifySystemUserText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Text is verified");
        viewSystemUserPage.clickOnAddbutton();
        String actualMsg = addUserPage.verifyAddUserText();
        String expectedMsg = "Add User";
        Assert.assertEquals(actualMsg, expectedMsg, "Text is verified");
        addUserPage.selectaddUserRollDropDown();
        addUserPage.enterEmployeeName();
        addUserPage.selectStatusAddDropDown();
        addUserPage.enterUsername("Dominicc");
        addUserPage.enterPassword("DominicC123@");
        addUserPage.enterConfirmPassword("DominicC123@");
        addUserPage.clickOnSaveButton();
        //verify message successfully saved
    }
            @Test(dataProvider = "Credentials", dataProviderClass = TestData.class)
            public void searchTheUserCreatedItandVerifyIt(String username,String password) throws InterruptedException {
                loginPage.enterUserName(username);
                loginPage.enterPassword(password);
                loginPage.clickonLoginButton();
                homePage.clickOnAdminTab();
                String actualText = viewSystemUserPage.verifySystemUserText();
                String expectedText = "System Users";
                Assert.assertEquals(actualText, expectedText, "Text is verified");
                viewSystemUserPage.enterUsernameField("KrishM");
                viewSystemUserPage.selectViewUserRollDropDown();
                viewSystemUserPage.enterUsernameField("K");
                viewSystemUserPage.selectViewStatusAddDropDown();
                viewSystemUserPage.clickOnSearchButton();
                //verify result

            }
    @Test(dataProvider = "Credentials", dataProviderClass = TestData.class)
    public void verifyThatAdminShouldDeleteTheUserSuccessfully(String username,String password) throws InterruptedException {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickonLoginButton();
        homePage.clickOnAdminTab();
        String actualText = viewSystemUserPage.verifySystemUserText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Text is verified");
        viewSystemUserPage.enterUsernameField("ivasile");
        viewSystemUserPage.selectViewUserRollDropDown();
        viewSystemUserPage.selectenViewStatusAddDropDown();
        viewSystemUserPage.clickOnSearchButton();
        // verifyResultList();
        viewSystemUserPage.clickOnCheckBox();
        viewSystemUserPage.clickOnDeleteButton();
        viewSystemUserPage.clickOnDeleteMessage();
        viewSystemUserPage.verifyNoRecordFound();
    }
    @Test(dataProvider = "Credentials", dataProviderClass = TestData.class)
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(String username,String password) throws InterruptedException {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickonLoginButton();
        homePage.clickOnAdminTab();
        String actualText = viewSystemUserPage.verifySystemUserText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Text is verified");
        viewSystemUserPage.enterUsernameField("Admin1");
        viewSystemUserPage.selectViewUserRollDropDown();
        viewSystemUserPage.selectenViewStatusAddDropDown();
        viewSystemUserPage.clickOnSearchButton();
        String actualText1= viewSystemUserPage.verifyNoRecordFound();
        String expectedText1 = "No Records Found";
        Assert.assertEquals(actualText1,expectedText1,"Text is verified");


    }


    }


