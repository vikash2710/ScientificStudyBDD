package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "(//button[@type='button'])[9]")
	WebElement logoutmenu;
	
	@FindBy(id = "page_logout")
	WebElement logout;
	
	@FindBy(id = "btn_/academics")
	WebElement academicbutton;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		}
	
	public String ValidateHomePageTitle() {
		return driver.getTitle();
		}
	
	public LoginPage logout() throws Throwable {
		logoutmenu.click();
		Thread.sleep(2000);
		logout.click();
		return new LoginPage();
	}
	
	public void scrollto() {
		((JavascriptExecutor)driver).executeScript("scroll(0,600)");
	}
	
	public AcademicPage clickonacademics() {
		academicbutton.click();
		return new AcademicPage();
	}
}
