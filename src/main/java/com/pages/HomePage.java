package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class HomePage extends TestBase{
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		}
	
	public String ValidateHomePageTitle() {
		return driver.getTitle();

		}
}
