package abstractComponent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponentF {

	public WebDriver driver;
	
	// Constructor
	public  AbstractComponentF (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// explicitly waiting until the element appears
	public void waitUntillElementAppears(WebElement Element)
	{
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(Element));
	}
	
}
