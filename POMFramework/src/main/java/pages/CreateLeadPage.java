package pages;

import baseclass.BaseClassforLeafTap;

public class CreateLeadPage extends BaseClassforLeafTap {
	public CreateLeadPage enterCompanyName(String cName){
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys(cName);
		return this;
	}
	public CreateLeadPage enterFirstName(String fName){
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys(fName);
		return this;
	}
	public CreateLeadPage enterLastName(String lName){
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys(lName);
		return this;
	}
	public ViewLeadPage clickCreateLead(){
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		return new ViewLeadPage();
	}
	
}

