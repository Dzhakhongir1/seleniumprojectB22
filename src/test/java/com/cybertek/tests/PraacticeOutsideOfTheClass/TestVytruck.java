package com.cybertek.tests.PraacticeOutsideOfTheClass;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestVytruck {
    @Test
    public void storeManager(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("user19"+ Keys.ENTER);
        //And the user enters Truck Driver password
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+Keys.ENTER);
        //Then the user should successfully login
        //And see the Truck Driver account’s page
    }
}
