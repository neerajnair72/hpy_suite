
 package testCases.Reports ;

 
 import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import frameworkBase.TestBotBase;
import frameworkListeners.TestListeners;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import orgUtils_ExpenseProduct.OUP_ExpenseOrg;
import orgUtils_ExpenseProduct.OUP_ReportOrg;
import pageobjects.CommonViews.CommonPageElements;
import pageobjects.CommonViews.LoginPage;
import testUtils.ExpenseUtilsOUP;


@Listeners(TestListeners.class) 
@Epic("Report Creation Tests")
@Feature("Reports")

public class ReportsModuleTestsOUP extends TestBotBase {
	
	@BeforeMethod
	public void Preconditions() {
		getThreadSafeDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	@Test(priority = 21, description ="Create a report without mandatory fields")
	@Description("Test Description: Create report")
	public void TC001_createReportWithoutMandatoryFields() throws Exception{
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 .goto_OUPReports_Page()
	                    	                         .CreateReportWithOutMandatoryFields_OUP("Please fill the Field - Type of Report")
	                    	                         .logout();
								 
		
	}
	
	@Test(priority = 22, description ="Create a report with mandatory fields")
	@Description("Test Description: Create a report with mandatory fields")
	public void TC002_createReport() throws Exception{
		
		OUP_ExpenseOrg.setTimestamp(Long.toString(new java.util.Date().getTime()));
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 .goto_OUPReports_Page()
		                                             .CreateReportWithMandatoryFields(ORG.OUP)
		                                             .clickSaveWithAssertion()
		                                             .logout();
		                                             	
	}
	
	@Test(priority = 23, description = "Edit a report and add existing expense")
	@Description("Test Description: Edit report and add existing expense")
	public void TC003_createReport_Add_ExistingExpense() throws Exception {
		final String stamp = Long.toString(new java.util.Date().getTime());
		OUP_ExpenseOrg.setTimestamp(stamp);
		ExpenseUtilsOUP.expenseCreationOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 .goto_OUPReports_Page()
													 .CreateReportWithMandatoryFields(ORG.OUP)
													 
													 .Add_Existing_Expense()
													 .clickSave()
													 .logout();
	}
	
	@Test(enabled=true,priority = 24, description = "Edit report, remove expense inside report")
	@Description("Test Description: Edit report, remove expense inside report")
	public void TC008_EditReportRemoveExpense() throws Exception{
		OUP_ExpenseOrg.setTimestamp(Long.toString(new java.util.Date().getTime()));
		ExpenseUtilsOUP.reportCreation_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 .goto_OUPReports_Page()
													 //.Add_Existing_Expense()
													 .RemoveExpense()
													 .clickSaveWithAssertion()
													 .logout();
	
	}
	
	@Test(priority = 25, description ="Create a report and new expense")
	@Description("Test Description: Create report and add new expense")
	public void TC004_createReport_AddNewExpense() throws Exception{
		OUP_ExpenseOrg.setTimestamp(Long.toString(new java.util.Date().getTime()));
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 .goto_Report_Page()
													 .CreateReportWithMandatoryFields(ORG.OUP)
													 .clickAddExpense();
		
		pageGeneratorNew.GetInstance(OUP_ExpenseOrg.class)
									.ReportExpenseType(excelUtils.getRowDataWithSheetName(1, "Expense"));
		
		
		//pageGeneratorNew.GetInstance(ExpensePage.class)
		//							.clickSave();
		
		pageGeneratorNew.GetInstance(OUP_ReportOrg.class)
									
									.goto_Report_Page()
									.assertFirstReport()
		 							.logout();
		
	}
	
	@Test(enabled=true,priority = 26, description = "Add Bill in expense inside report")
	@Description("Test Description: Add Bill for expense inside report")
	public void TC005_AddBillExpenseInsideReport() throws Exception{
		OUP_ExpenseOrg.setTimestamp(Long.toString(new java.util.Date().getTime()));
		ExpenseUtilsOUP.reportCreation_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		
													 .goto_OUPReports_Page()
													 .EditReportOUP()
													 .AddBillInsideReport_OUP()
													 .logout();
		
}

	@Test(enabled=true,priority = 27, description = "Delete Bill in expense inside report")
	@Description("Test Description: Delete Bill in expense inside report")
	public void TC006_DeleteBillExpenseInsideReport() throws Exception{
		OUP_ExpenseOrg.setTimestamp(Long.toString(new java.util.Date().getTime()));
		ExpenseUtilsOUP.reportCreation_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		ExpenseUtilsOUP.reportCreation_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		pageGeneratorNew.GetInstance(CommonPageElements.class).goto_OUPReports_Page().EditReportOUP()
				.AddBillInsideReport_OUP()

				.clickExpenseEdit_OUP().DeleteBillInsideReport_OUP().clickUpdate("Transaction updated successfully.")
				.clickSave().logout();
		
	}
	
	@Test(enabled=true,priority = 28, description = "Edit report, edit expense and save the expense")
	@Description("Test Description: Edit report and edit expense")
	public void TC007_addEditExpenseInReport() throws Exception{
		OUP_ExpenseOrg.setTimestamp(Long.toString(new java.util.Date().getTime()));
		ExpenseUtilsOUP.reportCreation_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 
													 .goto_OUPReports_Page()
													 .EditReportOUP()
													 .clickExpenseEdit_OUP()
													 .editTxnNativeField_OUP(excelUtils.getRowDataWithSheetName(2, "Expense"))
													 .clickUpdate("Transaction updated successfully.")
													 .clickSave()
													 .logout();
		
	}
	
	
	
//	@Test(enabled=false,priority = 29, description = "Split Expense inside the report")
//	@Description("Test Description: Split Expense inside the report")
//	public void TC009_SplitExpense_Report() throws Exception {
//		 
//		pageGenerator.loginPage().get()
//        						 .login(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
//        						 
//		pageGenerator.reportsPage().get()
//		                           .EditReport();
//	
//		 pageGenerator.expensePage().get()
//		 				 			.clickTxnSplit()
//		 							.splitTxn_OUP(excelUtils.getRowDataWithSheetName(1, "Expense"),"Transaction added successfully.");
//	}
	
	@Test(priority = 29, description = "Submit report from employee side")
	@Description("Test Description: Submit report from employee side")
	public void TC010_SubmitReport() throws Exception {
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 .goto_Report_Page()
													 .SubmitReport_Automation("Successfully Submitted")
													 .logout();
	
		
	}
	
/*	@Test(priority = 30, description = "Delete Report")
	@Description("Test Description: Delete Report")
	public void TC011_deleteReport() throws Exception{
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		.reportCreation(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 .goto_Report_Page()
													 .DeleteReport(ORG.OUP)
													 .logout();
	}*/
	
	@Test(priority = 31, description = "Submit report having no approver")
	@Description("Test Description: Submit report having no approver")
	public void TC012_SubmitReport_Noapprover() throws Exception {
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"))	
													 .goto_Report_Page()
													 .SubmitReport_Automation("No approver is assigned for the next level verification. Please contact your admin.")
						                  			 .logout();

}
		
	@Test(priority = 32, description = "Submit report without accept action in manager side")
	@Description("Test Description: Submit report without accept action in privileged side")
	public void TC013_SubmitWithoutActionManager() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
													.goto_Report_PrivilegePageOUP()
													//.goto_Report_Page()
													.SubmitWithoutAccept_Automation()
													.logout();
		
	}
	
