package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.util.TestBase;

public class LoginPage extends TestBase {
	

	// Page Factory
	
//	@FindBy(id= "ddlUserType")
//	WebElement role;
	
	@FindBy(id = "txtUserName")
	WebElement username;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement login;
	
	@FindBy(css = "a.btnlink.continue")
	WebElement Continue;
	
	@FindBy(css = "button.pushcrew-chrome-style-notification-btn.pushcrew-btn-close")
	WebElement Popup;
	
	
//	Initializing the page object
	
	public LoginPage() {
			PageFactory.initElements(driver, this);
	}
	
//	Action
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String id, String pwd) {
		Select role=new Select(driver.findElement(By.id("ddlUserType")));
		role.selectByVisibleText("Staff");
		username.sendKeys(id);
		password.sendKeys(pwd);
		login.click();
		Continue.click();
		Popup.click();
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
}