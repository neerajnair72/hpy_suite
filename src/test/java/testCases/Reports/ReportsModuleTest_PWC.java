
package testCases.Reports;


import frameworkBase.TestBotBase;
import frameworkListeners.TestListeners;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.CommonViews.LoginPage;
import pageobjects.EmployeeViews.CreateExpensePage.CategoryOptions;
import pageobjects.EmployeeViews.ExpensePage;
import pageobjects.EmployeeViews.ReportsPage;


@Listeners(TestListeners.class)
@Epic("Report Creation Tests")
@Feature("Reports")

public class ReportsModuleTest_PWC extends TestBotBase {
	
	@Test(priority = 1, description = "Create a report without project")
	@Description("Test Description: Create report without project")
	public void test000_createReport_WithoutProject() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
													 .goto_Report_Page()
													 .CreateReportWithoutProject_PWC("Please fill the Field - Project Name")
													 .logout();
	}
	
	
	@Test(priority = 2, description = "Create a report and add new expense")
	@Description("Test Description: Create report and add new expense")
	public void test001_createReport_AddNewExpense() throws Exception {
	pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(5, "LoginPWC"))
												 .goto_Report_Page()
												 .CreateReportWithMandatoryFields(ORG.PWC)
												 .clickAddExpense()
			  									 .fillExpenseDetailsWithCategory(CategoryOptions.AIRFARE_EXPENSE)
			 							         .imageUploadAndAssert("2.png")
		                                         .clickSave_PWC();

		pageGeneratorNew.GetInstance(ReportsPage.class)
										.ViewExpenseInsideReport()
										.clickSave("Report updated Successfully.")
										.logout();
	}

	@Test(priority = 3, description = "Create a report and add existing expense")
	@Description("Test Description: Create report and add existing expense")
	public void test002_createReport_Add_ExistingExpense() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class)
										.loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
										.goto_Report_Page()
										.CreateReportWithMandatoryFields(ORG.PWC)
										.clickSaveReport()
				                        .EditReport_PWC()
										.Add_Existing_Expense("Report updated Successfully.")
										.clickSave("Report updated Successfully.")
										.logout();

	}
	
	@Test(priority = 4, description = "Submit report having no approver")
	@Description("Test Description: Submit report having no approver")
	public void test003_SubmitReport_Noapprover() throws Exception {
		
		pageGeneratorNew.GetInstance(LoginPage.class)
        						    .loginPWC(excelUtils.getRowDataWithSheetName(5, "LoginPWC"))
        						    .goto_Report_Page()
		                            .SubmitReport_PWC("No approver is assigned for the next level verification. Please contact your admin.")
		                            .logout();
	}

	@Test(priority = 5, description = "Create report Edit Report Add existing expense Edit Expense Save")
	@Description("Test Description: Create report - Edit report and edit expense")
	public void test004_addEditExpenseInReport() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
												     .goto_Report_Page()
				  									 .CreateReportWithMandatoryFields(ORG.PWC)
				                                     .clickSaveReport()
				                                     .EditReport_PWC()
													 .Add_Existing_Expense("Report updated Successfully.")
												     .clickExpenseEdit_PWC()
												     .editTxnNativeField_PWC(excelUtils.getRowDataWithSheetName(2, "Expense_PWC"))
												     .clickUpdate_PWC("Transaction updated successfully.")
												     //.clickSave("Report updated Successfully.")
												     .logout();

	}
	
	@Test(priority = 6, description = "Split Expense inside the report")
	@Description("Test Description: Split Expense inside the report")
	public void test005_SplitExpense_Report() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class)
											.loginPWC(excelUtils.getRowDataWithSheetName(6, "LoginPWC"))
											.goto_Report_Page()
											.CreateReportWithMandatoryFields(ORG.PWC)
											.Add_Existing_Expense("Report updated Successfully.");
											//.EditReport_PWC();


		pageGeneratorNew.GetInstance(ExpensePage.class)
		 							.clickTxnSplit()
		 							.splitTxn_PWC(excelUtils.getRowDataWithSheetName(1, "Expense_PWC"),"Transaction added successfully.")
		 							.logout();
	}

	
	@Test(priority = 7, description = "Delete report")
	@Description("Test Description: Create report and then delete it")
	public void test006_deleteReport() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
													 .goto_Report_Page()
													 .DeleteReport(ORG.PWC)
													 .logout();
		
	}

	@Test(priority = 8, description = "Select Non Violated Reports")
	@Description("Test Description: Select Non violated reports from the filter")
	public void test007_viewNonViolatedReport() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
													 .goto_Report_Page()
													 .selectNonViolatedFilter("Not Violated")
													 .logout();
}

	@Test(priority = 9, description = "Select  Violated Reports")
	@Description("Test Description: Select violated reports from the filter")
	public void test008_viewViolatedReport() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
													 .goto_Report_Page()
													 .selectViolatedFilter("Violated")
													 .logout();	
	}	

	@Test(priority = 10, description = "Download Report Excel")
	@Description("Test Description: Export the excel sheet ")
	public void test009_downloadExcel() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
													 .goto_Report_Page()
													 .exportReport(excelUtils.getRowDataWithSheetName(2, "Report"),"File generated successfully")
													 .logout();
		
	}

	@Test(priority = 11, description = "Download Policy Exception Report")
	@Description("Test Description: Download policy exception reports only")
	public void test010_downloadPolicyException() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
		                         					 .goto_Report_Page()
													 .policyExceptionReport(excelUtils.getRowDataWithSheetName(2, "Report"),"No policy violations found for this organisation!")
													 .logout();
	
	}

	@Test(priority = 12, description = "Download Workflow Comments Report")
	@Description("Test Description: Download reports with workflow comments")
	public void test011_downloadWorkflowComments() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
		                         					 .goto_Report_Page()
		                         					 .downloadWorkflowComments(excelUtils.getRowDataWithSheetName(2, "Report"),"There are no comments for the selected date range")
		                         					 .logout();
	}
	
//	@Test(enabled=true,priority = 52, description = "Edit report, edit expense inside report and delete Bill")
//	@Description("Test Description: Create report and edit expense")
//	public void test005_EditExpenseInReportDeleteBill() throws Exception{
//		pageGenerator.loginPage().get()
//								.login(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
//								.goto_Report_Page();
//		
//		pageGenerator.reportsPage().get()					 
//        						    .EditReport();
//			
//		pageGenerator.reportsPage().get()
//									.clickExpenseEdit_PWC()
//									.DeleteBill_PWC("Policy Error: Bill attachment is mandatory");
//		
//		
//		
//	}
	
	
//	@Test(priority = 52, description = "Recall Submitted report")
//	@Description("Test Description: Recall Submitted report")
//	public void test012_RecallReport() throws Exception {
//
//		
//
//		pageGenerator.loginPage().get()
//		                         .login(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
//		                         .goto_Report_Creation_Page();
//
//		pageGenerator.reportsPage().get()
//								   .CreateReportWithMandatoryFields_PWC(excelUtils.getRowDataWithSheetName(1, "Report"), "Report created successfully").clickAddExpense();
//
//		pageGenerator.createExpensePage().get()
//		                                 .fillExpenseDetailsWithCategory(CategoryOptions.AIRFARE_EXPENSE)
//		                                 .imageUploadAndAssert(softassert).clickSave();
//
//		pageGenerator.reportsPage().get()
//		 						   .clickSubmit("Successfully submitted")
//		 						   .selectPendingForApprovalReport_PWC("Pending for Approval")
//		 						   .recall_PWC("");
//		
//		
//		//write code to recall report here
//		
//		softassert.assertAll();
//
//	}

}

