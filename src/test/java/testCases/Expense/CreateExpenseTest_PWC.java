package testCases.Expense;

import frameworkBase.TestBotBase;
import frameworkListeners.TestListeners;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import orgUtils_ExpenseProduct.PWC_ExpenseOrg;
import pageobjects.CommonViews.CommonPageElements;
import pageobjects.CommonViews.LoginPage;
import pageobjects.EmployeeViews.CreateExpensePage.CategoryOptions;

/**
 * The Class ExpenseModuleTests.
 */
@Listeners(TestListeners.class)
@Epic("Expense Creation Tests")
@Feature("Expense")
public class CreateExpenseTest_PWC extends TestBotBase {

	@Test(priority = 13, description = "Add expense with native fields and category AirfareExpense " )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category AirfareExpense ")
	@Story("Expense smoke test")
	public void Test001_Expense_createExpense_Category_AirfareExpense() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(6, "LoginPWC"))
													 .gotoExpense()
													 .clickAddExpens()
													 .fillExpenseDetailsWithCategory(CategoryOptions.AIRFARE_EXPENSE)
													 .imageUploadAndAssert("1.png")
													 .SaveExpense_VerifyFromScreen("Airfare Expense")
													 .logout();
}
	

	@Test(priority = 14, description = "Add expense with native fields and category BOOKS_AND_PERIODICALS" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category BOOKS_AND_PERIODICALS ")
	@Story("Expense smoke test")
	public void Test002_Expense_createExpense_Category_BOOKS_AND_PERIODICALS() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.BOOKS_AND_PERIODICALS)
														.imageUploadAndAssert("2.png")
											 			.SaveExpense_VerifyFromScreen( "Books & Periodicals")
														.logout();
        
}
	

	@Test(priority = 15, description = "Add expense with native fields and category COMMUNICATION " )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category COMMUNICATION")
	@Story("Expense smoke test")
	public void Test003_Expense_createExpense_Category_COMMUNICATION() throws Exception {
	pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(5, "LoginPWC"))
														 .gotoExpense()
														 .clickAddExpens()
														 .fillExpenseDetailsWithCategory(CategoryOptions.COMMUNICATION)
														 .imageUploadAndAssert("3.png")
														 .SaveExpense_VerifyFromScreen( "Communication")
														 .logout();
}
	

