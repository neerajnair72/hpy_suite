package testCases.MoneyRequest;

import java.util.HashMap;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotBase;
import frameworkBase.TestBotElementsWrapper;
import frameworkListeners.TestListeners;
import frameworkUtils.Log;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import pageobjects.CommonViews.LoginPage;
import testUtils.RESTAPIUtils;


@Listeners(TestListeners.class)
@Epic("Money Request Smoke Tests")
public class MoneyRequestCreateOUP extends TestBotBase {

/*Pre-requisites:
	1. Login: Reading from Excel Test data
	2. MR Details: Reading from Excel Test data*/

	@Test(description = "Money Request without mandatory fields")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Money Request without mandatory fields")
	@Story("Money Request without mandatory fields")
	public void TC001_MoneyrequestWithoutMandatoryfields( ) throws Exception {
		SoftAssert softAssert = new SoftAssert();
			/*Test Steps:
		    1. Login
		    2. Go to MR
		    3. Click on New Advance Request
		    4. Miss mandatory field
		    5. Add Bill
		    6. Submit
		    7. Logout
		   */

		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.goto_MR()
				.MoneyrequestWithoutMandatoryFields_OUP(excelUtils.getRowDataWithSheetName(1, "MR"))
				.imageUploadAndAssert(softAssert)
				.Click_Submit("Kindly enter a valid amount")
				.logout();
	}


	@Test(description = "Raise Money who is having no approver")
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Description: Raise Money who is having no approver")
	@Story("Raise Money who is having no approver")
	public void  TC002_MoneyrequestHavingNoapprover( ) throws Exception {

			/*Test Steps:
		    1. Login who is having no approver
		    2. Go to MR
		    3. Click on New Advance Request
		    4. Fill all the required fields
		    5. Add Bill
		    6. Submit
		    7. Logout
		   */

		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"))
				.goto_MR()
				.createMoneyrequest_OUP(excelUtils.getRowDataWithSheetName(1, "MR"))
				.Click_Submit("No approver is assigned for the next level verification. Please contact your admin.")
				.captureMRFailToastMessage("No approver is assigned for the next level verification. Please contact your admin.")
				.logout();
		
	}


	@Test(description = "Money Request with mandatory fields and capture the MRID")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request with mandatory fields and capture the MRID")
	@Story("Money Request with mandatory fields")
	public void  TC003_CreateMoneyrequestAndCaptureMrID() throws Exception {
		SoftAssert softAssert = new SoftAssert();
			/*	Test Steps:
		    1. Login
		    2. Go to MR
		    3. Click on New Advance Request
		    4. Fill all the required fields
		    5. Add Bill
		    6. Submit
		    7. Capture MR ID
		    8. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.goto_MR()
				.createMoneyrequest_OUP(excelUtils.getRowDataWithSheetName(1, "MR"))
				.imageUploadAndAssert(softAssert)
				.Click_Submit("Money Request initiated successfully.")
				.captureMRSuccessToastMessage("Money Request initiated successfully.")
				.getMoneyRequestId()
				.closeQuickView()
				.logout();
	}

	@Test(description = "Money Request approve from manager side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request approve from manager side")
	@Story("Money Request approve from manager side")
	public void  TC004_ApproveMoneyrequest( ) throws Exception {
		SoftAssert softAssert = new SoftAssert();

			/*Test Steps:
		    1. Login as manager
		    2. Go to MR on privileged side
		    3. Compate MR ID from previous test
		    4. Take action and submit
		    5. Verify status after action in history tab
		    6. Logout*/

		Response loginResponse = RESTAPIUtils.loginMethod(excelUtils.getRowDataWithSheetName(2, "LoginOUP"));
		System.out.println(loginResponse.asString());

		String CID = loginResponse.getHeader("HAPPAY-CID");
		String TOKEN = loginResponse.getHeader("HAPPAY-TOKEN");
		HashMap<String,String> getAuthData_Onboarding = new HashMap<>();
		getAuthData_Onboarding.put("HAPPAY-CID", CID);
		getAuthData_Onboarding.put("HAPPAY-TOKEN", TOKEN);
		System.out.println(getAuthData_Onboarding);

		boolean idPresent = RESTAPIUtils.isIDPresent(getAuthData_Onboarding,"pending_on_me_money_request","0","50","true");
		Log.info("idPresent " + idPresent);

		if(idPresent==true){
			pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
					.goto_MR_PrivillageView()
					.Approve_manager_OUP()
					.Verfiyactionstate_manager_Approve("Approved")
					.logout();
		}
		else{
			System.out.println("unable to find MRID");
		}
	}


