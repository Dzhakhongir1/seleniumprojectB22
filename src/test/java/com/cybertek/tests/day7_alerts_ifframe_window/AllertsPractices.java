package com.cybertek.tests.day7_alerts_ifframe_window;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
 #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cybertekschool.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfuly clicked an alert” text is displayed.
 */
public class AllertsPractices {
    WebDriver driver;
    @BeforeMethod
    public  void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }
    @Test(priority = 1)
    public void AlertTcN1(){
        // 3. Click to “Click for JS Alert” button
        WebElement infoAllertButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        infoAllertButton.click();
        Alert alert = driver.switchTo().alert();
        //4. Click to OK button from the alert
        alert.accept();
//        infoAllertButton.submit();
        String actualResultText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedResultText= "You successfuly clicked an alert";
        Assert.assertTrue(expectedResultText.equals(actualResultText));

    }
    @Test(priority = 2)
    public void AlertTc2(){
//        TC #2: Confirmation alert practice
//        1. Open browser
//        2. Go to website: http://practice.cybertekschool.com/javascript_alerts
        WebElement locator = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
//        3. Click to “Click for JS Confirm” button
        locator.click();
//        4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
//        5. Verify “You clicked: Ok” text is displayed.
        String actualResultText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedResultText = "You clicked: Ok";

        Assert.assertTrue(actualResultText.equals(expectedResultText));
    }
    @Test
    public void AlertTc3() throws InterruptedException {
        WebElement location = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        location.click();
        Thread.sleep(500);

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();
        String actualTextResult = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedresulText = "You entered: Hello";
        Assert.assertTrue(actualTextResult.equals(expectedresulText),"Wrong text was send");



    }
}
