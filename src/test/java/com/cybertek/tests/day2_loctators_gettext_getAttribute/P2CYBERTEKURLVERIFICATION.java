package com.cybertek.tests.day2_loctators_gettext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2CYBERTEKURLVERIFICATION {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();
        if (driver.getTitle().contains("Gmail")){
            System.out.println("PASSED");
        }
        driver.close();
    }
}