	@Test(priority = 5, description = "Money Request verify from Finance")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request verify from Finance")
	@Story("Money Request verify from Finance")
	public void  TC005_VerifyMoneyrequest( ) throws Exception {
		TestBotElementsWrapper testBotElementsWrapper = new TestBotElementsWrapper();
			/*Test Steps:
		    1. Login as Finance
		    2. Go to MR on privileged side
		    3. Take action and submit
		    4. Verify status after action in history tab
		    5. Logout*/

		Response loginResponse = RESTAPIUtils.loginMethod(excelUtils.getRowDataWithSheetName(3, "LoginOUP"));
		System.out.println(loginResponse.asString());

		String CID = loginResponse.getHeader("HAPPAY-CID");
		String TOKEN = loginResponse.getHeader("HAPPAY-TOKEN");
		HashMap<String, String> getAuthData_Onboarding = new HashMap<>();
		getAuthData_Onboarding.put("HAPPAY-CID", CID);
		getAuthData_Onboarding.put("HAPPAY-TOKEN", TOKEN);

		// Given
		boolean idPresent = RESTAPIUtils.isIDPresent(getAuthData_Onboarding,"pending_on_me_money_request","0","50","true");
		System.out.println("idPresent "+idPresent);

		if (idPresent == true) {

			pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"))
					.goto_MR_PrivillageView()
					.Verify_Finance_OUP()
					.Verfiyactionstate_manager_partVerify("Verified")
					.logout();
		}
		else {
			System.out.println("unable to find MRID");
		}

	}




	@Test(description = "Money Request with bill and verify in list")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request with bill and verify in list")
	@Story("Money Request with bill and verify in list")
	public void  TC006_CreateMoneyrequestWithBill( ) throws Exception {
		SoftAssert softAssert = new SoftAssert();
			/*Test Steps:
		    1. Login
		    2. Go to MR
		    3. Click on New Advance Request
		    4. Fill all the required fields
		    5. Add Bill
		    6. Submit
		    7.Logout
		   */
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.goto_MR()
				.createMoneyrequestcommon_OUP(excelUtils.getRowDataWithSheetName(1, "MR"))
				.imageUploadAndAssert(softAssert)
				.Click_Submit("Money Request initiated successfully.")
				.VerifyMR_pendingList_OUP()
				.logout();
	}

	@Test(description = "Money Request partial approve from manager side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request partial approve from manager side")
	@Story("Money Request partial approve from manager side")
	public void  TC007_PartApproveMoneyrequest( ) throws Exception {

			/*Test Steps:
		    1. Login as manager
		    2. Go to MR on privilege side
		    3. part approve the MR
		    4. take action
		    5. Verify status after action in history tab
		    6. Logout*/

		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
				.goto_MR_PrivillageView()
				.PartApprove_manager()
				.Verfiyactionstate_manager("Approved")
				.logout();

	}


	@Test(description = "Money Request partial approve from Finance side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request partial approve from Finance side")
	@Story("Money Request partial approve from Finance side")
	public void  TC008_PartVerifyMoneyrequest( ) throws Exception {

			/*Test Steps:
		    1. Login as Finance
		    2. Go to MR on privilege side
		    3. part approve the MR
		    4. take action
		    5. Verify status after action in history tab
		    6. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"))
				.goto_MR_PrivillageView()
				.PartApprove_finance()
				.Verfiyactionstate_manager_partVerify("Verified")
				.logout();

	}

	@Test(description = "Money Request from Home dashboard")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request from Home dashboard")
	@Story("Money Request from Home dashboard")
	public void  TC009_MoneyrequestFromHome( ) throws Exception {

			/*Test Steps:
		    1. Login as employee
		    2. Go to Home dashboard
		    3. Click on new advance request
		    4. Fill the required fields
		    5. Submit
		   */

		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.ClickOnNewMRFromHome()
				.fillMoneyRequestDetails_OUP(excelUtils.getRowDataWithSheetName(1, "MR"))
				.Click_SubmitMR("Money Request initiated successfully.")
				.logout();
	}



