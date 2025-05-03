package Locators;

import org.openqa.selenium.By;


public class Loc_Login {

    //Locators
    public final By loc_userName = By.name("username");
    public final By loc_password = By.name("password");
    public final By loc_loginBtn = By.xpath("//button[text()=' Login ']");
}