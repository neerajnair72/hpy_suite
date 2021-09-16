/*
package testCases.Localisation;

import frameworkBase.TestBotBase;
import frameworkBase.TestBotElementsWrapper;
import frameworkListeners.TestListeners;
import frameworkUtils.ExcelUtils;
import io.qameta.allure.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	// TODO: Auto-generated Javadoc
*
	 * The Class ExpenseModuleTests.


	@Listeners(TestListeners.class)
	@Epic("Dashboard Page")
	@Feature("Localisation")
	public class DashboardPage  extends TestBotBase{

		private WebDriver driver;
		private TestBotElementsWrapper pageWrapper;
		boolean actual=true;
		
		public DashboardPage(WebDriver driver) {

			this.driver = driver;
			PageFactory.initElements(driver, this);
			
			pageWrapper = new TestBotElementsWrapper(driver);
			
		}
			
	    private SoftAssert sa = new SoftAssert();
	    
	    @BeforeMethod
		public void testsetupbefore() throws Exception {
			pageGenerator.loginPage().get()
									 .loginAuto(ExcelUtils.getRowDataWithSheetName(5, "Login"))
									 .gotoExpense() ;
			 sa = new SoftAssert();
		}
	    
		@AfterMethod
		public void testsetupafter() throws Exception {

			pageGenerator.commonPageElements().get().logout();

		}
		@Test(priority = 2, description = "Verify dashboard page")
		@Severity(SeverityLevel.BLOCKER)
		@Description("Test Description: Verify dashboard page")
		@Story("Expense smoke test")
		public void verifyDashboardPage() throws Exception {
	    	
	    	int rowNum= pageGenerator.wrapper().getRowNum(ExcelUtils.getLastRowNum("Localisation"));
	    	boolean result= pageGenerator.wrapper().verifyLocalisationData(rowNum);
	    	
	    	sa.assertEquals(result,actual); 
	    	sa.assertAll();
	    	
	    	}
		
	}
*/