//	@Test(enabled = false,priority = 16, description = "Add expense with native fields and category CONTINUING_EDUCATION" )
//	@Severity(SeverityLevel.BLOCKER)
//	@Description("Test Description: Add expense with native fields and category CONTINUING_EDUCATION")
//	@Story("Expense smoke test")
//	public void Test004_Expense_createExpense_Category_CONTINUING_EDUCATION() throws Exception {
//	//         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
//														.gotoExpense()
//														.clickAddExpens()
//														.fillExpenseDetailsWithCategory(CategoryOptions.CONTINUING_EDUCATION)
//														.imageUploadAndAssert("4.png")
//													    .SaveExpense_VerifyFromScreen( "Continuing Education")
//														.logout(); }
	

	@Test(priority = 17, description = "Add expense with native fields and category CONVEYANCE" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category CONVEYANCE")
	@Story("Expense smoke test")
	public void Test005_Expense_createExpense_Category_CONVEYANCE() throws Exception {
	pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(5, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.CONVEYANCE)
														.imageUploadAndAssert("1.png")
				 										.SaveExpense_VerifyFromScreen( "Conveyance")
														.logout();
}

	@Test(priority = 18, description = "Add expense with native fields and category COURIER_POSTAGE" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category COURIER_POSTAGE")
	@Story("Expense smoke test")
	public void Test006_Expense_createExpense_Category_COURIER_POSTAGE() throws Exception {
	pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(6, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.COURIER_POSTAGE)
														.imageUploadAndAssert("2.png")
				   						 				.SaveExpense_VerifyFromScreen("Courier-Postage")
														.logout();
}
	

	@Test(priority = 19, description = "Add expense with native fields and category EMPLOYEE_INITIATIVES" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category EMPLOYEE_INITIATIVES")
	@Story("Expense smoke test")
	public void Test007_Expense_createExpense_Category_EMPLOYEE_INITIATIVES() throws Exception {
	pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(5, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.EMPLOYEE_INITIATIVES)
														.imageUploadAndAssert("3.png")
														.SaveExpense_VerifyFromScreen( "Employee Initiatives")
														.logout(); }
	

	@Test(priority = 20, description = "Add expense with native fields and category EQUIPMENT_HIRE_CHARGES" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category EQUIPMENT_HIRE_CHARGES")
	@Story("Expense smoke test")
	public void Test008_Expense_createExpense_Category_EQUIPMENT_HIRE_CHARGES() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.EQUIPMENT_HIRE_CHARGES)
														.imageUploadAndAssert("4.png")
				 									    .SaveExpense_VerifyFromScreen( "Equipment Hire Charges")
														.logout();
		 
	    
}
	

	@Test(priority = 21, description = "Add expense with native fields and category EVENT_EXPENSES" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category EVENT_EXPENSES")
	@Story("Expense smoke test")
	public void Test009_Expense_createExpense_Category_EVENT_EXPENSES() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.EVENT_EXPENSES)
														.imageUploadAndAssert("3.png")
				 									    .SaveExpense_VerifyFromScreen( "Event Expenses")
														.logout();
}
	

	@Test(priority = 22, description = "Add expense with native fields and category EXECUTIVE_HEALTH_CHECKUP" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category EXECUTIVE_HEALTH_CHECKUP")
	@Story("Expense smoke test")
	public void Test010_Expense_createExpense_Category_EXECUTIVE_HEALTH_CHECKUP() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(6, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.EXECUTIVE_HEALTH_CHECKUP)
														.imageUploadAndAssert("2.png")
													    .SaveExpense_VerifyFromScreen( "Executive Health")
														.logout();
}
	

	@Test(priority = 23, description = "Add expense with native fields and category FEES_RATES_AND_TAXES" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category FEES_RATES_AND_TAXES")
	@Story("Expense smoke test")
	public void Test011_Expense_createExpense_Category_FEES_RATES_AND_TAXES() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(5, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.FEES_RATES_AND_TAXES)
														.imageUploadAndAssert("1.png")
													    .SaveExpense_VerifyFromScreen( "Fees/ Rates And Taxes")
														.logout();
}
	

	@Test(priority = 24, description = "Add expense with native fields and category GIFTS_PRESENTS" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category GIFTS_PRESENTS")
	@Story("Expense smoke test")
	public void Test012_Expense_createExpense_Category_GIFTS_PRESENTS() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
				  								     .gotoExpense()
				  								     .clickAddExpens()
													 .fillExpenseDetailsWithCategory(CategoryOptions.GIFTS_PRESENTS)
				     								 .imageUploadAndAssert("3.png")
													 .SaveExpense_VerifyFromScreen( "Gifts & Presents")
				   									 .logout();

}
	

	@Test(priority = 25, description = "Add expense with native fields and category GUEST_HOUSE_EXPENSES" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category GUEST_HOUSE_EXPENSES")
	@Story("Expense smoke test")
	public void Test013_Expense_createExpense_Category_GUEST_HOUSE_EXPENSES() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
													  .gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.GUEST_HOUSE_EXPENSES)
														.imageUploadAndAssert("2.png")
													    .SaveExpense_VerifyFromScreen( "Guest House Expenses")
														.logout();

}
	

	@Test(priority = 26, description = "Add expense with native fields and category HOTEL_BOOKING_EXPENSE" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category HOTEL_BOOKING_EXPENSE ")
	@Story("Expense smoke test")
	public void Test014_Expense_createExpense_Category_HOTEL_BOOKING_EXPENSE() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(6, "LoginPWC"))
													    .gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.HOTEL_BOOKING_EXPENSE)
														.imageUploadAndAssert("1.png")
													    .SaveExpense_VerifyFromScreen( "Hotel Booking Expense")
														.logout();

}
	

	@Test(priority = 27, description = "Add expense with native fields and category INCIDENTAL_EXPENSES_PER_DIEM " )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category INCIDENTAL_EXPENSES_PER_DIEM")
	@Story("Expense smoke test")
	public void Test015_Expense_createExpense_Category_INCIDENTAL_EXPENSES_PER_DIEM() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(5, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.INCIDENTAL_EXPENSES_PER_DIEM)
														.imageUploadAndAssert("3.png")
													    .SaveExpense_VerifyFromScreen( "Incidental Expenses")
														.logout();

}
	

	@Test(priority = 28, description = "Add expense with native fields and category MEALS_AND_REFRESHMENTS" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category MEALS_AND_REFRESHMENTS")
	@Story("Expense smoke test")
	public void Test016_Expense_createExpense_Category_MEALS_AND_REFRESHMENTS() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.MEALS_AND_REFRESHMENTS)
														.imageUploadAndAssert("3.png")
												    	.SaveExpense_VerifyFromScreen( "Meals And Refreshments")
														.logout();

}
	

	@Test(priority = 29, description = "Add expense with native fields and category MEMBERSHIP_AND_SUBSCRIPTION" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category MEMBERSHIP_AND_SUBSCRIPTION")
	@Story("Expense smoke test")
	public void Test017_Expense_createExpense_Category_MEMBERSHIP_AND_SUBSCRIPTION() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.MEMBERSHIP_AND_SUBSCRIPTION)
														.imageUploadAndAssert("2.png")
														.SaveExpense_VerifyFromScreen( "Membership And Subscri")
														.logout();

}
	

	@Test(priority = 30, description = "Add expense with native fields and category PARTICIPATION_FEES" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category PARTICIPATION_FEES ")
	@Story("Expense smoke test")
	public void Test018_Expense_createExpense_Category_PARTICIPATION_FEES() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(6, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.PARTICIPATION_FEES)
														.imageUploadAndAssert("1.png")
				 										.SaveExpense_VerifyFromScreen( "Participation Fees")
														.logout();

}
	

	@Test(priority = 31, description = "Add expense with native fields and category PRINTING_AND_STATIONERY" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category PRINTING_AND_STATIONERY")
	@Story("Expense smoke test")
	public void Test019_Expense_createExpense_Category_PRINTING_AND_STATIONERY() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(5, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.PRINTING_AND_STATIONERY)
														.imageUploadAndAssert("3.png")
														.SaveExpense_VerifyFromScreen( "Printing And Stationery")
														.logout();

}
	

	@Test(priority = 32, description = "Add expense with native fields and category PROPOSAL_EXPENSES" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category PROPOSAL_EXPENSES")
	@Story("Expense smoke test")
	public void Test020_Expense_createExpense_Category_PROPOSAL_EXPENSES() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.PROPOSAL_EXPENSES)
														.imageUploadAndAssert("2.png")
														.SaveExpense_VerifyFromScreen( "Proposal Expenses")
														.logout();

}
	

	@Test(priority = 33, description = "Add expense with native fields and category RELOCATION_CHARGES" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category RELOCATION_CHARGES")
	@Story("Expense smoke test")
	public void Test021_Expense_createExpense_Category_RELOCATION_CHARGES() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
															.gotoExpense()
															.clickAddExpens()
															.fillExpenseDetailsWithCategory(CategoryOptions.RELOCATION_CHARGES)
															.imageUploadAndAssert("5.png")
															.SaveExpense_VerifyFromScreen( "Relocation Charges")
															.logout();
}
	


	@Test(priority = 34, description = "Add expense with native fields and category TRAIN_AND_BUS_FARE" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category TRAIN_AND_BUS_FARE")
	@Story("Expense smoke test")
	public void Test022_Expense_createExpense_Category_TRAIN_AND_BUS_FARE() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(6, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.TRAIN_AND_BUS_FARE)
														.imageUploadAndAssert("3.png")
														.SaveExpense_VerifyFromScreen( "Train And Bus Fare")
														.logout();
}
	


	@Test(priority = 35, description = "Add expense with native fields and category TRAVEL_INSURANCE" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category TRAVEL_INSURANCE")
	@Story("Expense smoke test")
	public void Test023_Expense_createExpense_Category_TRAVEL_INSURANCE() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(5, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.TRAVEL_INSURANCE)
														.imageUploadAndAssert("5.png")
														.SaveExpense_VerifyFromScreen( "Travel Insurance")
														.logout();
}
	


	@Test(priority = 36, description = "Add expense with native fields and category VEHICLE_EXPENSES_PARTNERS" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category VEHICLE_EXPENSES_PARTNERS")
	@Story("Expense smoke test")
	public void Test024_Expense_createExpense_Category_VEHICLE_EXPENSES_PARTNERS() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.VEHICLE_EXPENSES_PARTNERS)
														.imageUploadAndAssert("4.png")
														.SaveExpense_VerifyFromScreen( "Vehicle Expenses")
														.logout();
}
	


	@Test(priority = 37, description = "Add expense with native fields and category VISA" )
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and category VISA")
	@Story("Expense smoke test")
	public void Test025_Expense_createExpense_Category_VISA() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(4, "LoginPWC"))
														.gotoExpense()
														.clickAddExpens()
														.fillExpenseDetailsWithCategory(CategoryOptions.VISA)
														.imageUploadAndAssert("1.png")
														.SaveExpense_VerifyFromScreen( "Visa")
														.logout();
}
	
	

