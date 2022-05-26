package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoSignInPOM {

	WebDriver driver;

	public CostcoSignInPOM (WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	  @FindBy(id="header_sign_in")
	  WebElement click_SignIn;
	    public WebElement SignIn() { 
	    return click_SignIn;
	    }
	
	    @FindBy(id="signInName")
	    WebElement edit_email;
	    public WebElement email() {
	    	return edit_email;
	    }
	    
	    
        @FindBy(id="password")
	    WebElement edit_pass;
	    public WebElement pass() {
	    return edit_pass;
	   }


		  @FindBy(id="next")
		  WebElement click_next;
		    public WebElement next() { 
		    return click_next;
		    }




}
		
		
		
		
