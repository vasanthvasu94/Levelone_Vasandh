package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	public LoginPage enterUserName(String data) {
		WebElement eleUserName = locateElement("id", "username");
		clearAndType(eleUserName, data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		WebElement elePassword = locateElement("id", "password");
		clearAndType(elePassword, data);
		return this;
	}
	
	public HomePage clickLogin() {
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		return new HomePage();
	}
	
	public LoginPage clickLogInForFailer() {
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		return this;
	}
	
		
	public LoginPage verifyErrorMsg(String data) {
		WebElement eleVerifyErrMsg = locateElement("id", "errorDiv");
		verifyPartialText(eleVerifyErrMsg, data);
		return this;
	}
	
}









