package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.util.TestBase;

public class LoginPage extends TestBase {
	

	// Page Factory
	
	@FindBy(id= "ddlUserType")
	WebElement type;
	
	@FindBy(id = "txtUserName")
	WebElement username;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement login;
	
	@FindBy(xpath = "//a[@class='btnlink continue']")
	WebElement Continue;
	
	@FindBy(xpath = "//button[@class='pushcrew-chrome-style-notification-btn pushcrew-btn-close']")
	WebElement Popup;
	
	@FindBy(linkText ="Request here")
	WebElement SMS;
	
//	@FindBy(xpath = "//a[contains(text(),'Request here')]")

	
	
//	Initializing the page object
	
	public LoginPage() {
			PageFactory.initElements(driver, this);
	}
	
//	Action
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String role, String id, String pwd) throws Throwable {
		Select select=new Select(type);
		select.selectByVisibleText(role);
		username.sendKeys(id);
		password.sendKeys(pwd);
		login.click();
//		Continue.click();
		Thread.sleep(3000);
//		Popup.click();
		SMS.click();
		Thread.sleep(3000);
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
}
