package StepDefinition;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestBase;

import cucumber.api.java.en.And;

public class Logout extends TestBase  {
	
	HomePage homepage;
	LoginPage loginpage;
	
	@And("^user logout from the Application$")
	public void user_logout_from_the_Application() throws Throwable {
		homepage = new HomePage();
		loginpage = homepage.logout();
		Thread.sleep(5000);
		String title = loginpage.ValidateLoginPageTitle();
		Assert.assertEquals("Scientific Study", title);
		System.out.print("\n" + "Logout Successful" + "Page Title is " + title);
		driver.quit();
		
	}

}
