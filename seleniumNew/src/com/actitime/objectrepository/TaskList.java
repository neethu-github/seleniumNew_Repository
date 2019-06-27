package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskList {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	
	@FindBy(xpath="//div[@class='naviagationLinks']/following-sibling::div[1]")
	private WebElement customerNameDetails;


	public WebElement getCustomerNameDetails() {
		return customerNameDetails;
	}
	
	public void navigateToCreateNewCustomerPage()
	{
		addNewBtn.click();
		newCustomerBtn.click();
	}

}
