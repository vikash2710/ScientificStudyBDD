package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.util.TestBase;

public class AcademicMastersPage extends TestBase {
	
	String sheetName = "CreateSubject";

	
	@FindBy(name = "Title")
	WebElement Subject;
	
	@FindBy(xpath = "//label[@for='rdn_pr_yes']")
	WebElement PracticalYes;
	
	@FindBy(xpath = "//label[@for='rdn_pr_no']")
	WebElement PracticalNo;
	
	@FindBy(xpath = "//label[@for='rdn_CoSch_yes']")
	WebElement CoSchYes;
	
	@FindBy(xpath = "//label[@for='rdn_CoSch_no']")
	WebElement CoSchNo;
	
	@FindBy(xpath = "//button[@class='btn btn-primary change']")
	WebElement Save;
	
	public AcademicMastersPage() {
		PageFactory.initElements(driver, this);
	}
	

	public void CreateSubject(String SubjectName, String PracticalPaper, String CoScholastic) {
		
		Subject.sendKeys(SubjectName);
		String Practical = PracticalPaper;
		
		if(Practical.equals("Yes")) {
			PracticalYes.click();
		}
		else if(Practical.equals("No")){
			PracticalNo.click();
		}
		
		String CoSch = CoScholastic ;
		if(CoSch.equals("Yes")) {
			CoSchYes.click();
		}
		else if(CoSch.equals("No")) {
			CoSchNo.click();
		}
		Save.click();
	}
	
	

}
