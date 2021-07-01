package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractices {
    @Test
    public void VytruckLogInPage(){
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        LibraryLoginPage log = new LibraryLoginPage();
        log.InputUserName.sendKeys("user");
        log.InputPassword.sendKeys("UserUser123");
        log.signInButton.click();
        Assert.assertTrue(log.InvalidEmailOrPassword.isDisplayed());
    }
}
