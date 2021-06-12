package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{

	
	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	public FindLeadPage clickFindLead() {
		WebElement eleFindLeads = locateElement("link", "Find Leads");
		click(eleFindLeads);
		return new FindLeadPage();
	}
	
	
	public MyLeadsPage enterLeadId(String findfistname){
		WebElement eleLeadId = locateElement("name", "id");
		clearAndType(eleLeadId, findfistname);
		return this;
	}	
	
	public MergeLeadPage clickMergeLead(){
		WebElement elemergeLead = locateElement("link", "Merge Leads");
		click(elemergeLead);		
		return new MergeLeadPage();
	}
	
	
	
}









