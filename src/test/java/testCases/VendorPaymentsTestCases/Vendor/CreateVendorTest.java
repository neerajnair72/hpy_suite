/*package testCases.VendorPaymentsTestCases.Vendor;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
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
@Epic("Vendor Creation Tests")
@Feature("Create")
public class CreateVendorTest extends TestBotBase{
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
		 pageGenerator.VendorDetailsPage().clickCross();		
	}
   @Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Create vendor by entering all fields")
	@Story("Vendor payments smoke test")
	public void TC_01_Create_Vendor_Test() throws Exception {
		
		String expectedMessage = super.getProperty("VendorCreationToast");   
		String actualMessage =pageGenerator.VendorInitialPage()
		                                   .createVendor()	
				                           .captureToastMessage();
		sa.assertEquals(actualMessage, expectedMessage);
		closeActivePage();
		sa.assertAll();
	}
   	@Test(priority=2)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description-Create vendor and then submit it")
	@Story("Vendor payments smoke test")
	public void TC_02_Submit_Vendor_Test() throws Exception {	
		String expectedMessage =super.getProperty("VendorSubmissionToast");		
		String actualMessage = pageGenerator.VendorInitialPage()
                                            .createVendor()
                                            .clickSubmit()
                                            .captureToastMessage();         
		sa.assertEquals(actualMessage, expectedMessage);
	 	sa.assertAll();
	}
  @Test(priority=3)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description-Mandatory field error validation for each field in vendor create screen")
	@Story("Vendor payments sanity test")
	public void TC_11_MandatoryCheck_Test() throws Exception {
		boolean isAllMandatoryMessageExists = false;
		
		isAllMandatoryMessageExists = pageGenerator.VendorInitialPage()
		                                           .clickSave()
		                                           .assertMandatoryCheck();	
		sa.assertTrue(isAllMandatoryMessageExists);
		closeActivePage();
		sa.assertAll();					
	}
   @Test(priority=4)
   @Severity(SeverityLevel.NORMAL)
   @Description("Test Description-Test to verify auto save feature of vendor creation")
   @Story("Vendor payments sanity test")
   public void TC_12_AutoSaveCheck_Test() throws Exception {
	String expectedMessage = ExcelUtils.getCellDataWithSheetName(1, 1, "Vendor_Vendor");
	String actualMessage= pageGenerator.VendorInitialPage()
			                               .enterVendorName(ExcelUtils.getRowDataWithSheetName(1, "Vendor_Vendor"))
			                               .clickCross()
			                               .clickAutoSave()
			                               .clickEdit()
			                               .captureValue();		
	   sa.assertEquals(actualMessage, expectedMessage);
	   closeActivePage();
	   sa.assertAll();
   }
   @Test(priority=5)
   @Severity(SeverityLevel.NORMAL)
   @Description("Test Description-Test to verify deafult value of a field of vendor creation")
   @Story("Vendor payments sanity test")
   public void TC_13_DefaultValueCheck_Test() throws Exception {
	   boolean isDefault=false;
	   isDefault=pageGenerator.VendorInitialPage()
			                   .defaultCheck();
	   
	   sa.assertTrue(isDefault);
	   closeActivePage();
	   sa.assertAll();              	   
   }
   @Test(priority=6)
   @Severity(SeverityLevel.NORMAL)
   @Description("Test Description-Test to verify dependent value of a field of vendor creation")
   @Story("Vendor payments sanity test")
   public void TC_14_DependentFieldCheck_Test() throws Exception {
	   boolean isDependent=false;
	   isDependent=pageGenerator.VendorInitialPage()
			                    .isDependentFieldDisplayed();
	   sa.assertTrue(isDependent);
	   closeActivePage();
	   sa.assertAll();              	   
   }
	 @Test(priority=7)
	 @Severity(SeverityLevel.NORMAL)
	 @Description("Test Description-Test to validate error message for bacc mismatch")
	 @Story("Vendor payments sanity test")
	 public void TC_15_BaccMismatch_Test() throws Exception {
		 boolean isBaccMismatch=false;
		 isBaccMismatch=pageGenerator.VendorInitialPage()
				                     .addBACC(ExcelUtils.getRowDataWithSheetName(1, "Vendor_Vendor"))
				                     .assertBACC(super.getProperty("BaccValidation"));
		 sa.assertTrue(isBaccMismatch);
		 closeActivePage();
		 sa.assertAll();
	 }
	 @Test(priority=8)
	 @Severity(SeverityLevel.NORMAL)
	 @Description("Test Description-Test to validate error message for incorrect IFSC")
	 @Story("Vendor payments sanity test")
	 public void TC_16_IFSCValidation_Test() throws Exception {
		 boolean isWrongIfsc=false;
		 isWrongIfsc=pageGenerator.VendorInitialPage()
				                   .assertIFSC(super.getProperty("IfscValidation"));
		 sa.assertTrue(isWrongIfsc);
		 closeActivePage();
		 sa.assertAll();
}
	 @Test(priority=9)
	 @Severity(SeverityLevel.NORMAL)
	 @Description("Test Description-Test to validate bank details")
	 @Story("Vendor payments sanity test")
	 public void TC_17_BankDeatilsValidation_Test() throws Exception {
		 boolean getDetails=false;
		 getDetails=pageGenerator.VendorInitialPage()
				                   .assertBankDetails(super.getProperty("BranchName"),super.getProperty("BankName"));
		 sa.assertTrue(getDetails);
		 closeActivePage();
		 sa.assertAll();	 
	 }	
}
*/