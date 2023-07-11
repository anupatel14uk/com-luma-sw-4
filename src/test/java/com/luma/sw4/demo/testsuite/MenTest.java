package com.luma.sw4.demo.testsuite;

import com.luma.sw4.demo.pages.Men;
import com.luma.sw4.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    Men men = new Men();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart()throws InterruptedException {

        men.mouseHoverOnMen();
        Thread.sleep(1000);
        men.mouseHoverOnBottoms();
        men.clickOnPants();
        men.mouseHooverOnCronusYogaPantAndClickOnSize32();
        men. mouseHooverOnCronusYogaPantAndClickColourBlack();
        Thread.sleep(1000);
        men.mouseHooverOnCronusYogaPantAndClickToAdd();
        Thread.sleep(1000);
        //  String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
        // String actualMessage = men.getTextCronusYogaPantToYourShoppingCart();
        //  Assert.assertEquals(expectedMessage, actualMessage);

        men.clickOnShoppingCart();

        String expectedShoppingCart = "Shopping Cart";
        String actualShoppingCart = men.getTextShoppingCart();
        Assert.assertEquals(expectedShoppingCart, actualShoppingCart);

        String expectedCronusYogaText = "Cronus Yoga Pant";
        String actualCronusYogaText = men.getTextCronusYoga();
        Assert.assertEquals(expectedCronusYogaText, actualCronusYogaText);

        String expectedSize32Text = "32";
        String actualSize32Text = men.getProductSize32();
        Assert.assertEquals(expectedSize32Text, actualSize32Text);

        String expectedBlackText = "Black";
        String actualBlackText = men.getTextBlack();
        Assert.assertEquals(expectedBlackText, actualBlackText);


}


}
