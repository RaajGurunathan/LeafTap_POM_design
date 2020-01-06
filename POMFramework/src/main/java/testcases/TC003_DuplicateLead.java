package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClassforLeafTap;
import pages.HomePage;
import pages.LoginPage;

public class TC003_DuplicateLead extends BaseClassforLeafTap{
	
	@BeforeClass
	public void setData() {
		FileName = "DuplicateLead";
	}
	@Test(dataProvider = "getData", priority = 3)
	public void duplicateLead(String uName, String uPassword, String fName, String eMail) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(uPassword)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(fName)
		.searchLeads()
		.clickFirstName(fName)
		.clickDuplicateLead()
		.clearEmail()
		.enterNewEmail(eMail)
		.clickDuplicateLead()
		.checkEmail(eMail);
	}
}
