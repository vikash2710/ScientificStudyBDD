package StepDefinition;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.AcademicMastersPage;
import com.util.TestBase;
import com.util.TestUtil;

import cucumber.api.java.en.Then;
import cucumber.api.java.it.Data;


public class CreateSubject extends TestBase {
	
	String sheetName = "CreateSubject";
	AcademicMastersPage academicmasterspage;
	

@DataProvider 
public Object[][] ReadData() throws Throwable{
	Object data[][] = TestUtil.ReadExcel(sheetName);
	return data;
	}

@Test
//@UseDataProvider( "ReadData" )
	@Then("^user enter \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and save it$")
	public void user_enter_and_save_it(String SubjectName, String PracticalPaper, String CoScholastic) throws Throwable {
		
//	Data will set in Excel sheet once one parameter will get from excel sheet to Respective locator position.
//	DataSet++;
		academicmasterspage = new AcademicMastersPage();
		academicmasterspage.CreateSubject(SubjectName, PracticalPaper, CoScholastic);
		
	}
}
