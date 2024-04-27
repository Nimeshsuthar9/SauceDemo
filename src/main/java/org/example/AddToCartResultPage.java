package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCartResultPage extends Utils
{
    // Create Object For Load Properties Class
    LoadProp loadProp = new LoadProp();
    String expectedNameOfProduct = loadProp.getProperty("CartProductName");
    //Create Method To Verify Product Name Is Same as You Add Product In To Cart
    public void VerifyProductNameIsSameAsYouAddProductInToCart()
    {
        String actual = getTextFromElement(By.className("product-name"));
        Assert.assertEquals(getTextFromElement(By.className("product-name")),expectedNameOfProduct,"You Add Different Product In To Cart");
    }
}
