package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferProductResultPage extends Utils
{
    // Create Object For Load Properties Class
    LoadProp loadProp = new LoadProp();
    String expectedResultMessage = loadProp.getProperty("ReferProductResulMessage");

    // Create Method To Verify That Your Product Is Refer Or Not
    public void verifyReferProductMessage()
    {
        String actual = getTextFromElement(By.className("result"));
        Assert.assertEquals(getTextFromElement(By.className("result")),expectedResultMessage,"Your Product Is Not Refer To Your Friend");
    }
}
