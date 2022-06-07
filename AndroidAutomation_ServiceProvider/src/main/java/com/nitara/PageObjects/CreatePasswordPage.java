package com.nitara.PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreatePasswordPage extends BasePage {
	
	@AndroidFindBy(id = "createPinEt") 
	private MobileElement createPin;
	
	@AndroidFindBy(id = "reEnterPinEt") 
	private MobileElement reEnterPin;
	
	@AndroidFindBy(id = "savePin") 
	private MobileElement savePin;
	
	@AndroidFindBy(id = "snackbar_text")
	private MobileElement warning_msg;
	
	public void enter_createPin(int pin) {
		//waitForPageLoad();
		sendKeys(createPin, pin);
	}
	
	public void enter_reEnterPin(int pin) {
		//waitForPageLoad();
		sendKeys(reEnterPin, pin);
	}
	
	public void click_savePin() {
		click(savePin);
	}
	
	public void assertWarningMsg(String msg) {
		waitVisibility(warning_msg);
		Assert.assertEquals(warning_msg.getText(),msg);
	}



}
