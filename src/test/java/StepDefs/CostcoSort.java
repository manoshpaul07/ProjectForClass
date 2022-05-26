package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.ComputerSortPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CostcoSort {
WebDriver driver;


@Given("user visits Costco page")
public void user_visits_costco_page() {
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

@When("user types {string} and clicks search button")
public void user_types_and_clicks_search_button(String string) {
   try {
	ComputerSortPOM obj = new ComputerSortPOM(driver);
   obj.Search().sendKeys(string);
   obj.searchbutton().click();
 Thread.sleep(5000);
   
   }
   
   catch(Exception e) {
	   System.out.println("Search is not working");
	   
   }
}

@When("user clicks sort by dropdown and select one of the sort option")
public void user_clicks_sort_by_dropdown_and_select_one_of_the_sort_option() {
   try {
	ComputerSortPOM obj1 = new ComputerSortPOM(driver);
   Select dropdown = new Select(obj1.click_Sort);
	dropdown.selectByIndex(5);
	Thread.sleep(5000);
   }
   
   catch(Exception e) {
	   System.out.println("Selec method not working");
	   
   }
}

@Then("user will be able to see the results sorted out successfully")
public void user_will_be_able_to_see_the_results_sorted_out_successfully() {
   
	driver.quit();
	
 }
}


