/*package testCases.VendorPaymentsTestCases.Dashboard;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotBase;
import frameworkBase.TestBotElementsWrapper;
import frameworkListeners.TestListeners;
import frameworkUtils.ExcelUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pageobjects.VendorPaymentsView.CommonViews.ContainerElements_VendorPage;

*//**
 * The Class VendorModuleTests.
 *//*
@Listeners(TestListeners.class)
@Epic("Primary Navigation bar - Load only post click of secondary segments (Optimisation) - Transition")
@Feature("Navigation BAr")
public class PrimaryNavigationBarTest extends TestBotBase {

	SoftAssert softwaAssert ;
    TestBotElementsWrapper pageWrapper;
	
	@BeforeMethod
	public void testsetupbefore() throws Exception {
		pageGenerator.Login_VendorPage().get()
		                                .login(ExcelUtils.getRowDataWithSheetName(1, "Login_Vendor"))
		                                .clickContainer(ContainerElements_VendorPage.containerOptions.DASHBOARD);		                                		                                 		
	softAssert = new SoftAssert();		
	}	
	@AfterMethod
	public void testsetupafter() throws Exception {

		pageGenerator.PageElements_VendorPage().get()
		                                    .logout();
	}
	 	 
	 @Test(priority=1,enabled= true)
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-verify that after clicking on the container name, verifying it's all under suboptions availbility, user is still on the Dashboard.")
		@Story("Vendor Payments smoke test")
	 public void TC_01_VerifyDashBoardAvailabilityAndAllOptionsByContainerClick() throws Exception {
		 pageGenerator.ContainerElements_VendorPage().GetDashboardTitleName();
		 String expectedashboardtitle = super.getProperty("DashBoardTitle");   
	     String actualtest =pageGenerator.ContainerElements_VendorPage()
					                                     .DashboardTitle();
	     softAssert.assertEquals(actualtest, expectedashboardtitle);
	     pageGenerator.ContainerElements_VendorPage().AssertDashBoardVisibilityOnClickingAllContainerswithSubOptions(softAssert);
	     softAssert.assertAll();
		}

	 @Test(priority=2,enabled= true)
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description-verify DashBoard is available on containers name click and On again Click, User still on the Dashboard.")
		@Story("Vendor Payments smoke test")
	 public void TC_02_VerifyDashBoardAvailabilityForVendor() throws Exception {    
		 pageGenerator.ContainerElements_VendorPage().GetDashboardTitleName();
		 String expectedashboardtitle = super.getProperty("DashBoardTitle");   
	     String actualtest =pageGenerator.ContainerElements_VendorPage()
					                                     .DashboardTitle();
	     softAssert.assertEquals(actualtest, expectedashboardtitle);	     
	     pageGenerator.ContainerElements_VendorPage().AssertDashBoardVisibilityOnDoubleClickOnContainersName(softAssert);
		 softAssert.assertAll();
	     }

	 	 
	 
	 @Test(priority=3, enabled= true)
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description- Verify Invoice Options Post Click()")
		@Story("Vendor Payments smoke test")
	   public void TC_03_VerifyInvoiceOptionsPostClick() throws Exception {   
	   
		pageGenerator.ContainerElements_VendorPage().InvoiceContainerName();
        String expectedtitle = super.getProperty("DashBoardTitle");   
        String actualPagename =pageGenerator.ContainerElements_VendorPage().DashboardTitle();
	    softAssert.assertEquals(actualPagename, expectedtitle);
			
		pageGenerator.ContainerElements_VendorPage().AssertInvoiceContainerOptions(softAssert);		
		pageGenerator.ContainerElements_VendorPage().InvoiceContainerName();
		softAssert.assertAll();	 
	    }
	 	
	 
	 @Test(priority=4, enabled= true)
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description- Verify Payments Containers Options Post Click")
		@Story("Vendor Payments smoke test")
	   public void TC_04_VerifyPaymentsOptionsPostClick() throws Exception {   
	   
		pageGenerator.ContainerElements_VendorPage().PaymentContainerName();
        String expectedtitle = super.getProperty("DashBoardTitle");   
        String actualPagename =pageGenerator.ContainerElements_VendorPage().DashboardTitle();
	    softAssert.assertEquals(actualPagename, expectedtitle);
		pageGenerator.ContainerElements_VendorPage().PaymentsContainerOptionsTab(softAssert);
		pageGenerator.ContainerElements_VendorPage().PaymentContainerName();
		softAssert.assertAll();	 
		
	
}
	
	 @Test(priority=5, enabled= true)
		@Severity(SeverityLevel.NORMAL)
		@Description("Test Description- Verify Enterprise Bank Account Options Post Click()")
		@Story("Vendor Payments smoke test")
	   public void TC_05_VerifyEnterpriseBankAccountOptionsPostClick() throws Exception {   
	   
		 pageGenerator.ContainerElements_VendorPage().EnterpriseBankAccountContainerName();
	     String expectedtitle = super.getProperty("DashBoardTitle");   
	     String actualPagename =pageGenerator.ContainerElements_VendorPage().DashboardTitle();
	     softAssert.assertEquals(actualPagename, expectedtitle);		
		pageGenerator.ContainerElements_VendorPage().AssertEnterpriseBankAccountContainerOptionsTab(softAssert);
		pageGenerator.ContainerElements_VendorPage().EnterpriseBankAccountContainerName();
		softAssert.assertAll();	
}
	 
	 	 }
	 
	 
*/