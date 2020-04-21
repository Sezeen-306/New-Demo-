package practiceStepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webtest.socialware.pageObj.LoginPageObj;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import userclass.User;
import webloginpage.HomePageWeb;
import webloginpage.LoginWeb;


public class PracticeLoginSteps {

	WebDriver driver;
	User user;
	LoginWeb login;
	HomePageWeb homepage;
 



	@Given("^I open browser chrome$")
	public void i_open_browser_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayee\\eclipse-workspace\\webtest\\chromedriver.exe");
		driver=new ChromeDriver();

	}

	
	
	@Given("^I navigate to socialware\\.com$")
	public void i_navigate_to_socialware_com() throws Throwable {
		driver.manage().window().maximize();
		driver.get("https://www.demo.iscripts.com/socialware/demo/");
		//Thread.sleep(3000);
		//driver.close();
	}

	
	
	@When("^I complete login with valid credentials$")
	public void i_complete_login_with_valid_credentials() throws Throwable {
	
	//LoginWeb login=new 	LoginWeb(name,password,loginbtn)
		user=new User("user@iscripts.com","User1234","James Mathew");
		LoginPageObj login= new LoginPageObj();
		
		driver.findElement(login.user_name_field).sendKeys(user.getUseremail());
		driver.findElement(login.user_password_field).sendKeys(user.getUserpw());
		
		driver.findElement(login.user_login_btn).click();
	}

	
	
	
	@Then("^I expect profile Name as  James Methow$")
	public void i_expect_profile_Name_as_James_Methow() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}


}
