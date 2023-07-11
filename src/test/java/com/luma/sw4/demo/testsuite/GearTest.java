package com.luma.sw4.demo.testsuite;

import com.luma.sw4.demo.pages.Gear;
import com.luma.sw4.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    Gear gear = new Gear();

    @Test

    public void userShouldAddProductSuccessFullyToShoppingCart()throws InterruptedException{
        gear.mouseHooverOnGearMenu();
        Thread.sleep(1000);
        gear.clickOnBags();
        Thread.sleep(1000);
        gear.clickOnProductNameOvernightDuffle();

        String expectedText ="Overnight Duffle";
        String actualText = gear.getTextOvernightDuffle();
        Assert.assertEquals(expectedText, actualText);

        gear.changeQuantity();
        gear.clickAddToCart();

        String expectedCartMessage = "You added Overnight Duffle to your shopping cart.";
        String actualCartMessage = gear.getTextToVerifyText();
        Assert.assertEquals(expectedCartMessage,actualCartMessage);

        gear.clickOnShoppingCart();

        String expectedOvernightDuffleMessage = "Overnight Duffle";
        String actualOvernightDuffleMessage = gear.getTextToVerifyOvernightDuffleInTheCart();
        Assert.assertEquals(expectedOvernightDuffleMessage,actualOvernightDuffleMessage);

        String expectedQuantityInTheCart = "3";
        String actualQuantityInTheCart  = gear.getTextToVerifyQuantityInTheCart();
        Assert.assertEquals(expectedQuantityInTheCart,actualQuantityInTheCart);


        String expectedTotalAmount = "$135.00";
        String actualTotalAmount   = gear.getTextToVerifyTotalAmountInTheCart();
        Assert.assertEquals(expectedTotalAmount,actualTotalAmount);

        gear.changeTheQuantity();
        gear.clickOnUpdateShoppingCart();

        String expectedUpdatedTotalAmount = "$225.00";
        String actualUpdatedTotalAmount   = gear. getTextToVerifyTotalAmountInTheCartAfterUpdatingQty();
        Assert.assertEquals(expectedUpdatedTotalAmount,actualUpdatedTotalAmount);

}

}
