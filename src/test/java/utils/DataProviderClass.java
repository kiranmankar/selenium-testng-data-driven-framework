package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "loginData")
	public static Object[][] getLoginData(){
		return new Object[][] {
			{"standard_user", "secret_sauce", "success"},
			{"standard_user", "wrong_pass", "failure"},
			{"", "", "failure"}
		};
	}

}
