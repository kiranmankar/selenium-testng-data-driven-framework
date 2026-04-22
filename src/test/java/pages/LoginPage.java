package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Locators
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");
	By errorMsg = By.xpath("//h3[contains(text(),'Epic sadface')]");
	
	// Actions(Methods)
	
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
	
	public boolean isLoginSuccessfull() {
		return driver.getCurrentUrl().contains("inventory");
	}
	
	public boolean isErrorDisplayed() {
        return driver.findElements(errorMsg).size() > 0;
    }
}
