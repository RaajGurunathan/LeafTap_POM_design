package pages;

import baseclass.BaseClassforLeafTap;

public class DuplicateLeadPage extends BaseClassforLeafTap {
	
	public DuplicateLeadPage clearEmail() {
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").clear();
		return this;
	}
	public DuplicateLeadPage enterNewEmail(String newEmail) {
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys(newEmail);
		return this;
	}
	public ViewLeadPage clickDuplicateLead(){
		driver.findElementByXPath("//form[@name='createLeadForm']//input[@name='submitButton']").click();
		return new ViewLeadPage();
	}
	
}

