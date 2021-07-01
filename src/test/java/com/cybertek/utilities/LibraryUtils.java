package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibraryUtils {
    public  static void  loginToLibrary(WebDriver driver) {
        WebElement inputUser = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inputUser.sendKeys("student11@library");
        // “”4.Enter password:
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        inputPassword.sendKeys("tScBPCUr");
        // “”5.Click to Login button
        WebElement logInBtn = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
        logInBtn.click();
    }
}
