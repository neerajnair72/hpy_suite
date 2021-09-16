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
@Epic("Vendor Uodate Tests")
@Feature("Update")
public class EditVendorTest extends TestBotBase{
	private SoftAssert sa = new SoftAssert();
	TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(2, "Login_Vendor"))
		                                .goToPendingForApprovalContainer(ContainerElements_VendorPage.containerOptions.VENDOR);		                                		                                 				
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {
		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
	}
	 private void closeActivePage() throws Exception {
		 pageGenerator.VendorDetailsPage().clickCross();		
	}
	@Test(priority=1)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Mandatory field error validation for each field in vendor edit screen")
	@Story("Vendor Payments sanity test")
	public void TC_19_MandatoryCheck_Test() throws Exception {
		boolean isAllMandatoryMessageExists = false;		
		isAllMandatoryMessageExists = pageGenerator.VendorDetailsPage()
		                                           .clickEditVendor()
		                                           .clearMandatory()
		                                           .clickSave()
		                                           .assertMandatoryCheck();	
		sa.assertTrue(isAllMandatoryMessageExists);
		closeActivePage();
		sa.assertAll();					
	}
	@Test(priority=2)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify deafult value of a field of vendor update")
	   @Story("Vendor Payments sanity test")
	   public void TC_21_DefaultValueCheck_Test() throws Exception {
		   boolean isDefault=false;
		   isDefault=pageGenerator.VendorDetailsPage()
                                   .clickEditVendor()
				                   .defaultCheck();		   
		   sa.assertTrue(isDefault);
		   closeActivePage();
		   sa.assertAll();              	   
	   }
	 @Test(priority=3)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify dependent value of a field of vendor update")
	   @Story("Vendor Payments sanity test")
	   public void TC_22_DependentFieldCheck_Test() throws Exception {
		   boolean isDependent=false;		   
		   isDependent=pageGenerator.VendorDetailsPage()
				                     .clickEditVendor()
				                    .isDependentFieldDisplayed();
		   sa.assertTrue(isDependent);
		   closeActivePage();		   
		   sa.assertAll();              	   
	   }	 
	@Test(priority=4)
	 @Severity(SeverityLevel.NORMAL)
	 @Description("Test Description-Test to validate error message for bacc mismatch")
	 @Story("Vendor Payments sanity test")
	 public void TC_23_BaccMismatch_Test() throws Exception {
		 boolean isBaccMismatch=false;
		 isBaccMismatch=pageGenerator.VendorDetailsPage()
                                     .clickEditVendor()
                                     .clearBacc()
				                     .addBACC(ExcelUtils.getRowDataWithSheetName(1, "Vendor_Vendor"))
				                     .assertBACC(super.getProperty("BaccValidation"));
		 sa.assertTrue(isBaccMismatch);
		 closeActivePage();
		 sa.assertAll();
	 }
	@Test(priority=5)
	 @Severity(SeverityLevel.NORMAL)
	 @Description("Test Description-Test to validate error message for incorrect IFSC")
	 @Story("Vendor Payments sanity test")
	 public void TC_24_IFSCValidation_Test() throws Exception {
		 boolean isWrongIfsc=false;
		 isWrongIfsc=pageGenerator.VendorDetailsPage()
                                   .clickEditVendor()
                                   .clearIfsc()
				                   .assertIFSC(super.getProperty("IfscValidation"));
		 sa.assertTrue(isWrongIfsc);
		 closeActivePage();
		 sa.assertAll();
}
	 @Test(priority=6)
	 @Severity(SeverityLevel.NORMAL)
	 @Description("Test Description-Test to validate bank details")
	 @Story("Vendor Payments sanity test")
	 public void TC_25_BankDeatilsValidation_Test() throws Exception {
		 boolean getDetails=false;
		 getDetails=pageGenerator.VendorDetailsPage()
                                 .clickEditVendor()
                                 .clearIfsc()
				                 .assertBankDetails(super.getProperty("BranchName"),super.getProperty("BankName"));
		 sa.assertTrue(getDetails);
		 closeActivePage();
		 sa.assertAll();	 
	 }	
}
*/