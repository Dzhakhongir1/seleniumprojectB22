package com.cybertek.tests.PraacticeOutsideOfTheClass;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
/*
Given the user is Truck Driver
And the user is on the Vytrack Login page
When the user enters Truck Driver username
And the user enters Truck Driver password
And the user press enter on the keyboard
Then the user should successfully login
And see the Truck Driver account’s page

 */

public class AtomateLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa3.vytrack.com/user/login");
       // Given the user is Truck Driver
        // And the user is on the Vytrack Login page
        //When the user enters Truck Driver username
        driver.findElement(By.id("prependedInput")).sendKeys("user19"+ Keys.ENTER);
        //And the user enters Truck Driver password
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+Keys.ENTER);
        //Then the user should successfully login
        //And see the Truck Driver account’s page
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         String ActualTitle =driver.getTitle();
         String expectedTitle = "Dashboard";
         if (ActualTitle.equals(expectedTitle)){
             System.out.println("Log in functionality is working ");
         }else {
             System.out.println("log in functionality fail ");

         }
    }
}