	@Test(description = "Money Request Decline from manager side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request Decline from manager side")
	@Story("Money Request Decline from manager side")
	public void  TC010_DeclineMoneyrequestManager( ) throws Exception {

			/*Test Steps:
		    1. Login as Manager
		    2. Go to MR on privilege side
		    3. Take Decline action
		    4. Verify status after action in history tab
		    5. Logout
		   */

		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
				.goto_MR_PrivillageView()
				.Decline_manager()
				.Verfiyactionstate_manager_Decline("DeclinedByManager")
				.logout();

	}
	@Test(description = "Money Request Resubmit")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Resubmitting the MoneyRequest declinedByManager")
	@Story("Resubitting declined MoneyRequest")

	public void  TC021_ResubmitMRDeclinedByManager( ) throws Exception{

		/*Test Steps:
	    1. Login
	    2. Go to MR
	    3. Open declinedMR
	    4. Edit RequestedAmount
	    5. Update the MR
	    6.Resubmit the MR
	    7. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.goto_MR()
				.viewMR()
				.resubmitMR()
				.logout();
		        
	}

	@Test(description = "Money Request from Home dashboard")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request from Home dashboard")
	@Story("Money Request from Home dashboard")
	public void  TC011_MoneyrequestFromHome( ) throws Exception {

			/*Test Steps:
		    1. Login
		    2. Go to MR
		    3. Click on New Advance Request
		    4. Fill all the required fields
		    5. Add Bill
		    6. Submit
		    7. Logout
		   */

		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
						.ClickOnNewMRFromHome()
						.fillMoneyRequestDetails_OUP(excelUtils.getRowDataWithSheetName(1, "MR"))
						.Click_SubmitMR("Money Request initiated successfully.")
						.logout();
	}

	@Test(description = "Money Request part approve from manager side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request part approve from manager side")
	@Story("Money Request part approve from manager side")
	public void  TC012_ApproveMoneyrequest( ) throws Exception {

			/*Test Steps:
		    1. Login as Manager
		    2. Go to MR on privilege side
		    3. Take part approve action
		    4. Verify status after action in history tab
		    5. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
				.goto_MR_PrivillageView()
				.PartApprove_manager()
				.Verfiyactionstate_manager_Approve("Approved")
				.logout();

	}

	@Test(description = "Money Request Decline from Finance side")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Money Request Decline from Finance side")
	@Story("Money Request Decline from Finance side")
	public void  TC013_DeclineMoneyrequestFinance( ) throws Exception {

		/*Test Steps:
		    1. Login as Finance
		    2. Go to MR on privilege side
		    3. Take Decline action
		    4. Verify status after action in history tab
		    5. Logout*/

		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"))
				.goto_MR_PrivillageView()
				.Decline_manager()
				.Verfiyactionstate_finance_Decline("DeclinedByFinance")
				.logout();

	}
	@Test(description = "Money Request Resubmit")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Resubmitting the MoneyRequest declinedByManager")
	@Story("Resubitting declined MoneyRequest")

