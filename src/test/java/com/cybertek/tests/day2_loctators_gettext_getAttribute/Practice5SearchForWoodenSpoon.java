package com.cybertek.tests.day2_loctators_gettext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5SearchForWoodenSpoon {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        driver.findElement(By.id("global-enhancements-search-query"))
                .sendKeys("wooden spoon"+ Keys.ENTER);
        String expectedInTitle = "Wooden spoon | Etsy";
        String actualInTitle= driver.getTitle();
        if (actualInTitle.equals(expectedInTitle)){
            System.out.println("test case pass");
        }else
            System.out.println("test case fail");
    }
}
