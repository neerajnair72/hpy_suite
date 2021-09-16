package frameworkBase;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestContext;

public class TestBotOptionsManager {

    public static ChromeOptions getChromeOptions(ITestContext iTestContext) {
        // TODO Auto-generated method stub

       ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized", "disable-extensions",
                "test-type", "no-default-browser-check", "disable-popup-blocking", "ignore-certificate-errors");
        chromeOptions.addArguments("--window-size=1920,1080");
        // for headless mode uncomment below line
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--disable-dev-shm-usage");
//        chromeOptions.addArguments("--no-sandbox");
//        chromeOptions.addArguments("--disable-setuid-sandbox");
        if (System.getProperty("Headless") != null) {
            chromeOptions.addArguments("--headless");
        }
        chromeOptions.setCapability("name", iTestContext.getCurrentXmlTest().getName());
       return chromeOptions;
    }

    public static FirefoxOptions getFirefoxOptions(ITestContext iTestContext) {
        FirefoxOptions firefoxOptions = new FirefoxOptions();

        //firefoxOptions.setHeadless(true);

        if (System.getProperty("Headless") != null) {
            //firefoxOptions.addArguments("--headless");
            firefoxOptions.setHeadless(true);
        }

        firefoxOptions.setCapability("name", iTestContext.getCurrentXmlTest().getName());

        return firefoxOptions;

    }
}
