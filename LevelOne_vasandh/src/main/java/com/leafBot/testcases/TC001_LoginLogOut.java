package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_LoginLogOut extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Login and LoginOut";
		testCaseDescription = "Login testCase using valid credentials and LogOut";
		category = "Smoke";
		dataSheetName = "TC001";		
	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String uName, String pwd) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()		
		.clickLogout();
	}
}





