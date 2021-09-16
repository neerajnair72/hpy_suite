
package testCases.TRF;

import frameworkBase.TestBotBase;
import frameworkListeners.TestListeners;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.CommonViews.CommonPageElements;
import pageobjects.CommonViews.LoginPage;
import pageobjects.EmployeeViews.TRFPage;

@Listeners(TestListeners.class)
@Epic("TRF Creation Tests")
@Feature("TRF")
public class TRF_TestcasesOUP extends TestBotBase {


	private void logoutOfExpense() throws Exception {
		pageGeneratorNew.GetInstance(CommonPageElements.class).logout();

	}
	
	@Test(priority = 1, description = "Add TRF from homepage")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create TRF from home page")
	@Story("TRF data feed")
	public void Test001_TRFCreation() throws Exception {

		
		pageGeneratorNew.GetInstance(LoginPage.class)
		 						.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 
		pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRFCreation_Page()
		 						 .CreateTRFwithNativeField(excelUtils.getRowDataWithSheetName(1, "TRF"))
		 		 	 			 .AddtripButton()
		 						 .SaveTRF_OUP();
		logoutOfExpense();
 	}
	
	@Test(priority = 2, description = "Add TRF from homepage and verify in pending list")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add TRF from homepage and verify in pending list")
	@Story("TRF data feed")
	public void Test002_TRFVerifyPendingList() throws Exception {
		
		
		
		pageGeneratorNew.GetInstance(LoginPage.class)
		 						.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 
		pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRF_Page()
//		 						 .Goto_TRFCreation_Page()
//		 						 .CreateTRFwithNativeField(excelUtils.getRowDataWithSheetName(1, "TRF"))
//		 		 	 			 .AddtripButton()
//		 						 .SaveTRF()
		 						 .VerifyPendingList("TRF Automation");

		logoutOfExpense();
 	}
	
//	@Test(priority = 3, description = "Edit TRF", alwaysRun=true)
//	@Severity(SeverityLevel.BLOCKER)
//	@Description("Test Description: Edit TRF")
//	@Story("Edit TRF")
//	public void Test003_TRFEdit() throws Exception {
//		
//		
//		
//		 pageGenerator.loginPage().get()
//		 						  .loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
//		 
//		 try {
//			pageGenerator.trfPage().get().Goto_TRF_Page()
//			 							  .EditTRF("Form updated successfully");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 												 
//		
//	}
	
	@Test(alwaysRun=true,priority = 4, description = "Edit Trip")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Edit Trip")
	@Story("Edit Trip")
	public void Test004_TripEdit() throws  Exception {	
		SoftAssert softAssert = new SoftAssert();
		pageGeneratorNew.GetInstance(LoginPage.class)
		 						  .loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 
		pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRF_Page()
		 							  .EditTrip("Request updated successfully");
		 												 
		 softAssert.assertAll();
		logoutOfExpense();
	}
	
	@Test(alwaysRun=true,priority = 5, description = "Delete Trip inside TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Delete Trip inside TRF")
	@Story("Delete Trip inside TRF")
	public void Test005_TripDelete() throws  Exception {
		
		pageGeneratorNew.GetInstance(LoginPage.class)
		 							.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 
		pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRF_Page()
		 							  .DeleteTrip("Request deleted successfully");
		 
		logoutOfExpense();
						 
	}
	
	@Test(alwaysRun=true,priority = 6, description = "Submit TRF from employee side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Submit TRF from employee side")
	@Story("Submit TRF from employee side")
	public void Test006_SubmitTRF() throws  Exception {
		
		
		
		pageGeneratorNew.GetInstance(LoginPage.class)
		 						.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 
		pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRFCreation_Page()
		 						 .CreateTRFwithNativeField(excelUtils.getRowDataWithSheetName(1, "TRF"))
		 						 .AddtripButton()
		 						 .SubmitTRF_OUP("Form updated successfully");
		
		logoutOfExpense();
	}
	
