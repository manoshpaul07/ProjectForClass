package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerSortPOM {
	WebDriver driver;

	public ComputerSortPOM(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="search-field")
	WebElement edit_SearchBox;
	public WebElement Search() {
		return edit_SearchBox;

	}
	
	@FindBy(xpath = "//i[@automation-id=\"searchWidgetButton\"]")
	WebElement click_searchbutton;

	public WebElement searchbutton() {
		return click_searchbutton;

	}
	
	@FindBy(id="sort_by")
	public WebElement click_Sort;
	
	
	
	
	
	
}
