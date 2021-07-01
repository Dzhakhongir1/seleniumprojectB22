package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="prependedInput")
    public WebElement InputUserName;

    @FindBy(id="prependedInput2")
    public WebElement InputPassword;

    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='alert alert-error']/div")
    public WebElement InvalidEmailOrPassword;

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement fleetDropDown;

    @FindBy(xpath = "//span[@class='title title-level-2']")
    public WebElement fleetDropDownVehicles;

    @FindBy(xpath = "//div[@class='pull-left grid-toolbar-mass-actions']")
    public WebElement gridLeftSideParentLocator;
}
