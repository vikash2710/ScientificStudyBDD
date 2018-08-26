package StepDefinition;

import org.junit.Assert;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestBase;

import cucumber.api.java.en.And;
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
			homepage = loginpage.login(prop.getProperty("yrrole"), prop.getProperty("username"), prop.getProperty("password")); 
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  
	{
			String Hometitle = homepage.ValidateHomePageTitle();
			Assert.assertEquals("AdminDashboard", Hometitle);
			System.out.print("\n" + "Home Page Title is " + Hometitle + "\n" + "Login Succesfully" + "\n");
	}

	@And("^user logout the Application$")
	public void user_logout_the_Application() throws Throwable {
		homepage = new HomePage();
		loginpage = homepage.logout();
		Thread.sleep(5000);
		String title = loginpage.ValidateLoginPageTitle();
		Assert.assertEquals("Scientific Study", title);
		System.out.print("\n" + "Logout Successful " + "Page Title is " + title + "\n");
		driver.quit();
		
	}
	
	

}
