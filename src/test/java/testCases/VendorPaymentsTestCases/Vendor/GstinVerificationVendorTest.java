/*package testCases.VendorPaymentsTestCases.Vendor;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotBase;
import frameworkBase.TestBotElementsWrapper;
import frameworkListeners.TestListeners;
import frameworkUtils.ExcelUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageobjects.VendorPaymentsView.CommonViews.ContainerElements_VendorPage;

*//**
 * The Class VendorModuleTests.
 *//*
@Listeners(TestListeners.class)
@Epic("Vendor Gstin Tests")
@Feature("Create")
public class GstinVerificationVendorTest extends TestBotBase{
	 SoftAssert sa ;
     TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
		                                .clickContainer(ContainerElements_VendorPage.containerOptions.VENDOR);		                                		                                 		
	sa = new SoftAssert();		
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {

		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
	}
	 private void closeActivePage() throws Exception {
		 pageGenerator.VendorInitialPage().clickCross();		
	}
   @Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Validate wrong gstin")
	@Story("Vendor payments smoke test")
	public void TC_01_ValidateWrongGstin_Vendor_Test() throws Exception {
		
		boolean isValidated = false;   
		isValidated =pageGenerator.VendorInitialPage()
		                                   .enterGstin(ExcelUtils.getRowDataWithSheetName(3, "Vendor_Vendor"))
		                                   .validateGstin();
		sa.assertTrue(isValidated);
		closeActivePage();
		sa.assertAll();
	}
   @Test(priority=2)
  	@Severity(SeverityLevel.BLOCKER)
  	@Description("Test Description-Validate whether fetch button is enabled")
  	@Story("Vendor payments smoke test")
  	public void TC_01_ValidateFetchButtonEnabled_Vendor_Test() throws Exception {
  		
  		boolean isEnabled = false;   
  		isEnabled =pageGenerator.VendorInitialPage()
  		                                   .isFetchedEnabled();
  		sa.assertTrue(isEnabled);
  		closeActivePage();
  		sa.assertAll();
  	}
   @Test(priority=3)
  	@Severity(SeverityLevel.BLOCKER)
  	@Description("Test Description-Validate  gstin fields")
  	@Story("Vendor payments smoke test")
  	public void TC_01_ValidateGstinFields_Vendor_Test() throws Exception {
  		
    boolean isFetched = false;   
    isFetched= pageGenerator.VendorInitialPage()
  		                                   .enterGstin(ExcelUtils.getRowDataWithSheetName(2, "Vendor_Vendor"))
  		                                   .clickFetch()
  		                                   .validateFetchedData(ExcelUtils.getRowDataWithSheetName(3, "Vendor_Vendor"));
  		sa.assertTrue(isFetched);
  		closeActivePage();
  		sa.assertAll();
  	}
}
*/