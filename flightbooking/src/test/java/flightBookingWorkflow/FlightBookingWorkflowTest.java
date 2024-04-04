package flightBookingWorkflow;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import abstractComponent.AbstractComponentF;
import makeMyTripPageObjects.FlightSelectionPage;
import testComponents.baseTestFlight;

public class FlightBookingWorkflowTest extends baseTestFlight{
	
	
	@Test
	public void makeMyTripFlightBookingWorkflow()
	{	
		// clicking on round trip option
		homePage.selectRoundTrip();
		
		//clicking on the from city 
		homePage.fromCityDropdown();
		
		//searching from city
		homePage.searchFromCity("Mum");
		
		// gathering all the values from the drop down to select required city
		List <WebElement> fromCityDdValues=  driver.findElements(By.cssSelector("li[role='option']"));
		
		// writing loop to select the city as per user requirements
		for(int i=0; i<=fromCityDdValues.size(); i++)
		{
			String fromCityName = driver.findElements(By.cssSelector("li[role='option']")).get(i).getText();
			if(fromCityName.contains("Mumbai"))
			{
				driver.findElements(By.cssSelector("li[role='option']")).get(i).click();
				break;
			}
		}
		// now, its time select To city so opening to city drop down
		homePage.toCityDropDown();
		
		// giving search inputs as per user requirements
		homePage.searchToCity("chenn");
		
		// gathering all the values from the drop down to select required city
		List <WebElement> toCityDdValues = driver.findElements(By.cssSelector("li[role='option']"));
		
		// writing loop to select the city as per user requirements
		for(int i=0; i<=toCityDdValues.size(); i++)
		{
			String toCityName = driver.findElements(By.cssSelector("li[role='option']")).get(i).getText();
			if(toCityName.contains("Chennai"))
			{
				driver.findElements(By.cssSelector("li[role='option']")).get(i).click();
				break;
			}
		}		
		// object creating for abstract Component
		AbstractComponentF abstractComponent = new AbstractComponentF (driver);
		abstractComponent.waitUntillElementAppears(driver.findElement(By.cssSelector("div[aria-selected=\"true\"]")));
		// Handling calendars selecting present day date as departure date
		driver.findElement(By.cssSelector("div[aria-selected=\"true\"]")).sendKeys(Keys.RETURN);
		
		// Handling To date calendar 
		 String  inputDate = "10"; // the date that user can decide 
		 // List of the dates which present in To calendar
		 List<WebElement>dateList =  driver.findElements(By.xpath("//div[@class=\"DayPicker-Month\"] [2]/div/div/div/div"));
		 
		 // writing for loop to get selected the date which user wants to select
		 for (int i =0; i<=dateList.size(); i++)
		 {
			 String date =dateList.get(i).getText();
			 if (date.equals( inputDate))
			 {
				 driver.findElements(By.xpath("//div[@class='DayPicker-Month'] [2]/div/div/div/div")).get(i).click();
				 break;
			 }
		 }
		 // click on travelers option
		 homePage.clickOnTravellers();
		 
		 // select adults
		 homePage.selectingTwoAdults();
		 
		 // select children
		 homePage.selectingTwochildrens();
		 
		 // select infants
		 homePage.selectingOneInfants();
		 
		 // click on apply button
		 homePage.clickApply();
		 
		 
		 /* need to comment out the code for search button, because when selenium clicks on the search button the make my trip gave an error.
		 said- NETWORK PROBLEM
         We are unable to connect to our systems from your device. Please try again after a while.
		 so make my trip is identifying and blocking the automate bots so therefore unable to do further automation on this website.*/
		 
		 
		 
		 
		 
		 
		 /* click on search button
		 homePage.startSeach();
		 
          // wait until the page load properly
		 abstractComponent.waitUntillElementAppears(driver.findElement(By.cssSelector(".font24")));
		
		// created object for flight selection page 
		 FlightSelectionPage flightSelectionPage = new FlightSelectionPage(driver);
		 // asserting flight destinations are right or not
		String actualFlightDestination = flightSelectionPage.flightInfoText();
		String expectedFlightDestion = "Flights from Mumbai to Chennai, and back";
		Assert.assertEquals(actualFlightDestination,expectedFlightDestion);
*/
		
	}
	
}
