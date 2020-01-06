package pages;

import baseclass.BaseClassforLeafTap;

public class HomePage extends BaseClassforLeafTap {
	public MyHomePage clickCRMSFA(){
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		return new MyHomePage();
	}
	
}

