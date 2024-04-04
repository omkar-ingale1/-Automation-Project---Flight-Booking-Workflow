package makeMyTripPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponent.AbstractComponentF;

public class homePage extends AbstractComponentF {

	public WebDriver driver;
	
	// constructor
	public homePage (WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// radio button
	@FindBy(css = "li[data-cy='roundTrip']")
	WebElement roundTripButton;
	
	// from city drop down
	@FindBy(xpath = "//label[@for='fromCity']")
	WebElement fromCity;
	
	// search from city text box
	@FindBy(css = "input[placeholder='From']")
	WebElement searchFromCityTextBox;

	//To city drop down click
	@FindBy(id = "toCity")
	WebElement toCity;
	
	// search from city text box
	@FindBy(css = "input[placeholder='To']")
	WebElement searchToCityTextBox;
	
	// selecting travelers
	@FindBy(css = "span[class='lbl_input appendBottom5']")
	WebElement selectTravellers;
	
	// selecting 2 adults
	@FindBy(css = "li[data-cy='adults-2']")
	WebElement selectAdults;
	
	// selecting 2 children
	@FindBy(xpath = "//li[@data-cy='children-2']")
	WebElement selectChildrens;
	
	// select infants
	@FindBy(css = "li[data-cy='infants-1']")
	WebElement selectInfants;
	
	// select class
	@FindBy (css = "li[data-cy='travelClass-1']")
	WebElement premiumEconomyClass;
	
	// apply button
	@FindBy(css = "button[data-cy='travellerApplyBtn']")
	WebElement applyButton;
	
	// search button
	@FindBy(css = ".primaryBtn")
	WebElement searchButton;
	
	//go to make my trip web site
	public void visitMakeMyTripWebSite()
	{
		driver.get("https://www.makemytrip.com/flights/");
	}
	//clicking on round trip radio button
	public void selectRoundTrip()
	{
		roundTripButton.click();
	}
	// clicking on from city drop down
	public void fromCityDropdown()
	{
		fromCity.click();
	}
	//From city search text box 
	public void searchFromCity(String fromCity)
	{
		searchFromCityTextBox.sendKeys(fromCity);
	}
	//opening to City drop down
	public void toCityDropDown()
	{
		toCity.click();
	}
	// searching for city
	public void searchToCity(String toCityName)
	{
		searchToCityTextBox.sendKeys(toCityName);
	}
	// clicking travelers option to select traveler info
	public void clickOnTravellers()
	{
		selectTravellers.click();
	}
	// selecting 2 adults
	public void selectingTwoAdults()
	{
		selectAdults.click();
	}
	// selecting 2 children
	public void selectingTwochildrens()
	{
		selectChildrens.click();
	}
	// selecting 2 infants
	public void selectingOneInfants()
	{
		selectInfants.click();
	}		
	// clicking on apply button
	public void clickApply()
	{
		applyButton.click();
	}	
	// click on search button
	public void startSeach() 
	{
		searchButton.click();
	}
				
				
				
				
}



