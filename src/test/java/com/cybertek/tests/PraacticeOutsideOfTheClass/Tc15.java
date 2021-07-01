package com.cybertek.tests.PraacticeOutsideOfTheClass;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc15 {

    @Test
    public void doubleTap(){
       // Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        WebElement iframe = Driver.getDriver().findElement(By.id("iframeResult"));
        Driver.getDriver().switchTo().frame(iframe);

        // 2.Switch to iframe.
        WebElement locator = Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));

        // 3.Double click on the text “Double-click me to change my text color.
        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(locator).perform();

        // ”4.Assert: Text’s “style” attribute value contains “red”.
        Assert.assertTrue(locator.isDisplayed());

    }
}
