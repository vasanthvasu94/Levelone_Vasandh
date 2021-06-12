package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods{



	public FindLeadPage enterFirstName(String data) {
		WebElement eleFirstName = locateElement("xpath", "((//input[@name='firstName'])[3])");
		clearAndType(eleFirstName, data);
		return this;
	}

	public FindLeadPage clickFindleadsButton() {
		WebElement eleearchLeads = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleearchLeads);
		waits(3);
		return this;
	}

	public ViewLeadPage clickFirstResultingLead() {
		WebElement eleresult = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		click(eleresult);
		return new ViewLeadPage();
	}


	public FindLeadPage clickPhoneTab(){
		WebElement elePhoneTab = locateElement("xpath", "//span[text()='Phone']");
		click(elePhoneTab);
		return this;
	}

	public FindLeadPage clickEmailTab(){
		WebElement eleEmailTab = locateElement("xpath", "//span[text()='Email']");
		click(eleEmailTab);
		return this;
	}


	public FindLeadPage enterPhoneNumberField(String PhoneNumber){
		WebElement elePhoneNumberField = locateElement("name", "phoneNumber");
		clearAndType(elePhoneNumberField, PhoneNumber);
		return this;
	}


	public FindLeadPage enterEmailAddress(String emailAddress){
		WebElement eleEmailAddress = locateElement("name", "emailAddress");
		clearAndType(eleEmailAddress, emailAddress);
		return this;
	}


	public FindLeadPage verifyErrorMsg(String eleErrorMsgValue){
		WebElement eleErrorMsg = locateElement("class", "x-paging-info");
		verifyPartialText(eleErrorMsg, eleErrorMsgValue);
		return this;
	}

	public String getFirstResultingLead(){	
		WebElement eleGetResultingLeads = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return 	getElementText(eleGetResultingLeads);
	}

	public String getFirstResultingFirstName() throws InterruptedException{	
		WebElement eleGetResultingFName = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		Thread.sleep(1000);
		return 	getElementText(eleGetResultingFName);
	}
	
	public FindLeadPage enterLeadId(String findfistname){
		WebElement eleLeadId = locateElement("name", "id");
		clearAndType(eleLeadId, findfistname);
		return this;

	}

}









