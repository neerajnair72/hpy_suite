/*
package testCases.MoneyRequest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.lang.reflect.Method;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
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
import pageobjects.EmployeeViews.LoadRequestsPage;


@Listeners({ TestListeners.class })
@Epic("Money Request Smoke Tests")
@Feature("Login Tests")
public class MoneyRequestCreate extends TestBotBase {

	*/
/*Pre-requisites:
	1. Login: Reading from Excel Test data
	2. MR Details: Reading from Excel Test data
	*//*


	
	@Test(priority = 1, description = "Money Request without mandatory fields")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Money Request without mandatory fields")
	@Story("Money Request without mandatory fields")
	public void TC001_MoneyrequestWithoutMandatoryfields( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login
		    2. Go to MR
		    3. Click on New Advance Request
		    4. Miss mandatory field
		    5. Add Bill
		    6. Submit
		    7. Logout
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"))
										.goto_MR()
		                                .MoneyrequestWithoutMandatoryFields_OUP(ExcelUtils.getRowDataWithSheetName(1, "MR"))
		                                .imageUploadAndAssert(softAssert)
		                                .logout();
	}
	
	
	@Test(priority = 2, description = "Raise Money who is having no approver")
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Raise Money who is having no approver")
	@Story("Raise Money who is having no approver")
	public void  TC002_MoneyrequestHavingNoapprover( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login who is having no approver
		    2. Go to MR
		    3. Click on New Advance Request
		    4. Fill all the required fields
		    5. Add Bill
		    6. Submit
		    7. Logout
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(3, "Login"))
										.goto_MR()
		                                .createMoneyrequest_OUP(ExcelUtils.getRowDataWithSheetName(1, "MR"))  
		                                .Click_Submit("No approver is assigned for the next level verification. Please contact your admin.")                              
		                                .logout();
	}
	
	
	@Test(priority = 3, description = "Money Request with mandatory fields and capture the MRID")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request with mandatory fields and capture the MRID")
	@Story("Money Request with mandatory fields")
	public void  TC003_CreateMoneyrequestAndCaptureMrID( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login
		    2. Go to MR
		    3. Click on New Advance Request
		    4. Fill all the required fields
		    5. Add Bill
		    6. Submit
		    7. Capture MR ID
		    8. Logout
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"))
									   .goto_MR()	
		                               .createMoneyrequest_OUP(ExcelUtils.getRowDataWithSheetName(1, "MR"))
		                               .imageUploadAndAssert(softAssert)
		                               .Click_Submit("Money Request initiated successfully.")
		                               .getMoneyRequestId()
		                               .closeQuickView()
		                               .logout();
		
	}
	
	@Test(priority = 4, description = "Money Request approve from manager side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request approve from manager side")
	@Story("Money Request approve from manager side")
	public void  TC004_ApproveMoneyrequest( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login as manager
		    2. Go to MR on privileged side
		    3. Compate MR ID from previous test 
		    4. Take action and submit
		    5. Verify status after action in history tab
		    6. Logout
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(2, "Login"))
									   .goto_MR()
									   .Approve_manager_OUP()
									   .Verfiyactionstate_manager(LoadRequestsPage.PendingatFinanceState_xpath, "Pending at Finance")
									   .logout();
	
	}

	
	@Test(priority = 5, description = "Money Request verify from Finance")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request verify from Finance")
	@Story("Money Request verify from Finance")
	public void  TC005_VerifyMoneyrequest( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login as Finance
		    2. Go to MR on privileged side
		    3. Take action and submit
		    4. Verify status after action in history tab
		    5. Logout
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(3, "Login"))
									   .goto_MR()
									   .Verify_Finance_OUP()
									   .Verfiyactionstate_manager(LoadRequestsPage.VerifiedState_xpath, "Verified")
									   .logout();
	}

	@Test(priority = 6, description = "Money Request with bill and verify in list")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request with bill and verify in list")
	@Story("Money Request with bill and verify in list")
	public void  TC006_CreateMoneyrequestWithBill( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login
		    2. Go to MR
		    3. Click on New Advance Request
		    4. Fill all the required fields
		    5. Add Bill
		    6. Submit
		    7.Logout 
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"))
									   .goto_MR()
                                       .createMoneyrequestcommon_OUP(ExcelUtils.getRowDataWithSheetName(1, "MR"))
 		                               .imageUploadAndAssert(softAssert)
 		    			               .Click_Submit("Money Request initiated successfully.")
 		    			               .VerifyMR_pendingList_OUP()
 		    			               .logout();
	}

	
	@Test(priority = 7, description = "Money Request partial approve from manager side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request partial approve from manager side")
	@Story("Money Request partial approve from manager side")
	public void  TC007_PartApproveMoneyrequest( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login as manager
		    2. Go to MR on privilege side
		    3. part approve the MR
		    4. take action
		    5. Verify status after action in history tab
		    6. Logout
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(2, "Login"))
									   .goto_MR()
									   .PartApprove_manager()
									   .Verfiyactionstate_manager(LoadRequestsPage.PendingatFinanceState_xpath, "Pending at Finance")
									   .logout();
	
	}
	
	
	@Test(priority = 8, description = "Money Request partial approve from Finance side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request partial approve from Finance side")
	@Story("Money Request partial approve from Finance side")
	public void  TC008_PartVerifyMoneyrequest( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login as Finance
		    2. Go to MR on privilege side
		    3. part approve the MR
		    4. take action
		    5. Verify status after action in history tab
		    6. Logout
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(3, "Login"))
									   .goto_MR()
									   .PartApprove_finance()
									   .Verfiyactionstate_manager(LoadRequestsPage.VerifiedState_xpath, "Verified")
									   .logout();
	
	}
	
	
	
	@Test(priority = 9, description = "Money Request from Home dashboard")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request from Home dashboard")
	@Story("Money Request from Home dashboard")
	public void  TC009_MoneyrequestFromHome( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login as employee
		    2. Go to Home dashboard
		    3. Click on new advance request
		    4. Fill the required fields
		    5. Submit
		   
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"))
									   .goto_MR()
									   .HomeMenu()
                                       .createMoneyrequestHome_OUP(ExcelUtils.getRowDataWithSheetName(1, "MR"))
                                       .Click_Submit("Money Request initiated successfully.")
                                       .logout();
	}
	
	@Test(priority = 10, description = "Money Request Decline from manager side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request Decline from manager side")
	@Story("Money Request Decline from manager side")
	public void  TC010_DeclineMoneyrequestManager( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login as Manager
		    2. Go to MR on privilege side
		    3. Take Decline action
		    4. Verify status after action in history tab
		    5. Logout
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(2, "Login"))
									   .goto_MR()
									   .Decline_manager()
									   .Verfiyactionstate_manager(LoadRequestsPage.DeclineState_xpath, "Declined")
									   .logout();
	
	}
	
	@Test(priority = 11, description = "Money Request from Home dashboard")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request from Home dashboard")
	@Story("Money Request from Home dashboard")
	public void  TC011_MoneyrequestFromHome( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login
		    2. Go to MR
		    3. Click on New Advance Request
		    4. Fill all the required fields
		    5. Add Bill
		    6. Submit
		    7. Logout
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"))
									   .goto_MR()
									   .HomeMenu()
                                       .createMoneyrequestHome_OUP(ExcelUtils.getRowDataWithSheetName(1, "MR"))
                                       .Click_Submit("Money Request initiated successfully.")
                                       .logout();
	}
	
	@Test(priority = 12, description = "Money Request part approve from manager side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request part approve from manager side")
	@Story("Money Request part approve from manager side")
	public void  TC012_ApproveMoneyrequest( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login as Manager
		    2. Go to MR on privilege side
		    3. Take part approve action
		    4. Verify status after action in history tab
		    5. Logout
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(2, "Login"))
									   .goto_MR()
									   .PartApprove_manager()
									   .Verfiyactionstate_manager(LoadRequestsPage.PendingatFinanceState_xpath, "Pending at Finance")
									   .logout();
	
	}
	
	@Test(priority = 13, description = "Money Request Decline from Finance side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request Decline from Finance side")
	@Story("Money Request Decline from Finance side")
	public void  TC013_DeclineMoneyrequestFinance( ) throws Exception {
		*/
