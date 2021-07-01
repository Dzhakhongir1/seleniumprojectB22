package com.cybertek.tests.PraacticeOutsideOfTheClass;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc18 {
    @Test
    public void rightClick(){
        //Go to https://the-internet.herokuapp.com/context_menu
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        WebElement box = Driver.getDriver().findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions = new Actions(Driver.getDriver());
        // 2.Right click to the box.3.Alert will open.
        actions.contextClick(box).perform();
        // 4.Accept alertNo assertion needed for this practice.
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
}
