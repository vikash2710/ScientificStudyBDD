package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void User_is_already_on_Login_Page()
	{
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.scientificstudy.in");
	}
	
	@When("^title of login page is Scientific Study$")
	public void title_of_login_page_is_Scientific_Study() 
	{
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Scientific Study", title);
	}
	
	@Then("^user selects role as \"([^\"]*)\"$")
	public void user_selects_role_as(String Role)  
	{
			Select role=new Select(driver.findElement(By.id("ddlUserType")));
			role.selectByVisibleText(Role);	   
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) 
	{
			driver.findElement(By.id("txtUserName")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Exception  
	{
	    	driver.findElement(By.id("btnLogin")).click();
	    	Thread.sleep(6000);
	    	driver.findElement(By.cssSelector("a.btnlink.continue")).click();    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  
	{
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("AdminDashboard", title);    
	}

	@Then("^Close the browser$")
	public void close_the_browser()  
	{
			driver.quit();
	}
	

}
