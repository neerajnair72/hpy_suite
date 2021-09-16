
package pageobjects.TravelProductViews;

import frameworkBase.TestBotElementsWrapper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CommonPageElements_Travel extends TestBotElementsWrapper {

	
	
/** The hamburger menu. */

	//@FindBy(xpath = ".//*[@id='hamburger']")
	@FindBy(css ="img[src='./assets/images/hamburgernew.svg']") //"//*[@src='./assets/images/hamburgernew.svg']")
	@CacheLookup
	public WebElement hamburgerMenu;
	
	
/** The logout link. */

	@FindBy(xpath = "//div[text()='Sign Out']")
	@CacheLookup
	public WebElement logoutLink;
	
	
/** Flight Menu */

	@FindBy(xpath = "//a[text()='FLIGHTS']")
	private WebElement Flight_menu_xpath;
	
	
	
	
 //Capture the Home screen URL with Flight search URL 

	public CommonPageElements_Travel URL() throws Exception {
		//shortWait();
		getThreadSafeDriver().getCurrentUrl();
		return this;
	}
	
	
	public CommonPageElements_Travel ClickonFlightMenu(){
		//shortWait();
		waitAndClickWebElement(Flight_menu_xpath);
		//shortWait();
		return this;
	}	
	
	public CommonPageElements_Travel logout_Travel() throws Exception {
		
		//shortWait();
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotFile, new File("./screenGrab.png"));
		waitForElementVisible(hamburgerMenu);
		waitForElementToClickable(hamburgerMenu);
		hamburgerMenu.click();
		//click_Actions(hamburgerMenu);
		waitAndClickWebElement(logoutLink);
		
		return this;
	}
	
	
	
	
}

