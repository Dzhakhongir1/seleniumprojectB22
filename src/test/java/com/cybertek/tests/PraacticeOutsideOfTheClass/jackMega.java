package com.cybertek.tests.PraacticeOutsideOfTheClass;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class jackMega {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://megasaver.com");
        driver.findElement(By.className("search-bar__input")).sendKeys("iphone 6"+ Keys.ENTER);
        driver.findElement(By.linkText("href=/products/mint-apple-iphone-6s-64gb-gray-at-t?_pos=1&_sid=1dec2d70c&_ss=r")).click();
    }
}
