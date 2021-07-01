package com.cybertek.tests.day7_alerts_ifframe_window;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iFramePracticeN4 {
    WebDriver driver;
    @BeforeMethod
    public  void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }
    @Test
    public void iFrameTest(){
        //Chnaging iframe index we pass index number
        //driver.switchTo().frame(0);

        // we find and locate iFrane web element from the page
        //if iframe tag has id or name attribute we can pass its attribute , we can pass ots attribute value as a
        //String intro driver.switchto().frame("id iNfo")
        WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        //locate web element text
        driver.switchTo().frame(iFrame);
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
//        4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());
//        5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        //locating header as web element
        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        Assert.assertTrue(headerText.isDisplayed());

    }
}
