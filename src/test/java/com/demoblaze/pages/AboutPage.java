package com.demoblaze.pages;

public class AboutPage extends BasePage {


    private static final String ABOUT_MODAL_TITLE = "//*[@id='videoModalLabel']";
    private static final String PLAY_BUTTON = "//button[@class='vjs-big-play-button']";
    private static final String VIDEO_ELEMENT = "//*[@id='example-video_html5_api']";
    private static final String PLAYING_BUTTON = "//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']";
    private static final String PAUSED_BUTTON = "//button[@class='vjs-play-control vjs-control vjs-button vjs-paused']";

    public String findTitle() {
        return getText(ABOUT_MODAL_TITLE);
    }

    public void playVideoModal () { click(PLAY_BUTTON); }

    public void playVideo () { click(PLAYING_BUTTON); }

    public void pauseVideo () { click(PAUSED_BUTTON); }

    private void videoPoster(String videoElement) {
      //  VIDEO_ELEMENT
    }


}
