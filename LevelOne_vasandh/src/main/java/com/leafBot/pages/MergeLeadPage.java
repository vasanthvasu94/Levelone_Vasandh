package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class MergeLeadPage extends ProjectSpecificMethods {


	public FindLeadPopPage clickFromLeadLookup(){
		WebElement eleFromLeadLookup = locateElement("xpath", "(//img[@alt='Lookup'])[1]");
		clickWithNoSnap(eleFromLeadLookup);
		switchToWindow(1);
		return new FindLeadPopPage();		
	}

	public FindLeadPopPage clickToLeadLookup(){
		WebElement eleToLeadLookup = locateElement("xpath", "(//img[@alt='Lookup'])[2]");
		clickWithNoSnap(eleToLeadLookup);
		switchToWindow(1);
		return new FindLeadPopPage();		
	}

	public ViewLeadPage clickMergeButton(){
		WebElement eleclickMergeButton = locateElement("link", "Merge");
		clickWithNoSnap(eleclickMergeButton);
		acceptAlert();
		return new ViewLeadPage();
	}
}