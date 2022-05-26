package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.deltaPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class delta {
WebDriver driver;


@Given("the user visits Delta booking flight website")
public void the_user_visits_delta_booking_flight_website() {
	try{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	//Implicit wait syn
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.delta.com/flight-search/book-a-flight");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	}
	
	catch(Exception e) {
		System.out.println("Browser not opening");
		
	}
	
	
	
	
}

@When("the user types on {string} and {string} and selects their destinations")
public void the_user_types_on_and_and_selects_their_destinations(String string, String string2) {
  deltaPOM obj = new deltaPOM(driver);
  
  //From
  obj.From().click();
  obj.TypeFrom().sendKeys(string);
  obj.From2().click();
  
  //To
  obj.To().click();
  obj.TypeTo().sendKeys(string2);
  obj.To2().click();
	
	
}

@When("the user selects their trip, depart and return time")
public void the_user_selects_their_trip_depart_and_return_time() {
	try {
	//Trip type
	
    deltaPOM obj = new deltaPOM(driver);
	Select dropdown = new Select(obj.click_Triptype);
	dropdown.selectByIndex(0);
	
	Thread.sleep(1000);
	
	//Depart and Return
	
	obj.Depart().click();
	obj.DepartDate().click();
	obj.ReturnDate().click();
	obj.Done().click();
	
	}
	catch(Exception e) {
		
		System.out.println("Step 3 not working");
	}
	
	
}

@When("the user selects the amount of passengers,selects best fares for")
public void the_user_selects_the_amount_of_passengers_selects_best_fares_for() {
    
	try {
	    
		//Passenger
		
		deltaPOM obj = new deltaPOM(driver);
	    Select action = new Select(obj.click_Passangers);
	    action.selectByIndex(1);

	    
	    //Fares 
	    
	    Select action2 = new Select(obj.click_fares);
	    action2.selectByIndex(1);
		
		
	}
	
	catch(Exception e) {
		
		System.out.println("Step 4 is not working");
	}	
	
}

@Then("the user will click next arrow and will be able to see the tickets")
public void the_user_will_click_next_arrow_and_will_be_able_to_see_the_tickets()throws Throwable {
    
	deltaPOM obj = new deltaPOM(driver);
	obj.Submit().click();
	
	Thread.sleep(5000);
	
	
	
}


}
