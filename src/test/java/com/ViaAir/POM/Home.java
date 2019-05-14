package com.ViaAir.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionBase.basefunction;

public class Home extends basefunction {
	public Home() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='BOOK A FLIGHT']")
	private WebElement bookinflight;
	public WebElement getBookinflight() {
		return bookinflight;
	}

}
