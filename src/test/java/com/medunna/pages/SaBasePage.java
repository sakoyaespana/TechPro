package com.medunna.pages;

import com.medunna.utilities.ConfigReader;
import com.medunna.utilities.Driver;
import com.medunna.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.module.Configuration;

public class SaBasePage {
    public SaBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "#account-menu > a ")
    public WebElement user_icon;

    @FindBy(css = "#login-item > span")
    public WebElement sign_in_option;


    @FindBy(css = "#username")
    public WebElement input_username;

    @FindBy(css = "#password")
    public WebElement input_password;

    @FindBy(css = "[type='submit']")
    public WebElement signInBTN;


     public void SaDocSignIn(){

        String un = ConfigReader.getProperty("sa-username");
        String pw = ConfigReader.getProperty("sa-password");

        input_username.sendKeys(un);
        input_password.sendKeys(pw);
         signInBTN.click();

    }
}

