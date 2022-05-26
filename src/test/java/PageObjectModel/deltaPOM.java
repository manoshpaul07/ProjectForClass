package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deltaPOM {
WebDriver driver;

public deltaPOM (WebDriver driver) {
	this.driver = driver;

	PageFactory.initElements(driver, this);

}

@FindBy(xpath="(//span[@class='airport-code d-block'])[1]")
WebElement click_From;
  public WebElement From() { 
  return click_From;
  }

  @FindBy(xpath="(//input[@id=\"search_input\"])")
  WebElement edit_From;
    public WebElement TypeFrom() { 
    return edit_From;
    }
  

    @FindBy(xpath="//span[text()='New York City Area Airports, NY']")
    WebElement click_From2;
      public WebElement From2() { 
      return click_From2;
      }
  
  
      @FindBy(xpath="//span[text()='To']")
      WebElement click_To;
        public WebElement To() { 
        return click_To;
        }
  
  
        @FindBy(xpath="(//input[@id=\"search_input\"])")
        WebElement edit_To;
          public WebElement TypeTo() { 
          return edit_To;
          }
  
          @FindBy(xpath="//span[text()='Austin, TX']")
          WebElement click_To2;
            public WebElement To2() { 
            return click_To2;
            }
            @FindBy(id="selectTripType")
        	public WebElement click_Triptype;
  
          
            @FindBy(xpath="//span[text()='Depart']")
            WebElement click_Depart;
              public WebElement Depart() { 
              return click_Depart;
              }
         
  
              @FindBy(xpath="//a[@aria-label=\"31 May 2022, Tuesday\"]")
              WebElement click_DepartDate;
                public WebElement DepartDate() { 
                return click_DepartDate;
                }
                @FindBy(xpath="//a[@aria-label=\"12 June 2022, Sunday\"]")
                WebElement click_ReturnDate;
                  public WebElement ReturnDate() { 
                  return click_ReturnDate;
                  }
  
              
                  @FindBy(xpath=" //button[text()='done']")
                  WebElement click_Done;
                    public WebElement Done() { 
                    return click_Done;
                    }
  
                    
  
                  @FindBy(id="passengers")
             public WebElement click_Passangers;
  
                    		
  
  
                  	@FindBy(id="faresFor")
              public WebElement click_fares;
  
  
                  	
                            @FindBy(id="btnSubmit")
                    WebElement click_Submit;
                      public WebElement Submit() { 
                      return click_Submit;
                      }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
