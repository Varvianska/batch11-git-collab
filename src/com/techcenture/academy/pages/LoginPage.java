package com.techcenture.academy.pages;

public class LoginPage extends BasePage {

    public LoginPage(){

    }

    public void login(String username, String password){
        System.out.println("using " + username +" and " + password);
    }
}
