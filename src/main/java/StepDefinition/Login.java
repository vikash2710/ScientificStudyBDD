package StepDefinition;

import org.junit.Assert;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestBase;
import cucumber.api.java.en.Then;


public class Login extends TestBase {
	
	
	LoginPage loginpage;
	HomePage homepage;
	
	@Then("^user login into the website$")
	public void user_login_into_the_web() 
	{
		TestBase.initialization();
		loginpage = new LoginPage();
		String title = loginpage.ValidateLoginPageTitle();
		System.out.print("Login Page Title is " + title + "\n");
		Assert.assertEquals("Scientific Study", title);
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
		String Hometitle = homepage.ValidateHomePageTitle();
		Assert.assertEquals("AdminDashboard", Hometitle);
		System.out.print("\n" + "Home Page Title is " + Hometitle + "\n" + "Login Succesfully" + "\n");
	}
}
