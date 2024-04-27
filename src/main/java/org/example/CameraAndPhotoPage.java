package org.example;

import org.openqa.selenium.By;

public class CameraAndPhotoPage extends Utils
{
    // Create Method To Click on Particular Product
    public void clickOnProduct()
    {
        clickOnElement(By.xpath("//div[1]/div[@class='product-item']"));
    }
}
