package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerAPOM {

	WebDriver driver;

	public ComputerAPOM (WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(id="navigation-dropdown")
	WebElement act_shop;
	  public WebElement shop() { 
		   return act_shop;
   }
	
		@FindBy(xpath="//div[@id='level1-all-departments']//ul//li//a[text()='Computers']")
	  //@FindBy(xpath="//i[@id='arrow-2']")
	      WebElement act_computers;
		  public WebElement Computers() { 
		   return act_computers;
		   }
		  
		  @FindBy(xpath="//i[@id='arrow-5']")
	      WebElement act_arrow;
		  public WebElement arrow() { 
		   return act_arrow;
		   }
		  
		  
			@FindBy(xpath="(//a[@href=\"/computer-accessories.html\"])[2]")
			  WebElement click_computersA;
			  public WebElement ComputersA() { 
			   return click_computersA;
			   }
	  
	  
}
