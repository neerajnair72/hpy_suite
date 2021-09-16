/*
package testCases.Settlement;

import frameworkBase.TestBotBase;
import frameworkListeners.TestListeners;
import frameworkUtils.Log;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.CommonViews.CommonPageElements;
import pageobjects.CommonViews.LoginPage;

import java.io.IOException;
import java.lang.reflect.Method;

@Listeners({ TestListeners.class })
@Epic("Settlement Smoke Tests")
@Feature("Login Tests")
public class SettlementTests extends TestBotBase {

	@BeforeClass
	public void testSetup() throws IOException {

		excelUtils.setExcelFileSheet("Login");

	}


	public void logOutOfDashboard() throws Exception {

		pageGeneratorNew.GetInstance(CommonPageElements.class).logout();

	}


	*/
/**
	 * Test to Settlement out of happay
	 *//*


	@Test(priority = 20, description = "Settlement Out of Happay ")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:  Out of Happay - Paid by Employee")
	@Story("Settlement smoke test")

	public void settlementOutofhappayPaidbyemployee(Method method) throws Exception {
		Log.info(method.getName() + " Settlement Smoke test ");
		pageGeneratorNew.GetInstance(LoginPage.class).loginAuto(excelUtils.getRowDataWithSheetName(1, "Login")).gotoFinance()

		pageGenerator.loginPage().get().loginAuto(excelUtils.getRowDataWithSheetName(2, "Login")).gotoFinance();

		pageGenerator.settlementPage().get().NavigateToSettlementTab()
				.PerformsingleUserSettlement(excelUtils.getRowDataWithSheetName(1, "Settlement"))
				.outOfHappayUserSettlement().doneButton();

		String actual = pageGenerator.settlementPage().get().getSettlement_initiated_successfully().getText();
		softAssert.assertEquals(actual, "Settlement successful.");
		softAssert.assertAll();



	}

	*/
/**
	 * Test to Settlement through wallet & to be paid by employee
	 *//*


	@Test(priority = 21, description = "through wallet - Paid by employee ")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:  Through- Paid by employee")
	@Story("Settlement smoke test")

	public void settlementThroughwalletPaidbyemployee(Method method) throws Exception {
		Log.info(method.getName() + " Settlement Smoke test ");

		pageGenerator.loginPage().get().loginAuto(excelUtils.getRowDataWithSheetName(2, "Login")).gotoFinance();

		pageGenerator.settlementPage().get().NavigateToSettlementTab()
				.PerformsingleUserSettlement(excelUtils.getRowDataWithSheetName(1, "Settlement"))
				.throughWalletSettlement().doneButton();

		String actual = pageGenerator.settlementPage().get().getSettlement_initiated_successfully().getText();
		softAssert.assertEquals(actual, "Settlement successful.");
		softAssert.assertAll();

	}

	*/
/**
	 * Test to Settlement out of happay
	 *//*


	@Test(priority = 22, description = "Settlement Out of Happay - Paid by org ")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:  Out of Happay - Paid by org")
	@Story("Settlement smoke test")

	public void settlementThroughSamewallet(Method method) throws Exception {
		Log.info(method.getName() + " Settlement through same wallet is starting.");

		pageGenerator.loginPage().get().loginAuto(excelUtils.getRowDataWithSheetName(2, "Login")).gotoFinance();

		pageGenerator.settlementPage().get().NavigateToSettlementTab()
				.PerformsingleUserSettlement(excelUtils.getRowDataWithSheetName(1, "Settlement")).outofHappayPaidbyOrg()
				.doneButton();

		String actual = pageGenerator.settlementPage().getSettlement_initiated_successfully().getText();
		softAssert.assertEquals(actual, "Settlement successful.");
		softAssert.assertAll();

	}

	*/
/**
	 * Test to Settlement through wallet - Paid by Employee
	 *//*


	@Test(priority = 23, description = "through wallet - paid by employee ")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:  Out of Happay - Paid by Employee")
	@Story("Settlement smoke test")

	public void settlementThroughtwallet(Method method) throws Exception {
		Log.info(method.getName() + " through wallet - Paid by Employee");

		pageGenerator.loginPage().get().loginAuto(excelUtils.getRowDataWithSheetName(2, "Login")).gotoFinance();

		pageGenerator.settlementPage().get().NavigateToSettlementTab()
				.PerformsingleUserSettlement(excelUtils.getRowDataWithSheetName(1, "Settlement"))
				.throughWallettoBePaidByEmployee().doneButton();

		String actual = pageGenerator.settlementPage().get().getSettlement_initiated_successfully().getText();
		softAssert.assertEquals(actual, "Settlement successful.");
		softAssert.assertAll();

	}

	*/
/**
	 * Test to Settlement more than balance
	 *//*


	@Test(priority = 24, description = "tobepaidMorethanbalance ")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:  tobepaidMorethanbalance")
	@Story("Settlement smoke test")

	public void tobepaidMorethanbalance(Method method) throws Exception {

		Log.info(method.getName() + " through wallet - Paid by Employee");

		pageGenerator.loginPage().get().loginAuto(excelUtils.getRowDataWithSheetName(2, "Login")).gotoFinance();

		pageGenerator.settlementPage().get().NavigateToSettlementTab().userSelection().settleNow()
				.throughWallettoBePaidByEmployee().doneButton();

		String actual = pageGenerator.settlementPage().getSettlement_initiated_successfully().getText();
		softAssert.assertEquals(actual, "Organisation wallet doesn't have sufficient balance. Please contact your admin.");
		pageGenerator.settlementPage().get().getSettlementPopupClose();
		softAssert.assertAll();

	}

	*/
/**
	 * Test to wallet does not have sufficient balance
	 *//*


	@Test(priority =25, description = "wallet does not have sufficient balance")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: wallet does not have sufficient balance")
	@Story("Settlement smoke test")

	public void walletSufficientBalance(Method method) throws Exception {
		Log.info(method.getName() + "through wallet & paid by employee : Wallet balance");

		pageGenerator.loginPage().get().loginAuto(excelUtils.getRowDataWithSheetName(2, "Login")).gotoFinance();

		pageGenerator.settlementPage().get().NavigateToSettlementTab().userSelection().settleNow()
				.throughWalletPaidbyOrg().doneButton();

		String actual = pageGenerator.settlementPage().get().getSettlement_initiated_successfully().getText();
		softAssert.assertTrue(actual.contains("Wallet does not have sufficient balance."));
		softAssert.assertAll();

	}

	*/
/**
	 * Test to Settlement through different wallet
	 *//*


	@Test(priority = 26, description = "Settlement through different wallet ")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description:  Settlement through different wallet")
	@Story("Settlement smoke test")
	public void settlementThroughdifferentwallet(Method method) throws Exception {
		Log.info(method.getName() + " through wallet - Paid by Employee");

		pageGenerator.loginPage().get().loginAuto(excelUtils.getRowDataWithSheetName(2, "Login")).gotoFinance();

		pageGenerator.settlementPage().get().NavigateToSettlementTab()
				.PerformsingleUserSettlement(excelUtils.getRowDataWithSheetName(1, "Settlement"))
				.throughDifferentWallet().settlementType().paidByEmployee().doneButton();

		String actual = pageGenerator.settlementPage().getSettlement_initiated_successfully().getText();
		softAssert.assertEquals(actual, "Settlement successful.");
		softAssert.assertAll();
	}

}
*/
