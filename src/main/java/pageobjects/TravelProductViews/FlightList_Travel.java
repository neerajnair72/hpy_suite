/*
package pageobjects.TravelProductViews;

import frameworkBase.TestBotElementsWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotElementsWrapper;

public class FlightList_Travel extends TestBotElementsWrapper {
	
	public boolean isMoreThanOnePass = false;
	public boolean isDOB = false;
	
*//** The driver. *//*
	private static WebDriver driver;
*//** The page wrapper. *//*

	private static TestBotElementsWrapper pageWrapper;

	private SoftAssert softassert = new SoftAssert();

	
*//**
	 * Instantiates a new common page elements.
	 *
	 * @param driver
	 *            the driver
	 *//*

	public FlightList_Travel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		pageWrapper = new TestBotElementsWrapper(driver);
	}
	


	
	@FindBy(xpath = "(//div[@class='tick-icon'])[3]")
	private WebElement SelectFlight_Selection_xpath;
	
	@FindBy(xpath = "//div[@class='new-travel-roundcnt left']//div[@class='new-travel-round-trip-cnt']//div[@class='card-container-main has-collapsible selected']//div[@class='fare-content']")
	private WebElement SelectOnwardFlight_Selection_xpath;
	
	@FindBy(xpath = "//div[@class='new-travel-roundcnt right']//div[@class='new-travel-round-trip-cnt']//div[@class='card-container-main has-collapsible selected']//div[@class='fare-content']")
	private WebElement SelectReturnFlight_Selection_xpath;
	
	@FindBy(xpath = "(//div/span[text()='BOOK NOW'])[3]")
	private WebElement BookNow_Button_xpath;
	
	@FindBy(xpath = "//div/span[text()='BOOK NOW']")
	private WebElement BookNowRoundTrip_Button_xpath;
	
	@FindBy(xpath="(//div[@class='city-hdr'])[1]")
	public WebElement SearchPageFromCity_Info_xpath;
	
	@FindBy(xpath="(//div[@class='city-hdr'])[2]")
	public WebElement SearchPageToCity_Info_xpath;
}

*/