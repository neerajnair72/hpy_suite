package frameworkBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBotPageGenerator extends TestBotBase {

    //JAVA Generics to Create and return a New Page
    public  <TPage extends TestBotElementsWrapper> TPage GetInstance (Class<TPage> pageClass) {
        try {
            //Initialize the Page with its elements and return it.
            return PageFactory.initElements(getThreadSafeDriver(),  pageClass);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
