package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils
{
    // Create Object To Call Browser Manager Class In  Base Test Class
    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod // Create Annotation For Before Method
    public void setUp()
    {
        browserManager.openBrowser();
    }
    @AfterMethod // Create Annotation For After Method
    public void tearDown(ITestResult result)
    {
        if(!result.isSuccess())
        {
            takeSnapShot(result.getName());
        }
        browserManager.closeBrowser();
    }
}