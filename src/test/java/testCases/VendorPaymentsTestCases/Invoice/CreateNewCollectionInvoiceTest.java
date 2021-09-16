/*package testCases.VendorPaymentsTestCases.Invoice;

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
import pageobjects.VendorPaymentsView.CommonViews.PageElements_VendorPage;

*//**
 * The Class VendorModuleTests.
 *//*
@Listeners(TestListeners.class)
@Epic("Invoice Creation Tests")
@Feature("Create")
public class CreateNewCollectionInvoiceTest extends TestBotBase{
	 SoftAssert sa ;
     TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
		                                .clickContainer(ContainerElements_VendorPage.containerOptions.INVOICE);		                                		                                 		
	sa = new SoftAssert();		
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {
		                                      
		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
	}
	 private ContainerElements_VendorPage closeActivePage() throws Exception {
		 pageGenerator.InvoiceInitialPage().clickCross();
		return new ContainerElements_VendorPage(driver);		
	}
	private PageElements_VendorPage deleteDelivary() throws Exception {
		pageGenerator.ContainerElements_VendorPage()
                                               .gotoEditSavedOfMyDraft(ContainerElements_VendorPage.containerOptions.DELIVERY_ADDRESS);
        pageGenerator.DeliveryAddressDetailsPage()			                                          			                                        
                                                 .deleteDeliveryAddress() ; 
       return new PageElements_VendorPage(driver);
	}
	 @Test(priority=1)
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description-Create new delivary address from invoice page")
		@Story("Vendor Payments smoke test")
		public void TC_01_CreateNewDelivaryAddressFrom_Invoice_Test() throws Exception {
			
			String expectedMessage = super.getProperty("DeliveryAddressCreationToast");   
			String actualMessage =pageGenerator.InvoiceInitialPage()
			                                   .addNewDelivaryAddress()	
			                                   .createDeliveryAddress()
					                           .captureToastMessage();
			sa.assertEquals(actualMessage, expectedMessage);
			closeActivePage();
			deleteDelivary();
			sa.assertAll();
		}
	 @Test(priority=2)
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description-Test to assert location redirection after adding new delivary address")
		@Story("Vendor Payments smoke test")
		public void TC_02_AssertLocationAfterAdding_Invoice_Test() throws Exception {
			
			String expectedMessage = super.getProperty("InvoiceTitle");   
			String actualMessage =pageGenerator.InvoiceInitialPage()
			                                   .addNewDelivaryAddress()	
			                                   .createDeliveryAddress()
					                           .getTitle();
					                           
			sa.assertEquals(actualMessage, expectedMessage);
			closeActivePage();
			deleteDelivary();
			sa.assertAll();
		}
	 @Test(priority=3)
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description-Test to assert add new collection for workflow containers")
		@Story("Vendor Payments smoke test")
		public void TC_02_AssertAddCoolectionButton_Invoice_Test() throws Exception {
			
			boolean isDisplayed =true;
			isDisplayed =pageGenerator.InvoiceInitialPage()
			                                   .clickAttachVendor()
			                                   .isAddNewCollectionDisplayed();
					                           
			sa.assertTrue(isDisplayed);
			closeActivePage();
			sa.assertAll();
		}
}
*/