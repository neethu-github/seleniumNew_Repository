package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	/* R-1 Login Class */
	/* R-2 LoginPage WebElements */
	@FindBy(name="username")
	private WebElement usernameEdit;
	
	@FindBy(name="pwd")
	private WebElement passwordEdit;
	
	@FindBy(id="LoginButton")
	private WebElement LoginBtn;
	
	/* R-3 provide getters method to give read access */

	public WebElement getUsernameEdit() {
		return usernameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	
	/* R=4 provide business lib for every common navigation steps */
	
	public void LogintoApp(String username, String password)
	{
		usernameEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		LoginBtn.click();
	}
}
