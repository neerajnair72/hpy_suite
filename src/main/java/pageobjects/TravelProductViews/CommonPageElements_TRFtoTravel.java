
package pageobjects.TravelProductViews;

import frameworkBase.TestBotElementsWrapper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPageElements_TRFtoTravel extends TestBotElementsWrapper {
	
	
/** The hamburger menu. */

	@FindBy(xpath = ".//*[@id='hamburger']/img")
	public WebElement hamburgerMenu;
	
	
/** The logout link. */

	@FindBy(xpath = "//div[text()='Sign Out']")
	public WebElement logoutLink;
	
	
/** Flight Menu */

	@FindBy(xpath = "//a[text()='FLIGHTS']")
	private WebElement Flight_menu_xpath;
	
	@FindBy(xpath = "//div/nav/a[text()='TRAVEL REQUESTS']")
	private WebElement TravelRequest_menu_xpath;
	
	
	
 //Capture the Home screen URL with Flight search URL 

	public CommonPageElements_TRFtoTravel URL() throws Exception {
		// shortWait();
		getThreadSafeDriver().getCurrentUrl();
		//driver.getCurrentUrl();
		return this;
	}
	
	
	public CommonPageElements_TRFtoTravel ClickonFlightMenu(){
 		 waitAndClickWebElement(Flight_menu_xpath);
 		return this;
	}	
	
	public CommonPageElements_TRFtoTravel ClickonTravelRequestMenu(){
 		 waitAndClickWebElement(TravelRequest_menu_xpath);
 		return this;
	}	
	
	public CommonPageElements_TRFtoTravel logout_Travel() {
		 waitForElementVisible(hamburgerMenu);
		 waitForElementToClickable(hamburgerMenu);
		 click_Actions(hamburgerMenu);
		 waitAndClickWebElement(logoutLink);
		return this;
	}
	
	
	
	
}

