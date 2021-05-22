package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_incorrectLogInInfo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("BlablablaLol@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("something"+ Keys.ENTER);
        Thread.sleep(5000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Log into Facebook";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

    }
}
