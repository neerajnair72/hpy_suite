package frameworkBase;

import java.io.File;
import java.io.FileWriter;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import frameworkUtils.Constants;
import frameworkUtils.Log;

public class TestBotElementsWrapper extends TestBotPageGenerator {

    public WebDriverWait wait = null;
    public final int MAX_TRY = 4;
    // The javascript executor.
    //public static JavascriptExecutor javascriptExecutor;
    /**
     * The select.
     */
    public Select select;
    public Actions builder;
    private static String str;


    public TestBotElementsWrapper() {
        wait = new WebDriverWait(getThreadSafeDriver(), Constants.TIMEOUT, Constants.POLLING);
        builder = new Actions(getThreadSafeDriver());
        //javascriptExecutor = (JavascriptExecutor) getThreadSafeDriver();
    }

        /**
         * writeText -> Check isElementDisplayed and then sendKeys.
         *
         * @param element the element
         * @param text the text
         */
        public void writeText(WebElement element, String text) {
            if( isElementDisplayed(element))  {

                element.sendKeys(text);
            }
        }

        public void enterText(WebElement element, String text) {
            if( isElementDisplayed(element))  {

                element.sendKeys(text);
                element.sendKeys(Keys.ENTER);
            }
        }
        
        public void selectSuggestion(WebElement element1, String text, WebElement element2){
        	element1.sendKeys(text);
        	waitForElementVisible(element2);
        	element2.click();
        }

        /**
         * Read text.
         *
         * @param element the element
         * @return the string
         */
        //Read Text
        public String readText (WebElement element) {
            String text = null;

            if( isElementDisplayed(element)) {

                text = element.getText();
            }

            return text;
        }




        /* ============================================ Commands using wait conditions ============================================ */
        /**
         * text wait
         */ 
        public ExpectedCondition<Boolean> waitForElementToHaveText(final WebElement element, final String expectedText) {
            return
                    new ExpectedCondition<Boolean>() {
                            public Boolean apply(WebDriver driver) {
                                try {
                                    return element.getText().equals(expectedText);
                                } catch (Exception e) {
                                    return false;
                                }
                            }
                public String toString() {
                    return String.format("text ('%s') to be present in element %s", expectedText, element);
                }
            };
        }
       
        /**
         * Wait for element visible.
         *
         * @param webElement the web element
         */
//        public boolean waitForElementVisible( WebElement webElement)	{
//
//            try {
//                wait.until(ExpectedConditions.visibilityOf(webElement));
//            } catch (Exception e) {
//                e.printStackTrace();
//                return false;
//            }
//
//            return true;
//        }

    public void waitForElementVisible(WebElement webElement) {
        int trialCount = 0;
        while (trialCount < MAX_TRY) {
            try {
                wait.until(ExpectedConditions.visibilityOf(webElement));
                return;
            } catch (Exception e) {
                e.printStackTrace();
                trialCount++;
                continue;
            }
        }
    }



//        /**Method to VERIFY text field*/
//        public void VerifyTextField(WebElement element, String text) {
//            try {
//                if(getAttributeValue(element,"value").equalsIgnoreCase(text)==false)
//                {
//                    writeText(element,text);
//                }
//            }catch(Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }	
        
