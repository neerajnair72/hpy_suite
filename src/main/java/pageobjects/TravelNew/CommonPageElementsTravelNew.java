package pageobjects.TravelNew;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;

public class CommonPageElementsTravelNew extends TestBotElementsWrapper {

	
	/** The hamburger menu. */
	@FindBy(xpath = "//div[@id = 'hamburger']")
	private WebElement hamburgerMenu;
	
	/** The logout link. */
	@FindBy(xpath="//div[text() = 'Sign Out']")
	private WebElement logoutLink;
	
	
	@Step("{method}")
	public CommonPageElementsTravelNew logout() throws Exception {
		
		isElementDisplayed(hamburgerMenu);
		click_Actions(hamburgerMenu);
//		isElementDisplayed(logoutLink);
//	 	safeJavaScriptClick(logoutLink);
		isElementDisplayed(logoutLink);
		waitForElementToClickable(logoutLink);
		click_Actions(logoutLink);
		return this;
	}
	
}
