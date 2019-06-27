package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//div[text()='TASKS')")
    private WebElement taskImg;
	
	@FindBy(xpath="//div[text()='USERS')")
    private WebElement userImg;
	
	@FindBy(xpath="//a(@id='LogoutLink']")
    private WebElement LogoutLink;
	
	
	public void navigateToTaskPage1()
	{
		taskImg.click();
	}
	
	public void navigateToUserPage()
	{
		userImg.click();
	}
	
	public void logout()
	{
		LogoutLink.click();
	}
	
	
	
}


