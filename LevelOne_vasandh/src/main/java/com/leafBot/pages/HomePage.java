package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	
	public MyHomePage clickCRMSFA() {
		WebElement eleCRMSFA = locateElement("link", "CRM/SFA");
		click(eleCRMSFA);
		return new MyHomePage();
	}
	
	public LoginPage clickLogout() {
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		return new LoginPage();
	}
	
}









