package pageobjects.TravelNew;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;
import net.bytebuddy.asm.Advice.Enter;

public class TripCreation extends TestBotElementsWrapper {
	
	/** Validate Proceed button */
	@FindBy (xpath = "//button[text() = 'Proceed']")
	private WebElement ClickProceed_Button_xpath;
	
	/** Validate Booking Engine */
	@FindBy (xpath = "//div/span[text() = 'Booking Engine']")
	private WebElement BookingEngine_Label_xpath;
	
	/** Validate Trip Form */
	@FindBy (xpath = "//div/span[text() = 'Trip Creation']")
	private WebElement TripCreation_Label_xpath;
	
	/** Mandatory Field */
	@FindBy (xpath = "//fieldset/legend[text() = 'Automation Test']/ancestor::div/input[@placeholder = 'e.g. Enter text here']")
	private WebElement MandatoryField_TextField_xpath;
	
	/** Validate On-Behalf field */
	@FindBy (xpath = "//span[@class = 'hw-radio-circle height-20 width-20']/ancestor::div/label[@for = 'on-behalf']")
	private WebElement OnBehalf_RadioButton_xpath;
	
	/** Validate On-Behalf */
	@FindBy (xpath = "//div/input[@data-testid = 'onbehalfPolicyHolderID']")
	private WebElement OnBehalf_TextField_xpath;
	
	/** Suggestion text */
	@FindBy (xpath = "//div[contains(text(),'Happay A Shetty(akshay.shetty@happay.in)')]")
	private WebElement Suggestion_Option_xpath;
	
	/** Validate invalid policy holder */
	@FindBy (xpath = "//div[text()='No users found !']")
	private WebElement InvalidPolicyHolder_Label_xpath;
	
	@Step("{method}")
	public void logout() throws Exception {
		GetInstance(CommonPageElementsTravelNew.class).logout();
	}
	

	@Step("{method}")
	public TripCreation ClickOnProceedButtonWithoutMandatoryField() throws Exception{
		SoftAssert sa = new SoftAssert();
		waitAndClickWebElement(ClickProceed_Button_xpath);
		
		boolean Actual = isElementDisplayed(TripCreation_Label_xpath);
		sa.assertTrue(Actual);
		sa.assertAll();
		return GetInstance(TripCreation.class);
	}
	
	@Step("{method}")
	public TripCreation ClickOnProceedButtonWithMandatoryField() throws Exception{
		SoftAssert sa = new SoftAssert();
		if (isElementDisplayed(MandatoryField_TextField_xpath)){
			MandatoryField_TextField_xpath.sendKeys("Test");
		}
		waitAndClickWebElement(ClickProceed_Button_xpath);
		
		boolean Actual = isElementDisplayed(BookingEngine_Label_xpath);
		sa.assertTrue(Actual);
		sa.assertAll();
		return GetInstance(TripCreation.class);
	}
	
	@Step("{method}")
	public TripCreation ClickOnProceedButtonWithoutPolicyHolder() throws Exception{
		SoftAssert sa = new SoftAssert();
		waitAndClickWebElement(OnBehalf_RadioButton_xpath);
		waitAndClickWebElement(ClickProceed_Button_xpath);
		
		boolean Actual = isElementDisplayed(TripCreation_Label_xpath);
		sa.assertTrue(Actual);
		sa.assertAll();
		return GetInstance(TripCreation.class);
	}
	
	@Step("{method}")
	public TripCreation ClickOnProceedButtonWithOnBehalfPolicyHolder() throws Exception{
		SoftAssert sa = new SoftAssert();
		waitAndClickWebElement(OnBehalf_RadioButton_xpath);
		selectSuggestion(OnBehalf_TextField_xpath, "Happay", Suggestion_Option_xpath);
		
		if (isElementDisplayed(MandatoryField_TextField_xpath)){
			MandatoryField_TextField_xpath.sendKeys("Test");
		}
		isElementDisplayed(ClickProceed_Button_xpath);
		waitAndClickWebElement(ClickProceed_Button_xpath);
		
		boolean Actual = isElementDisplayed(BookingEngine_Label_xpath);
		sa.assertTrue(Actual);
		sa.assertAll();
		return GetInstance(TripCreation.class);
	}
	
	@Step("{method}")
	public TripCreation ClickOnProceedButtonWithInvalidPolicyHolder() throws Exception{
		SoftAssert sa = new SoftAssert();
		waitAndClickWebElement(OnBehalf_RadioButton_xpath);
		
		OnBehalf_TextField_xpath.sendKeys("ABCD");
		waitForElementVisible(InvalidPolicyHolder_Label_xpath);
		
		if (isElementDisplayed(MandatoryField_TextField_xpath)){
			MandatoryField_TextField_xpath.sendKeys("Test");
		}
		
		boolean Actual = isElementDisplayed(InvalidPolicyHolder_Label_xpath);
		sa.assertTrue(Actual);
		sa.assertAll();
		return GetInstance(TripCreation.class);
	}
	
	
}
