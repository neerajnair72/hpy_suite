package testCases.Expense;

import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotBase;
import frameworkUtils.Log;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import orgUtils_ExpenseProduct.OUP_ExpenseOrg;
import pageobjects.CommonViews.CommonPageElements;
import pageobjects.CommonViews.LoginPage;
import testUtils.ExpenseUtilsOUP;
import testUtils.RESTAPIUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class ExpenseModuleTests for OUP org in Pre prod
 */

@Epic("Expense Creation Tests")
@Feature("Expense")
public class CreateExpenseTestOUP  extends TestBotBase {

	SoftAssert softAssert = new SoftAssert();
	Random rand = new Random();
	private void logoutOfExpense() throws Exception {
		pageGeneratorNew.GetInstance(CommonPageElements.class).logout();

	}
	
	
	@Test(priority = 1, description = "Create expense by missing Amount mandatory field")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create expense by missing Amount mandatory field")
	@Story("Expense smoke test in OUP pre prod org")
	public void TC001_Expense_CreateExpenseMissingAmountFields() throws Exception {
		
		 
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
			                            .gotoExpense()
			                            .clickAddExpens()
									  	.fill_Missing_Amount_TransactionDetails(ORG.OUP)
									  	.clickSave()
									  	.verifyPageTitle("CREATE EXPENSE")
		 								.logout();
	}



	/**
	 * Test to create expense and verify the same in pending list
	 * 
	 * @throws Exception*/
	 