	public void  TC022_ResubmitMRDeclinedByFinance( ) throws Exception{

		/*Test Steps:
	    1. Login
	    2. Go to MR
	    3. Open declinedMR
	    4. Edit RequestedAmount
	    5. Update the MR
	    6.Resubmit the MR
	    7. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.goto_MR()
				.viewMR()
				.resubmitMR()
				.logout();
		        
	}



	@Test(description = "Money Request Export")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Money Request Export")
	@Story("Money Request Export")
	public void  TC014_MRExport( ) throws Exception{

		/*Test Steps:
	    1. Login
	    2. Go to MR
	    3. Click on Export
	    4. Click on download
	    5. Add email
	    6. Click on download
	    7. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.goto_MR()
				.Export(excelUtils.getRowDataWithSheetName(2, "MR"))
				.logout();
	}

	@Test(description = "Money Request Export Workflow comments")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Money Request Export comments")
	@Story("Money Request Export")
	public void  TC015_MRExportWorkflowComments( ) throws Exception{

		/*Test Steps:
	    1. Login
	    2. Go to MR
	    3. Click on Export
	    4. Click on Workflow comments
	    5. Add email
	    6. Click on download
	    7. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.goto_MR()
				.downloadWorkflowComments(excelUtils.getRowDataWithSheetName(2, "MR"), "Your data export request has been received successfully. You will receive an email shortly")
				.logout();
	}
	@Test(description = "Money Request PDF Download with invoices by employee")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Money Request PDF Download with invoices")
	@Story("Money Request Export")
	public void  TC016_MRPDFDownloadWithInvoices( ) throws Exception{

		/*Test Steps:
	    1. Login
	    2. Go to MR
	    3. Click on RequestForNewAdvance
	    4. Create new MR with attachments  in it
	    5. Click on more button and select PDF with invoices
	    6. Enter email address and click enter
	    7. Click on Download button
	    8. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.goto_MR()
				.createMoneyrequest_OUP(excelUtils.getRowDataWithSheetName(1, "MR"))
				.Click_Submit("Money Request initiated successfully.")
				.viewMR()
				.downloadPDFWithInnvoices(excelUtils.getRowDataWithSheetName(2, "MR"), "PDF With Invoices")
				.logout();
	}
	@Test(description = "Money Request PDF Download without invoices by employee")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Money Request PDF Download without invoices")
	@Story("Money Request Export")
	public void  TC017_MRPDFDownloadWithoutInvoices() throws Exception{

		/*Test Steps:
	    1. Login
	    2. Go to MR
	    3. Click on RequestForNewAdvance
	    4. Create new MR with attachments  in it
	    5. Click on more button and select PDF with invoices
	    6. Enter email address and click enter
	    7. Click on Download button
	    8. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
				.goto_MR()
				.createMoneyrequest_OUP(excelUtils.getRowDataWithSheetName(1, "MR"))
				.Click_Submit("Money Request initiated successfully.")
				.viewMR()
				.downloadPDFWithInnvoices(excelUtils.getRowDataWithSheetName(2, "MR"), "PDF Without Invoices")
				.logout();
	}
	@Test(description = "Money Request PDF Download without invoices by manager")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Money Request PDF Download without invoices")
	@Story("Money Request Export")

	public void  TC018_MRPDFDownloadWithInvoicesByManager() throws Exception{

		/*Test Steps:
	    1. Login
	    2. Go to MR table view at privileged view
	    3. Open existing MR 
	    4. Click on More button and select PDFWithInvoices
	    5. Enter email address and click enter key
	    6. Click on Download button
	    7. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
				.goto_MR_PrivillageView()
				.viewMR()
				.downloadPDFWithInnvoices(excelUtils.getRowDataWithSheetName(2, "MR"), "PDF With Invoices")
				.logout();
	}
	@Test(description = "Money Request PDF Download without invoices by manager")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Money Request PDF Download without invoices")
	@Story("Money Request Export")

	public void  TC019_MRPDFDownloadWithoutInvoicesByManager( ) throws Exception{

		/*Test Steps:
	    1. Login
	    2. Go to MR table view at privileged view
	    3. Open existing MR 
	    4. Click on More button and select PDFWithoutInvoices
	    5. Enter email address and click enter key
	    6. Click on Download button
	    7. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
				.goto_MR_PrivillageView()
				.viewMR()
				.downloadPDFWithInnvoices(excelUtils.getRowDataWithSheetName(2, "MR"), "PDF Without Invoices")
				.logout();
	}
	@Test(description = "Money Request PDF Download without invoices by manager")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Money Request PDF Download without invoices")
	@Story("Money Request Export")

	public void  TC020_MRPDFDownloadVisibilityCheckByManager( ) throws Exception{

		/*Test Steps:
	    1. Login
	    2. Go to MR table view at privileged view
	    3. Open existing MR 
	    4. Click on More button and select PDFWithoutInvoices
	    5. Enter email address and click enter key
	    6. Click on Download button
	    7. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"))
				.goto_MR_PrivillageView()
				.viewMR()
				.moreButtonVisibilityCheck()
				.logout();
	}
	@Test(description = "Check the recall button visibility for verified MR")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description:heck the recall button visibility for verified MR")
	@Story("RecallButton visibility check")

	public void  TC023_recallbuttonCheckForVerifiedMR( ) throws Exception{
		SoftAssert softAssert = new SoftAssert();

		/*Test Steps:
	    1. Login
	    2. Go to MR table view at privileged view
	    3. Open existing MR 
	    4. Click on More button and select PDFWithoutInvoices
	    5. Enter email address and click enter key
	    6. Click on Download button
	    7. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		.goto_MR()
		.createMoneyrequest_OUP(excelUtils.getRowDataWithSheetName(1, "MR"))
		.Click_Submit("Money Request initiated successfully.")
		.logout();
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
		.goto_MR_PrivillageView()
		.Approve_manager_OUP()
		.Verfiyactionstate_manager_Approve("Approved")
		.logout();
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(3, "LoginOUP"))
		.goto_MR_PrivillageView()
		.Verify_Finance_OUP()
		.logout();
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		.goto_MR()
		.viewMR()
		.recallButtonVisibilityCheck()
		.logout();
		
	}
	@Test(description = "Resubmitting the recalled MR")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Resubmitting the recalled MR")
	@Story("Money Request Resubmit")
	public void  TC024_resubmitRecalledMR() throws Exception{
		SoftAssert softAssert = new SoftAssert();

		/*Test Steps:
	    1. Login
	    2. Go to MR table view at privileged view
	    3. Open existing MR 
	    4. Click on More button and select PDFWithoutInvoices
	    5. Enter email address and click enter key
	    6. Click on Download button
	    7. Logout*/


		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		.goto_MR()
		.createMoneyrequest_OUP(excelUtils.getRowDataWithSheetName(1, "MR"))
		.Click_Submit("Money Request initiated successfully.")
		.viewMR()
		.recallMR()
		.resubmitRecalledMR("Money Request initiated successfully.")
		.logout();
	}
	
