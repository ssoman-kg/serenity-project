package com.demoblaze.pages;

import org.junit.Assert;

public class AboutPage extends BasePage {

    private static final String ABOUT_MODAL_TITLE = "//*[@id='videoModalLabel']";
    private static final String MODAL_PLAY_BUTTON = "//button[@class='vjs-big-play-button']";
    private static final String PAUSE_BUTTON = "//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']";
    private static final String PLAY_BUTTON = "//button[@class='vjs-play-control vjs-control vjs-button vjs-paused']";

    public String findTitle() {
        return getText(ABOUT_MODAL_TITLE);
    }


    public void playVideoModal() {
        click(MODAL_PLAY_BUTTON);
    }

    public String showPauseButton() {
        return show(PAUSE_BUTTON);
    }

    public void playVideo() {
        click(PLAY_BUTTON);
    }

    public void pauseVideo() {
        click(PAUSE_BUTTON);
    }

    public String showPlayButton() {
        return show(PLAY_BUTTON);
    }

    public void verifyAboutUsTitle() {
        String aboutModalTitle = findTitle();
        Assert.assertEquals("About us", aboutModalTitle);
    }

    public void verifyPauseIsShown() {
        String pause = showPauseButton();
        Assert.assertEquals("Pause", pause);
    }

    public void verifyIfVideoStop() {
        String play = showPlayButton();
        Assert.assertEquals("Play", play);
        playVideo();
        String pause = showPauseButton();
        Assert.assertEquals("Pause", pause);
    }
}
