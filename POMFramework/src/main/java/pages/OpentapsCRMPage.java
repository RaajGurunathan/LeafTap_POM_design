package pages;

import baseclass.BaseClassforLeafTap;

public class OpentapsCRMPage extends BaseClassforLeafTap {
	public OpentapsCRMPage clearCompanyName(){
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		return this;
	}
	public OpentapsCRMPage enterNewCompanyName(String cName){
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys(cName);
		return this;
	}
	public ViewLeadPage clickUpdate(){
		driver.findElementByXPath("//form[@name='updateLeadForm']//input[@name='submitButton']").click();
		return new ViewLeadPage();
	}
	
	
}

