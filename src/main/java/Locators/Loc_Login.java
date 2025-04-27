package Locators;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Loc_Login {

    //Locators
    public final By loc_userName = By.name("username");
    public final By loc_password = By.name("password");
    public final By loc_loginBtn = By.xpath("//button[text()=' Login ']");
}