package pages;

import baseclass.BaseClassforLeafTap;

public class MyLeadsPage extends BaseClassforLeafTap {
	public CreateLeadPage clickCreateLead(){
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		return new CreateLeadPage();
	}
	public FindLeadsPage clickFindLeads(){
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		return new FindLeadsPage();
	}	
}

