package com.demoblaze.pages;

public class PlaceOrderPage extends BasePage {

    private static final String ABOUT_MODAL_TITLE = "//*[@id='videoModalLabel']";
    private static final String MODAL_PLAY_BUTTON = "//button[@class='vjs-big-play-button']";
    private static final String PAUSE_BUTTON = "//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']";
    private static final String PLAY_BUTTON = "//button[@class='vjs-play-control vjs-control vjs-button vjs-paused']";

    public String getAboutModalTitle() {
        return getText(ABOUT_MODAL_TITLE);
    }

    public void playVideoModal() {
        click(MODAL_PLAY_BUTTON);
    }


}