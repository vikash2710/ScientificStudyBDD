package StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class NavigatesToAcademics 	

{
	public static WebDriver driver=null;
	
	@When("^user navigates to academics module$")
	public void user_navigates_to_academics_module() throws Throwable 
	{
			
			driver.findElement(By.id("logoutdashboard")).click();
//			((JavascriptExecutor)driver).executeScript("scroll(0,600)");
//			driver.findElement(By.id("btn_/academics")).click();
		
	    
	}

}
