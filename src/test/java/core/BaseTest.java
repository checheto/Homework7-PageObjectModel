package core;

import org.testng.annotations.*;
import utils.Browser;

public abstract class BaseTest {
    @BeforeClass
    public void setUpBrowser(){
        Browser.setup();
    }
    @AfterClass
    public void tearDownBrowser(){
        Browser.tearDown();
    }
}
