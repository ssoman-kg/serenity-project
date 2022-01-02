package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {

    public void enterField(String fieldText, String Field, String value) {
        waitForTextToAppear(fieldText);
        waitFor(Field).$(Field).type(value);
    }

    public void click(String text, String button) {
        waitForTextToAppear(text);
        waitFor(button).$(button).click();
    }
}

