package pages;

import baseclass.BaseClassforLeafTap;

public class LoginPage extends BaseClassforLeafTap {
	
	public LoginPage enterUserName(String uName) {
		driver.findElementByXPath("//input[@id='username']").sendKeys(uName);
		return this;
	}
	public LoginPage enterPassword(String uPassword) {
		driver.findElementByXPath("//input[@id='password']").sendKeys(uPassword);
		return this;
	}
	public HomePage clickLoginButton() {
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		return new HomePage();
	}
	
}

