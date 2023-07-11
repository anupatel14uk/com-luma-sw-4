package com.luma.sw4.demo.testsuite;

import com.luma.sw4.demo.pages.Women;
import com.luma.sw4.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    Women women = new Women();

    @Test
    public void verifyTheSortByProductNameFilter() {
        women.mouseHoverOnWomenMenu();
        women.mouseHoverOnTops();
        women.clickOnJacket();
        women.selectSortByProductName();

    }
    @Test
    public void verifyTheSortByPriceFilter(){

        women.mouseHoverOnWomenMenu();
        women.mouseHoverOnTops();
        women.clickOnJacket();
        women.selectSortByPrice();


}

}
