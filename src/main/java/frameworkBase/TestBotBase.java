package frameworkBase;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import frameworkUtils.Constants;
import frameworkUtils.ExcelUtils;
import frameworkUtils.Log;

// Import the AWS SDK for Java 2.x Device Farm client:


// TODO: Auto-generated Javadoc

/**
 * The Class TestBotBase.
 *
 * @author vikramvasanthkumar
 */
public class TestBotBase {
	
	
	


	protected static ThreadLocal<WebDriver> remoteWebDriverTl = new ThreadLocal<>();
	//private ThreadLocal<EventFiringWebDriver> eventFiringWebDriverTl = new ThreadLocal<>();
	/**
	 * The Constant CONFIG_FILENAME.
	 */
	private static final String CONFIG_FILENAME = "config";
	/**
	 * The resource bundle.
	 */
	private static ResourceBundle resourceBundle = ResourceBundle.getBundle(CONFIG_FILENAME);

	public TestBotDrivers testBotDrivers = new TestBotDrivers();
	public TestBotPageGenerator pageGeneratorNew = null;
	private WebDriverWait initialWait = null;
	public ExcelUtils excelUtils;

	{
		try {
			excelUtils = ExcelUtils.getInstance();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Global test setup.
	 *
	 * @param browser the browser
	 * @throws MalformedURLException
	 */

	@BeforeMethod(description = "Method level Setup!")
	@Parameters(value = {"browser", "env"})
	public void globalTestSetup(@Optional String browser, @Optional String env, ITestContext iTestContext) throws MalformedURLException {
		//Set Browser to ThreadLocalMap
		//((RemoteWebDriver) remoteWebDriverTl).setFileDetector(new LocalFileDetector());
		String imageList[] = {"1.png", "MRID.txt", "CopyTypeTxnID.txt", "TxnID.txt"};
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("build", "5 parallels timing");
    	capabilities.setCapability("name", "8 TC on Mac/Chrom 92.v");
    	capabilities.setCapability("platform", "MacOS Big sur");
    	capabilities.setCapability("browserName", "Chrome");
    	capabilities.setCapability("version","92.0");
    	capabilities.setCapability("resolution","1024x768");

//		capabilities.setCapability("os", "OS X");
//		capabilities.setCapability("os_version", "Big Sur");
//		capabilities.setCapability("browser", "Chrome");
//		capabilities.setCapability("browser_version", "92.0");
//		capabilities.setCapability("build", "HAPPAY");
//    	capabilities.setCapability("lambda:userFiles", imageList);
    	//capabilities.setCapability("video",false);
		
		if (System.getProperty("BROWSER") != null && System.getProperty("HUB_HOST") != null) {
			String host = System.getProperty("HUB_HOST");
			String browserArg = System.getProperty("BROWSER");
			//remoteWebDriverTl.set(new RemoteWebDriver(new URL("http://"+host+":4444/wd/hub"), testBotDrivers.getCapabilities(browserArg, iTestContext)));
			//remoteWebDriverTl.set(new RemoteWebDriver(new URL("https://falconmagicleap_vci1oa:JxzszpGVzPndo6ySxp3r@hub-cloud.browserstack.com/wd/hub"), capabilities));
			remoteWebDriverTl.set(new RemoteWebDriver(new URL("https://neerajnair72:V3mHKgu82lWUMtNcJzNBrIi9xr8mM7nBGf1sAwxa0unZfXkNFF@hub.lambdatest.com/wd/hub"), capabilities));

		}
		else if (System.getProperty("HUB_HOST") != null) {
			String host = System.getProperty("HUB_HOST");
			 String browserArg = System.getProperty("BROWSER");
			//remoteWebDriverTl.set(new RemoteWebDriver(new URL("https://falconmagicleap_vci1oa:JxzszpGVzPndo6ySxp3r@hub-cloud.browserstack.com/wd/hub"), capabilities));
			remoteWebDriverTl.set(new RemoteWebDriver(new URL("https://neerajnair72:V3mHKgu82lWUMtNcJzNBrIi9xr8mM7nBGf1sAwxa0unZfXkNFF@hub.lambdatest.com/wd/hub"), capabilities));
			//remoteWebDriverTl.set(new RemoteWebDriver(new URL("http://"+host+":4444/wd/hub"), testBotDrivers.getCapabilities(browserArg, iTestContext)));

		} 
		else {
			//remoteWebDriverTl.set(new RemoteWebDriver(new URL("https://falconmagicleap_vci1oa:JxzszpGVzPndo6ySxp3r@hub-cloud.browserstack.com/wd/hub"), capabilities));
			remoteWebDriverTl.set(new RemoteWebDriver(new URL("https://neerajnair72:V3mHKgu82lWUMtNcJzNBrIi9xr8mM7nBGf1sAwxa0unZfXkNFF@hub.lambdatest.com/wd/hub"), capabilities));
			//remoteWebDriverTl.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), testBotDrivers.getCapabilities(browser, iTestContext)));

		}

		pageGeneratorNew = new TestBotPageGenerator();
		initialWait = new WebDriverWait(getThreadSafeDriver(), Constants.TIMEOUT, Constants.POLLING);
		
		getThreadSafeDriver().navigate().to(env);
		waitForPageLoad();

		getThreadSafeDriver().manage().window().maximize();
		Log.info("BeforeMethod is started. "+Thread.currentThread().getId());
	}

	public void waitForPageLoad() {
		ExpectedCondition<Boolean> pageLoadCondition = driver -> ((JavascriptExecutor) getThreadSafeDriver()).executeScript("return document.readyState").toString().equals("complete");
		try {
			initialWait.until(pageLoadCondition);
		} catch (Throwable error) {
			//e.printStackTrace();
			Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}


	public WebDriver getThreadSafeDriver() {
		return remoteWebDriverTl.get();
	}

	/*public void setThreadSafeDriver(RemoteWebDriver driver) {
		remoteWebDriverTl.set(driver);
	}*/

	@AfterMethod(description = "Method Level Teardown!")
	public void globalTearDown() {
		getThreadSafeDriver().quit();
	}

	@AfterClass
	public void terminate() {
		//Remove the ThreadLocalMap element
		remoteWebDriverTl.remove();
	}

	/**
	 * Method to read the property value.
	 *
	 * @param key the key
	 * @return the property
	 */
	public static String getProperty(final String key) {
		String propertyValue = null;

		if (resourceBundle != null) {
			propertyValue = resourceBundle.getString(key);

			Log.info("Property Value Found: "+propertyValue+" For Key: "+key);
		} else {
			Log.info("Property File not loaded successfully! ");
		}
		return propertyValue;
	}
	
	

	public enum ORG {PWC, OUP, LANDMARK, AUTO}

	public enum ExpenseType {BaseStation_OutofPocket, BaseStation_CompanyPaid, NonTravel_OutofPocket, NonTravel_CompanyPaid, Multiday, Cab, Cash, Deposit, Merge_Transaction}
}