package com.demoblaze.cucumber.stepdefinitions;

import io.cucumber.java.ParameterType;

public class StepDefinitions {

    @ParameterType("[a-z0-9]+")
    public String userName(String name){
        return name;
    }

    @ParameterType("[a-z0-9]+")
    public String password(String password){
        return password;
    }
}
