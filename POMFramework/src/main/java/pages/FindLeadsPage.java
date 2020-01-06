package pages;

import baseclass.BaseClassforLeafTap;

public class FindLeadsPage extends BaseClassforLeafTap {
	public FindLeadsPage enterFirstName(String fName){
		driver.findElementByXPath("//div[@id='center-content-column']//following::input[@name='firstName']").sendKeys(fName);
		return this;
	}
	public FindLeadsPage searchLeads() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}
	public ViewLeadPage clickFirstName(String fName) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr//following::div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[text()='"+fName+"']").click();
		return new ViewLeadPage();
	}
	public FindLeadsPage clickEmail() {
		driver.findElementByXPath("//span[text()='Email']").click();
		return this;
	}
	public FindLeadsPage enterEmail(String eMail){
		driver.findElementByXPath("//input[@name='emailAddress' ]").sendKeys(eMail);
		return this;
	}
	public FindLeadsPage checkDeleted() throws InterruptedException {
		Thread.sleep(2000);
		String checkDel = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(checkDel.equals("No records to display")) {
			System.out.println("Lead is Deleted Successfully");
		}
		else {
			System.out.println("Lead is not Deleted");
		}
		return this;
	}
	
	
}