	@Test(priority = 2, description = "Add expense with native fields and verify the same in pending list")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and verify the same in pending list")
	@Story("Expense smoke test")
	public void TC002_Expense_createExpense_Verify_pending_list() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		 								.gotoExpense()
		 								.clickAddExpens()
		                              	.fillTransactionDetails(ORG.OUP)
		                              	.clickSave()
		                              	.SaveExpense_VerifyToast("Transaction added successfully.")
		                              	.fetchlatestTxnId()
		                              	.logout();



	}
	
	/**
	 * Test to Edit expense by without giving spent 
	 * @throws Exception 
	 */
	@Test(priority = 3, description = "Test to Edit expense by without giving spent" )
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Test to Edit expense by without giving spent  ")
	@Story("Expense smoke test")
	public void TC003_Expense_EditExpenseWithoutSpentAt() throws Exception {
		
		//ExpenseUtilsOUP.expenseCreationOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
								.gotoExpense()
								.openRecentlyCreatedTxn()
								.clickExpenseEdit()
								.EditExpenseWithoutSpentAt_OUP("Please enter Spent At")
								.logout();
	}
	
	/**
	 * Test to Edit expense by without giving Description 
	 * @throws Exception 
	 */
	@Test(priority = 4, description = "Test to Edit expense by without giving Description" )
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Test to Edit expense by without giving Description")
	@Story("Expense smoke test")
	public void TC004_Expense_EditExpenseWithoutDescription() throws Exception {
		
		ExpenseUtilsOUP.expenseCreationOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
						.gotoExpense()
						.openRecentlyCreatedTxn()
						.clickExpenseEdit()
		 				.EditExpenseWithoutDescription_OUP("Please enter the Description")
		 				.logout();
	}
	
	/**
	 * Test to create expense with native fields.
	 * @throws Exception 
	 */
	@Test(priority = 5, description = "Add expense type split with native fields" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields")
	@Story("Expense smoke test")
	public void TC005_CreateExpenseWithNativeFields() throws Exception {
		
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
					            	.gotoExpense()
		 							.clickAddExpens();
		 
		 pageGeneratorNew.GetInstance(OUP_ExpenseOrg.class)
						.SplitExpenseTypeOUP(excelUtils.getRowDataWithSheetName(1, "Expense"))
						.clickSave()
						.verifyToastMessage("Transaction added successfully.")
						.logout();
													
	}
	
	
	/**
	 * Test to edit expense with native field.
	 * @throws Exception 
	 */
	@Test(priority = 6, description = "Edit expense with native fields" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Edit expense with native fields")
	@Story("Expense smoke test")
	public void TC006_EditExpenseWithNativeFields() throws Exception {	
		
		//ExpenseUtilsOUP.expenseCreationOUPSplit_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
					                .gotoExpense()
					                .fetchlatestTxnId()
		               				.clickExpenseEdit()
		               				.editTxnNativeField_OUP(excelUtils.getRowDataWithSheetName(2, "Expense"))
		               				.clickUpdateBtn()
		               				.verifyExpenseButton()
		               				.logout();
	}
	
	/**
	 * Test to Delete attachement.
	 * @throws Exception 
	 */
	@Test(priority = 7, description = "Delete Attachment in expense " )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Delete Attachment in expense ")
	@Story("Expense smoke test")
	public void TC007_DeleteBill() throws Exception {
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
					                				.gotoExpense()
					                				.clickAddExpens()
					                				.fillTransactionDetails(ORG.OUP)
					                              	.imageUploadAndAssert("1.png")
					                              	.clickSaveNew()
					                              	.SearchForlatestCreatedTxn("Domestic Travel: Company Paid")
					                				.clickExpenseEdit()
					                				.DeleteBillOUP()
					                				.logout();
	}
	
	/**
	 * Test to split expense.
	 */
	@Test(priority = 8, description = "Test to split the expense")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to split the expense")
	@Story("Expense smoke test")
	public void TC008_Expense_Split() throws Exception {
		
		//ExpenseUtilsOUP.expenseCreationOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
					                	.gotoExpense()
					                	.openRecentlyCreatedTxn()
					                	.clickTxnSplit()
					                	.splitTxn_OUP(excelUtils.getRowDataWithSheetName(1, "Expense"))
					                	.logout();
	}
	
	/**
	 * Test to Delete expense from hamburger menu
	 * 
	 * @throws Exception
	 */
	@Test(priority = 9, description = "Test to Delete expense from hamburger menu")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to Delete Expense from hamburger menu")
	@Story("Expense smoke test")
	public void TC009_Expense_DeleteFromHamburger() throws Exception {

		ExpenseUtilsOUP.expenseCreationOUPSplit_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));

		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				        .gotoExpense()
				        .clickAddExpens()
				        .fillTransactionDetails(ORG.OUP)
				        .clickSave()
				        .SaveExpense_VerifyToast("Transaction added successfully.")
				        .fetchlatestTxnId()
				        .openRecentlyCreatedTxn()
				        .deleteExpenseHamburger_Automation("Transaction deleted successfully.")
				        .logout();
	}
	
	 /** Test to delete the expense from quick view
	 * 
	 * @throws Exception
	 */
	@Test(priority = 10, description = "Test to Delete expense from Quick View")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to Delete Expense")
	@Story("Expense smoke test")
	public void TC010_Expense_DeleteFromQuickView() throws Exception {
		
		ExpenseUtilsOUP.expenseCreationOUPSplit_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
					                .gotoExpense()
					                .clickAddExpens()
							        .fillTransactionDetails(ORG.OUP)
							        .clickSave()
							        .SaveExpense_VerifyToast("Transaction added successfully.")
							        .fetchlatestTxnId()
							        .openRecentlyCreatedTxn()
         							.deleteExpense("Transaction deleted successfully.")
         							.logout();
}
	/**
	 * Test to check export.
	 * @throws Exception 
	 */
	@Test(priority = 11, description = "Check export " )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Check export  ")
	@Story("Expense smoke test")
	public void TC011_ExportExpense() throws Exception {
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				 .gotoExpense()
				 .DownloadExpenseExcel("File generated successfully")
				 .logout();
			    
	}
	
	/**
	 * Test to check export.
	 * @throws Exception 
	 */
	@Test(priority =12, description = "Create Mileage expense " )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create  Mileage expense   ")
	@Story("Expense smoke test")
	public void TC012_MileageExpense() throws Exception {


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.gotoExpense()
				.clickAddExpens()
				.MileageExpense_OUP(excelUtils.getRowDataWithSheetName(1, "Expense"))
				.imageUploadAndAssert("1.png")
				.SaveExpense_VerifyToast("Transaction added successfully.")
				.logout();


	}
	
	/**
	 * Test to View Expense.
	 * @throws Exception 
	 */
	@Test(priority = 13, description = "View Expense" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: View expense ")
	@Story("Expense smoke test")
	public void TC013_Expense_ViewExpense() throws Exception {
		
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
					                .gotoExpense()
				 					.ViewExpense_PWC()
				 					.logout();
			    
	}
	


	/**
	 * Test to Merge Expense icon is shown in expense list
	 * @throws Exception
	 */
	@Test(priority = 14, description = "Verify the Merge Expense icon is shown in expense list and Merge option is shown in hamburger menu" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Verify the Merge Expense icon is shown in expense list and Merge option is shown in hamburger menu ")
	@Story("Expense smoke test")
	public void TC014_Expense_MergeExpenseIconinAndMergeExpenseinHamburgerExpenseList() throws Exception {
		/*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Verify the merge option is shown in expense list
	    4. Logout
	    */

		double Expense_amount=rand.nextInt()+rand.nextDouble();
        excelUtils.getRowDataWithSheetName(1,  "LoginOUP");
		Response loginResponse = RESTAPIUtils.loginMethod(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		System.out.println("Login Response"+loginResponse.getBody().asString());
		String CID = loginResponse.getHeader("HAPPAY-CID");
		String TOKEN = loginResponse.getHeader("HAPPAY-TOKEN");
		HashMap<String, String> getAuthData_Onboarding = new HashMap<>();
		getAuthData_Onboarding.put("HAPPAY-CID", CID);
		getAuthData_Onboarding.put("HAPPAY-TOKEN", TOKEN);

		String transaction_id= RESTAPIUtils.isMergeExpenseIDPresent(getAuthData_Onboarding, "transaction", "0", "60", "true", "18903");
       Log.info("transaction id:"+transaction_id);
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.gotoExpense()
				.CreateAndMergeExpenseOUP(Expense_amount)
				.getMergeExpenseID(transaction_id)
				.MergeExpenseinhamburger()
				.MergeExpenseIconinExpenseList("merged to this transaction")
				.logout();
		
		

	}

	@Test(priority = 15, description = "Verify the Auto Merge Expense " )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Verify the Auto Merge Expense  ")
	@Story("Expense smoke test")
	public void TC015_Expense_AutoMergeExpenseIconinaAndExpenseBillsExpenseList() throws Exception {
		/*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the Auto merged icon and get the tool tip message
	    4. Compare the transaction id from file
	    5. Logout
	    */

		ExpenseUtilsOUP.expenseCreationMergeOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"), "345");
		ExpenseUtilsOUP.expenseCreationMergeOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"), "345");
		Response loginResponse = RESTAPIUtils.loginMethod(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));


		String CID = loginResponse.getHeader("HAPPAY-CID");
		String TOKEN = loginResponse.getHeader("HAPPAY-TOKEN");
		HashMap<String, String> getAuthData_Onboarding = new HashMap<>();
		getAuthData_Onboarding.put("HAPPAY-CID", CID);
		getAuthData_Onboarding.put("HAPPAY-TOKEN", TOKEN);

		// Given
		String transaction_id= RESTAPIUtils.isAutoMergeExpenseIDPresent(getAuthData_Onboarding, "transaction", "0", "60", "true", "18903");


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.gotoExpense()
				.AutoMergeVerify("transactions can be merged to this transaction")
				.getMergeExpenseID(transaction_id)
				.MergeExpenseDetails(345)
				.logout();
	}

	/**
	 * Test to Un Merge Expense
	 * @throws Exception **/
	@Test(priority = 16, description = "Verify the Un Merge Expense" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Verify the Un Merge Expense ")
	@Story("Expense smoke test")
	public void TC016_Expense_UnMerge() throws Exception {
		/*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the action menu in merged expense
	    4. Unmerge the expense, get the success message
	    5. Logout **/

		double Expense_amount=rand.nextInt()+rand.nextDouble();


		Response loginResponse = RESTAPIUtils.loginMethod(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));

		String CID = loginResponse.getHeader("HAPPAY-CID");
		String TOKEN = loginResponse.getHeader("HAPPAY-TOKEN");
		HashMap<String, String> getAuthData_Onboarding = new HashMap<>();
		getAuthData_Onboarding.put("HAPPAY-CID", CID);
		getAuthData_Onboarding.put("HAPPAY-TOKEN", TOKEN);

		String transaction_id= RESTAPIUtils.isAutoMergeExpenseIDPresent(getAuthData_Onboarding, "transaction", "0", "60", "true", "18903");
		System.out.println("Transaction ID" +transaction_id);

		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.gotoExpense()
				.CreateAndMergeExpenseOUP(Expense_amount)
				.getMergeExpenseID(transaction_id)
				.Unmergeexpense("transactions successfully unmerged from this transaction :")
				.logout();
	}

	
	/**
	 * Test to verify merge expense without selecting mergable transaction
	 * @throws Exception 
	 */
	@Test(priority = 17,description = "Merge Expense without selecting mergable transaction" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Merge expense without selecting mergable transaction ")
	@Story("Expense smoke test")
	public void TC017_Expense_MergeExpenseWithoutSelectingMergableTransaction() throws Exception {
		/*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the action menu , click on merge option
	    4. Dont select mergeable tranaction and click on merge button
	    5. Logout
	    */


		ExpenseUtilsOUP.expenseCreationMergeOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"), "600");
		ExpenseUtilsOUP.expenseCreationMergeOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"), "600");

		Response loginResponse = RESTAPIUtils.loginMethod(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));

		String CID = loginResponse.getHeader("HAPPAY-CID");
		String TOKEN = loginResponse.getHeader("HAPPAY-TOKEN");
		HashMap<String, String> getAuthData_Onboarding = new HashMap<>();
		getAuthData_Onboarding.put("HAPPAY-CID", CID);
		getAuthData_Onboarding.put("HAPPAY-TOKEN", TOKEN);

		String transaction_id= RESTAPIUtils.isMergeExpenseIDPresent(getAuthData_Onboarding, "transaction", "0", "60", "true","18903");
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.gotoExpense()
				.getMergeExpenseID(transaction_id)
				.MergeExpensewithoutSelectingExpense("Please select atleast one transaction to merge")
				.logout();
		   
	}
	
	

	/**
	 * Test to Edit Merged expense
	 */
	@Test(priority = 27, description = "Verify Edit Merged Expense" )
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Verify Edit Merged Expense")
	@Story("Expense smoke test")
	public void TC027_Expense_EditMergeExpenseDetails() throws Exception {
		/*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the action menu and edit the expense
	    4. Change the spent at and description
	    5. Update the changes
	    6. Logout
	    */
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		 								.gotoExpense()
		 							    .editMergeExpense(excelUtils.getRowDataWithSheetName(3, "Expense"))
		 							    .clickUpdate("Transaction updated successfully.")
		 							    .logout();
		    
	}
	
	/**
	 * Test to create expense for merge for more than 2 Transactions
	 * 
	 * @throws Exception*/
	 
	/*@Test(priority = 28, description = "Create expenses for merge")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create expenses for merge")
	@Story("Expense smoke test")
	public void TC028_Expense_createExpenseformerge() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Create expense with all the details
	    4. Logout
	    *//*
		
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
									   .gotoExpense()
									   .Unmergeexpense(CreateExpensePage.UnMergeSuccess_Xpath,"1 transactions successfully unmerged from this transaction :")
		                               .clickAddExpens()
		                               .createMergeExpense(ORG.OUP,ExpenseType.NonTravel_OutofPocket)
		                               .imageUploadAndAssert()
		                               .SaveExpense_VerifyToast("Transaction added successfully.")
		                               .logout();
		
	}
	*/
	/**
	 * Test to Verify the Auto merge expense of 3 transactions
	 * @throws Exception 
	 */
	/*@Test(priority = 29, description = "Verify Auto Merge Expense Details of 3 transactions" )
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Verify Auto Merge Expense Details of 3 transactions")
	@Story("Expense smoke test")
	public void TC029_Expense_VerfiyAutoMergeExpenseDetails() throws Exception {
		*//*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the merged expense and get the tool tip message
	    4. Verify the merge option is shown
	    5. Logout
	    *//*
		
		

		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
										.gotoExpense()
		 					 	    	.AutoMergeVerify("Merged Transaction 2 transactions merged to this transaction")
		 							    .Unmergeexpense(CreateExpensePage.UnMergeSuccessTwo_Xpath,"2 transactions successfully unmerged from this transaction :")
		 							    .logout();
		 
	}*/
	

	
	/** Test to Delete expense from hamburger menu
	 * 
	 * @throws Exception
	 */
	@Test(priority = 19, description = "Test to Delete expense from hamburger menu")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to Delete Expense from hamburger menu")
	@Story("Expense smoke test")
	public void TC019_Expense_DeleteFromHamburger() throws Exception {
		/*Pre-requisites:
		Test Steps:
	    1. Login
	    2. Go to Expense
	    3. Click on the merged expense action menu and click on delete
	    4. Click on delete confirm
	    5. Logout
	    */
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
										 .gotoExpense()
							             .clickAddExpens()
									     .fillTransactionDetails(ORG.OUP)
									     .clickSave()
									     .SaveExpense_VerifyToast("Transaction added successfully.")
									     .fetchlatestTxnId()
									     .openRecentlyCreatedTxn()
         							     .deleteExpenseHamburger_Automation("Transaction deleted successfully.")
         							     .logout();
		
		}
	 
	@Test(priority = 32, description = "Create expense with Copy Settings Configured" )
	@Description("Test Description: Create expense with Copy Settings Configured")
	@Story("Expense smoke test")

	public void TC032_CreateExpenseWithCopyConfigured() throws Exception {

		/*Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Add Expense
		    4. Select Expense Type as Copy
		    5. Add Amount
		    6. Add Description
		    7. Click Copy
		    8. Logout 
		    */
		
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				 						.gotoExpense()
				 						.clickAddExpens()
				 						.createTxnWithTxnType(excelUtils.getRowDataWithSheetName(5, "Expense"))  
				 						//.verifyType("COPY")
				 						.clickSave()
				 						.fetchlatestCopyTypeTxnId()
				 						.logout();

	
	}
	
	
	@Test(priority = 33, description = "Copy the transaction and verify new expense page to be opened " )
	@Description("Test Description: Copy the transaction and verify new expense page to be opened ")
	@Story("Expense smoke test")
	
	public void TC033_CopyParticularTxnType() throws Exception {

		/*Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Copy from hamburger menu
		    4. Verify Copy Expense page title
		    5. Logout  
		    */
		
	//	ExpenseUtilsOUP.expenseCreationCopyOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		
        pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
					                	.gotoExpense()
					                	.openRecentlyCreatedCopyTypeTxn()
        								.ClickCopy_VerifyTitle("COPY EXPENSE")
        								.logout();

	     
	}
		 
   
	@Test(priority = 34, description = "Copy Expense without filling amount" )
	@Description("Test Description: Copy expense without filling amount")
	@Story("Expense smoke test")
	
	public void TC034_CopyExpensewithoutAmount() throws Exception {
		
		/*Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Copy from hamburger menu
		    4. Add Description
		    5. Click Copy
		    6. Verify Error message
		    7. Logout
		
		    */
		
		//ExpenseUtilsOUP.expenseCreationCopyOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		
		 pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		 								.gotoExpense()
		 								.openRecentlyCreatedCopyTypeTxn()
					                	.copyExpenseWithoutAmount()
		 							    .clickCopyButton_VerifyToast()
		 							    .verifyPageTitle("COPY EXPENSE")
		 							    .logout();
			    
	     
	}
	
	
	@Test(priority = 35, description = "Copy Expense and verify the transaction id" )
	@Description("Test Description: Copy Expense and verify the transaction id")
	@Story("Expense smoke test")
	
	public void TC035_VerifyCopyExpenseTransactionID()throws Exception {
		
		/*Pre-requisites:	
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
		    */
		
		//ExpenseUtilsOUP.expenseCreationCopyOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
										.gotoExpense()
										.openRecentlyCreatedCopyTypeTxn()
										.copyExpense(excelUtils.getRowDataWithSheetName(5, "Expense"))
		 								.clickCopyButton()
		 								.VerifyCopyExpense_TxnId()
		 								.logout();	 
	}
	
	@Test(priority = 36, description = "Add Attachment while copying expense" )
	@Description("Test Description: Add Attachment while copying expense")
	@Story("Expense smoke test")
	
	public void TC036_CopyExpenseAddAttachment()throws Exception {
		
		/*Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Copy from hamburger menu
		    4. Add Amount
		    5. Add Description
		    6. Add Attachment
		    7. Click Copy
		    8. Logout
		    */
		
		
		//ExpenseUtilsOUP.expenseCreationCopyOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
									   .gotoExpense()
									   .openRecentlyCreatedCopyTypeTxn()
									   .copyExpense(excelUtils.getRowDataWithSheetName(5, "Expense"))	
									   .imageUploadAndAssert("2.png")
			                           .clickCopyButton()
			                           .logout();

		 
	}
	
	@Test(priority = 37,description = "Change wallet while copying expense" )
	@Description("Test Description: Change wallet while copying expense")
	@Story("Expense smoke test")
	
	public void TC037_CopyExpenseChangeWalletType()throws Exception {
		
		/*Pre-requisites:
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Copy from hamburger menu
		    4. Try changing Wallet
		    5. Logout
		    */
		//ExpenseUtilsOUP.expenseCreationCopyOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		   								.gotoExpense()
		   								.openRecentlyCreatedCopyTypeTxn()
		    							.copyExpenseChangeWallet_VerifyWalletReadonly(excelUtils.getRowDataWithSheetName(5, "Expense"))
		    							.logout();
		 

	
	}
	
	
	@Test(priority = 38,description = " Edit Expense Type While Copying")
	@Description("Test Description: Edit Expense Type While Copying")
	@Story("Expense smoke test")
	
	public void TC038_CopyExpenseEditExpenseType()throws Exception {
		
		/*Pre-requisites:
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Click on Copy from hamburger menu
		    4. Try changing Expense type
		    5. Logout
		    */
		
			 
		//ExpenseUtilsOUP.expenseCreationCopyOUP_API(excelUtils.getRowDataWithSheetName(1, "LoginOUP"));
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		   							   .gotoExpense()
		   							   .openRecentlyCreatedCopyTypeTxn()
		   							   .copyExpenseEditExpType_VerifyTypeReadonly()
		   							   .logout();


		 
	}
	
	@Test(priority = 39,description = "Create expense from home dashboard")
	@Description("Test Description: Create expense from home dashboard")
	@Story("Expense smoke test")
	
	public void TC039_createExpenseFromHomeDashboard()throws Exception {
		
		/*Pre-requisites:	
		 Test Steps:
		    1. Login
		    2. Go to Expense
		    3. Go to Home
		    4. Click on Add expense
		    5. Fill all the required fields
		    6. Logout
		    */
		
			 
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		   							   .gotoExpense()
		   							   .HomeMenu()
		   							   .clickAddExpens()
		   							   .fillTransactionDetails(ORG.OUP)
		   							   .imageUploadAndAssert("1.png")
		   							   .clickSave()
		   							   .saveExpense_VerifyHomePage()
		   							   .logout();


		 
	}
	
	
}
