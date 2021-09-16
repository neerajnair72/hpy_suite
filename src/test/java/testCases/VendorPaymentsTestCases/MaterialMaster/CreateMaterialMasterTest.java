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
@Epic("MaterialMaster Creation Tests")
@Feature("Create")
public class CreateMaterialMasterTest extends TestBotBase{
	 SoftAssert sa ;
     TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
		                                .clickContainer(ContainerElements_VendorPage.containerOptions.MATERIAL_MASTER);		                                		                                 		
	sa = new SoftAssert();		
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {

		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
	}
	 private void closeActivePage() throws Exception {
		 pageGenerator.MaterialMasterDetailsPage().clickCross();		
	}
	 @Test(priority=1)
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description-Create material master by entering all fields")
		@Story("Vendor Payments Smoke test")
		public void TC_01_Create_MaterialMaster_Test() throws Exception {			
			String expectedMessage = super.getProperty("MaterialMasrerCreationToast");   
			String actualMessage =pageGenerator.MaterialMasterDetailsPage()
			                                   .createMaterialMaster()	
					                           .captureToastMessage();
			sa.assertEquals(actualMessage, expectedMessage);
			sa.assertAll();
		}
	 @Test(priority=2)
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-Mandatory field error validation for each field in material master create screen")
		@Story("Vendor Payments sanity test")
		public void TC_05_MandatoryCheck_Test() throws Exception {
			boolean isAllMandatoryMessageExists = false;
			
			isAllMandatoryMessageExists = pageGenerator.MaterialMasterDetailsPage()
			                                           .clickSave()
			                                           .mandantotyCheck();	
			sa.assertTrue(isAllMandatoryMessageExists);
			closeActivePage();
			sa.assertAll();					
		}
	  @Test(priority=3)
	   @Severity(SeverityLevel.NORMAL)
	   @Description("Test Description-Test to verify auto save feature of material creation")
	   @Story("Vendor Payments sanity test")
	   public void TC_04_AutoSaveCheck_Test() throws Exception {
		String expectedMessage = ExcelUtils.getCellDataWithSheetName(1, 1, "MaterialMaster_Vendor");
		String actualMessage= pageGenerator.MaterialMasterDetailsPage()
				                               .enterMaterialName(ExcelUtils.getRowDataWithSheetName(1, "MaterialMaster_Vendor"))
				                               .clickCross()
				                               .clickAutoSave()
				                               .clickEditMaterialMaster()
				                               .captureValue();		
		   sa.assertEquals(actualMessage, expectedMessage);
		   closeActivePage();
		   sa.assertAll();
	   }
}
*/