	@Test(priority = 33, description = "Accept action on report in manager side")
	@Description("Test Description: Accept action on report")
	public void TC014_AcceptActionManager_Report() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
													 .goto_Report_PrivilegePageOUP()
													// .goto_Report_Page()
													 .AcceptAllManager_OUP("Updated successfully")
													 .logout();
		
	}
		
	@Test(priority = 34, description = "Submit report without accept action in finance side")
	@Description("Test Description: Submit report without accept action in privileged side")
	public void TC015_SubmitWithoutActionFinance() throws Exception {
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"))
													 .goto_Report_PrivilegePageOUP()
													// .goto_Report_Page()
													 .SubmitWithoutAccept_Automation()
													 .logout();
		
	}
	
	
	
	@Test(priority = 35, description = "Accept Hard copy on report in finance side")
	@Description("Test Description: Accept action on report")
	public void TC016_AcceptHardcopyFinance_Report() throws Exception {
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"))
													 .goto_Report_PrivilegePageOUP()
													// .goto_Report_Page()
													 .HardCopyReceivedALlFinance_OUP("Updated successfully")
													 .logout();
		
	}
	
	@Test(priority = 36, description = "Accept action on report in finance side")
	@Description("Test Description: Accept action on report")
	public void TC017_AcceptActionFinance_Report() throws Exception {
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"))
													 .goto_Report_PrivilegePageOUP()
													// .goto_Report_Page()
													 .AcceptAllFinance_OUP("Updated successfully")
													 .logout();
	}
	
	@Test(priority = 37, description = "Select Non Violated Reports")
	@Description("Test Description: Select Non violated reports from the filter")
	public void TC018_viewNonViolatedReport() throws Exception{
	pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 .goto_Report_Page()
													 .selectNonViolatedFilter("Not Violated")
													 .logout();
		
		}	
		
	@Test(priority = 38, description = "Download Report Excel")
	@Description("Test Description: Export the excel sheet ")
	public void TC019_downloadExcel()throws Exception{
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 .goto_Report_Page()
													 .exportReportOUP(excelUtils.getRowDataWithSheetName(2, "Report"))
													 .logout();
		
		
	}
		
	@Test(priority = 39, description = "Download Policy Exception Report")
	@Description("Test Description: Download policy exception reports only")
	public void TC020_downloadPolicyException () throws Exception {
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													.goto_Report_Page()
													.policyExceptionReport(excelUtils.getRowDataWithSheetName(2, "Report"),"No policy violations found for this organisation!")
													.logout();
		
	}
		
	@Test(priority = 40, description = "Download Workflow Comments Report")
	@Description("Test Description: Download reports with workflow comments")
	public void TC021_downloadWorkflowComments() throws Exception {
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 .goto_Report_Page()
													 .downloadWorkflowComments(excelUtils.getRowDataWithSheetName(2, "Report"),"Your data export request has been received successfully. You will receive an email shortly")
													 .logout();
		
	}
	
	@Test(priority = 41, description = "Delete Report from qucik view")
	@Description("Test Description: Delete Report from qucik view")
	public void TC022_DeleteReportQuickView() throws Exception {
		ExpenseUtilsOUP.reportCreation_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
													 .goto_Report_Page();
		
		
		pageGeneratorNew.GetInstance(OUP_ExpenseOrg.class)
		                              .DeleteReportQucikView("Report deleted Successfully.")
		                              .logout();
		
	}
	
	
	@Test(priority = 42, description = "Recall the submitted report")
	@Description("Test Description: Recall the submitted report")
	public void TC023_RecallReport() throws Exception {
		
		ExpenseUtilsOUP.reportCreation_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		.goto_OUPReports_Page()
		
		 .SubmitReport_Automation("Successfully Submitted");
//													 .CreateReportWithMandatoryFields(ORG.OUP)
//													 .clickAddExpense();
//		
//		pageGeneratorNew.GetInstance(OUP_ExpenseOrg.class)
//									.ReportExpenseType(excelUtils.getRowDataWithSheetName(1, "Expense"));
//		
//		pageGeneratorNew.GetInstance(ReportsPage.class)
//									.clickSave("Report updated Successfully.")
//									.SubmitReport_Automation("Successfully Submitted");
									
		pageGeneratorNew.GetInstance(OUP_ExpenseOrg.class)
									.RecallReport("Resource was recalled successfully.")
									.logout();
		
	}
	
	
	
/*@Test(priority = 45, description = "Decline action on report")
	@Description("Test Description: Accept action on report")
	public void TC025_DeclineAction_Report() throws Exception {
		pageGenerator.loginPage().get().loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"));
								
		
		pageGenerator.reportsPagePrivileged().get()
		 									.toggle()
		 									.goto_Report_Page()
		 									.Decline_Automation("Updated successfully");
								   
	}
	
	@Test(priority = 46, description = "Accept all action on report")
	@Description("Test Description: Accept action on report")
	public void TC026_AcceptAll_Report() throws Exception {
		pageGenerator.loginPage().get().loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"));
								
		
		pageGenerator.reportsPagePrivileged().get()
		 									.toggle()
		 									.goto_Report_Page()
		 									.AcceptAll_Automation("Updated successfully");
								   
	}
	
	@Test(priority = 47, description = "Decline all action on report")
	@Description("Test Description: Accept action on report")
	public void TC027_DeclineAll_Report() throws Exception {
		pageGenerator.loginPage().get().loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"));
								
		
		pageGenerator.reportsPagePrivileged().get()
		 									.toggle()
		 									.goto_Report_Page()
		 									.DeclineAll_Automation("Updated successfully");
								   
	}*/

	
	

	
	
	
}

