package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{


	public ViewLeadPage verifyFirstName(String fname) {
		WebElement eleLeadLink = locateElement("viewLead_firstName_sp");
		verifyPartialText(eleLeadLink, fname);
		return this;
	}

	public EditLeadPage clickEditLeadLink() {		
		WebElement eleedit = locateElement("linktext", "Edit");
		click(eleedit);
		return new EditLeadPage();
	}

	public ViewLeadPage verifyCompanyName(String cName) {
		WebElement eleLeadLink = locateElement("viewLead_companyName_sp");
		verifyPartialText(eleLeadLink, cName);		
		return this;
	}


	public MyLeadsPage clickDeleteLeadLink(){
		WebElement eleDeleteLeadLink = locateElement("link", "Delete");
		click(eleDeleteLeadLink);
		return new MyLeadsPage();
	}
	
	
	public DuplicateLeadPage clickDuplicateLeadLink(){
		WebElement eleDuplicateLeadLink = locateElement("link", "Duplicate Lead");
		click(eleDuplicateLeadLink);
		return new DuplicateLeadPage();
	}
	
	public FindLeadPage clickFindLead(){
		WebElement elefindLead = locateElement("link", "Find Leads");
		click(elefindLead);
		return new FindLeadPage();
	}
}
