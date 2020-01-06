package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClassforLeafTap;
import pages.HomePage;
import pages.LoginPage;

public class TC002_EditLead extends BaseClassforLeafTap{
	
	@BeforeClass
	public void setData() {
		FileName = "EditLead";
	}
	@Test(dataProvider = "getData", priority = 2)
	public void editLead(String uName, String uPassword, String fName, String cName) throws InterruptedException {
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
		.clickEdit()
		.clearCompanyName()
		.enterNewCompanyName(cName)
		.clickUpdate()
		.checkComapanyName(cName);

		
	}
}
