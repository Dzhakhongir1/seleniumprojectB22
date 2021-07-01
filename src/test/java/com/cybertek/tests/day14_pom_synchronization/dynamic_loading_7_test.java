package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.pages.DynamicLoad1Page;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dynamic_loading_7_test {
    @Test
    public void dynamicLoadingTest(){
//        1. Go to http://practice.cybertekschool.com/dynamic_loading/1
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        DynamicLoad1Page load = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
//        2. Click to start
        load.startButton.click();

//        3. Wait until loading bar disappears
        wait.until(ExpectedConditions.invisibilityOf(load.LoadingBar));
//        4. Assert username inputbox is displayed
        Assert.assertTrue(load.userName.isEnabled());

//        5. Enter username: tomsmith
        load.userName.sendKeys("tomsmith");
//        6. Enter password: incorrectpassword
        load.password.sendKeys("anythinghere");
//        7. Click to Submit button
        load.submitButton.click();
//        8. Assert “Your password is invalid!” text is displayed.

        Assert.assertTrue(load.errorMessage.isDisplayed());
    }
}
