package makeMyTripPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponent.AbstractComponentF;

public class FlightSelectionPage extends AbstractComponentF{
	public WebDriver driver;

	public FlightSelectionPage (WebDriver driver)
	{
		super (driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css = ".font24")
	WebElement flightInfo;
	
	public String flightInfoText()
	{
		return flightInfo.getText();
	}
	
	
	
	
	
	
	
	
	
	
}


