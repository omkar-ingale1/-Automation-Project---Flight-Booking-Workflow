package testComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import makeMyTripPageObjects.homePage;

public class baseTestFlight {

	public WebDriver driver;
	public makeMyTripPageObjects.homePage homePage;
	public WebDriver InitializeDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	
	
	
	@BeforeMethod
	public makeMyTripPageObjects.homePage launchBrowser()
	{
		driver = InitializeDriver();
		homePage = new makeMyTripPageObjects.homePage(driver);
		driver.manage().deleteAllCookies();
		homePage.visitMakeMyTripWebSite();
		
		return homePage;
	}
	
}
