	package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.util.TestBase;

public class AcademicPage extends TestBase {
	
	
	@FindBy(css = "div.btn-group > button.btn.btn-primary")
	WebElement EnterMarks;
	
	@FindBy(css = "button.btn.btn-info")
	WebElement AcademicAction;
	
	@FindBy(xpath = "(//button[@type='button'])[15]")
	WebElement Masters;
	
	@FindBy(xpath = "(//button[@type='button'])[17]")
	WebElement Reports;
	
	@FindBy(xpath = "(//button[@type='button'])[19]")
	WebElement AcademicReports;
	
	@FindBy(xpath= "(//button[@type='button'])[16]")
	WebElement MasterDropDown;
	
	public AcademicPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateAcademicsPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyEntermarks(){
		return EnterMarks.isDisplayed();
	}
	
	public boolean verifyAcademicAction(){
		return AcademicAction.isDisplayed();
	}
	
	public boolean verifyMasters(){
		return Masters.isDisplayed();
	}
	
	public boolean verifyReports(){
		return Reports.isDisplayed();
	}
	
	public boolean verifyAcademicReports(){
		return AcademicReports.isDisplayed();
	}
	
	public AcademicMastersPage subject(String item) {
	    WebElement dropDown = MasterDropDown;
	    dropDown.click();
	    driver.findElement(By.xpath("//a[@ui-sref='" +item+ "']")).click();
	    return new AcademicMastersPage();
	}
	
	public AcademicMastersGradingPage grading(String item) {
	    WebElement dropDown = MasterDropDown;
	    dropDown.click();
	    driver.findElement(By.xpath("//a[@ui-sref='" +item+ "']")).click();
	    return new AcademicMastersGradingPage();
	}
	

}
