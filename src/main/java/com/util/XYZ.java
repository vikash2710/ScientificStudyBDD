package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import com.pages.AcademicAddExamPage;


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

//public static Object[][] getTestData(String sheetName , String sheetpath) {
//	FileInputStream file = null;
//	try {
//		file = new FileInputStream(sheetpath);
//	} catch (FileNotFoundException e) {
//		e.printStackTrace();
//	}
//	try {
//		book = WorkbookFactory.create(file);
//	} catch (InvalidFormatException e) {
//		e.printStackTrace();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//	sheet = book.getSheet(sheetName);
//	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//	// System.out.println(sheet.getLastRowNum() + "--------" +
//	// sheet.getRow(0).getLastCellNum());
//	for (int i = 0; i < sheet.getLastRowNum(); i++) {
//		for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
//			data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
//			// System.out.println(data[i][k]);
//		}
//	}
//	return data;
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
