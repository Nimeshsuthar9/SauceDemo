package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils
{
    // Create Object For Load Properties Class
    LoadProp loadProp = new LoadProp();

    public void enterRegisterDetails()
    {

        // choose male or female
        clickOnElement(By.id("gender-male"));

        // Type first name using Test Data
        typeText(By.id("FirstName"),loadProp.getProperty("Firstname"));

        // Type last name Using Test Data
        typeText(By.id("LastName"),loadProp.getProperty("Lastname"));

        //Store Email Id In One Variable
        String emailid = "tomluis"+randomDate()+"@gmail.com";
        // Type email
        typeText(By.id("Email"),emailid);

        //Select Date From Date of Birth By Using Select By Visible Text
        selectByVisibleText(By.name("DateOfBirthDay"),"9");
        //Select Month From Date Of Birth By Using SelectByValue
        selectByVisibleText(By.name("DateOfBirthMonth"),"December");
        //Select Year From Date Of Birth By Using SelectByIndex
        selectByVisibleText(By.name("DateOfBirthYear"),"1996");

        // Type password using Test Data
        typeText(By.id("Password"),loadProp.getProperty("password"));

        // Type confirm password using Test Data
        typeText(By.id("ConfirmPassword"),loadProp.getProperty("confirmPassword"));

        //click on Register button
        clickOnElement(By.id("register-button"));
    }

}
