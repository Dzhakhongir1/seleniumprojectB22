package com.cybertek.tests.day7_alerts_ifframe_window;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownPractice2 {
    WebDriver driver;
    @BeforeClass
    public void SetUpClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void ts2_DropdownTest2(){
     Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
     stateDropDown.selectByVisibleText("Illinois");
     stateDropDown.selectByValue("VA");
     stateDropDown.selectByValue("CA");
    String expectedOptionText= "California";
    String actualOptionText = stateDropDown.getFirstSelectedOption().getText();
    Assert.assertTrue(expectedOptionText.equals(actualOptionText),"Your test has failed ");
    }
}
