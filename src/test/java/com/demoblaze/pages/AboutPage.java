package com.demoblaze.pages;

public class AboutPage extends BasePage {


    private static final String ABOUT_MODAL_TITLE = "//*[@id='videoModalLabel']";

    public String findTitle() {
        return getText(ABOUT_MODAL_TITLE);
    }
//
//    public void playVideo() {
//    }

}
