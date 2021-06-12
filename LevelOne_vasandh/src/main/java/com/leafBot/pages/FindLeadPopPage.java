package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class FindLeadPopPage extends ProjectSpecificMethods {


	public FindLeadPopPage enterFirstName(String findfistname){
		WebElement elefindFirstName = locateElement("name", "firstName");
		clearAndType(elefindFirstName, findfistname);
		return this;
	}

	public FindLeadPopPage clickFindleadsButton(){
		WebElement eleFindleadsButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindleadsButton);
		return this;
	}
	
	public String getFirstResultingLead(){	
		WebElement eleGetResultingLeads = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		return getElementText(eleGetResultingLeads);
	}

	public MergeLeadPage clickResultingLeads(){
		WebElement eleResultingLeads = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickWithNoSnap(eleResultingLeads);
		switchToWindow(0);
		return new MergeLeadPage();
	}
}