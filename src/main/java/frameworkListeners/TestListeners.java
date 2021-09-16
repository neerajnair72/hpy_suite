package frameworkListeners;


import frameworkBase.TestBotBase;
import frameworkUtils.Log;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


// TODO: Auto-generated Javadoc

/**
 * The Class TestListeners.
 *
 * @author vikramvasanthkumar
 */
public class TestListeners extends TestBotBase implements ITestListener {
	
	
	/**
	 * Gets the test method name.
	 *
	 * @param iTestResult the i test result
	 * @return the test method name
	 */
	private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    /**
     * Save screenshot PNG.
     *
     * @param driver the driver
     * @return the byte[]
     */
    //Text attachments for Allure
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG (WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    /**
     * Save text log.
     *
     * @param message the message
     * @return the string
     */
    //Text attachments for Allure
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog (String message) {
        return message;
    }

    /**
     * Attach html.
     *
     * @param html the html
     * @return the string
     */
    //HTML attachments for Allure
    @Attachment(value = "{0}", type = "text/html")
    public static String attachHtml(String html) {
        return html;
    }

    /* (non-Javadoc)
     * @see org.testng.ITestListener#onStart(org.testng.ITestContext)
     */
    @Override
    public void onStart(ITestContext iTestContext) {
        //System.out.println("I am in onStart method " + iTestContext.getName());
        Log.info("Start Execution of" +"\n" +
                        "TestNG Suite Name : " +iTestContext.getCurrentXmlTest().getSuite().getName() +"\n" +
                        "Test Group Name: " +iTestContext.getName() ) ;

        iTestContext.setAttribute("WebDriver", getThreadSafeDriver());
      
    }

    /* (non-Javadoc)
     * @see org.testng.ITestListener#onFinish(org.testng.ITestContext)
     */
    @Override
    public void onFinish(ITestContext iTestContext) {
        //System.out.println("I am in onFinish method " + iTestContext.getName());
        Log.info("Finish Execution of" +"\n" +
                "TestNG Suite Name : " +iTestContext.getCurrentXmlTest().getSuite().getName() +"\n" +
                "Test Group Name: " +iTestContext.getName() ) ;
    }

    /* (non-Javadoc)
     * @see org.testng.ITestListener#onTestStart(org.testng.ITestResult)
     */
    @Override
    public void onTestStart(ITestResult iTestResult) {
        //System.out.println("I am in onTestStart method " +  getTestMethodName(iTestResult) + " start");
        //Log.info(getTestMethodName(iTestResult) +"  Thread ID is:  " +Thread.currentThread().getId());
        Log.info("Test Start Details:" +"\n" +
                        "Method Name: " +getTestMethodName(iTestResult) +"\n" +
                        "Thread ID is:  " +Thread.currentThread().getId());
    }

    /* (non-Javadoc)
     * @see org.testng.ITestListener#onTestSuccess(org.testng.ITestResult)
     */
    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        //System.out.println("I am in onTestSuccess method " +  getTestMethodName(iTestResult) + " succeed");
        Log.info("Test Passed Successfully: " +getTestMethodName(iTestResult) +"  Thread ID is:  " +Thread.currentThread().getId());
       
    }

    /* (non-Javadoc)
     * @see org.testng.ITestListener#onTestFailure(org.testng.ITestResult)
     */
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        //System.out.println("I am in onTestFailure method " +  getTestMethodName(iTestResult) + " failed");
        Log.info("Test Failed: " +getTestMethodName(iTestResult) +"  Thread ID is:  " +Thread.currentThread().getId());
        //Get driver from TestBotBase and assign to local webdriver variable.
        saveScreenshotPNG(getThreadSafeDriver());
        Log.info("Screenshot captured for test case:" + getTestMethodName(iTestResult));
        
       //Object testClass =  iTestResult.getInstance();
      /* WebDriver driver =  getDriverWithListeners();

        //Allure ScreenShotRobot and SaveTestLog
        if (driver instanceof WebDriver) {
            System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
            saveScreenshotPNG(driver);
        }*/

        //Save a log on allure.
        saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");
        Log.info("Log is captured for test case:" + getTestMethodName(iTestResult));

    }

    /* (non-Javadoc)
     * @see org.testng.ITestListener#onTestSkipped(org.testng.ITestResult)
     */
    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        //System.out.println("I am in onTestSkipped method "+  getTestMethodName(iTestResult) + " skipped");
        Log.info("Test got skipped: " +getTestMethodName(iTestResult) +"  Thread ID is:  " +Thread.currentThread().getId());
    }

    /* (non-Javadoc)
     * @see org.testng.ITestListener#onTestFailedButWithinSuccessPercentage(org.testng.ITestResult)
     */
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        //System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
        Log.info("onTestFailedButWithinSuccessPercentage: " +getTestMethodName(iTestResult) +"  Thread ID is:  " +Thread.currentThread().getId());
    }
}

