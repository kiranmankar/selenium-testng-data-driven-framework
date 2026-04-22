package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.DataProviderClass;

public class LoginTest extends BaseTest {
	
	@Test(dataProvider = "loginData", dataProviderClass = DataProviderClass.class)
	public void loginTest(String username, String password, String expectedResult) {
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		
		if(expectedResult.equals("success")) {
			Assert.assertTrue(loginPage.isLoginSuccessfull());
		} else {
			Assert.assertTrue(loginPage.isErrorDisplayed());
		}
	}

}
