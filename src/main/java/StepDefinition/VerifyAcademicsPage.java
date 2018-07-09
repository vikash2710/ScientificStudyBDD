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
		System.out.println("\n" + "Enter Marks option is available");
		Assert.assertTrue(academicpage.verifyAcademicAction());
		System.out.println("\n" + "Academic Action option is available");
		Assert.assertTrue(academicpage.verifyMasters());
		System.out.println("\n" + "Master option is  available");
		Assert.assertTrue(academicpage.verifyReports());
		System.out.println("\n" + "Report option is available");
		Assert.assertTrue(academicpage.verifyAcademicReports());
		System.out.println("\n" + "Academics Report option is available");
		
	   
		
	}

}
