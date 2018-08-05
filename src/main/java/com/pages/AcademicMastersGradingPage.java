package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class AcademicMastersGradingPage extends TestBase {
	
	@FindBy(name = "Title")
	WebElement ScaleName;
	
	@FindBy(xpath = "//form[@name='form']//div[2]//div[1]//input[1]")
	WebElement ScaleDescription;
	
	@FindBy(xpath = "//button[@class='btn btn-primary change']")
	WebElement Save;
	
	public AcademicMastersGradingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void CreateGrade(String scaleName, String scaleDescription) {
		
		ScaleName.sendKeys(scaleName);
		ScaleDescription.sendKeys(scaleDescription);
		Save.click();
		
		
	}

}
