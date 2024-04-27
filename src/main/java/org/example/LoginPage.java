package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils
{
    // Create Object For Load Properties Class
    LoadProp loadProp = new LoadProp();

    // Create Method To Enter Login Credential
    public void enterLoginDetails()
    {
        RegisterPage registerPage = new RegisterPage();
        // Type Email
        typeText(By.id("Email"),"tomluis"+randomDate()+"@gmail.com");
        // Type Password
        typeText(By.id("Password"),loadProp.getProperty("password"));
        //Click on Login Button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
    }
}
