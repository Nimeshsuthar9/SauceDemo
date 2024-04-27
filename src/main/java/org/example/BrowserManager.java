package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserManager extends Utils
{
    // Create Object For Load Properties Class
    LoadProp loadProp = new LoadProp();
    //Select Browser From Properties
    String browser= loadProp.getProperty("Browser");
    // Create Method To Open Browser
    public void openBrowser()
    {
        if(browser.equalsIgnoreCase("Chrome"))
        {
            //if Your Browser is Chrome In Properties
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("Safari"))
        {
            //if Your Browser is Safari In Properties
            driver = new SafariDriver();
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {
            //if Your Browser is Firefox In Properties
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("Edge"))
        {
            //if Your Browser is Edge In Properties
            driver = new EdgeDriver();
        }
        else
        {
            //if Your Browser id Different From All If Condition
            System.out.println("Please Select Valid Browser");
        }
        //Add Command To Maximize Browser Window
        driver.manage().window().maximize();
        //Add Url From Properties
        driver.get(loadProp.getProperty("Url"));
    }
    //Create Method To Close Browser
    public void closeBrowser()
    {
        driver.quit();
    }
}
