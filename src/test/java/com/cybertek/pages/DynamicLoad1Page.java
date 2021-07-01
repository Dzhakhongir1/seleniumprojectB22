package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {

    public DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(id = "loading")
    public WebElement LoadingBar;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='pwd']")
    public WebElement password;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(id="flash")
    public WebElement errorMessage;
}