	@Test(description = "Resubmitting the recalled MR")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Resubmitting the recalled MR")
	@Story("Money Request Resubmit")
	public void  TC025_recallAndResubmitApproveddMR() throws Exception{
		SoftAssert softAssert = new SoftAssert();

		/*Test Steps:
	    1. Login
	    2. Go to MR table view at privileged view
	    3. Open existing MR 
	    4. Click on More button and select PDFWithoutInvoices
	    5. Enter email address and click enter key
	    6. Click on Download button
	    7. Logout*/
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		.goto_MR()
		.createMoneyrequest_OUP(excelUtils.getRowDataWithSheetName(1, "MR"))
		.Click_Submit("Money Request initiated successfully.")
		.logout();
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
		.goto_MR_PrivillageView()
		.Approve_manager_OUP()
		.Verfiyactionstate_manager_Approve("Approved")
		.logout();

		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		.goto_MR()
		.viewMR()
		.recallMR()
		.resubmitRecalledMR("Money Request initiated successfully.")
		.logout();
	}
	@Test(description = "Resubmitting the recalled MR")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Description: Resubmitting the recalled MR")
	@Story("Money Request Resubmit")
	public void  TC026_requestedAmountEditByFinance() throws Exception{
		SoftAssert softAssert = new SoftAssert();

		/*Test Steps:
	    1. Login
	    2. Go to MR table view at privileged view
	    3. Open existing MR 
	    4. Click on More button and select PDFWithoutInvoices
	    5. Enter email address and click enter key
	    6. Click on Download button
	    7. Logout*/
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(1, "LoginOUP"))
		.goto_MR()
		.createMoneyrequest_OUPWithoutBill(excelUtils.getRowDataWithSheetName(1, "MR"))
		.Click_Submit("Money Request initiated successfully.")
		.logout();
		
		pageGeneratorNew.GetInstance(LoginPage.class).loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
		.goto_MR_PrivillageView()
		.viewMR()
		.checkRequestedAmountEnabled()
		.logout();

	}
	
	

}//email shortly