/*	Test Steps:
		    1. Login as Finance
		    2. Go to MR on privilege side
		    3. Take Decline action
		    4. Verify status after action in history tab
		    5. Logout
		   *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(3, "Login"))
									   .goto_MR()
									   .Decline_manager()
									   .Verfiyactionstate_manager(LoadRequestsPage.DeclineState_xpath, "Declined")
									   .logout();
	
	}
	
	
	
	@Test(priority = 14, description = "Money Request Export")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Money Request Export")
	@Story("Money Request Export")
	public void  TC014_MRExport( ) throws Exception{
		*/
/*	Test Steps:
	    1. Login
	    2. Go to MR
	    3. Click on Export
	    4. Click on download
	    5. Add email
	    6. Click on download
	    7. Logout
	    *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"))
		 							   .goto_MR()
		                               .Export(ExcelUtils.getRowDataWithSheetName(2, "MR"))
		                               .logout();
	}
	
	@Test(priority = 15, description = "Money Request Export Workflow comments")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Money Request Export comments")
	@Story("Money Request Export")
	public void  TC015_MRExportWorkflowComments( ) throws Exception{
		*/
/*	Test Steps:
	    1. Login
	    2. Go to MR
	    3. Click on Export
	    4. Click on Workflow comments
	    5. Add email
	    6. Click on download
	    7. Logout
	    *//*

		Log.info(getClass().getName() +"Test is starting");
		pageGenerator.loginPage().get().loginAuto(ExcelUtils.getRowDataWithSheetName(1, "Login"))
		 							   .goto_MR()
		                               .downloadWorkflowComments(ExcelUtils.getRowDataWithSheetName(2, "MR"), " dfYour data export request has been received successfully. You will receive an email shortly")
		                               .logout();
	}
}
*/
