package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClassforLeafTap;
import pages.HomePage;
import pages.LoginPage;

public class TC004_DeleteLead extends BaseClassforLeafTap{
	
	@BeforeClass
	public void setData() {
		FileName = "DeleteLead";
	}
	@Test(dataProvider = "getData", priority = 4)
	public void deleteLead(String uName, String uPassword, String fName, String eMail) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(uPassword)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickEmail()
		.enterEmail(eMail)
		.searchLeads()
		.clickFirstName(fName)
		.deleteLead()
		.clickFindLeads()
		.clickEmail()
		.enterEmail(eMail)
		.searchLeads()
		.checkDeleted();
	}
}
