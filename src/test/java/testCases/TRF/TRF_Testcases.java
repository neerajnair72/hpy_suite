/*
package testCases.TRF;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import frameworkBase.TestBotBase;
import frameworkListeners.TestListeners;
import frameworkUtils.ExcelUtils;
import frameworkUtils.Log;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners(TestListeners.class)
@Epic("TRF Creation Tests")
@Feature("TRF")
public class TRF_Testcases extends TestBotBase {
	SoftAssert softassert = new SoftAssert();


	
	@AfterMethod
	public void testsetupafter() throws Exception {

	 	pageGenerator.commonPageElements().get().logout();	
	}
	
	@Test(priority = 1, description = "Add TRF from homepage")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create TRF from home page")
	@Story("TRF data feed")
	public void Test001_TRFCreation() throws Exception {
		
		
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 
		 pageGenerator.trfPage().get().Goto_TRFCreation_Page()
		 						 .CreateTRFwithNativeField(ExcelUtils.getRowDataWithSheetName(1, "TRF"))
		 		 	 			 .AddtripButton()
		 						 .SaveTRF();
 	}
	
	@Test(priority = 2, description = "Add TRF from homepage and verify in pending list")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add TRF from homepage and verify in pending list")
	@Story("TRF data feed")
	public void Test002_TRFVerifyPendingList() throws Exception {
		 pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 
		 pageGenerator.trfPage().get().Goto_TRF_Page()
//		 						 .Goto_TRFCreation_Page()
//		 						 .CreateTRFwithNativeField(ExcelUtils.getRowDataWithSheetName(1, "TRF"))
//		 		 	 			 .AddtripButton()
//		 						 .SaveTRF()
		 						 .VerifyPendingList("TRF Automation");
		 softassert.assertAll();	
		 
 	}
	
	@Test(priority = 3, description = "Edit TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Edit TRF")
	@Story("Edit TRF")
	public void Test003_TRFEdit() throws  Exception {
		 pageGenerator.loginPage().get()
		 						  .loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 
		 pageGenerator.trfPage().get().Goto_TRF_Page()
		 							  .EditTRF("Form updated successfully");
		 												 
		 
	}
	
	@Test(priority = 4, description = "Edit Trip")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Edit Trip")
	@Story("Edit Trip")
	public void Test004_TripEdit() throws  Exception {
		 pageGenerator.loginPage().get()
		 						  .loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 
		 pageGenerator.trfPage().get().Goto_TRF_Page()
		 							  .EditTrip("Request updated successfully");
		 												 
		 softassert.assertAll();
	}
	
	@Test(priority = 5, description = "Delete Trip inside TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Delete Trip inside TRF")
	@Story("Delete Trip inside TRF")
	public void Test005_TripDelete() throws  Exception {
		 pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 
		 pageGenerator.trfPage().get().Goto_TRF_Page()
		 							  .DeleteTrip("Request deleted successfully");
		 softassert.assertAll();	
						 
	}
	
	@Test(priority = 6, description = "Submit TRF from employee side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Submit TRF from employee side")
	@Story("Submit TRF from employee side")
	public void Test006_SubmitTRF() throws  Exception {
		 pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 
		 pageGenerator.trfPage().get().Goto_TRFCreation_Page()
		 						 .CreateTRFwithNativeField(ExcelUtils.getRowDataWithSheetName(1, "TRF"))
		 						 .AddtripButton()
		 						 .SubmitTRF("Form updated successfully");
		 softassert.assertAll();	
	}
	
	@Test(priority = 7, description = "Submit TRF without accept action in manager side")
	@Description("Test Description: Submit TRF without accept action in privileged side")
	public void test007_SubmitWithoutActionManager() throws Exception {
		pageGenerator.loginPage().get()
								.loginAuto(ExcelUtils.getRowDataWithSheetName(2, "Login"));
								
		
		pageGenerator.trfPagePrivileged().get()
		 									.toggle()
		 									.goto_TRF_Page()
		 									.SubmitWithoutAccept_Automation("Please select some action for all items");
								   
	}
	
	@Test(priority = 8, description = "Accept action on TRF in manager side")
	@Description("Test Description: Accept action on TRF")
	public void test008_AcceptActionManager_TRF() throws Exception {
		pageGenerator.loginPage().get()
								.loginAuto(ExcelUtils.getRowDataWithSheetName(2, "Login"));
								
		
		pageGenerator.trfPagePrivileged().get()
		 									.toggle()
		 									.goto_TRF_Page()
		 									.AcceptAll_Automation("Updated successfully");
								   
	}
	
	
	@Test(priority = 9, description = "Submit TRF without accept action in finance side")
	@Description("Test Description: Submit TRF without accept action in privileged side")
	public void test009_SubmitWithoutActionFinance() throws Exception {	
		pageGenerator.loginPage().get()
								.loginAuto(ExcelUtils.getRowDataWithSheetName(3, "Login"));
								
		
		pageGenerator.trfPagePrivileged().get()
		 									.toggle()
		 									.goto_TRF_Page()
		 									.SubmitWithoutAccept_Automation("Please select some action for all items");
								   
	}
	
	@Test(priority = 10, description = "Accept action on TRF in finance side")
	@Description("Test Description: Accept action on TRF")
	public void test010_AcceptActionFinance_TRF() throws Exception {
		pageGenerator.loginPage().get()
								.loginAuto(ExcelUtils.getRowDataWithSheetName(3, "Login"));
								
		
		pageGenerator.trfPagePrivileged().get()
		 									.toggle()
		 									.goto_TRF_Page()
		 									.AcceptAll_Automation("Updated successfully");
								   
	}
	
	
	@Test(priority = 11, description = "Recall the Submitted TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Recall the Submitted TRF")
	@Story("Recall the Submitted TRF")
	public void Test011_TRFRecall() throws  Exception {
		 pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 pageGenerator.trfPage().get().Goto_TRFCreation_Page()
		 							.CreateTRFwithNativeField(ExcelUtils.getRowDataWithSheetName(1, "TRF"))
		 							.AddtripButton()
		 							.SubmitTRF("Form updated successfully")
		 							.RecallTRF("Resource was recalled successfully");
		 												
	}
	
	@Test( priority = 12, description = "Delete TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Delete TRF")
	@Story("Delete TRF")
	public void Test012_TRFDelete() throws  Exception {	
		 pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 pageGenerator.trfPage().get().Goto_TRF_Page()
		 							  .DeleteTRF("Request deleted successfully");
		 												 
	}
	
	
	@Test(priority = 13, description = "Policy Violated TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Policy Violated TRF")
	@Story("Policy Violated TRF")
	public void Test013_ViolatedTRF() throws  Exception {
		 pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 pageGenerator.trfPage().get().Goto_TRF_Page()
		 								.selectViolatedFilter("Violated");
		 												 
		 softassert.assertAll();	
	}
	
	@Test(priority = 14, description = "Policy Not-Violated TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Export TRF")
	@Story("Export TRF")
	public void Test014_NotViolatedTRF() throws  Exception {
		 pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 pageGenerator.trfPage().get().Goto_TRF_Page()
		 								.selectNonViolatedFilter("Not Violated");
		 												 
		 softassert.assertAll();	
	}
	
	@Test(priority = 15, description = "Export TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Export TRF")
	@Story("Export TRF")
	public void Test015_TRFExport() throws  Exception {
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 pageGenerator.trfPage().get().Goto_TRF_Page()
		 							      .exportReport(ExcelUtils.getRowDataWithSheetName(1, "TRF"),"File generated successfully");
		 												 
		 softassert.assertAll();	
	}
	
	@Test(priority = 16, description = "Download Policy Exception TRF")
	@Description("Test Description: Download policy exception TRF only")
	public void test016_downloadPolicyException() throws Exception {
		 pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		pageGenerator.trfPage().get().Goto_TRF_Page()
		                           .policyExceptionReport(ExcelUtils.getRowDataWithSheetName(2, "Report"),"No Policy violations found for this organisation");

		softassert.assertAll();
	}

	@Test(priority = 17, description = "Download Workflow Comments TRF")
	@Description("Test Description: Download TRF with workflow comments")
	public void test017_downloadWorkflowComments() throws Exception {	
		 pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"));
		 
		pageGenerator.trfPage().get().Goto_TRF_Page()
		                           .downloadWorkflowComments(ExcelUtils.getRowDataWithSheetName(2, "Report"),"Your data export request has been received successfully. You will receive an email shortly");

		softassert.assertAll();

	}
	
	
	
}
*/
