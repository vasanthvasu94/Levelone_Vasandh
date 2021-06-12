package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {

	public EditLeadPage updateCompanyName(String data) {
		WebElement elecompany = locateElement("xpath", "//input[@id='updateLeadForm_companyName']");
		clearAndType(elecompany, data);
		return this;
	}

	public ViewLeadPage clickUpdateSubmit() {
		WebElement eleupdate = locateElement("name", "submitButton");
		click(eleupdate);
		return new ViewLeadPage();
	}

}
