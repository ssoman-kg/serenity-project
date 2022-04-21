package com.demoblaze.pages;

public class CartPage extends BasePage {

    private static final String CART_PAGE_TITLE = "//*[@id='page-wrapper']/div/div[1]/h2";
    private static final String PLACE_ORDER_BUTTON = "//button[@class='btn btn-success']";
    private static final String PRODUCT_NAME = "//*[@id='tbodyid']/tr/td[2]";

    public String getCartPageTitle() {
        return getText(CART_PAGE_TITLE);
    }

    public void clickPlaceOrder() {
        click(PLACE_ORDER_BUTTON);
    }

    public void getProductName() {
        getText(PRODUCT_NAME);
    }
}
