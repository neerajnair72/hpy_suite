/*package testCases.Expense;

import frameworkBase.TestBotBaseNew;
import frameworkListeners.TestListeners;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import orgUtils_ExpenseProduct.Automation_ExpenseOrg;
import pageobjects.CommonViews.LoginPage;

// TODO: Auto-generated Javadoc
*//**
 * The Class ExpenseModuleTests.
 *//*
@Listeners(TestListeners.class)
@Epic("Expense Creation Tests")
@Feature("Expense")
public class CreateExpenseTest  extends TestBotBaseNew {


	@Test(priority = 1, description = "Create expense by missing Amount mandatory field")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create expense by missing Amount mandatory field")
	@Story("Expense smoke test")
	public void Test001_Expense_CreateExpenseMissingAmountFields() throws Exception {

		pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
		 								.gotoExpense()
		 								.clickAddExpens()
		 								.fill_Missing_Amount_TransactionDetails(ORG.AUTO)
		 								.imageUploadAndAssert()
		 								.SaveExpense_VerifyToast("Please Enter Amount")
		 								.logout();
	}

	*//**
	 * Test to create expense and verify the same in pending list
	 * 
	 * @throws Exception*//*
	 
	@Test(priority = 2, description = "Add expense with native fields and verify the same in pending list")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and verify the same in pending list")
	@Story("Expense smoke test")
	public void Test002_Expense_createExpense_Verify_pending_list() throws Exception {

		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
										.clickAddExpens()
										.fillTransactionDetails(ORG.AUTO)
										.imageUploadAndAssert()
										.SaveExpense_VerifyToast("Transaction added successfully.")	;

		 pageGeneratorNew.GetInstance(Automation_ExpenseOrg.class)
				 						.VerifyExpense_pending_list_Automation()
				 						.logout();
	}
	
		
		

	*//**
	 * Test to create expense with native fields.
	 * @throws Exception 
	 *//*
	@Test(priority = 3, description = "Add expense with native fields" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields")
	@Story("Expense smoke test")
	public void Test003_CreateExpenseWithNativeFields() throws Exception {

		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
										.clickAddExpens()
										.fillTransactionDetails(ORG.AUTO)
										.imageUploadAndAssert()
										.SaveExpense_VerifyToast("Please Enter Amount")
		 								.logout();
	}
	
	
	*//**
	 * Test to edit expense with native field.
	 * @throws Exception 
	 *//*
	@Test(priority = 4, description = "Edit expense with native fields" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Edit expense with native fields")
	@Story("Expense smoke test")
	public void Test004_EditExpenseWithNativeFields() throws Exception {

		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
										.clickExpenseEdit()
										.editTxnNativeField(excelUtils.getRowDataWithSheetName(2, "Expense"))
										.clickUpdate("Transaction updated successfully.")	
										.logout();
	}
	
	*//**
	 * Test to Delete attachement.
	 * @throws Exception 
	 *//*
	@Test(priority = 5, description = "Delete Attachment in expense " )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Delete Attachment in expense ")
	@Story("Expense smoke test")
	public void TC005_DeleteBill() throws Exception {

		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
		 								.clickExpenseEdit()
		 							    .DeleteBill("Transaction attachment deleted successfully.")	
		 							    .logout();
			    
	}
	
	*//**
	 * Test to split expense.
	 *//*
	@Test(priority = 6, description = "Test to split the expense")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to split the expense")
	@Story("Expense smoke test")
	public void Test006_Expense_Split() throws Exception {

		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
										.clickTxnSplit()
										.splitTxn_Automation(excelUtils.getRowDataWithSheetName(1, "Expense"),"Transaction added successfully.")
										.logout();
           

	}
	
	
	*//** Test to Delete expense from hamburger menu
	 * 
	 * @throws Exception
	 *//*
	@Test(priority = 7, description = "Test to Delete expense from hamburger menu")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to Delete Expense from hamburger menu")
	@Story("Expense smoke test")
	public void Test007_Expense_DeleteFromHamburger() throws Exception {

		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
										.deleteExpenseHamburger_Automation("Transaction deleted successfully.")
										.logout();
		    
		}
	
	 *//** Test to delete the expense from quick view
	 * 
	 * @throws Exception
	 *//*
	@Test(priority = 8, description = "Test to Delete expense from Quick View")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to Delete Expense")
	@Story("Expense smoke test")
	public void Test008_Expense_DeleteFromQuickView() throws Exception {

		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
			.gotoExpense()
         							.deleteExpense("Transaction deleted successfully.")
         							.logout();
		 	
}
	*//**
	 * Test to check export.
	 * @throws Exception 
	 *//*
	@Test(priority = 9, description = "Check export " )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Check export  ")
	@Story("Expense smoke test")
	public void TC009_ExportExpense() throws Exception {

		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
			.gotoExpense()
		 								 .DownloadExpenseExcel("File generated successfully")
		 								.logout();
			    
	}
	
	*//**
	 * Test to check export.
	 * @throws Exception 
	 *//*
	@Test(priority = 10, description = "Create Auto Mileage expense " )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create Auto Mileage expense   ")
	@Story("Expense smoke test")
	public void TC010_AutoMileageExpense() throws Exception {

		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
										.clickAddExpens()
		              					.MileageExpense_Automation()
		              					.SaveExpense_VerifyToast("Transaction added successfully.")
		              					.logout();
	}
	
	*//** Test to Delete expense from hamburger menu
	 * 
	 * @throws Exception
	 *//*
	@Test(priority = 11, description = "Test to Delete expense from hamburger menu")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to Delete Expense from hamburger menu")
	@Story("Expense smoke test")
	public void Test011_Expense_DeleteFromHamburger() throws Exception {

		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
										.deleteExpenseHamburger_Automation("Transaction deleted successfully.")
										.logout();
		}
	
	
	@Test(priority = 20, description = "Create expense with Copy Settings Configured" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Create expense with Copy Settings Configured")
	@Story("Expense smoke test")
	
	public void TC020_CreateExpenseWithCopyConfigured() throws Exception {
		
		Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Add Expense
		    4. Select Expense Type as Copy
		    5. Add Amount
		    6. Add Description
		    7. Click Copy
		    8. Logout 
		    

		
		pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
										.clickAddExpens()
										.createTxnWithTxnType(excelUtils.getRowDataWithSheetName(5, "Expense"))
										.SaveExpense_VerifyToast("Transaction added successfully.")
										.logout();

	    
	}
	
	@Test(priority = 21, description = "Copy the transaction and verify new expense page to be opened " )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Copy the transaction and verify new expense page to be opened ")
	@Story("Expense smoke test")

	public void TC021_CopyParticularTxnType() throws Exception {
		
		Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Copy from hamburger menu
		    4. Verify Copy Expense page title
		    5. Logout  
		    
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
        								 .ClickCopy_VerifyTitle("COPY EXPENSE")
        								 .logout();

	     
	}
		 
   
	@Test(priority = 22, description = "Copy Expense without filling amount" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Copy expense without filling amount")
	@Story("Expense smoke test")
	
	public void TC022_CopyExpensewithoutAmount() throws Exception {
		
		Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Copy from hamburger menu
		    4. Add Description
		    5. Click Copy
		    6. Verify Error message
		    7. Logout
		
		    

		 pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
         								  .ClickCopy_VerifyTitle("COPY EXPENSE")
		 							      .clickCopyButton_VerifyToast("Please enter the conversion amount")
		 							     .logout();
			    
	    
	}
	
	
	@Test(priority = 23, description = "Copy Expense and verify the transaction id" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Copy Expense and verify the transaction id")
	@Story("Expense smoke test")

	public void TC023_VerifyCopyExpenseTransactionID()throws Exception {
		
		Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Copy from hamburger menu
		    4. Add Amount
		    5. Add Description
		    6. Add Attachment
		    7. Click Copy
		    8. Verify Transaction Id
		    9. Logout
		    

		pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
		 								 .copyExpense(excelUtils.getRowDataWithSheetName(5, "Expense"))
		 								 .clickCopyButton_VerifyToast("Transaction added successfully.")
		 								 .VerifyCopyExpense_TxnId()
		 								 .logout();

		
	}
	
	@Test(priority = 24, description = "Add Attachment while copying expense" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Add Attachment while copying expense")
	@Story("Expense smoke test")
	
	public void TC024_CopyExpenseAddAttachment()throws Exception {
		
		Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Copy from hamburger menu
		    4. Add Amount
		    5. Add Description
		    6. Add Attachment
		    7. Click Copy
		    8. Logout
		    

		pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
		    							 .copyExpense(excelUtils.getRowDataWithSheetName(5, "Expense"))
		    							 .imageUploadAndAssert()
			                             .clickCopyButton_VerifyToast("Transaction added successfully.")
			                             .logout();

	}
	
	@Test(priority = 25,description = "Change wallet while copying expense" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Change wallet while copying expense")
	@Story("Expense smoke test")
	
	public void TC025_CopyExpenseChangeWalletType()throws Exception {
		
		Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Copy from hamburger menu
		    4. Try changing Wallet
		    5. Logout
		    
	
		pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
		    							.copyExpenseChangeWallet_VerifyWalletReadonly(excelUtils.getRowDataWithSheetName(5, "Expense"))
		    							.logout();
		 
	}
	
	
	@Test(priority = 26,description = " Edit Expense Type While Copying")
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Edit Expense Type While Copying")
	@Story("Expense smoke test")
	
	public void TC026_CopyExpenseEditExpenseType()throws Exception {
		Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Copy from hamburger menu
		    4. Try changing Expense type
		    5. Logout
		    
 
		pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login"))
										.gotoExpense()
		    							.copyExpenseEditExpType_VerifyTypeReadonly()
		    							.logout();

	}
}


*/