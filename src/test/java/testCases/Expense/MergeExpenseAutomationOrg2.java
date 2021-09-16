package testCases.Expense;

import frameworkBase.TestBotBase;
import frameworkListeners.TestListeners;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.CommonViews.LoginPage;

@Listeners(TestListeners.class)
@Epic("Expense Creation Tests")
@Feature("Expense")
public class MergeExpenseAutomationOrg2  extends TestBotBase {
/*
	*//*Pre-requisites:
	1. Login: Reading from Excel Test data
	2. Expense Type Details: Reading from Excel Test data
	*//*

	*//**
	 * Test to create expense for merge
	 * 
	 * @throws Exception*//*
	 
	@Test(invocationCount=1,priority = 1, description = "Create expenses for merge")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create expenses for merge")
	@Story("Expense smoke test")
	public void TC001_Expense_createExpenseformergeDeposit() throws Exception {
		
		*//*Pre-requisites:
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Add Expense
		    4. Select Expense type Deposit, Get expense details from excel
		    5. Add Bill
		    6. Save Expense
		    7. Logout
		*//*
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		                               .gotoExpense()
		                               .clickAddExpens()
		                               .createMergeExpense(ORG.AUTO, ExpenseType.Deposit)
		                               .imageUploadAndAssert()
		                               .SaveExpense_VerifyToast("Transaction added successfully.")
		                               .logout();
		
		
	}
	
	*//**
	 * Test to create expense for merge
	 * 
	 * @throws Exception*//*
	@Test(priority = 2, description = "Create expenses for merge")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create expenses for merge")
	@Story("Expense smoke test")
	public void TC002_Expense_createExpenseformergeCab() throws Exception {
		*//*Pre-requisites:
 	 	Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on Add Expense
	    4. Select Expense type Cab, Get expense details from excel
	    5. Add Bill
	    6. Save Expense
	    7. Copy the expense id and write into file
	    8. Logout
	    *//*
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
									   .gotoExpense()
		                               .clickAddExpens()
		                               .createMergeExpense(ORG.AUTO,ExpenseType.Cab)
		                               .imageUploadAndAssert()
		                               .SaveExpense_VerifyToast("Transaction added successfully.")               
	                                   .getExpenseId("Copied to clipboard succesfully !!!!")
	                                   .logout();
			}
	
	
	
	
	*//**
	 * Test to Auto Merge Expense icon is shown in expense list
	 * @throws Exception 
	 *//*
	
	@Test(priority = 3, description = "Verify the Auto Merge Expense icon is shown in expense list" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Verify the Auto Merge Expense icon is shown in expense list ")
	@Story("Expense smoke test")
	public void TC003_Expense_AutoMergeExpenseIconinExpenseList() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the Auto merged icon and get the tool tip message 
	    4. Compare the transaction id from file 
	    5. Logout
	    *//*
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 								.gotoExpense()
		 								.clickAddExpens()
			                            .createMergeExpense(ORG.AUTO, ExpenseType.Deposit)
			                            .imageUploadAndAssert()
			                            .SaveExpense_VerifyToast("Transaction added successfully.")
			                            .clickAddExpens()
			                            .createMergeExpense(ORG.AUTO,ExpenseType.Cab)
			                            .imageUploadAndAssert()
			                            .SaveExpense_VerifyToast("Transaction added successfully.")               
		                                .getExpenseId("Copied to clipboard succesfully !!!!")
		 							    .AutoMergeVerify("Merged Transaction 1 transactions merged to this transaction")
		 							    .compareTxnID("Copied to clipboard succesfully !!!!")
		 							    .logout();
		 
	}
	
	*//**
	 * Test to Verify the Auto merge expense details bills
	 * @throws Exception 
	 *//*
	@Test(priority = 4, description = "Verify Auto Merge Expense Bills" )
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Verify Auto Merge Expense Bills")
	@Story("Expense smoke test")
	public void TC004_Expense_VerfiyAutoMergeExpenseDetailsBills() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the Auto merged Expense, Edit the expense
	    4. get the count of bills
	    5. Logout
	    *//*
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
		 							    .MergeExpenseDetailsBills(2)
		 							    .logout();

	}
	
	*//**
	 * Test to Verify the Auto merge expense details bills
	 * @throws Exception 
	 *//*
	@Test(priority = 5, description = "Verify Auto Merge Expense Details" )
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Verify Auto Merge Expense Details")
	@Story("Expense smoke test")
	public void TC005_Expense_VerfiyAutoMergeExpenseDetails() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the Auto merged Expense, Edit the expense
	    4. Verify the Spent at and description
	    5. Logout
	    *//*
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 								.gotoExpense()
		 							    .MergeExpenseDetails(excelUtils.getRowDataWithSheetName(4, "Expense"))
		 							    .logout();
		 
	}
	
	*//**
	 * Test to Un Merge Expense
	 * @throws Exception 
	 *//*
	*//*@Test(priority = 6, description = "Verify the Un Merge Expense" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Verify the Un Merge Expense ")
	@Story("Expense smoke test")
	public void TC006_Expense_UnMerge() throws Exception {
		*//**//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the action menu in merged expense
	    4. Unmerge the expense, get the success message
	    5. Logout
	    *//**//*
		 
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		  								.gotoExpense()
		 							    .Unmergeexpense(CreateExpensePage.UnMergeSuccess_Xpath,"1 transactions successfully unmerged from this transaction :")
		 							    .logout();
	}*//*
	
	*//**
	 * Test to Verify Bills after unmerge
	 * @throws Exception 
	 *//*
	@Test(priority = 7, description = "Verify Bills after unmerge" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Verify Bills after unmerge ")
	@Story("Expense smoke test")
	public void TC007_Expense_VerifyBillsAfterUnMerge() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the un merged Expense, Edit the expense
	    4. Verify the count of bills
	    5. Logout
	    *//*
		 
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		   								.gotoExpense()
		 							    .MergeExpenseDetailsBills(1)
		 							    .logout();
	}
	
	*//**
	 * Test to Merge Expense icon is shown in expense list
	 * @throws Exception 
	 *//*
	@Test(priority = 8, description = "Verify the Merge Expense icon is shown in expense list" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Verify the Merge Expense icon is shown in expense list ")
	@Story("Expense smoke test")
	public void TC008_Expense_MergeExpenseIconinExpenseList() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Verify the merge option is shown in expense list
	    4. Logout
	    *//*
		 
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 								.gotoExpense()
		 							    .MergeExpenseIconinExpenseList("Mergeable Transaction 1 transactions can be merged to this transaction")
		 							    .logout();
	}
	
	*//**
	 * Test to Merge option is shown in hamburger menu
	 * @throws Exception 
	 *//*
	@Test(dependsOnMethods="TC008_Expense_MergeExpenseIconinExpenseList",priority = 9, description = "Test to Merge option is shown in hamburger menu" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Test to Merge option is shown in hamburger menu ")
	@Story("Expense smoke test")
	public void TC009_Expense_MergeExpenseIconinHamburger() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the action menu 
	    4. Verify the merge option is shown
	    5. Logout
	    *//*
		 
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		  								.gotoExpense()
		 							    .MergeExpenseinhamburger()
		 							    .logout();
	}
	
	*//**
	 * Test to verify merge expense without selecting mergable transaction
	 * @throws Exception 
	 *//*
	@Test(dependsOnMethods="TC009_Expense_MergeExpenseIconinHamburger",priority = 10,description = "Merge Expense without selecting mergable transaction" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Merge expense without selecting mergable transaction ")
	@Story("Expense smoke test")
	public void TC010_Expense_MergeExpenseWithoutSelectingMergableTransaction() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the action menu , click on merge option
	    4. Dont select mergeable tranaction and click on merge button
	    5. Logout
	    *//*
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 								.gotoExpense()
		 							    .MergeExpensewithoutSelectingExpense("Please select atleast one transaction to merge")
		 							    .logout();
		   
	}
	
	*//**
	 * Test to Manually merge Expense.
	 * @throws Exception 
	 *//*
	@Test(dependsOnMethods="TC010_Expense_MergeExpenseWithoutSelectingMergableTransaction",priority = 11, description = "Merge Expense" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Merge expense ")
	@Story("Expense smoke test")
	public void TC011_Expense_MergeExpense() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the action menu 
	    4. Click on the merge option and get the success message
	    5. Logout
	    *//*
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 								.gotoExpense()
		 							    .MergeExpense("1 transactions successfully merged to this transaction :")
		 							    .logout();
		   
	}
	
	*//**
	 * Test to Verify the merge expense details.
	 * @throws Exception 
	 *//*
	@Test(dependsOnMethods="TC011_Expense_MergeExpense",priority = 12, description = "Verify Merge Expense Details Amount and merchant" )
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Verify Merge Expense Details Amount and merchant")
	@Story("Expense smoke test")
	public void TC012_Expense_VerfiyMergeExpenseDetails() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the action menu and edit the expense
	    4. Verify the expense details 
	    5. Logout
	    *//*
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 								.gotoExpense()
		 							    .MergeExpenseDetails(excelUtils.getRowDataWithSheetName(4, "Expense"))
		 							    .logout();
	}
	
	*//**
	 * Test to Verify the merge expense details bills
	 * @throws Exception 
	 *//*
	@Test(dependsOnMethods="TC012_Expense_VerfiyMergeExpenseDetails",priority = 13, description = "Verify Merge Expense Details Amount and merchant" )
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Verify Merge Expense Details Amount and merchant")
	@Story("Expense smoke test")
	public void TC013_Expense_VerfiyMergeExpenseDetailsBills() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the action menu , edit the expense
	    4. Verify the count of bills
	    5. Logout
	    *//*
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 								.gotoExpense()
		 							    .MergeExpenseDetailsBills(2)
		 							    .logout();
	}
	
	*//**
	 * Test to Edit Merged expense
	 *//*
	@Test(dependsOnMethods="TC013_Expense_VerfiyMergeExpenseDetailsBills",priority = 14, description = "Verify Edit Merged Expense" )
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Verify Edit Merged Expense")
	@Story("Expense smoke test")
	public void TC014_Expense_EditMergeExpenseDetails() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the action menu and edit the expense
	    4. Change the spent at and description
	    5. Update the changes
	    6. Logout
	    *//*
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 								.gotoExpense()
		 							    .editMergeExpense(excelUtils.getRowDataWithSheetName(3, "Expense"))
		 							    .clickUpdate("Transaction updated successfully.")
		 							    .logout();
	}
	
	*//**
	 * Test to create expense for merge for more than 2 Transactions
	 * 
	 * @throws Exception*//*
	 
	*//*@Test(dependsOnMethods="TC014_Expense_EditMergeExpenseDetails",priority = 15, description = "Create expenses for merge")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create expenses for merge")
	@Story("Expense smoke test")
	public void TC015_Expense_createExpenseformerge() throws Exception {
		*//**//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Create expense with all the details
	    4. Logout
	    *//**//*
		
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 							    .gotoExpense()
		 								.Unmergeexpense(CreateExpensePage.UnMergeSuccess_Xpath,"1 transactions successfully unmerged from this transaction :")
		 								.clickAddExpens()
		 								.createMergeExpense(ORG.AUTO, ExpenseType.Cab)
		 								.imageUploadAndAssert()
		 								.SaveExpense_VerifyToast("Transaction added successfully.")
		 								.logout();
		
	}*//*
	
	*//**
	 * Test to Verify the Auto merge expense of 3 transactions
	 * @throws Exception 
	 *//*
	*//*@Test(dependsOnMethods="TC015_Expense_createExpenseformerge",priority = 16, description = "Verify Auto Merge Expense Details of 3 transactions" )
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Verify Auto Merge Expense Details of 3 transactions")
	@Story("Expense smoke test")
	public void TC016_Expense_VerfiyAutoMergeExpenseDetails() throws Exception {
		*//**//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the merged expense and get the tool tip message
	    4. Verify the merge option is shown
	    5. Logout
	    *//**//*
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 								.gotoExpense()
		 								.AutoMergeVerify("Merged Transaction 2 transactions merged to this transaction")
		 								.Unmergeexpense(CreateExpensePage.UnMergeSuccessTwo_Xpath,"2 transactions successfully unmerged from this transaction :") 
		 							   	.logout();
	}*//*
	
	*//**
	 * Test to Merge more than 2 transactions
	 *//*
	@Test(dependsOnMethods="TC016_Expense_VerfiyAutoMergeExpenseDetails",priority = 17, description = "Test to Merge 3 transactions" )
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Test to Merge 3 transactions")
	@Story("Expense smoke test")
	public void TC017_Expense_MergeExpensemorethanTwoTransactions() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the merged expense icon and select the 2 mergeble expenses
	    4. click on merge button and get the success message
	    5. Logout
	    *//*
		 
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 								.gotoExpense()
		 								.MergeMorethanTwoExpense("2 transactions successfully merged to this transaction :")
		 								.logout();
		
	}
	
	*//** Test to Delete expense from hamburger menu
	 * 
	 * @throws Exception
	 *//*
	@Test(dependsOnMethods="TC017_Expense_MergeExpensemorethanTwoTransactions",priority = 18, description = "Test to Delete expense from hamburger menu")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to Delete Expense from hamburger menu")
	@Story("Expense smoke test")
	public void TC018_Expense_DeleteFromHamburger() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the merged expense action menu and click on delete
	    4. Click on delete confirm
	    5. Logout
	    *//*
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 							    .gotoExpense()
		 							    .deleteExpenseHamburger_Automation("Transaction deleted successfully.")
		 							    .logout();
		     	
		}*/
	
}
