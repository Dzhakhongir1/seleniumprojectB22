package com.cybertek.tests.day2_loctators_gettext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4_FIndELEMNTBYNAme {
    public static void main(String[] args) {
        //helps to inport chrome and go to certain browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //go to google.com
        driver.get("https:/www.google.com");

        // search in google apple
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        //make sure name is matching with expected name
        String expectedInTitle= "apple";
        String actualInTitle= driver.getTitle();
        if (actualInTitle.startsWith(expectedInTitle)){
            System.out.println("Test case Passed");
        }else{
            System.out.println("title verification Failed");
        }
    }
}
