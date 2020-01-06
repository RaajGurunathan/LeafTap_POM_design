package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClassforLeafTap;
import pages.HomePage;
import pages.LoginPage;

public class TC001_CreateLead extends BaseClassforLeafTap{
	
	@BeforeClass
	public void setData() {
		FileName = "CreateLead";
	}
	@Test(dataProvider = "getData", priority = 1)
	public void createLead(String uName, String uPassword, String cName, String fName, String lName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(uPassword)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLead()
		.checkFirstName(fName);
	}
}
