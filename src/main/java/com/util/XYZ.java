package com.util;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pages.AcademicAddExamPage;


//public class XYZ {
	
	
	//@RunWith(DataProviderRunner.class)
//	@DataProvider
//	public Object[][] getTestData(){
//		Object data[][] = TestUtil.getTestData(sheetName);
//		return data;
//	}
//	
//	@Test(dataProvider = "getTestData")
	
	
//	@Then("^user enter subject name and save it$")
//	public void user_enter_subject_name_and_save_it()  {
//		
//		academicmasterspage = new AcademicMastersPage();
////		academicmasterspage.CreateSubject(SubjectName,PracticalPaper, CoScholastic);
//		
////		String SubjectName, String PracticalPaper, String CoScholastic
	    
//	}

//}



//
//public void addexam(String testtitle, String StartDate ,String EndDate) throws ParseException
//	{
//		
//		TestTitle.sendKeys(testtitle);
//		String date[]=StartDate.split("/");
//		String day = date[0];
//		String MonthName = date[1];
//		String year = date[2];
//		
//		//Clicking on calendar to open calendar widget
//		CalFrom.click();
//		
//		// Retrieving current year value
//		String currentYear= Year.getText();
//		
//		// Click on Next arrow till we get desired year
//		if(!currentYear.equals(year))
//				{
//					do
//					{
//						Next.click();
//					} 
//					while (!Year.getText().equals(year));	
//				}
//		
//		// Select desired month after selecting desired year
//		String currentMonth= Month.getText();
//		if(!currentMonth.equalsIgnoreCase(MonthName))
//				{
//					do
//					{
//						Next.click();
//					}
//					while(!Month.getText().trim().equalsIgnoreCase(MonthName));	
//				}
//		
//		// Find dates of desired month only
//		
//		int javaMonthInt= AcademicAddExamPage.getMonthJavaInt(MonthName);
//		
//		List<WebElement> allDateOfDesiredMonth= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td[(@class=' ' or @class=' ui-datepicker-week-end ' ) and @data-month='"+javaMonthInt+"']"));
//				for(WebElement d:allDateOfDesiredMonth )
//				{
//					if(d.getText().trim().equals(day))
//					{
//						d.click();
//						break;
//					}
//				}			
//	}