//	@Test(priority = 0, description = "Add expense with native fields and add Project")
//	@Severity(SeverityLevel.BLOCKER)
//	@Description("Test Description: Add expense with native fields and add project")
//	@Story("Expense smoke test")
//	public void Test026_Expense_createExpenseWithProject() throws Exception {
//         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
//													  .gotoExpense()
//													  .clickAddExpens()
//													  .fillExpenseDetailsWithCategory(CategoryOptions.AIRFARE_EXPENSE)
//													  .imageUploadAndAssert("2.png")
//													  .SaveExpense_VerifyFromScreen("Automation", "2.0")
//													  .logout();
//}

	@Test(priority = 1, description = "Add expense with native fields and verify the same in pending list")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense with native fields and verify the same in pending list")
	@Story("Expense smoke test")
	public void Test027_Expense_createExpense_Verify_pending_list() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
													  .gotoExpense()
													  .clickAddExpens()
													  .fillExpenseDetailsWithCategory(CategoryOptions.AIRFARE_EXPENSE)
													  .imageUploadAndAssert("3.png")
													  .clickSave();

         pageGeneratorNew.GetInstance(PWC_ExpenseOrg.class).VerifyExpense_pending_list_PWC();
		 pageGeneratorNew.GetInstance(CommonPageElements.class).logout();
}
	

	@Test(priority = 2, description = "Test to Edit expense by without giving spent" )
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Test to Edit expense by without giving spent  ")
	@Story("Expense smoke test")
	public void TC041_Expense_EditExpenseWithoutSpentAt() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
				 									  	.gotoExpense()
														.clickExpenseEdit()
														.EditExpenseWithoutSpentAt_PWC("Please enter Spent At")
														.verifyPageTitle("EDIT EXPENSE")
		 												.logout();
	    
}

		

	@Test(priority = 3, description = "Test to Edit expense by without giving city" )
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Test to Edit expense by without giving City  ")
	@Story("Expense smoke test")
	public void TC042_Expense_EditExpenseWithoutCity() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
                                                      .gotoExpense()
                                                      .clickExpenseEdit()
                                                      .EditExpenseWithoutCity_PWC("Please enter the City Name")
                                                      .verifyPageTitle("EDIT EXPENSE")
                                                      .logout();
}


	@Test(priority = 4, description = "Test to Edit expense by without giving Bill number" )
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Test to Edit expense by without giving Bill number  ")
	@Story("Expense smoke test")
	public void TC043_Expense_EditExpenseWithoutBillNumber() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
                                                      .gotoExpense()
                                                      .clickExpenseEdit()
                                                      .EditExpenseWithoutBillNumber_PWC("Please fill the Field - Bill Number")
                                                      .verifyPageTitle("EDIT EXPENSE")
                                                      .logout(); }

	

	@Test(priority = 5, description = "Test to Edit the Expense")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to Edit the Expense ")
	@Story("Expense smoke test")
	public void Test028_Expense_Edit() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
         											  .gotoExpense()
         											  .clickExpenseEdit_PWC()
         											  .editTxnNativeField_PWC(excelUtils.getRowDataWithSheetName(2, "Expense_PWC"))
         											  .clickUpdateBtn()
         											  .EditExpenseVerifyFromScreen("12.0")
         											  .logout();
	    
}
	

	 
	@Test(priority = 6, description = "Create expense by missing Amount mandatory field")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create expense by missing Amount mandatory field")
	@Story("Expense smoke test")
	public void Test029_Expense_CreateExpenseMissingAmountFields() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
         											  .gotoExpense()
         											  .clickAddExpens()
         											  .fill_Missing_Amount_TransactionDetails(ORG.PWC)
         											  .clickSave_CheckError()
         											  .verifyPageTitle("CREATE EXPENSE")
													  .logout();
	    
}


	@Test(priority = 7, description = "Create expense by missing spent at fields")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Create expense by missing spent at fields")
	@Story("Expense smoke test")
	public void Test030_Expense_createExpenseMissingSpentAtField() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
                                      .gotoExpense()
		                              .clickAddExpens()
		                              .fill_Missing_SpentAt_TransactionDetails(ORG.PWC)
		                              .imageUploadAndAssert("1.png")
		                              .clickSave()
		                              .verifyPageTitle("CREATE EXPENSE")
									  .logout();
}


	@Test(priority = 8, description = "Add expense by missing city native fields")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Add expense by missing city native fields")
	@Story("Expense smoke test")
	public void Test031_Expense_createExpenseMissingCityField() throws Exception {
		pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
         											  .gotoExpense()
         											  .clickAddExpens()
         											  .fill_Missing_City_TransactionDetails(ORG.PWC)
         											  .imageUploadAndAssert("2.png")
         											  .clickSave()
         											  //.SaveExpense_VerifyToast("Please enter the City Name")
         											  .verifyPageTitle("CREATE EXPENSE")
         											  .logout();

}



	 @Test(priority = 10, description = "Test to create expense without project")
	 @Severity(SeverityLevel.BLOCKER)
	 @Description("Test Description: Test to create expense without project")
	 @Story("Expense smoke test")
	 public void Test032_Expense_WithoutProject() throws Exception {
		 pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
		 											  .gotoExpense()
		 											  .clickAddExpens()
		 											  .ExpenseWithoutProject()
		 											  .verifyPageTitle("CREATE EXPENSE")
				                                      .logout();
	     
}
	

