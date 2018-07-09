package StepDefinition;


import org.junit.Assert;

import com.pages.AcademicPage;
import com.pages.HomePage;
import com.util.TestBase;

import cucumber.api.java.en.When;


public class NavigatesToAcademics extends TestBase 	{
	
	HomePage homepage;
	AcademicPage academicpage;
	
	
	@When("^user navigates to academics module$")
	public void user_navigates_to_academics_module() 
	{
			homepage = new HomePage();
			homepage.scrollto();
			academicpage = homepage.clickonacademics();
			String academicstitle = academicpage.ValidateAcademicsPageTitle();
			Assert.assertEquals("ACADEMICS MANAGEMENT", academicstitle);
			System.out.print("\n" + "Academics Page Title is " + academicstitle + "\n");
			
				
			
		
	    
	}

}
