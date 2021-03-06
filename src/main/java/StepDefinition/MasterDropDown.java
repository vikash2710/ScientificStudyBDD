package StepDefinition;

import com.pages.AcademicAddExamPage;
import com.pages.AcademicMastersGradingPage;
import com.pages.AcademicMastersPage;
import com.pages.AcademicPage;
import com.util.TestBase;

import cucumber.api.java.en.Then;

public class MasterDropDown extends TestBase {
	
	AcademicMastersPage academicmasterspage;
	AcademicMastersGradingPage academicmastersgradingpage;
	AcademicPage academicpage;
	AcademicAddExamPage academicaddExampage;
	
	@Then("^user select Subject from Masters dropdown$")
	public void user_select_Subject_from_Masters_dropdown()  {
		
		academicmasterspage = new AcademicMastersPage();
		academicpage = new AcademicPage();
		academicmasterspage = academicpage.subject("subjects");	
	}
	
	@Then("^user select Grading from Masters dropdown$")
	public void user_select_Grading_from_Masters_dropdown()  {
		
		academicmastersgradingpage = new AcademicMastersGradingPage();
		academicpage = new AcademicPage();
		academicmastersgradingpage = academicpage.grading("gradeScale");  
	}
	
	@Then("^user select AddExam from Masters dropdown$")
	public void user_select_AddExam_from_Masters_dropdown()  {
		
		academicaddExampage = new AcademicAddExamPage();
		academicpage = new AcademicPage();
		academicaddExampage= academicpage.addexam("addExam");    
	}
	
	

}
