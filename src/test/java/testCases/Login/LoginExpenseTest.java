package testCases.Login;

import frameworkBase.TestBotBase;
import org.testng.annotations.Test;
import pageobjects.CommonViews.LoginPage;

import java.lang.reflect.Method;

public class LoginExpenseTest extends TestBotBase {


    /**
     * Test 001 expense login as employee HAT 01.
     *
     * @param method the method
     * @throws Exception the exception
     */
    @Test(priority = 0, description="Login to Happay as an Employee.")
    public void test001_ExpenseLogin_AsEmployee_HAT01_Chrome(Method method) throws Exception {
        /*Log.info(method.getName()  +" test is starting.");
        //Log.info(getClass().getName() +"	Test is starting");
        long id = Thread.currentThread().getId();
        Log.info("Thread id is: " + id);*/
        //Log.info(getClass().getName() +"  Thread ID is: " +Thread.currentThread().getId());
        //Log.info(getMethod().getName() +"  Thread ID is: " +Thread.currentThread().getId());

        //getThreadSafeDriver().get("https://expense-prep.happay.in");
        //getThreadSafeDriver().navigate().to("https://expense-prep.happay.in");
        pageGeneratorNew.GetInstance(LoginPage.class)
                .loginOUP(excelUtils.getRowDataWithSheetName(1,"LoginOUP"))
                .verifyExpenseButton("Expenses Button available")
                .logout();

    }


    /**
     * Test 002 expense login as manager HAT 02.
     *
     * @throws Exception the exception
     */
    @Test(enabled = true)
    public void test002_ExpenseLogin_AsManager_HAT02_Chrome(Method method) throws Exception {
      /*  Log.info(method.getName()  +" test is starting.");
        //Log.info(getClass().getName() +"	Test is starting");
        long id = Thread.currentThread().getId();
        Log.info("Thread id is: " + id);*/
        //Log.info(getClass().getName() +"  Thread ID is: " +Thread.currentThread().getId());
        //getThreadSafeDriver().navigate().to("https://expense-prep.happay.in");
        pageGeneratorNew.GetInstance(LoginPage.class)
                .loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
                .verifyExpenseButtonAgain("Expenses Button available")
                .logout();

    }
    @Test (priority = 2, description="Login to Happay as an Employee.")
    public void test003_ExpenseLogin_AsEmployee_HAT01_Firefox(Method method) throws Exception {
       /* Log.info(method.getName()  +" test is starting.");
        //Log.info(getClass().getName() +"	Test is starting");
        long id = Thread.currentThread().getId();
        Log.info("Thread id is: " + id);*/
        //Log.info(getClass().getName() +"  Thread ID is: " +Thread.currentThread().getId());

        //getThreadSafeDriver().get("https://expense-prep.happay.in");
       // getThreadSafeDriver().navigate().to("https://expense-prep.happay.in");
        pageGeneratorNew.GetInstance(LoginPage.class)
                .loginOUP(excelUtils.getRowDataWithSheetName(1,"LoginOUP"))
                .verifyExpenseButton("Expenses Button available")
                .logout();

    }
    @Test(enabled = true)
    public void test004_ExpenseLogin_AsManager_HAT02_Firefox(Method method) throws Exception {
        /*Log.info(method.getName()  +" test is starting.");
        //Log.info(getClass().getName() +"	Test is starting");
        long id = Thread.currentThread().getId();
        Log.info("Thread id is: " + id);*/
        //Log.info(getClass().getName() +"  Thread ID is: " +Thread.currentThread().getId());

        //getThreadSafeDriver().navigate().to("https://expense-prep.happay.in");
        pageGeneratorNew.GetInstance(LoginPage.class)
                .loginOUP(excelUtils.getRowDataWithSheetName(2, "LoginOUP"))
                .verifyExpenseButtonAgain("Expenses Button available")
                .logout();

    }



}