	@Test(alwaysRun=true,priority = 6, description = "save TRF from employee side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Submit TRF from employee side")
	@Story("Submit TRF from employee side")
	public void Test006_SaveTRF() throws  Exception {
		
		
		
		pageGeneratorNew.GetInstance(LoginPage.class)
		 						.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 
		pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRFCreation_Page()
		 						 .CreateTRFwithNativeField(excelUtils.getRowDataWithSheetName(1, "TRF"))
		 						 .AddtripButton()
		 						 .SaveTRF_OUP();
		 
		logoutOfExpense();
	}
	
	
/*@Test(enabled =false,priority = 7, description = "Submit TRF without accept action in manager side")
	@Description("Test Description: Submit TRF without accept action in privileged side")
	public void Test007_SubmitWithoutActionManager() throws Exception {

		
		pageGenerator.loginPage().get()
								.loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"));
								
		
		pageGenerator.trfPagePrivileged().get()
		 									.toggle()
		 									.goto_TRF_Page()
		 									.SubmitWithoutAccept_Automation("Please select some action for all items");
		logoutOfExpense();
	}
	
	@Test(enabled =false,priority = 8, description = "Accept action on TRF in manager side")
	@Description("Test Description: Accept action on TRF")
	public void Test008_AcceptActionManager_TRF() throws Exception {
		
		
		pageGenerator.loginPage().get()
								.loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"));
								
		
		pageGenerator.trfPagePrivileged().get()
		 									.toggle()
		 									.goto_TRF_Page()
		 									.AcceptAll_Automation("Updated successfully");
		logoutOfExpense();
	}
	
	
	@Test(enabled =false,priority = 9, description = "Submit TRF without accept action in finance side")
	@Description("Test Description: Submit TRF without accept action in privileged side")
	public void Test009_SubmitWithoutActionFinance() throws Exception {
		
		
		pageGenerator.loginPage().get()
								.loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"));
								
		
		pageGenerator.trfPagePrivileged().get()
		 									.toggle()
		 									.goto_TRF_Page()
		 									.SubmitWithoutAccept_Automation("Please select some action for all items");
		logoutOfExpense();
	}
	
	@Test(enabled =false,priority = 10, description = "Accept action on TRF in finance side")
	@Description("Test Description: Accept action on TRF")
	public void Test010_AcceptActionFinance_TRF() throws Exception {
		
		
		pageGenerator.loginPage().get()
								.loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"));
								
		
		pageGenerator.trfPagePrivileged().get()
		 									.toggle()
		 									.goto_TRF_Page()
		 									.AcceptAll_Automation("Updated successfully");
		logoutOfExpense();
	}
	
	
	@Test(enabled=false,priority = 11, description = "Recall the Submitted TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Recall the Submitted TRF")
	@Story("Recall the Submitted TRF")
	public void Test011_TRFRecall() throws  Exception {
		
		
		 pageGenerator.loginPage().get()
		 						.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 pageGenerator.trfPage().get()
		                             .Goto_TRFCreation_Page()
		 							.CreateTRFwithNativeField(excelUtils.getRowDataWithSheetName(1, "TRF"))
		 							.AddtripButton()
		 							.SubmitTRF_OUP("Form updated successfully")
		 							.RecallTRF("Resource was recalled successfully.");
		logoutOfExpense();
	}
*/
	
	@Test(alwaysRun=true, priority = 12, description = "Delete TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Delete TRF")
	@Story("Delete TRF")
	public void Test012_TRFDelete() throws  Exception {
		
		
		pageGeneratorNew.GetInstance(LoginPage.class)
		 						.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRF_Page()
		 							  .Goto_TRFCreation_Page()
		 							  .CreateTRFwithNativeField(excelUtils.getRowDataWithSheetName(1, "TRF"))
		 							  .AddtripButton()
		 							  .SaveTRF_OUP()
		 							  .DeleteTRF_OUP("Request deleted successfully");
		logoutOfExpense();
		 												 
	}
	
	
	@Test(alwaysRun=true,priority = 13, description = "Policy Violated TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Policy Violated TRF")
	@Story("Policy Violated TRF")
	public void Test013_ViolatedTRF() throws  Exception {
		SoftAssert softAssert = new SoftAssert();
		pageGeneratorNew.GetInstance(LoginPage.class)
		 						.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRF_Page()
		 								.selectViolatedFilter("Violated");
		 												 
		 softAssert.assertAll();
		logoutOfExpense();
	}
	
	@Test(alwaysRun=true,priority = 14, description = "Policy Not-Violated TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Export TRF")
	@Story("Export TRF")
	public void Test014_NotViolatedTRF() throws  Exception {
		
		SoftAssert softAssert = new SoftAssert();
		pageGeneratorNew.GetInstance(LoginPage.class)
		 						.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRF_Page()
		 								.selectNonViolatedFilter("Not Violated");
		 												 
		 softAssert.assertAll();
		logoutOfExpense();
	}
	
	@Test(alwaysRun=true,priority = 15, description = "Export TRF")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Export TRF")
	@Story("Export TRF")
	public void Test015_TRFExport() throws  Exception {
		SoftAssert softAssert = new SoftAssert();
		
		pageGeneratorNew.GetInstance(LoginPage.class)
		 						.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRF_Page()
		 							      .exportReport(excelUtils.getRowDataWithSheetName(1, "TRF"),"File generated successfully");
		 												 
		 softAssert.assertAll();
		logoutOfExpense();
	}
	
	@Test(alwaysRun=true,priority = 16, description = "Download Policy Exception TRF")
	@Description("Test Description: Download policy exception TRF only")
	public void Test016_downloadPolicyException() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		
		pageGeneratorNew.GetInstance(LoginPage.class)
		 						.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRF_Page()
		                           .policyExceptionReport(excelUtils.getRowDataWithSheetName(2, "Report"),"No Policy violations found for this organisation");

		softAssert.assertAll();
		logoutOfExpense();
	}

	@Test(alwaysRun=true,priority = 17, description = "Download Workflow Comments TRF")
	@Description("Test Description: Download TRF with workflow comments")
	public void Test017_downloadWorkflowComments() throws Exception {
		SoftAssert softAssert = new SoftAssert();
		pageGeneratorNew.GetInstance(LoginPage.class)
		 						.loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 
		 pageGeneratorNew.GetInstance(TRFPage.class).Goto_TRF_Page()
		                           .downloadWorkflowComments(excelUtils.getRowDataWithSheetName(2, "Report"),"Your data export request has been received successfully. You will receive an email shortly");

		softAssert.assertAll();
		logoutOfExpense();

	}


	
	
}

