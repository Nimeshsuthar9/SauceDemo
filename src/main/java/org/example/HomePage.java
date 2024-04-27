package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    // Create Method For Click On Register Button From Home Page
    public  void clickOnRegisterButton()
    {
        // Click On Register Button
        clickOnElement(By.className("ico-register"));
    }
    //Create Method For Click On Login Button
    public void clickOnLoginButton()
    {
        // Click On Login
        clickOnElement(By.className("ico-login"));
    }
    //Create Method For Click On Electronics
    public void clickOnElectronics()
    {
        // Click On Electronics Menu
        clickOnElement(By.linkText("Electronics"));
    }
    //Create Method For Click On Camera & Photo
    public void clickOnCameraAndPhoto()
    {
        //Click On Camera & Photo
        clickOnElement(By.linkText("Camera & photo"));
    }
    //Create Method For Click On Build Own Computer Product
    public void clickOnBuildOnComputerProduct()
    {
        // Click On Build Your Own Computer Product
        clickOnElement(By.xpath(" // img[@title='Show details for Build your own computer']"));
    }
}
