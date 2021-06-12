package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{

	
	public MyLeadsPage clickLeadLink() {
		WebElement eleLeads = locateElement("link", "Leads");
		click(eleLeads);
		return new MyLeadsPage();
	}
	
}









