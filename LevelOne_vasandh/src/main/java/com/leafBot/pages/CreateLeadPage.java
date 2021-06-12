package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{

	public CreateLeadPage enterCompanyName(String data) {
		WebElement eleCompanyName = locateElement("id", "createLeadForm_companyName");
		clearAndType(eleCompanyName, data);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String data) {
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		clearAndType(eleFirstName, data);
		return this;
	}
	public CreateLeadPage enterLastName(String data) {
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		clearAndType(eleLastName, data);
		return this;
	}
	public CreateLeadPage enterEmail(String data) {
		WebElement eleLastName = locateElement("id", "createLeadForm_primaryEmail");
		clearAndType(eleLastName, data);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadSubmit() {
		WebElement eleCreateLead= locateElement("class", "smallSubmit");
		click(eleCreateLead);
		return new ViewLeadPage(); 
	}
	
}









