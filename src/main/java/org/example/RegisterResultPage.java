package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils
{
    // Create Object For Load Properties Class
  LoadProp loadProp = new LoadProp();
  String expectedResultMessage = loadProp.getProperty("ExpectedResultMessage");

  // Create Method To Verify That You Register or Not
  public void verifyRegisterMessage()
  {
      String actual = getTextFromElement(By.className("result"));
      Assert.assertEquals(getTextFromElement(By.className("result")),expectedResultMessage,"Your Actual is Not Equals Expected");
  }
}
