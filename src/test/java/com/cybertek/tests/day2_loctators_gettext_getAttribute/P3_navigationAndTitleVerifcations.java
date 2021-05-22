package com.cybertek.tests.day2_loctators_gettext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_navigationAndTitleVerifcations {
    public static void main(String[] args) {
        //1open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2go to google.com
        driver.get("https:/www.google.com");
        //3 click to Gmail from top right
                        //locate web elemeent  // here click
//      driver.findElement(By.partialLinkText("mail")).click();
        driver.findElement(By.linkText("mail")).click();

        //4 verify title contains
        //expected "Gmail"
        String expectedInTitle= "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED");
        }
        // go back to google
        driver.navigate().back();
        String expectedGoogleTitle= "Google";
        String actualGoogleTitle=driver.getTitle();
        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test Failed");

        }

    }
}