        /**
         * Wait for element invisible.
         *
         * @param webElement the web element
         * @return true, if successful
         */
        public boolean waitForElementInVisible(WebElement webElement) {
            try {
                wait.until(ExpectedConditions.invisibilityOf(webElement));
                
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
            return true;
        }
        public boolean waitForElementTextInVisible(WebElement webElement, String string) {

            try {
            	wait.until(ExpectedConditions.invisibilityOfElementWithText((By) webElement, string));
            	if(webElement.getText().equalsIgnoreCase(string)== true)
                {
                clearTextField(webElement);
                } 
            }
            catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }
        
        
        /**
         * Wait for element to clickable.
         *
         * @param webElement the web element
         * @return true, if successful
         */
        public void waitForElementToClickable(WebElement webElement) {
            int trialCount = 0;
            while (trialCount < MAX_TRY) {
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(webElement));
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    trialCount++;
                    continue;
                }
            }
        }

        /**
         * Wait for page title.
         *
         * @param title the title
         * @return true, if successful
         */
        public boolean waitForPageTitle(String title) {
            try {
                wait.until(ExpectedConditions.titleContains(title));
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }

        /**
         * Wait for text.
         *
         * @param webElement the web element
         * @param text the text
         * @return true, if successful
         */
        public boolean waitForText(WebElement webElement, String text){
            try{

                wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));

            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }

        /**
         * Wait and click web element.
         *
         * @param webElement the web element
         * @return true, if successful
         */
        public boolean waitAndClickWebElement(WebElement webElement) {
        	boolean clickResult = true;
            try {
                //wait.until(ExpectedConditions.elementToBeClickable(webElement));
                if(isElementDisplayed(webElement) && isElementEnabled(webElement))
                	webElement.click();

            } catch (NoSuchElementException e) {
            	clickResult = false;
                System.out.println("Element was not found in DOM "+ e.getStackTrace());
                Log.error("Element was not found in DOM "+ e.getStackTrace());

            } catch (Exception e) {
            	clickResult = false;
                System.out.println("Unable to click on element "+ e.getStackTrace());
                Log.error("Unable to click on element "+ e.getStackTrace());
            }
            return clickResult;
        }
        
        /*
         * Fluent wait which polls every half second to be visible
         */
        public void fluentWaitForElementVisible(WebElement element)
        {
        	Wait fluentWait = new FluentWait<WebDriver>(getThreadSafeDriver())
        			.withTimeout(Duration.ofSeconds(100))
        			.pollingEvery(Duration.ofMillis(600))
        			.ignoring(NoSuchElementException.class);

            fluentWait.until(ExpectedConditions.visibilityOf(element));
            }
        
        
        /*
         * Fluent wait which polls every half second to be clickable
         */
        public void fluentWaitForElementClickable(WebElement element)
        {
        	Wait fluentWait = new FluentWait<WebDriver>(getThreadSafeDriver())
                    .withTimeout(Duration.ofSeconds(100))
                    .pollingEvery(Duration.ofMillis(600))
        			.ignoring(NoSuchElementException.class);

            fluentWait.until(ExpectedConditions.elementToBeClickable(element));
        }

        public void safeJavaScriptClick(WebElement webElement) throws Exception {
            try {

                //if (webElement.isEnabled() && webElement.isDisplayed())
                if (webElement.isDisplayed())
                {
                    JavascriptExecutor jse = (JavascriptExecutor)getThreadSafeDriver();
                    jse.executeScript("arguments[0].click();", webElement);

                }

            } catch (StaleElementReferenceException e) {

                System.out.println("Element is not attached to the page document "+ e.getStackTrace());
                Log.error("Element is not attached to the page document "+ e.getStackTrace());

            } catch (NoSuchElementException e) {

                System.out.println("Element was not found in DOM "+ e.getStackTrace());
                Log.error("Element was not found in DOM "+ e.getStackTrace());

            } catch (Exception e) {
                System.out.println("Unable to click on element "+ e.getStackTrace());
                Log.error("Unable to click on element "+ e.getStackTrace());
            }
        }



        /* ============================================ START - Boolean Validatoins and Alerts ============================================ */

        /**
         * Checks if is element displayed.
         *
         * @param webElement the web element
         * @return true, if is element displayed
         */
        public boolean isElementDisplayed(WebElement webElement){

            try{
                wait.until(ExpectedConditions.visibilityOf(webElement));
                webElement.isDisplayed();
            }
            catch(NoSuchElementException e)
            {
                return false;
            }

            catch(Exception e)
            {
                Log.error("Catch the exception" + e.getStackTrace());
                return false;
            }
            return true;
        }

        /**
         * Checks if is element selected.
         *
         * @param element the element
         * @return true, if is element selected
         */
        public boolean isElementSelected(WebElement element) {

            try {
                element.isSelected();
            }
            catch(NoSuchElementException e) {
                return false;
            }
            return true;
        }

        /**
         * Checks if is element enabled.
         *
         * @param element the element
         * @return true, if is element enabled
         */
        public boolean isElementEnabled(WebElement element) {

            try {
                element.isEnabled();
            }
            catch(NoSuchElementException e) {
                return false;
            }
            return true;
        }
     

        /* ============================================ END - Boolean Validatoins and Alerts ============================================ */


        /* ============================================ START - Select Methods  ============================================ */

        /**
         * Gets the selected option.
         *
         * @param webElement the web element
         * @return the selected option
         */
        public String getSelectedOption(WebElement webElement) {

            select = new Select(webElement);
            return select.getFirstSelectedOption().getText();
        }


        /**
         * Gets the drop down item text by index.
         *
         * @param webElement the web element
         * @param index the index
         * @return the drop down item text by index
         */
        public String getDropDownItemTextByIndex(WebElement webElement,int index)
        {
            Select select = new Select(webElement);
            return select.getOptions().get(index).getText();

        }
        
        

        /**
         * Select by visible text.
         *
         * @param webElement the web element
         * @param Key the key
         * @return true, if successful
         */
        public boolean selectByVisibleText(WebElement webElement,String Key)
        {
            boolean testresult = false;
            try{

                new Select(webElement).selectByVisibleText(Key);
                testresult = true;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            return testresult;
        }

        /**
         * Gets the drop down list.
         *
         * @param webElement the web element
         * @return the drop down list
         */
        public ArrayList<String> getDropDownList(WebElement webElement)
        {
            Select select = new Select(webElement);
            List<WebElement> elementcount = select.getOptions();
            ArrayList<String> dropDownList = new ArrayList<String>();

            for(WebElement element:elementcount)
            {
                dropDownList.add(element.getText());
            }

            return dropDownList;
        }



        public void ScrollDown( WebElement element) {
            JavascriptExecutor jse = (JavascriptExecutor)getThreadSafeDriver();
            jse.executeScript("arguments[0].scrollIntoView(true);", element);
        }
        /* ============================================ START - Action Class Methods ============================================
         *  Mouse Actions: RED HAT -
         * =================
         *  1. DragAndDrop
         *  3. MoveToElement
         *  6. Mouse hover
         *
         *  4. ActionClick
         *  5. Rightclick
         *  6. Double Click
         *  2. ClickAndHold
         *
         *  6. Mouse hover
         *  7. Send Enter / Tab Keys
         *  8. Double Click
         *
         *  */

        /**
         * Drag and drop actions.
         *
         * @param sourceElement the source element
         * @param destinationElement the destination element
         */
        public void dragAndDrop_Actions(WebElement sourceElement, WebElement destinationElement) {

            builder
                    .click(sourceElement)
                    .clickAndHold(sourceElement)
                    .moveToElement(destinationElement)
                    .release(destinationElement)
                    .build()  // Get the action
                    .perform();

        }

        /**
         * Click and hold actions.
         *
         * @param webElement1 the web element 1
         * @param webElement2 the web element 2
         * @throws InterruptedException the interrupted exception
         */
        public void clickAndHold_Actions(WebElement webElement1,WebElement webElement2) throws InterruptedException
        {
            builder
                    .clickAndHold(webElement1)
                    .build()
                    .perform();
            webElement2.click();

        }

        /**
         * Move to element actions.
         * @param element the element
         */
        public void moveToElement_Actions(WebElement element )
        {
            builder
                    .moveToElement(element)
                    .build()
                    .perform();

        }


        /**
         * Click actions.
         * @param element the element
         */
        public void click_Actions(WebElement element ) 
        {
            builder
                    .moveToElement(element)
                    .click()
                    .build()
                    .perform();

        }


        /**Clear Text*/
        public void clearText(WebElement element) {
            if(isElementDisplayed(element)) {
                element.clear();
            }
        }
        
        /*
         * Special click which loops and retries upon failure
         */
        public void specialClick(WebElement element)
        {
        	for(int i=0;i<5;i++)
    		{
        		if(waitAndClickWebElement(element))
        		{break;}
    		}
        }
        
        public void specialGETElement(WebElement element)
        {
        	for(int i=0;i<5;i++)
    		{
        		if(isElementDisplayed(element))
        		{break;}
    		}
        }

        /**Clear Text*/
        public void clearTextField(WebElement element) {
            if(isElementDisplayed(element)) {
                 // element.click();
               // element.sendKeys(Keys.chord(Keys.COMMAND + "a", Keys.DELETE));
                 String b=Keys.BACK_SPACE.toString();
               // element.sendKeys(Keys.chord(Keys.COMMAND,"a"));
                element.sendKeys(b+b+b+b+b+b+b+b+b+b+b+b+b+b+b+b+b+b+b+b+b+b+b+b+b+b );

                
            }
        }

      
        
        public void writeKeyboardText(WebElement element, Keys text) {
            // TODO Auto-generated method stub
            if( isElementDisplayed(element))  {

                element.sendKeys(text);
            }
        }

//			public Map getEFData() throws Exception
//			{
//		Map<Enum,String> efData = new HashMap<Enum, String>();
//		//ExcelUtils eu = new ExcelUtils();
//
//				//efData.put(EFType.TEXT, ExcelUtils.getCellData(10, 1).toString());
//				efData.put(EFType.TEXT, ExcelUtils.getCellDataWithSheetName(1, 1, "EFData").toString());
//				efData.put(EFType.NUMBER, ExcelUtils.getCellDataWithSheetName(2, 1,"EFData").toString());
//				efData.put(EFType.FILE, ExcelUtils.getCellDataWithSheetName(3, 1,"EFData").toString());
//				efData.put(EFType.DATE, ExcelUtils.getCellDataWithSheetName(4, 1,"EFData").toString());
//				efData.put(EFType.TIME, ExcelUtils.getCellDataWithSheetName(5, 1,"EFData").toString());
//				efData.put(EFType.ACCOUNT, ExcelUtils.getCellDataWithSheetName(6, 1,"EFData").toString());
//				efData.put(EFType.IFSC, ExcelUtils.getCellDataWithSheetName(7, 1,"EFData").toString());
//				efData.put(EFType.PREFIX, ExcelUtils.getCellDataWithSheetName(8, 1,"EFData").toString());
//				efData.put(EFType.POSTFIX, ExcelUtils.getCellDataWithSheetName(9, 1,"EFData").toString());
//
//				return efData;
//			}

        public void ScrollToElement( WebElement element) {
            JavascriptExecutor jse = (JavascriptExecutor)getThreadSafeDriver();
            jse.executeScript("arguments[0].scrollIntoView(true);", element);
        }
        
        public void ScrollToElementNew( WebElement element) {
       // ((JavascriptExecutor) ((RemoteWebDriver) getThreadSafeDriver())).executeScript("arguments[0].scrollIntoView(true);", element);
            JavascriptExecutor jse = (JavascriptExecutor)getThreadSafeDriver();
            jse.executeScript("arguments[0].scrollIntoView(true);", element);
        }

        public void doubleClick(WebElement element)
        {
            builder.doubleClick(element).build().perform();
        }

        //============================================ END - Action Class Methods ============================================//

        //================================= Basic Selenium GET Methods =============================//


        public int getWebElementsCount(List<WebElement> webElements) {
            return webElements.size();
        }

        public String getText(WebElement webElement) {
            return webElement.getText();

        }
        public String getValue(WebElement webElement) {
            return webElement.getAttribute("value");

        }

        public String getAttributeValue(WebElement webElement, String attribute) {

            return webElement.getAttribute(attribute);
        }

        public String getTextAttribute(WebElement webElement) {

            return null;
        }




        public void untilJqueryIsDone(){
            untilJqueryIsDone( Constants.IMPLICITWAIT_INSECONDS);
        }

        public void untilJqueryIsDone(Long timeoutInSeconds){
            until( (d) ->
            {
                JavascriptExecutor jse = (JavascriptExecutor)getThreadSafeDriver();
                Boolean isJqueryCallDone = (Boolean)jse.executeScript("return jQuery.active==0");
                if (!isJqueryCallDone) System.out.println("JQuery call is in Progress");
                return isJqueryCallDone;
            }, timeoutInSeconds);
        }



        public void untilPageLoadComplete() {
            untilPageLoadComplete( Constants.IMPLICITWAIT_INSECONDS);
            
        }

        public void untilPageLoadComplete(Long timeoutInSeconds){
            until( (d) ->
            {
                JavascriptExecutor jse = (JavascriptExecutor)getThreadSafeDriver();
                Boolean isPageLoaded = (Boolean)jse.executeScript("return document.readyState").equals("complete");
                if (!isPageLoaded) System.out.println("Document is loading");
                return isPageLoaded;
            }, timeoutInSeconds);
        }



        public void until(Function<WebDriver, Boolean> waitCondition){
            until(waitCondition, Constants.IMPLICITWAIT_INSECONDS);
        }


        private void until( Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds){
            //WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);

            // Duration using ofSeconds() method
            Duration duration = Duration.ofSeconds(20);

            wait.withTimeout(duration);
            try{
                wait.until(waitCondition);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }


        }

        /**Method to assert text message
         * @return */
        public  void assertText(String actual, String expected) {
            SoftAssert sa =new SoftAssert();
            sa.assertEquals(actual, expected);
        }
        /**Method to assert value message
         * @return */
        public  boolean assertTextValue(String actual,String Expected) {
            SoftAssert sa =new SoftAssert();

            boolean validation=false;
            try {

                sa.assertEquals(actual, Expected);
                return validation=true;
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
            return validation;
        }
        /**Method to handle multiple asserts*/
        public boolean booleanAssert(boolean Expected) {
            SoftAssert sa =new SoftAssert();

            boolean flag=false;
            try {
                sa.assertTrue(Expected);
                return flag= true;
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
            return flag;
        }

        /**Method to upload file*/
        public void uploadFile(String file_location,WebElement upload_id) {
            try {
                File f = new File(file_location);
                upload_id.sendKeys(f.getAbsolutePath());
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        /**Method to add text field*/
        public void addTextField(WebElement element, String text) {
            try {
                waitForElementToClickable(element);
                writeText(element, text);

            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

    /**Method to VERIFY text field*/
    public void VerifyTextField(WebElement element, String text) {
        try {
            if(getAttributeValue(element,"value").equalsIgnoreCase(text)==false)
            {
                writeText(element,text);
            }

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


        /**Method to select value from dropdown field */
        public void selectValueOfDropdown(WebElement select_element, List<WebElement> option, int index) {
            try {
                click_Actions(select_element);
                click_Actions(option.get(index));
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }

        }
        /**Method to select value from dropdown field */
        public void selectValueOfDropdownwithWaitAndClock(WebElement select_element, List<WebElement> option, int index) {
            try {
                //ScrollToElement(select_element);
                waitAndClickWebElement(select_element);
                //ScrollToElement(option.get(index));
                waitAndClickWebElement(option.get(index));
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }

        }
        /**Method to assert Mandatory field*/
        public boolean assertValidation(WebElement element,WebElement toolTip, String actual) {
            SoftAssert sa =new SoftAssert();

            boolean validation=false;
            try {
                ScrollToElement(element);
                sa.assertEquals(toolTip.getText(), actual);
                return validation=true;
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
            return validation;
        }
        /**Method to scroll up*/
        public void scrollUp() {
            JavascriptExecutor jse = (JavascriptExecutor)getThreadSafeDriver();
            jse.executeScript("window.scrollTo(0, -1000)");
        }
        /**Method to scroll up*/
        public void scrollVericalUp() {
            JavascriptExecutor jse = (JavascriptExecutor)getThreadSafeDriver();
            jse.executeScript("window.scrollTo(0, 1000)");
        }
        /**Method for half horizontal inner scroll*/
        public void scrollHalflHorizontal(WebElement element) {

            JavascriptExecutor jse = (JavascriptExecutor)getThreadSafeDriver();
            jse.executeScript("arguments[0].scrollLeft = arguments[1];",element, 500);

        }
        /**Method for half horizontal inner scroll*/
        public void scrollFullHorizontal(WebElement element) {

            JavascriptExecutor jse = (JavascriptExecutor)getThreadSafeDriver();
            jse.executeScript("arguments[0].scrollLeft = arguments[1];",element, 1300);

        }
        /**Method to check default value*/
        public boolean isDefault(WebElement element) {
            boolean flag=false;
            try {
                String value=element.getText();
                if(value!="null") {
                    return flag=true;
                }
                else {
                    return flag=false;
                }

            }catch(Exception e) {

            }
            return flag;
        }
        /**Method to verify Account Number matches with BACC*/
        public void addBacc(WebElement accountNo,WebElement bacc, String accNum, String baccNum) {
            addTextField(accountNo, accNum);
            addTextField(bacc, baccNum);
        }
        /**Method to verify bank details*/
        public boolean assertBankDetails(WebElement bank,String bankName, WebElement branch, String branchName) {
            boolean details=false;
            try {
                assertText(bank.getText(),bankName);
                assertText(branch.getText(),branchName);
                return details=true;
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
            return details;
        }
        /**Method for deleting uploaded file*/
        public void deleteUploadedFile(WebElement file, WebElement deleteIcon) {
            try {
                waitForElementToClickable(file);
                click_Actions(file);
                waitForElementToClickable(deleteIcon);
                click_Actions(deleteIcon);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        /**Method for deselecting dropdown value*/
        public void resetDropDownValue(WebElement dropDown, WebElement reset) {
            try {
                waitForElementToClickable(dropDown);
                click_Actions(dropDown);
                waitForElementToClickable(reset);
                click_Actions(reset);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }

        }
        /**Method to wait for element to be clickable and then clicking on it
         * @throws Exception */
        /*public void customClickAction(WebElement element) throws Exception {
            shortWait();
            waitForElementVisible(element);
            waitForElementToClickable(element);
            safeJavaScriptClick(element);
            // 	click_Actions(element);
        }*/
        /**Method to clear value of a field*/
        public void clearValue(WebElement element) {
            builder.click(element)
                    .sendKeys(Keys.END)
                    .keyDown(Keys.SHIFT)
//                    .keyDownArrow(Keys.ARROW_DOWN);
                    .sendKeys(Keys.HOME)
                    .keyUp(Keys.SHIFT)
                    .sendKeys(Keys.BACK_SPACE)
                    .sendKeys("")
                    .perform();

        }
        /**Method to shift focus */
        public void shiftFocus(WebElement element)
        {
            element.sendKeys(Keys.SHIFT);
            JavascriptExecutor jse = (JavascriptExecutor)getThreadSafeDriver();
            jse.executeScript("document.getElementsByTagName('input')[4].focus();");

        }
        /**Method to get current date time in format-dd Mon yyyy,hh:mm a*/
        public static String getCurrentDateTime() {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a");
            //	SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy hh:mm a");
            LocalDateTime now = LocalDateTime.now();
            String date= dtf.format(now);
            return date;

        }
        /**Method to check whether column displayed*/
        public boolean isColumnDisplayed(WebElement element) {
            if(isElementDisplayed(element)) {
                return true;
            }
            else {
                return false;
            }
        }
        /**Method to assert all columns*/
        public  void assertAllColumns(List<WebElement> col, XSSFRow row ){
            SoftAssert sa=new SoftAssert();
            for(int i=2;i<col.size();i++) {
                ScrollToElement(col.get(i));
                String actual=col.get(i).getText();
                for (int j = 1; j < row.getLastCellNum(); j++) {
                    String Expected=row.getCell(j).getStringCellValue();
                    sa.assertEquals(actual, Expected);
                }
                i++;
            }
        }
        /**Method to assert default columns*/
        public  void assertDefaultColumns(List<WebElement> col, XSSFRow row ){
            SoftAssert sa=new SoftAssert();
            for(int i=1;i<col.size();i++) {
                ScrollToElement(col.get(i));
                String actual=col.get(i).getText();
                for (int j = 1; j < row.getLastCellNum(); j++) {
                    String Expected=row.getCell(j).getStringCellValue();
                    sa.assertEquals(actual, Expected);
                }
                i++;
            }
        }
        /**Method to select all filters invoice
         * @throws Exception */
        /*public void selectAllFiltersInvoice(WebElement allFilter,WebElement searchField,String colName, WebElement filterColumn, WebElement checkbox,WebElement apply ) throws Exception {
            customClickAction(allFilter);
            writeText(searchField, colName);
            customClickAction(filterColumn);
            customClickAction(checkbox);
            customClickAction(apply);
        }
        *//**Method to select all filters
         * @throws Exception *//*
        public void selectAllFilters(WebElement allFilter,WebElement filter, WebElement checkbox,WebElement apply ) throws Exception {
            customClickAction(allFilter);
            customClickAction(filter);
            customClickAction(checkbox);
            customClickAction(apply);
        }
        *//**Method to capture filter value
         * @throws Exception *//*
        public String captureFilterValue(WebElement allFilter,WebElement filter, WebElement checkbox,WebElement value, WebElement cancel) throws Exception {
            customClickAction(allFilter);
            customClickAction(filter);
            customClickAction(checkbox);
            String filterValue=getText(value);
            customClickAction(cancel);
            return filterValue;
        }

        *//**Method to capture filter value for invoice
         * @throws Exception *//*
        public String captureFilterValueInvoice(WebElement allFilter,WebElement searchField,String colName, WebElement filterColumn,WebElement checkbox,WebElement value, WebElement cancel) throws Exception {
            customClickAction(allFilter);
            writeText(searchField, colName);
            customClickAction(filterColumn);
            customClickAction(checkbox);
            String filterValue=getText(value);
            customClickAction(cancel);
            return filterValue;
        }*/
        /**Method to assert filter data
         * @return */
        public static void assertFilterData(List<WebElement> value, String expected ){
            SoftAssert sa=new SoftAssert();
            for(int i=0;i< value.size();i++) {
                String actual = value.get(i).getText();
                sa.assertEquals(actual, expected);
            }

        }
        /**Method to assert filter data for invoice
         * @return */
        public static void assertFilterDataInvoice(WebElement value, String expected ){
            SoftAssert sa=new SoftAssert();
            String actual=value.getText();
            sa.assertEquals(actual, expected);


        }
        /**Method to capture filter value from table view
         * @throws Exception */
        /*public String captureFilterValueFromTable(WebElement filterIcon,WebElement value, WebElement cancel) throws Exception {
            customClickAction(filterIcon);
            String filterValue=getText(value);
            customClickAction(cancel);
            return filterValue;
        }
        *//**Method to select  filter in table view
         * @throws Exception *//*
        public void selectFilterFromTable(WebElement filterIcon, WebElement checkbox,WebElement apply ) throws Exception {
            customClickAction(filterIcon);
            customClickAction(checkbox);
            customClickAction(apply);
        }
        *//**Method to upload invoice
         * @throws Exception *//*
        public void uploadInvoice(String file_location, WebElement upload_id, WebElement proceedButton) throws Exception {
            shortWait();
            uploadFile(file_location, upload_id);
            customClickAction(proceedButton);
        }
        *//**Method to attach container*//*

        public void attachCollection(WebElement container,WebElement container_rct,WebElement done) throws Exception {
            shortWait();
            customClickAction(container);
            customClickAction(container_rct);
            customClickAction(done);

        }*/
        /**Method to select next day of current date
         * @throws Exception */
        /*public void selectnextday(WebElement datepicker, WebElement today) throws Exception {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Date dt = new Date();

            Calendar cl = Calendar.getInstance();
            //cl.setTime(dt);;
            cl.add(Calendar.DAY_OF_YEAR, 1);
            System.out.println(cl.DATE);

            //dt=cl.getTime();
            str = df.format( cl.DATE);
            int dateCount=Integer.parseInt(str);
            customClickAction(datepicker);
            customClickAction(today);
            //writeText(date.get(dateCount), str);
        }
        *//**Method to select current date
         * @throws Exception *//*
        public void selectTodayDate(WebElement datepicker, WebElement today) throws Exception {
            customClickAction(datepicker);
            ScrollToElement(today);
            customClickAction(today);
        }*/
        /**Method to capture last action*/
        public String captureLastAction(WebElement action, WebElement actor) {
            this.waitAndClickWebElement(action);
            String captureAction=this.getText(action);
            this.waitAndClickWebElement(actor);
            String captureActor=this.getText(actor);
            String lastActivity=captureAction+","+captureActor;
            return lastActivity;
        }
        /**Method to download a file*/
        public void downloadFile()
        {
            String downloadFilepath="./src/test/resources/ExportedFiles";
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("download.default_directory", downloadFilepath);
            ChromeOptions option = new ChromeOptions();
            option.setExperimentalOption("prefs", chromePrefs);

        }
        /**Method to switch to child window*/
        public void switchToChilWindow(WebDriver driver) {
            String MainWindow=driver.getWindowHandle();
            Set<String> s1=driver.getWindowHandles();
            Iterator<String> i1=s1.iterator();
            while(i1.hasNext())
            {
                String ChildWindow=i1.next();

                if(!MainWindow.equalsIgnoreCase(ChildWindow))
                {

                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                }
            }

        }

       /* public boolean verifyLocalisationData(int rowNum) {

            boolean actual = true;
            boolean result=true;
            for (int row=1;row<=rowNum;row++)
            {

                result= verifyText(ExcelUtils.getRowData(row));

                softAssert.assertEquals(result,actual);
            }
            return result;
        }*/

        public boolean verifyText(XSSFRow rowData) {
            String text=null;
            boolean expectedTxt = false;
            try{
                text = rowData.getCell(1).getStringCellValue();
                String expected=rowData.getCell(2).getStringCellValue();
                WebElement Xpath = getThreadSafeDriver().findElement(By.xpath(text));
                //System.out.println(Xpath.getText());

                expectedTxt=Xpath.getText().contains(expected);
                //int lengthofchar=Xpath.getText().length();
                //System.out.println(lengthofchar);

                return expectedTxt;
            }

            catch(Exception e)
            {
                e.printStackTrace();
                return false;
            }
        }

        public int getRowNum(int rowNum) {
            // TODO Auto-generated method stub
            return rowNum;
        }


        /**
         * Create a file
         *
         */

        public File CreateFile(String Filename) {

            //File myObj = null;

            try {

                File file = new File(Filename);
                boolean fileCreated = file.createNewFile();
                if (fileCreated) {

                    System.out.println("File created: " + file.getName());
                    return file;
                } else{
                    System.out.println("File already exists: " + file.getName());
                    return new File(Filename);
                }
            } catch (Exception e) {
                System.out.println("An error occurred while creating file.");
                e.printStackTrace();
                return null;
            }

        }

        /**
         * Write into file
         *
         */
        public boolean writeintoFile(String Filename, String data) {

            try{

                FileWriter myWriter = new FileWriter(Filename);
                myWriter.write(data);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
                return true;
            }
            catch(Exception e){
                System.out.println("An error occurred while writing into file.");
                e.printStackTrace();
                return false;
            }

        }
        
        public void waitForFewSeconds() throws Exception{
            Thread.sleep(3000);
            }

        /**
         * Read from file
         *
         */

        public String readFile(String Filename) {
            String data = "";
            try{
                File file = new File(Filename);
                Scanner myReader = new Scanner(file);
                while (myReader.hasNextLine()) {
                    data = myReader.nextLine();
                    // data is txn id reading from file
                    System.out.println("Expense Id From file is " + data);
                }
                myReader.close();
                return data;
            }
            catch(Exception e){
                System.out.println("An error occurred while reading from file.");
                e.printStackTrace();
                return null;
            }


        }
        

        public void hardPageRefreshAndClick(WebElement element){
            getThreadSafeDriver().navigate().refresh();
            untilPageLoadComplete();
            waitAndClickWebElement(element);
        }

    public void hardPageRefresh(){
        getThreadSafeDriver().navigate().refresh();
        untilPageLoadComplete();
    }
    public void maximizeWindow(){
        getThreadSafeDriver().manage().window().maximize();
        untilPageLoadComplete();
    }
    
    
    /**Method to switch first tab*/
    public void switchToFirstTab(WebElement element) {

      element.sendKeys(Keys.COMMAND);
      element.sendKeys(Keys.NUMPAD1);

    }
 
    
    /**Method to switch new tab*/
    public void switchToNewTab(WebElement element,int tabNum) {

    	
    	ArrayList<String> tabs2 = new ArrayList<String> (getThreadSafeDriver().getWindowHandles());
    	getThreadSafeDriver().switchTo().window(tabs2.get(tabNum));
    	
    	//getThreadSafeDriver().close();
        //getThreadSafeDriver().switchTo().window(tabs2.get(0));
        

    }
    
    
    /**Method to close tab*/
    public void closeTab() {

     getThreadSafeDriver().close();
  

    }
}


