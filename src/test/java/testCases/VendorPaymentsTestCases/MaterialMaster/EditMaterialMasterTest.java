/*package testCases.VendorPaymentsTestCases.MaterialMaster;

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
@Epic("MaterialMaster Edit Tests")
@Feature("Update")
public class EditMaterialMasterTest extends TestBotBase{
	SoftAssert sa ;
    TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
		                                .gotoEditSavedOfMyDraft(ContainerElements_VendorPage.containerOptions.MATERIAL_MASTER);		                                		                                 		
	sa = new SoftAssert();		
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {

		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
	}
	 private void closeActivePage() throws Exception {
		 pageGenerator.MaterialMasterDetailsPage()
		                                 .clickCross();		
	}
	 @Test(priority=1)
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-Very edit material master")
		@Story("Vendor Payments sanity test")
		public void TC_02_Edit_MaterialMaster_Test() throws Exception {
		 String expectedMessage = super.getProperty("MaterialMasrerUpdateToast"); 		
		 String actualMessage = pageGenerator.MaterialMasterDetailsPage()			                                          
			                                           .clearMandatory()
			                                           .editMaterialMaster()
			                                           .captureToastMessage();			                                           
		 sa.assertEquals(actualMessage, expectedMessage);
		 sa.assertAll();					
		}
	 @Test(priority=2)
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-Very delete material master")
		@Story("Vendor Payments sanity test")
		public void TC_03_Delete_MaterialMaster_Test() throws Exception {
		 String expectedMessage = super.getProperty("MaterialMasrerDeleteToast"); 		
		 String actualMessage = pageGenerator.MaterialMasterDetailsPage()			                                          			                                        
			                                           .deleteMaterialMaster()
			                                           .captureToastMessage();			                                           
		 sa.assertEquals(actualMessage, expectedMessage);
		 sa.assertAll();					
		}
	 @Test(priority=3)
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-Very mandatory check while editing material master")
		@Story("Vendor Payments sanity test")
		public void TC_06_MandatoryCheck_Test() throws Exception {
		 boolean isAllMandatoryMessageExists = false;
			
			isAllMandatoryMessageExists = pageGenerator.MaterialMasterDetailsPage()
					                                   .clearMandatory()
			                                           .clickSave()
			                                           .mandantotyCheck();	
			sa.assertTrue(isAllMandatoryMessageExists);
			closeActivePage();
			sa.assertAll();									
		}
}
*/