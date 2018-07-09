package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	
	
	@Given("^user is already on Login Page$")
	public void User_is_already_on_Login_Page()
	{
		TestBase.initialization();
	}
	
	@When("^title of login page is Scientific Study$")
	public void title_of_login_page_is_Scientific_Study() 
	{
			loginpage = new LoginPage();
			String title = loginpage.ValidateLoginPageTitle();
			Assert.assertEquals("Scientific Study", title);
	}
	
	   

	@Then("^user login into the web$")
	public void user_login_into_the_web() 
	{
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));   
	}

	

	@Then("^user is on home page$")
	public void user_is_on_home_page()  
	{
			String Hometitle = homepage.ValidateHomePageTitle();
			Assert.assertEquals("AdminDashboard", Hometitle);
	}

	@Then("^Close the browser$")
	public void close_the_browser()  
	{
			driver.quit();
	}
	

}
