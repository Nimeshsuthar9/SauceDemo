package org.example;

import org.openqa.selenium.By;

public class Product extends Utils
{
    //Create Method To Refer A Product To Friend
    public void clickOnProductToReferFriend()
    {
        clickOnElement(By.xpath("//button[@class='button-2 email-a-friend-button']"));
    }
}
