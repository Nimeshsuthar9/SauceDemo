package org.example;

import org.openqa.selenium.By;

public class BuildOwnComputerProductPage extends Utils
{
    //Create Method For Select All Details Of Product
    public void selectAllProductDetails()
    {
        //Select Processor From Dropdown List
        selectByVisibleText(By.xpath("//select[@name='product_attribute_1']"),"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
        // Select RAm From Dropdown List
        selectByVisibleText(By.xpath("//select[@name='product_attribute_2']"),"4GB [+$20.00]");
        //Select HDD
        clickOnElement(By.xpath("//label[@for='product_attribute_3_7']"));
        //Select OS
        clickOnElement(By.xpath("//label[@for='product_attribute_4_9']"));
        // Select Software
        clickOnElement(By.id("product_attribute_5_11"));
        //click on Add to Cart Button
        clickOnElement(By.xpath("//button[@class='button-1 add-to-cart-button']"));
        //Click on Shopping Cart
        clickOnElement(By.xpath("//li[@id='topcartlink']"));
    }
}
