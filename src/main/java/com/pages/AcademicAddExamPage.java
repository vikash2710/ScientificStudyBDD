package com.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Date;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;



public class AcademicAddExamPage extends TestBase {
	
	@FindBy(id = "scheduledTestTitle")
	WebElement TestTitle;
	
	@FindBy(id = "txtCalendarFrom")
	WebElement CalFrom;
	
	@FindBy(id = "txtCalendarTo")
	WebElement CalTo;
	
	@FindBy(xpath = "//a[@title='Next']")
	WebElement Next;
	
	@FindBy(xpath = "//a[@title='Prev']")
	WebElement Prev;
	
	@FindBy(xpath = "//span[@class='ui-datepicker-month']")
	WebElement Month;
	
	@FindBy(xpath = "//span[@class='ui-datepicker-year']")
	WebElement Year;
	
	@FindBy(id = "btnSubmit")
	WebElement Save;
	
	
	public AcademicAddExamPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void date(String givendate) throws ParseException
		{
		
		String date[]=givendate.split("/");
		String day = date[0];
		String MonthName = date[1];
		String year = date[2];
	
		// Retrieving current year value
		String currentYear= Year.getText();
		
		// Click on Next arrow till we get desired year
		if(!currentYear.equals(year))
				{
					do
					{
						Next.click();
					} 
					while (!Year.getText().equals(year));	
				}
		
		// Select desired month after selecting desired year
		String currentMonth= Month.getText();
		if(!currentMonth.equalsIgnoreCase(MonthName))
				{
					do
					{
						Next.click();
					}
					while(!Month.getText().trim().equalsIgnoreCase(MonthName));	
				}
		
		// Find dates of desired month only
		
		int javaMonthInt= AcademicAddExamPage.getMonthJavaInt(MonthName);
		
		List<WebElement> allDateOfDesiredMonth= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td[(@class=' ' or @class=' ui-datepicker-week-end ' ) and @data-month='"+javaMonthInt+"']"));
				for(WebElement d:allDateOfDesiredMonth )
				{
					if(d.getText().trim().equals(day))
					{
						d.click();
						break;
					}
				}	
				
	}

	
	// Code to get java month number
		public static int getMonthJavaInt(String MonthName) throws ParseException  
		{
					Date date = new SimpleDateFormat("MMMM").parse(MonthName);
					Calendar cal = Calendar.getInstance();
					cal.setTime(date);
					return cal.get(Calendar.MONTH);
		}
	

	
	public void addexam(String testtitle, String StartDate ,String EndDate) throws ParseException 
	{
		
		TestTitle.sendKeys(testtitle);
		
		//Clicking on calendar to open calendar widget
		CalFrom.click();
		date(StartDate);
		CalTo.click();
		date(EndDate);
		Save.click();
		
		
		
		
	}

	
	
}

