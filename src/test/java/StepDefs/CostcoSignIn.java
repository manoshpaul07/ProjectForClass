package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.CostcoSignInPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CostcoSignIn {
	WebDriver driver;
	@Given("user visit Costco homepage")
	public void user_visit_costco_homepage() throws Throwable {
		try{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		//Implicit wait syn
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.costco.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		}
		
		catch(Exception e) {
			System.out.println("Browser not opening");
			
		}
	}

	@When("user click on Sign In and type valid {string} , invalid {string}")
	public void user_click_on_sign_in_and_type_valid_invalid(String string, String string2)throws Throwable {
		try {
		CostcoSignInPOM obj = new CostcoSignInPOM(driver);
		obj.SignIn().click();
		obj.email().sendKeys(string);
		obj.pass().sendKeys(string2);
		
		Thread.sleep(5000);
		}
		
		catch(Exception e) {
			System.out.println("Password not typing");
		}
	}

	@Then("user click on sign in")
	public void user_click_on_sign_in() {
		try {
		CostcoSignInPOM obj = new CostcoSignInPOM(driver);
		obj.next().click();
		}
		
		catch(Exception e) {
			System.out.println("Clicking not working");
		}
	}
	
	
	
	
	
	
}
