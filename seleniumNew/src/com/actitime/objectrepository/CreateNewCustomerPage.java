package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomerPage {
	@FindBy(id="CustomerLightBox_nameField")
	private WebElement customerNameEdit1;

	@FindBy(id="CustomerLightBox_descriptionField")
	private WebElement customerdescriptionEdit;

	@FindBy(id="CustomerLightBox_commitField")
	private WebElement CreateCustomerBtn;
	
	public void CreateCustomerNewCustomer(String customerName)
	{
		customerNameEdit1.sendKeys(customerName);
		CreateCustomerBtn.click();	
	}
	
	public void CreateCustomerNewCustomer(String customerName,String description)
	{
		customerNameEdit1.sendKeys(customerName);
		customerdescriptionEdit.sendKeys(description);
		CreateCustomerBtn.click();
	}
}
