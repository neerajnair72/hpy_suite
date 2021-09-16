package frameworkBase;

import org.openqa.selenium.Capabilities;
import org.testng.ITestContext;

public class TestBotDrivers {

    public Capabilities capabilities;

    public Capabilities getCapabilities (String browser, ITestContext iTestContext) {
        if (browser.equalsIgnoreCase("firefox"))
            capabilities = TestBotOptionsManager.getFirefoxOptions(iTestContext);
        else if(browser.equalsIgnoreCase("chrome"))
            capabilities = TestBotOptionsManager.getChromeOptions(iTestContext);
        return capabilities;
    }

}
