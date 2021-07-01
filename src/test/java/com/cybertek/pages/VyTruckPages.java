package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTruckPages {
    public VyTruckPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public void logIn(){
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        VyTruckPages log = new VyTruckPages();
        log.InputUserName.sendKeys("user20");
        log.InputPassword.sendKeys("UserUser123");
        log.signInButton.click();
    }
    public void dropDownHandle(){
        VyTruckPages pages = new VyTruckPages();
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(3);
        actions.clickAndHold(pages.fleetDropDown).perform();
        BrowserUtils.sleep(3);
        pages.fleetDropDownVehicles.click();
    }
    @FindBy(id="prependedInput")
    public WebElement InputUserName;

    @FindBy(id="prependedInput2")
    public WebElement InputPassword;

    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='alert alert-error']/div")
    public WebElement InvalidEmailOrPassword;

    @FindBy(xpath = "//span[@class='title title-level-1'][1]")
    public WebElement fleetDropDown;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement fleetDropDownVehicles;

    @FindBy(xpath = "//div[@class='pull-left grid-toolbar-mass-actions']")
    public WebElement gridLeftSideParentLocator;

    @FindBy(xpath="//a[@title='Refresh']")
    public WebElement refreshButton;

}
