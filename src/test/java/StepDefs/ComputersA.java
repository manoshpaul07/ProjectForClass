package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.ComputerAPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputersA {
WebDriver driver;


@Given("user visits Costco homepage")
public void user_visits_costco_homepage()throws Throwable {
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

@When("user hovers over Shop and hovers over Computers and  clicks Computer Accessories")
public void user_hovers_over_shop_and_hovers_over_computers_and_clicks_computer_accessories()throws Throwable {
try {
	Actions act =new Actions (driver);
	ComputerAPOM obj = new ComputerAPOM(driver);
	act.moveToElement(obj.shop()).build().perform();
	
	act.moveToElement(obj.Computers()).contextClick().perform();
	
	Thread.sleep(1000);
    
	obj.arrow().click();
	
    Thread.sleep(1000);
	
	obj.ComputersA().click();
	
	Thread.sleep(5000);

	//Actions act2 =new Actions (driver);
	//act2.moveToElement(obj.Computers()).contextClick().build().perform();
    //obj.Computers().click();
	//WebDriverWait wait2 =new WebDriverWait(driver,20);
	//Actions act3 =new Actions (driver);
	
	//act3.moveToElement(obj.arrow()).click().perform();
	
}
catch(Exception e) {
	System.out.println("Not Clicking");
	
}

}

@Then("user will be redirected successfully")
public void user_will_be_redirected_successfully() {


	
	
}

}
