package org.example;

import org.openqa.selenium.By;

public class ProductEmailFriendPage extends Utils
{
    // Create Object For Load Properties Class
    LoadProp loadProp = new LoadProp();

    // Create Method To Refer A Product
    public void referAProduct()
    {
        // Type Friend Email Id
        typeText(By.xpath("//input[@id='FriendEmail']"),loadProp.getProperty("FriendsEmailId"));
        //click On Send Button
        clickOnElement(By.xpath("//button[@class='button-1 send-email-a-friend-button']" ));
    }
}
