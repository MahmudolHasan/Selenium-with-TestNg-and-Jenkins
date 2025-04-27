package pages;

import Base.Base;
import Locators.Loc_Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base {
    Loc_Login locs = new Loc_Login();
    WebDriver driver = getDriver();

    //Elements
    WebElement userName = driver.findElement(locs.loc_userName);
    WebElement password = driver.findElement(locs.loc_password);
    WebElement loginBtn = driver.findElement(locs.loc_loginBtn);

    //method
    public void setUserName(String usrname){
        userName.clear();
        userName.sendKeys(usrname);
    }
    public void setPassword(String passwrd){
        password.clear();
        password.sendKeys(passwrd);
    }

    public void clcikOnLoginBtn(){
        loginBtn.click();
    }

    public String getTitle(){
        return driver.getTitle();
    }


}
