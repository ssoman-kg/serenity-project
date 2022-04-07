package com.demoblaze.pages;

public class ProductPage extends BasePage {

    private static final String ADD_TO_CART = "//a[@onclick='addToCart(1)']";
    private static final String PRODUCT_NAME = "//h2[@class='name']";
    private static final String PAUSE_BUTTON = "//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']";
    private static final String PLAY_BUTTON = "//button[@class='vjs-play-control vjs-control vjs-button vjs-paused']";

    public void clickAddToCart() {
        click(ADD_TO_CART);
    }

    public String getProductName() {
        return getText(PRODUCT_NAME);
    }
}