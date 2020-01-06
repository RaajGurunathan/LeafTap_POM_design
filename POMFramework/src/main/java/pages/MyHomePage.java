package pages;

import baseclass.BaseClassforLeafTap;

public class MyHomePage extends BaseClassforLeafTap {
	public MyLeadsPage clickLeads(){
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		return new MyLeadsPage();
	}
	
}

