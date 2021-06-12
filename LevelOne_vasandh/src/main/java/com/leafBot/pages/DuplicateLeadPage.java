package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class DuplicateLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage clickCreateLeadDublicate(){
		WebElement eleCreateLeadDublicate = locateElement("class", "smallSubmit");
		click(eleCreateLeadDublicate);
		return new ViewLeadPage();
	}
}
