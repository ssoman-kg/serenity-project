package com.demoblaze.pages;

import org.junit.Assert;

public class AboutPage extends BasePage {

    private static final String ABOUT_MODAL_TITLE = "//*[@id='videoModalLabel']";

    public String findTitle() {
        return getText(ABOUT_MODAL_TITLE);
    }


    public void verifyAboutUsTitle() {
        String aboutModalTitle = findTitle();
        Assert.assertEquals("About us", aboutModalTitle);
    }

}


