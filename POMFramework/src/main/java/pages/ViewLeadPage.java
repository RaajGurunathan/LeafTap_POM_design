package pages;

import org.openqa.selenium.WebElement;

import baseclass.BaseClassforLeafTap;

public class ViewLeadPage extends BaseClassforLeafTap {
	public ViewLeadPage checkFirstName(String fName){
		String checkFname = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		if(checkFname.contains(fName)) {
			System.out.println("Lead is Created Successfully");
		}
		else
		{
			System.out.println("Lead is not created");
		}
		return this;
	}
	public OpentapsCRMPage clickEdit() {
		driver.findElementByXPath("//a[text()='Edit']").click();
		return new OpentapsCRMPage();
	}
	public ViewLeadPage checkComapanyName(String cName) {
		String newCName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		String replacedString = newCName.replaceAll("[(\\d)]", "");
		String trimSpace = replacedString.trim();
		if(trimSpace.equals(cName)) {
			System.out.println("The Company Name is updated successfully");
		}
		else {
			System.out.println("The Company Name is not updated");
		}
		return this;
	}
	public DuplicateLeadPage clickDuplicateLead() {
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		return new DuplicateLeadPage();
	}
	public ViewLeadPage checkEmail(String nEmail) {
		String checkEmail = driver.findElementByXPath("//div[@class='tabletext']//following::a[text()='"+nEmail+"']").getText();
		if(checkEmail.contains("")) {
			System.out.println("Duplicate Lead is Created Successfully");
		}
		else{
			System.out.println("Duplicate Lead us not created");
		} 
		return this;
	}
	public MyLeadsPage deleteLead() {
		driver.findElementByXPath("//a[text()='Delete']").click();
		return new MyLeadsPage();
	}
}
