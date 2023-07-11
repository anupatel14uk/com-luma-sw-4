package com.luma.sw4.demo.pages;

import com.luma.sw4.demo.utilites.Utility;
import org.openqa.selenium.By;

public class Men extends Utility {
    By menMenu = By.xpath("//span[contains(text(),'Men')]");
    By bottom = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By cronusYogaPant = By.xpath("//img[@alt='Cronus Yoga Pant ']");
    By size32 = By.cssSelector("#option-label-size-143-item-175");
    By colourBlack = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By addToCart = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
    By message = By.xpath("//body/div[1]/main[1]/div[2]/div[2]/div[2]/div[1]/div[1]");
    By shoppingCart = By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)'] a");
    By shoppingCartMessage = By.xpath("//span[@class='base']");
    By CronusYogaMessage = By.xpath("//tbody/tr[1]/td[1]/div[1]/strong[1]/a[1]");
    By cartSize32 = By.xpath("//dd[contains(text(),'32')]");
    By black = By.xpath("//dd[contains(text(),'Black')]");



    //* Mouse Hover on Men Menu
    public void mouseHoverOnMen() {
        mouseHoverToElement(menMenu);
    }
    //* Mouse Hover on Bottoms
    public void mouseHoverOnBottoms() {
        mouseHoverToElement(bottom);
    }
    //* Click on Pants
    public void clickOnPants() {
        clickOnElement(pants);
    }
    //* Mouse Hover on product name Cronus Yoga Pant’ and click on size 32.
    public void mouseHooverOnCronusYogaPantAndClickOnSize32() {
        mouseHoverToElement(cronusYogaPant);
        clickOnElement(size32);
    }
    //* Mouse Hover on product name Cronus Yoga Pant’ and click on colour Black.
    public void mouseHooverOnCronusYogaPantAndClickColourBlack(){
        clickOnElement(colourBlack);
    }

    //* Mouse Hover on product name Cronus Yoga Pant’ and click on Add To Cart’ Button.
    public void mouseHooverOnCronusYogaPantAndClickToAdd() {
        mouseHoverToElement(cronusYogaPant);
        clickOnElement(addToCart);
    }
    //Verify the text You added Cronus Yoga Pant to your shopping cart.’
    public String getTextCronusYogaPantToYourShoppingCart() {
        return getTextFromElement(message);
    }
    // Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }
    //Verify the text ‘Shopping Cart.’
    public String getTextShoppingCart() {
        return getTextFromElement(shoppingCartMessage);
    }

    // Verify the product name ‘Cronus Yoga Pant’
    public String getTextCronusYoga(){
        return getTextFromElement(CronusYogaMessage);
    }
    // Verify the product size ‘32’
    public String getProductSize32() {
        return getTextFromElement(cartSize32);
    }
    //Verify the product colour ‘Black
    public String getTextBlack() {
        return getTextFromElement(black);
}


}