//	@Test(priority = 9, description = "Test to split the expense")
//	@Severity(SeverityLevel.BLOCKER)
//	@Description("Test Description: Test to split the expense")
//	@Story("Expense smoke test")
//	public void Test033_Expense_Split() throws Exception {
//         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
//         											  .gotoExpense()
//         											  .clickAddExpens()
//													  .fillExpenseDetailsWithCategory(CategoryOptions.AIRFARE_EXPENSE)
//				                                      .clickSave()
//         											  .clickTxnSplit()
//         											  .splitTxn_PwC(excelUtils.getRowDataWithSheetName(1, "Expense_PWC"))
//         											  .SplitExpense_VerifyFromScreen("Automation", "1.0")
//         											  .logout();
//}
	

	@Test(priority = 11, description = "Test to Delete expense from Quick View")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to Delete Expense")
	@Story("Expense smoke test")
	public void Test035_Expense_DeleteFromQuickView() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
                                      				  .gotoExpense()
                                      				  .deleteExpenseQuickview_PWC("Transaction deleted successfully.")
                                      				  .logout();
		 
		    
}


	@Test(priority = 12, description = "Test to Delete expense from hamburger menu")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Test to Delete Expense from hamburger menu")
	@Story("Expense smoke test")
	public void Test034_Expense_DeleteFromHamburger() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
                                      				  .gotoExpense()
                                      				  .clickAddExpens()
													  .fillExpenseDetailsWithCategory(CategoryOptions.AIRFARE_EXPENSE)
													  .imageUploadAndAssert("2.png")
													  .clickSave()
                                      				  .deleteExpenseHamburger_PWC("Transaction deleted successfully.")
                                      				  .logout();
}


	@Test(priority = 38, description = "Check export " )
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Check export  ")
	@Story("Expense smoke test")
	public void TC036_Expense_ExportExpense() throws Exception{
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
         											  .gotoExpense()
         											  .DownloadExpenseExcel("File generated successfully")
         											  .logout();
}
	

	@Test(priority = 39, description = "Delete Attachment in expense " )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Delete Attachment in expense ")
	@Story("Expense smoke test")
	public void TC037_Expense_DeleteBill() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
                                                      .gotoExpense()
                                                      .clickAddExpens()
                                                      .fillExpenseDetailsWithCategory(CategoryOptions.AIRFARE_EXPENSE)
                                                      .imageUploadAndAssert("2.png")
                                                      .clickSave()
		 								              .clickExpenseEdit()
		 							                  .DeleteBill()
		 							                  .logout();
}

	@Test(priority = 40, description = "Copy Expense without filling amount field" )
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Copy expense without filling amount field ")
	@Story("Expense smoke test")
	public void TC038_Expense_CopyExpensewithoutAmount() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
         											  .gotoExpense()
		 							                  .CopyExpenseWithoutAmount_PWC(excelUtils.getRowDataWithSheetName(1, "Expense_PWC"))
		 							                  .verifyPageTitle("COPY EXPENSE")
		 							                  .logout();
      
}


@Test(priority = 42, description = "Copy Expense " )
@Severity(SeverityLevel.TRIVIAL)
@Description("Test Description: Copy expense ")
@Story("Expense smoke test")
public void TC039_Expense_CopyExpense() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
                                    				  .gotoExpense()
	 							   					 .CopyExpense_PWC(excelUtils.getRowDataWithSheetName(1, "Expense_PWC"));

			pageGeneratorNew.GetInstance(PWC_ExpenseOrg.class).VerifyExpense_pending_list_PWC();
			pageGeneratorNew.GetInstance(CommonPageElements.class).logout();
}
	

@Test(priority = 43, description = "View Expense " )
@Severity(SeverityLevel.TRIVIAL)
@Description("Test Description: View expense ")
@Story("Expense smoke test")
public void TC040_Expense_ViewExpense() throws Exception {
         pageGeneratorNew.GetInstance(LoginPage.class).loginPWC(excelUtils.getRowDataWithSheetName(1, "LoginPWC"))
                                      .gotoExpense()
	 							  	  .ViewExpense_PWC()
				                      .logout();
    
}


}
