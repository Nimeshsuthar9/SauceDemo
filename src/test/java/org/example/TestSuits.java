package org.example;

import org.testng.annotations.Test;

public class TestSuits extends BaseTest
{
    //Create Object Of Home Page
    HomePage homePage = new HomePage();
    // Create Object of Register Page
    RegisterPage registerPage = new RegisterPage();
    // Create Object Of Register Result Page
    RegisterResultPage registerResultPage = new RegisterResultPage();
    //Create Object Of Login Page
    LoginPage loginPage = new LoginPage();
    //Create Object For Product Page
    Product product = new Product();
    // Create Object For Product Email A Friend Page
    ProductEmailFriendPage productEmailFriendPage= new ProductEmailFriendPage();
    // Create Object For Refer Product Result Page
    ReferProductResultPage referProductResultPage = new ReferProductResultPage();
    //Create Object For Build Own Computer Product Page
    BuildOwnComputerProductPage buildOwnComputerProductPage = new BuildOwnComputerProductPage();
    //Create Object For Verify Product Added Into Cart Result Page
    AddToCartResultPage addToCartResultPage=new AddToCartResultPage();

    // Create Testng To Verify User Should Able To Register Successfully
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully()
    {
        // Click On Register Button
        homePage.clickOnRegisterButton();
        // Enter Registration Details
        registerPage.enterRegisterDetails();
        // Verify Register Result Page
        registerResultPage.verifyRegisterMessage();
    }
    @Test
    public void toVerifyUserCanAbleToLoginAndReferAProductToFriend()
    {
        // Click On Register Button
        homePage.clickOnRegisterButton();
        // Enter Registration Details
        registerPage.enterRegisterDetails();
        //Click On Login Button
        homePage.clickOnLoginButton();
        // Enter Login Details
        loginPage.enterLoginDetails();
        //Click On Electronics
        homePage.clickOnElectronics();
        //Click On Camera & Photo
        homePage.clickOnCameraAndPhoto();
        // Click On Product To Refer A Friend
        cameraAndPhotoPage.clickOnProduct();
        // Click On Product
        product.clickOnProductToReferFriend();
        //Click On Email Friend
        productEmailFriendPage.referAProduct();
        // VerifyReferProductResult
        referProductResultPage.verifyReferProductMessage();
    }
    @Test
    public void toVerifyUserShouldAbleToAddProductInToCart()
    {
        //Click On Build Own Computer
        homePage.clickOnBuildOnComputerProduct();
        //Enter All Details Of Product
        buildOwnComputerProductPage.selectAllProductDetails();
        // Verify User Add Right Product In To Cart
        addToCartResultPage.VerifyProductNameIsSameAsYouAddProductInToCart();
    }
}
