package StepDefinition;

import com.pages.AcademicPage;
import com.util.TestBase;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class VerifyAcademicsPage extends TestBase {
	
	
	AcademicPage academicpage;
	
	@Then("^user verify the page$")
	public void user_verify_the_page()  {
		
		academicpage = new AcademicPage();
		
		Assert.assertTrue(academicpage.verifyEntermarks());
		Assert.assertTrue(academicpage.verifyAcademicAction());
		Assert.assertTrue(academicpage.verifyMasters());
		Assert.assertTrue(academicpage.verifyReports());
		Assert.assertTrue(academicpage.verifyAcademicReports());
		
	   
		
	}

}
