/*
package testCases.Localisation;

import frameworkBase.TestBotBase;
import frameworkBase.TestBotBaseNew;
import frameworkBase.TestBotElementsWrapper;
import frameworkListeners.TestListeners;
import frameworkUtils.ExcelUtils;
import io.qameta.allure.*;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



@Test
@Listeners(TestListeners.class)
@Epic("Localisation Tests")
@Feature("Localisation")
public class LoginPage extends TestBotBaseNew {
	
		private SoftAssert sa = new SoftAssert();
	    boolean actual=true;
	    private TestBotElementsWrapper pageWrapper ;
	    
	    @Test(priority = 1, description = "Verify login page")
	    @Severity(SeverityLevel.BLOCKER)
		@Description("Test Description: Verify login page")
		@Story("Expense smoke test")
		public void verifyLoginPage() throws Exception {
	    	
	    	int rowNum= pageGenerator.wrapper().getRowNum(excelUtils.getLastRowNum("Localisation"));
	    	boolean result= pageGenerator.wrapper().verifyLocalisationData(rowNum);
	    	
	    	sa.assertEquals(result,actual); 
	    	sa.assertAll();
	    	
	    	}
	    
	    
	    
	    }*/
