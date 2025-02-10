package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	
	public static  WebDriver driver ;
	@Before
	void setUp ()
	{
		
		 driver =  new ChromeDriver();
		driver.manage().window().maximize();
	}
	@After
	void tearDown()
	{
		driver.close();           
	}

	
	
	@Given("navigate the application Url")
	public void navigate_the_application_url() {
		driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/");
	      
	}
	

	@When("Enter the username {string} into username field")
	public void enter_the_username_into_username_field(String username) {
		
		driver.findElement( By.name("txtUserName")).sendKeys(username);
	   
	}

	@When("Enter the password {string} into password field")
	public void enter_the_password_into_password_field(String password) {
		
		driver.findElement( By.name("txtPassword")).sendKeys(password);
	   
	}

	@When("click on login")
	public void click_on_login() {
		
	 driver.findElement(By.name("Submit")).click();  
	}

	@Then("verify login success")
	public void verify_login_success() {
		
		System.out.println("verified welcomepage successfully");
	    
	

	

	
	
	
	}
}





