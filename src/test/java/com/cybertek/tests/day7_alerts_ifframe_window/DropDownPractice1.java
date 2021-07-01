package com.cybertek.tests.day7_alerts_ifframe_window;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownPractice1 {
    WebDriver driver;
    @BeforeClass
    public void setupClass(){
        driver =WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void tc1_simple_dropdown_test(){
        //Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”

        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOptions =simpleDropDown.getFirstSelectedOption();
        String textOfCurrentOption = currentlySelectedOptions.getText();
        String expectedText = "Please select an option";
        Assert.assertTrue(textOfCurrentOption.equals(expectedText));

        //Verify“State selection” default selected value is correctExpected: “Select a State”
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualStateDropdownText = stateDropDown.getFirstSelectedOption().getText();
        String expectedStateDropdownText= "Select a State";
        Assert.assertTrue(expectedStateDropdownText.equals(actualStateDropdownText));
    }
}
