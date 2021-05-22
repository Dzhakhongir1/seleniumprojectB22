package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class f4_verifyCreatePage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement createPageLink =driver.findElement(By.linkText("Create a Page"));

        String expected = "registration_form";
        String actual = createPageLink.getAttribute("href");
        if (actual.contains(expected)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

