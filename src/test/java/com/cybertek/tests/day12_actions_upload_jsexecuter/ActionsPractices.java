package com.cybertek.tests.day12_actions_upload_jsexecuter;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void tc15_actions_hover(){
       // 1.Go to http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        WebElement img1= Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2= Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3= Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        // we must create object of actions class to be able to use it
        BrowserUtils.sleep(2);

        Actions actions = new Actions(Driver.getDriver());


        // 2.Hover over to first image
        actions.moveToElement(img1).perform();
        // 3.Assert: a.“name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed(),"user 1 text i snot displayed");
        BrowserUtils.sleep(1);
        // 4.Hover over to second image
        actions.moveToElement(img2).perform();
        // 5.Assert: a.“name: user2” is displayed6.Hover over to third image
        Assert.assertTrue(user2.isDisplayed(),"user 2 text i snot displayed");
        BrowserUtils.sleep(1);
        // 7.Confirm: a.“name: user3” is displayed
        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed(),"user 3 text i snot displayed");
    }

    @Test
    public void scrolling_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com");

        // scroll down to powered by cybertek
        Actions actions = new Actions(Driver.getDriver());
        //locate powered by Cybertek

        WebElement cyberSchlLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));

        actions.moveToElement(cyberSchlLink).perform();

        //Scrolling up using Keys.page_Up
        actions.sendKeys(Keys.PAGE_UP).perform();
    }
}
